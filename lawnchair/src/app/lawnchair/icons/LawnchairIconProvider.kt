package app.lawnchair.icons

import android.content.*
import android.content.Intent.*
import android.content.pm.ActivityInfo
import android.content.pm.LauncherActivityInfo
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.os.Handler
import android.os.Process
import android.os.UserHandle
import android.os.UserManager
import android.util.ArrayMap
import android.util.Log
import androidx.core.content.getSystemService
import app.lawnchair.preferences.PreferenceManager
import app.lawnchair.util.MultiSafeCloseable
import app.lawnchair.util.getPackageVersionCode
import app.lawnchair.util.isPackageInstalled
import com.android.launcher3.icons.IconProvider
import com.android.launcher3.icons.ThemedIconDrawable
import com.android.launcher3.util.SafeCloseable
import org.xmlpull.v1.XmlPullParser
import java.util.function.Supplier

class LawnchairIconProvider @JvmOverloads constructor(
    private val context: Context,
    supportsIconTheme: Boolean = false
) : IconProvider(context, supportsIconTheme) {

    private val prefs = PreferenceManager.getInstance(context)
    private val iconPackPref = prefs.iconPackPackage
    private val iconPackProvider = IconPackProvider.INSTANCE.get(context)
    private val iconPack get() = iconPackProvider.getIconPack(iconPackPref.get())?.apply { loadBlocking() }
    private var lawniconsVersion = context.packageManager.getPackageVersionCode(LAWNICONS_PACKAGE_NAME)

    override fun getIconWithOverrides(
        packageName: String,
        component: String,
        user: UserHandle,
        iconDpi: Int,
        fallback: Supplier<Drawable>
    ): Drawable {
        val iconPack = this.iconPack
        val componentName = ComponentName(packageName, component)
        var iconEntry: IconEntry? = null

        var iconType = ICON_TYPE_DEFAULT
        var themeData: ThemedIconDrawable.ThemeData? = null
        if (iconPack != null) {
            if (iconEntry == null) {
                iconEntry = iconPack.getCalendar(componentName)?.getIconEntry(getDay())
                themeData = themedIconMap[mCalendar.packageName]
                iconType = ICON_TYPE_CALENDAR
            }
            if (iconEntry == null) {
                iconEntry = iconPack.getIcon(componentName)
                val clock = iconEntry?.let { iconPack.getClock(it) }
                if (clock != null) {
                    themeData = themedIconMap[mClock.packageName]
                    iconType = ICON_TYPE_CLOCK
                } else {
                    themeData = themedIconMap[componentName.packageName]
                }
            }
        }
        val icon = iconEntry?.getDrawable(iconDpi, user)
        val td = themeData
        if (icon != null) {
            return if (td != null) td.wrapDrawable(icon, iconType) else icon
        }
        return super.getIconWithOverrides(packageName, component, user, iconDpi, fallback)
    }

    override fun getIcon(info: ActivityInfo?): Drawable {
        return CustomAdaptiveIconDrawable.wrapNonNull(super.getIcon(info))
    }

    override fun getIcon(info: ActivityInfo?, iconDpi: Int): Drawable {
        return CustomAdaptiveIconDrawable.wrapNonNull(super.getIcon(info, iconDpi))
    }

    override fun getIcon(info: LauncherActivityInfo?, iconDpi: Int): Drawable {
        return CustomAdaptiveIconDrawable.wrapNonNull(super.getIcon(info, iconDpi))
    }

    override fun getSystemStateForPackage(systemState: String, packageName: String): String {
        return super.getSystemStateForPackage(systemState, packageName)
    }

    override fun getSystemIconState(): String {
        return super.getSystemIconState() + ",pack:${iconPackPref.get()},lawnicons:${lawniconsVersion}"
    }

    override fun registerIconChangeListener(
        callback: IconChangeListener,
        handler: Handler
    ): SafeCloseable {
        return MultiSafeCloseable().apply {
            add(super.registerIconChangeListener(callback, handler))
            add(IconPackChangeReceiver(context, handler, callback))
            add(LawniconsChangeReceiver(context, handler, callback))
        }
    }

    private inner class IconPackChangeReceiver(
        private val context: Context,
        private val handler: Handler,
        private val callback: IconChangeListener
    ) : SafeCloseable {

        private var calendarAndClockChangeReceiver: CalendarAndClockChangeReceiver? = null
            set(value) {
                field?.close()
                field = value
            }
        private var iconState = systemIconState
        private val iconPackPref = PreferenceManager.getInstance(context).iconPackPackage
        private val subscription = iconPackPref.subscribeChanges {
            val newState = systemIconState
            if (iconState != newState) {
                iconState = newState
                callback.onSystemIconStateChanged(iconState)
                recreateCalendarAndClockChangeReceiver()
            }
        }

        init {
            recreateCalendarAndClockChangeReceiver()
        }

        private fun recreateCalendarAndClockChangeReceiver() {
            val iconPack = IconPackProvider.INSTANCE.get(context).getIconPack(iconPackPref.get())
            calendarAndClockChangeReceiver = if (iconPack != null) {
                CalendarAndClockChangeReceiver(context, handler, iconPack, callback)
            } else {
                null
            }
        }

        override fun close() {
            calendarAndClockChangeReceiver = null
            subscription.close()
        }
    }

    private class CalendarAndClockChangeReceiver(
        private val context: Context, handler: Handler,
        private val iconPack: IconPack,
        private val callback: IconChangeListener
    ) : BroadcastReceiver(), SafeCloseable {

        init {
            val filter = IntentFilter(ACTION_TIMEZONE_CHANGED)
            filter.addAction(ACTION_TIME_CHANGED)
            filter.addAction(ACTION_DATE_CHANGED)
            context.registerReceiver(this, filter, null, handler)
        }

        override fun onReceive(context: Context, intent: Intent) {
            when (intent.action) {
                ACTION_TIMEZONE_CHANGED -> {
                    iconPack.getClocks().forEach { componentName ->
                        callback.onAppIconChanged(componentName.packageName, Process.myUserHandle())
                    }
                }
                ACTION_DATE_CHANGED, ACTION_TIME_CHANGED -> {
                    context.getSystemService<UserManager>()?.userProfiles?.forEach { user ->
                        iconPack.getCalendars().forEach { componentName ->
                            callback.onAppIconChanged(componentName.packageName, user)
                        }
                    }
                }
            }
        }

        override fun close() {
            context.unregisterReceiver(this)
        }
    }

    private inner class LawniconsChangeReceiver(
        private val context: Context, handler: Handler,
        private val callback: IconChangeListener
    ) : BroadcastReceiver(), SafeCloseable {

        init {
            val filter = IntentFilter(ACTION_PACKAGE_ADDED)
            filter.addAction(ACTION_PACKAGE_CHANGED)
            filter.addAction(ACTION_PACKAGE_REMOVED)
            filter.addDataScheme("package")
            filter.addDataSchemeSpecificPart(LAWNICONS_PACKAGE_NAME, 0)
            context.registerReceiver(this, filter, null, handler)
        }

        override fun onReceive(context: Context, intent: Intent) {
            if (themedIconMap.isNotEmpty()) {
            lawniconsVersion = context.packageManager.getPackageVersionCode(LAWNICONS_PACKAGE_NAME)
                mThemedIconMap = null
                callback.onSystemIconStateChanged(systemIconState)
            }
        }

        override fun close() {
            context.unregisterReceiver(this)
        }
    }

    override fun getThemedIconMap(): MutableMap<String, ThemedIconDrawable.ThemeData> {
        if (mThemedIconMap != null) return mThemedIconMap
        val map = ArrayMap<String, ThemedIconDrawable.ThemeData>()

        fun updateMapFromResources(resources: Resources, packageName: String) {
            try {
                val xmlId = resources.getIdentifier(THEMED_ICON_MAP_FILE, "xml", packageName)
                if (xmlId != 0) {
                    val parser = resources.getXml(xmlId)
                    val depth = parser.depth
                    var type: Int
                    while (
                        (parser.next().also { type = it } != XmlPullParser.END_TAG || parser.depth > depth) &&
                        type != XmlPullParser.END_DOCUMENT
                    ) {
                        if (type != XmlPullParser.START_TAG) continue
                        if (TAG_ICON == parser.name) {
                            val pkg = parser.getAttributeValue(null, ATTR_PACKAGE)
                            val iconId = parser.getAttributeResourceValue(null, ATTR_DRAWABLE, 0)
                            if (iconId != 0 && pkg.isNotEmpty()) {
                                map[pkg] = ThemedIconDrawable.ThemeData(resources, iconId)
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "Unable to parse icon map.", e)
            }
        }

        updateMapFromResources(
            resources = context.resources,
            packageName = context.packageName
        )

        if (context.packageManager.isPackageInstalled(packageName = LAWNICONS_PACKAGE_NAME)) {
            updateMapFromResources(
                resources = context.packageManager.getResourcesForApplication(LAWNICONS_PACKAGE_NAME),
                packageName = LAWNICONS_PACKAGE_NAME
            )
        }

        mThemedIconMap = map
        return mThemedIconMap
    }

    companion object {
        const val LAWNICONS_PACKAGE_NAME = "app.lawnchair.lawnicons"
        const val TAG = "LawnchairIconProvider"
    }
}
