# Bubble Tea

## Bubble Tea [QPR1]

### 🏗️ Development 5 Release 1

> [!WARNING]
> This branch has diverged timeline from the original `16-dev`, meaning you will have to rebase your
> commit back to this branch if you wish to contribute to this branch.

Compatibility list: https://github.com/LawnchairLauncher/lawnchair/issues/6681

#### Features
* [Lawnchair] Allow user to disable the auto-updater (for Nightly build only)
* [Lawnchair/PathShapeDelegate] Implement custom path revealing animations for folder transitions with complex shapes
* [Lawnchair/Folder] Allow user to set custom folder shapes (experimental settings exclusive!)
* [Launcher] Reintroduce folder expressive animations from Bubble Tea QPR1 Development 1 Release 1
* [Lawnchair/Smartspace] Onboarding provider (Full-parity with Lawnchair Legacy)
* [Launcher] Theme page indicator dots
* [Lawnchair] Add work profile customization and fix issues (https://github.com/LawnchairLauncher/lawnchair/pull/6167)
* [Lawnchair] Update Google Fonts listing to 03022026 (https://github.com/LawnchairLauncher/lawnchair/pull/6193)
* [Lawnchair] Compare GitHub digest with actual downloaded file in Nightly updater
* [Lawnchair] Enable wrap adaptive icons by default (only on by default)
* [Lawnchair] Enable bulk icon loading by default (toggle removed, on by default)
* [Lawnchair] Allow customising force monochrome option
* [Lawnchair] Update Google Fonts listing to 20022026
* [Lawnchair/Workspace] Add "Set as default page" option (https://github.com/LawnchairLauncher/lawnchair/pull/6395)
* [Lawnchair] Improve GestureNavContract device detection
* [Lawnchair] App drawer haptic feedback toggle (https://github.com/LawnchairLauncher/lawnchair/pull/6436)
* [Lawnchair] Move backup and restore to separate screen (237a0beb)
* [Lawnchair/Search] Make blurred app search look nicer
* [Lawnchair/Search] Load image preview faster at less memory usage
* [Lawnchair/Search] Add Cromite search provider (https://github.com/LawnchairLauncher/lawnchair/pull/6558)
* [Lawnchair/Preference] Add haptic on Lawnchair settings (https://github.com/LawnchairLauncher/lawnchair/pull/6470)
* [Launcher] Put widget to default page (https://github.com/LawnchairLauncher/lawnchair/pull/6569)
* [Lawnchair/Search] Add Vivaldi search provider (https://github.com/LawnchairLauncher/lawnchair/pull/6587)
* [Lawnchair/Preference] Support deep linking (https://github.com/LawnchairLauncher/lawnchair/pull/6399)
* [Lawnchair/Gesture] Use reflection to open Quick Settings panel (https://github.com/LawnchairLauncher/lawnchair/pull/6485)
* [Launcher/Widget] Display Lawnchair at the top of the widget list (https://github.com/LawnchairLauncher/lawnchair/pull/6628)
* [Lawnchair/Gesture] Port shortcut support for triggering gestures (https://github.com/LawnchairLauncher/lawnchair/pull/6485)
* [Lawnchair/Preference] Add custom icon for Lawnchair settings (https://github.com/LawnchairLauncher/lawnchair/pull/6630)
* [Lawnchair/Caddy] Caddy mode without restarting (https://github.com/LawnchairLauncher/lawnchair/pull/6634)
* [Lawnchair/Caddy] Caddy hold message translatable (https://github.com/LawnchairLauncher/lawnchair/pull/6644)
* [Lawnchair] Add additional icon shapes (https://github.com/LawnchairLauncher/lawnchair/pull/6651)
* [Lawnchair/Gesture] Implement two-finger swipe gestures
* [Lawnchair/Preference] Add intent to apply icon packs externally (https://github.com/LawnchairLauncher/lawnchair/pull/6643)
* [Lawnchair/Gesture] Add selectable sleep method preference
* [Lawnchair/Folder] Promote folder shape customisation to stable (https://github.com/LawnchairLauncher/lawnchair/pull/6701)
* [Lawnchair/Build] Android Studio LeakCanary integrations (https://github.com/LawnchairLauncher/lawnchair/pull/6753)
* [Lawnchair] Target SDK 37 (https://github.com/LawnchairLauncher/lawnchair/pull/6760)
* [Lawnchair/Smartspace] Torch Provider (Flashlight) (https://github.com/LawnchairLauncher/lawnchair/pull/6742)
* [Lawnchair/Allapps] Action to sort folder apps (https://github.com/LawnchairLauncher/lawnchair/pull/6779)
* [Lawnchair/QSB] Waterfox search provider (https://github.com/LawnchairLauncher/lawnchair/pull/6799)
* [Lawnchair/Garden] Workspace reordering using page strip UI with option to set default home (https://github.com/LawnchairLauncher/lawnchair/pull/6809)
* [Lawnchair/Allapps] Blurred search bar ((https://github.com/LawnchairLauncher/lawnchair/pull/6818))
* [Lawnchair/Build] Aggressive ProGuard configuration (https://github.com/LawnchairLauncher/lawnchair/pull/6787)
* [Lawnchair/Build] Support non-cellular enabled device (https://github.com/LawnchairLauncher/lawnchair/pull/6833)
* [Lawnchair] Open in store shortcut (https://github.com/LawnchairLauncher/lawnchair/pull/6585)
* [Lawnchair] Promote Icon Swipe Gesture to stable (https://github.com/LawnchairLauncher/lawnchair/pull/6821)
* [Lawnchair] Workspace padding (vertical, horizontal) control, allapps padding (vertical, top) control, and show widget resizing handle bar when force resizing is enabled (https://github.com/LawnchairLauncher/lawnchair/pull/6872)
* [Lawnchair/Preference] Cache PreferenceManager2 in memory (https://github.com/LawnchairLauncher/lawnchair/pull/6897)
* [Lawnchair] Transparent icon backgrounds for adaptive icons (https://github.com/LawnchairLauncher/lawnchair/pull/6890)
* [Lawnchair] Show cloned app from clone profile (https://github.com/LawnchairLauncher/lawnchair/pull/6909)
* [Lawnchair/QSB] Migrate QSB to Compose (https://github.com/LawnchairLauncher/lawnchair/pull/6887)
* [Lawnchair/Search] Use custom background colour for search result icon (https://github.com/LawnchairLauncher/lawnchair/pull/6908)
* [Lawnchair] Improve Lawnchair grid specifications (https://github.com/LawnchairLauncher/lawnchair/pull/6583)
* [Lawnchair/Search] Add EU version of Startpage as Search Engine (https://github.com/LawnchairLauncher/lawnchair/pull/6652)
* [Lawnchair] Vertical icon swipe gesture (https://github.com/LawnchairLauncher/lawnchair/pull/6958)
* [Lawnchair] Animate icon swipe gestures (https://github.com/LawnchairLauncher/lawnchair/pull/6964)
* [Lawnchair] Lawnchair Night icon for Lawnchair Nightly (https://github.com/LawnchairLauncher/lawnchair/pull/6972)
* [Lawnchair] Update Google Fonts listing to 11072026 (https://github.com/LawnchairLauncher/lawnchair/pull/6980)
* [Lawnchair] Add option to have two-row dock (https://github.com/LawnchairLauncher/lawnchair/pull/6979)
* [Lawnchair/Preference] Hide app from allapps no reload (https://github.com/LawnchairLauncher/lawnchair/pull/6983)
* [Lawnchair] Optimise loading time in allapps folder screen (https://github.com/LawnchairLauncher/lawnchair/pull/6996)
* [Lawnchair] Rewrite PositionalList component to be state-based (https://github.com/LawnchairLauncher/lawnchair/pull/7002)
* [Lawnchair/QSB] Add customise shortcut to dock (https://github.com/LawnchairLauncher/lawnchair/pull/7011)
* [Lawnchair/Smartspace] Get DP from null-safety code path (https://github.com/LawnchairLauncher/lawnchair/pull/7045)
* [Lawnchair/Smartspace] Update dimension value (https://github.com/LawnchairLauncher/lawnchair/pull/7048)
* [Lawnchair] Allow live information to be configured on/off and custom endpoint (https://github.com/LawnchairLauncher/lawnchair/pull/7026)
* [Launcher/Iconloaderlib] Move PorterDuff to BlendModeColorFilterCompat
* [Lawnchair/Smartspace] Use new page indicator (https://github.com/LawnchairLauncher/lawnchair/pull/7061)
* [Lawnchair] Hide set as default page popup entry by default (https://github.com/LawnchairLauncher/lawnchair/pull/7064)
* [Lawnchair] Add Prefs2 cached to FlowUtils (https://github.com/LawnchairLauncher/lawnchair/pull/7080)
* [Lawnchair/Search] Improve drawer search animations and state (https://github.com/LawnchairLauncher/lawnchair/pull/7054)
* [Launcher] Allow creation of item outside of workspace (https://github.com/LawnchairLauncher/lawnchair/pull/7110)
* [Lawnchair] Migrate folder item ranking to FolderEntry.rank (https://github.com/LawnchairLauncher/lawnchair/pull/7108)
* [Lawnchair] Folder allapps shortcut popup (https://github.com/LawnchairLauncher/lawnchair/pull/7113)
* [Lawnchair] Implement scroll dock page (https://github.com/LawnchairLauncher/lawnchair/pull/7120)
* [Lawnchair] Richer haptic feedback (https://github.com/LawnchairLauncher/lawnchair/pull/7121)
* [Launcher] Adjustable MSDL vibration feedback level (https://github.com/LawnchairLauncher/lawnchair/pull/7122)
* [Lawnchair] Reimplement support for non-root app predictions (https://github.com/LawnchairLauncher/lawnchair/pull/6745)
* [Lawnchair] Customisable hotseat bg corner radius (https://github.com/LawnchairLauncher/lawnchair/pull/7133)
* [Lawnchair] Ignore diacritics in app search (https://github.com/LawnchairLauncher/lawnchair/pull/7136)
* [Lawnchair] Clean up experimental expressive API opt-in (https://github.com/LawnchairLauncher/lawnchair/pull/7218)
* [Lawnchair] Add Quickstep Protolog for Baklava (https://github.com/LawnchairLauncher/lawnchair/pull/7217)
* [Lawnchair] Remove backup residue from codebase (https://github.com/LawnchairLauncher/lawnchair/pull/7222)
* [Lawnchair/Build] Compile against 37.2 (https://github.com/LawnchairLauncher/lawnchair/pull/7251)

#### Fixes
* [Launcher] Limited Android 11 support
* [Launcher] Limited Android 10 support
* [Launcher] Icon pack support (by SuperDragonXD @ https://github.com/LawnchairLauncher/lawnchair/pull/6066)
* [Launcher] Crash when trying to grab display context from public reference in Android 12.0 and above
* [Launcher] Don't run predictiveBackTimestamp in less than Baklava device
* [Launcher] Reimplement Pull to trigger notifications
* [Lawnchair/Preference] Broken ASI/Global preference items for allapps search
* [Lawnchair] Stop Nightly auto updater from showing outdated result when app major version is newer than what available to source
* [Launcher] Crash with `NameNotFoundException` when app is archived in Android 15/16.0
* [Launcher] Null crash when trying to drop an icon on the home screen for some devices (fix: LawnchairLauncher/Lawnchair#6237)
* [Launcher] Crash due to incorrect thread looper for accessing cache
* [Launcher] Make icon shapes change instantaneous
* [Build] Update dependency to fully support 16-kb page size in Android (x86_64 architecture)
* [Lawnchair] Crash due to unable to access Window/Display context on Android 8.0 and above
* [Lawnchair] Reimplement Backup & Restore
* [Launcher] Fix or **_tried_** to make the app drawer listing listed in alphabetical order when loading icon in bulk
* [Lawnchair] Incorrect expressive lists behaviour
* [Lawnchair] Disable blur effect on bottom sheet on L3 incompatible devices for consistency
* [Lawnchair] Reimplement clear home screen action
* [Lawnchair] Crash when tapping on launcher preview
* [Launcher] Actually fix app drawer alphabetical listing when loading icon in bulk
* [Launcher] Mark home bounce as seen when user actually opens All Apps
* [Lawnchair] Reimplement app drawer suggested app toggle
* [Lawnchair] Disable all Android Desktop components
* [Lawnchair] Reimplement app drawer multiple lines logic (https://github.com/LawnchairLauncher/lawnchair/pull/6324)
* [Launcher] Skip initialising QuickstepProtoLog for Android 11
* [Lawnchair] Reimplement Lawnchair 13 migration
* [Launcher] Launcher render At a Glance widget as search widget in preview
* [Lawnchair/Iconloaderlib] Use correct default percentage for icon adaptive lightness
* [Lawnchair/Iconloaderlib] Correct wrap adaptive drawable behaviour
* [Launcher] Null exception in FloatingIconView
* [Lawnchair/Search] Add timeout for web suggestions (https://github.com/LawnchairLauncher/lawnchair/pull/6338)
* [Lawnchair] Restore custom app labels (https://github.com/LawnchairLauncher/lawnchair/pull/6364)
* [Lawnchair/Preference] Fix layout change animation of paddings on AppDrawerPreferences
* [Lawnchair/Preference] Resolve unnecessary launcherPopupOrder write (https://github.com/LawnchairLauncher/lawnchair/pull/6419)
* [Launcher] Resolve unnecessary model reload (https://github.com/LawnchairLauncher/lawnchair/pull/6420)
* [Launcher/Widget] Widget configuration activity fail to open due to BAL hardening on Android 14
* [Lawnchair/Iconloaderlib] Icon shadow can't be disabled by user preference
* [Lawnchair/Workspace] Disallow infinite scroll to the left when feed is enabled
* [Launcher] Crash when trying to use back gesture on below Android 16
* [Lawnchair] Limited Android 9, 8.1, 8.0 support
* [Lawnchair/Search] Launch app on enter for local search algorithm (https://github.com/LawnchairLauncher/lawnchair/pull/6477)
* [Lawnchair/Search] Stale search result (https://github.com/LawnchairLauncher/lawnchair/pull/6472)
* [Launcher] Don't run app archive on under Android 15
* [Launcher] Fix inconsistent haptic across all Android version
* [Lawnchair/Search] Fix accessibility issues with allapps blurred style
* [Lawnchair/Search] Fix search result and focus decorator
* [Launcher] Fix 5th folder preview item appearing out of bounds
* [Launcher] Fully reimplement IDP/DP customisation
* [Lawnchair/Settings] Pass preview IDP to preview renderer
* [Launcher] Move from 7x7 grid to 4x7
* [Lawnchair] Temporarily fix reloadIcons
* [Launcher/AllApps] Don't use workspace scale on allapps
* [Lawnchair/Settings] Leave Lawnchair settings lifecycle alone
* [Lawnchair/Settings] Correct dropdown menu count
* [Lawnchair] Register LawnchairApp activity handler
* [Launcher] Don't call IProtoLog in launcher-level
* [Launcher] Don't override device rotation prefs on phone form factor
* [Launcher] Reimplement icon gesture customisation
* [QuickSwitch] Reimplement ActivityTaskManager
* [QuickSwitch] Remove DesktopExperienceFlags
* [QuickSwitch] Implement Baklava compat
* [QuickSwitch] Initial QuickSwitch testing with Baklava
* [Lawnchair/Search] Trim whitespace in app drawer search query (https://github.com/LawnchairLauncher/lawnchair/pull/6538)
* [Launcher/Widget] Handle ISE when fetching widget previews for locked profiles (https://github.com/LawnchairLauncher/lawnchair/pull/6531)
* [Launcher] Apply themed icons to app drawer folder preview items (https://github.com/LawnchairLauncher/lawnchair/pull/6568)
* [Lawnchair/Caddy] Correct repeated folder name in Caddy layout (https://github.com/LawnchairLauncher/lawnchair/pull/6564)
* [Lawnchair/AllApps] Apply label size factor to allAppsIconTextSize (https://github.com/LawnchairLauncher/lawnchair/pull/6562)
* [QuickSwitch] Fix resource not found
* [Launcher/Folder] Adjust folder height and scrim handling
* [Launcher/Folder] Restore scrim and workspace scale on folder dismiss
* [Launcher] Reset icon scale and press state in BTV
* [Launcher] Clear pressed icon state on focus/launch
* [Lawnchair/Search] Use EXIF orientation of the metadata to preview the image
* [Lawnchair/BugReporter] Specify FGS type for logs uploader
* [Lawnchair/BugReporter] Grant URI explictly for sharing report
* [Lawnchair/Search] Remove unnecessary URI permission flags from file intent
* [Lawnchair/Search] Remove fallback image logging
* [QuickSwitch] Initial QuickSwitch testing with Vanilla Ice Cream QPR2 (https://github.com/LawnchairLauncher/lawnchair/pull/6624)
* [Launcher/Folder] Reimplement folder label in dock toggle (https://github.com/LawnchairLauncher/lawnchair/pull/6642)
* [Lawnchair] Extend LawnchairApp with LauncherApplication (https://github.com/LawnchairLauncher/lawnchair/pull/6629)
* [Lawnchair/Preference] Don't instantly make the announcement item opaque (https://github.com/LawnchairLauncher/lawnchair/pull/6673)
* [Launcher3] Don't call archive status check on low APIs (https://github.com/LawnchairLauncher/lawnchair/pull/6687)
* [Lawnchair] Refresh icon preferences (https://github.com/LawnchairLauncher/lawnchair/pull/6690)
* [Launcher3/PagedView] Use EdgeEffectCompat for fling effect (https://github.com/LawnchairLauncher/lawnchair/pull/6691)
* [Lawnchair/Launcher] Update launcher theme when Preference change (https://github.com/LawnchairLauncher/lawnchair/pull/6697)
* [Lawnchair/Iconloaderlib] Reimplement transparent icons (https://github.com/LawnchairLauncher/lawnchair/pull/6698)
* [Lawnchair/Search] Cap oversized preview bitmaps with extreme aspect ratio (https://github.com/LawnchairLauncher/lawnchair/pull/6584)
* [Lawnchair/Colour] Update allapps colour (https://github.com/LawnchairLauncher/lawnchair/pull/6702)
* [Launcher3/Allapps] Make folder in allapps follow row height settings (https://github.com/LawnchairLauncher/lawnchair/pull/6713)
* [Launcher3/Iconloaderlib] Use UserHandle.of() instead of getUserHandleForUid() (https://github.com/LawnchairLauncher/lawnchair/pull/6714)
* [Lawnchair/Search] Prevent search header from clipping for tablet
* [Lawnchair/Colour] Link allapps opacity to correct colours (https://github.com/LawnchairLauncher/lawnchair/pull/6636)
* [Lawnchair] Memory leak reported by LeakCanary (https://github.com/LawnchairLauncher/lawnchair/pull/6752)
* [Launcher3] Support Android 17 QPR1 Beta 3 (https://github.com/LawnchairLauncher/lawnchair/pull/6773)
* [Lawnchair] Hide destructive popup when workspace is locked (https://github.com/LawnchairLauncher/lawnchair/pull/6774)
* [Launcher3] Fix crash when adding clock widget in Android 13 and below (https://github.com/LawnchairLauncher/lawnchair/pull/6790)
* [Launcher3] Fix back navigation on Android 13 and below (https://github.com/LawnchairLauncher/lawnchair/pull/6791)
* [Launcher3] Folder dismissing during screenshot gesture (https://github.com/LawnchairLauncher/lawnchair/pull/6792)
* [Launcher3] Clear two layers stale state from highlight decorator (https://github.com/LawnchairLauncher/lawnchair/pull/6819)
* [Lawnchair/Preference] Set allapps two line preference to false by default (https://github.com/LawnchairLauncher/lawnchair/pull/6820)
* [Lawnchair/Search] Don't align padding of the search too close to the screen (https://github.com/LawnchairLauncher/lawnchair/pull/6822)
* [Lawnchair/Preference] Set allapps opacity to .5f by default (https://github.com/LawnchairLauncher/lawnchair/pull/6829)
* [Lawnchair/IconProvider] Icon not refreshing after changing icon preferences (https://github.com/LawnchairLauncher/lawnchair/pull/6738)
* [Lawnchair/Search] Remove RawContacts columns from contact search preventing silent fails (https://github.com/LawnchairLauncher/lawnchair/pull/6834)
* [Lawnchair/Search] Don't make search result content sit too close to layout (https://github.com/LawnchairLauncher/lawnchair/pull/6832)
* [Lawnchair/Search] Improve performance using StateFlow from code that uses LiveData (https://github.com/LawnchairLauncher/lawnchair/pull/6843)
* [Lawnchair/Build] Keep protobuf rules (https://github.com/LawnchairLauncher/lawnchair/pull/6845)
* [Launcher3] Handle NCDFE for devicestate flags on rotating (https://github.com/LawnchairLauncher/lawnchair/pull/6627)
* [Launcher3/Folder] Find the correct folder size depending on which parent owned them (https://github.com/LawnchairLauncher/lawnchair/pull/6850)
* [Launcher3] Custom notification dot colour not being applied (https://github.com/LawnchairLauncher/lawnchair/pull/6851)
* [Lawnchair/About] Update dead link in About attribution (https://github.com/LawnchairLauncher/lawnchair/pull/6880)
* [Lawnchair] Downsample carousel thumbnails and scope image loads to view (https://github.com/LawnchairLauncher/lawnchair/pull/6883)
* [Launcher3] Restore workspace alpha on swipe-to-home reveal cancellation (https://github.com/LawnchairLauncher/lawnchair/pull/6793)
* [Lawnchair/QSB] Launch Startpage app from dock search bar (https://github.com/LawnchairLauncher/lawnchair/pull/6886)
* [Launcher3/Allapps] Double tap gesture quickly show and dismissed the page on trigger (https://github.com/LawnchairLauncher/lawnchair/pull/6905)
* [Launcher3/Launcher] Don't run onBackInvoked() on less than Android 14
* [Lawnchair] Font not updated to expressive variant
* [Launcher] Preserve item position and widget sizes on grid resize (https://github.com/LawnchairLauncher/lawnchair/pull/6873)
* [Launcher] Align home screen icons based on text size (https://github.com/LawnchairLauncher/lawnchair/pull/6921)
* [Launcher3] General code lifecycle bugs (https://github.com/LawnchairLauncher/lawnchair/pull/6882)
* [Launcher3] Don't crash from missing taskbar size for Android 8.X and 9 (https://github.com/LawnchairLauncher/lawnchair/pull/6927)
* [Lawnchair] Empty bound for Android 11 and older (https://github.com/LawnchairLauncher/lawnchair/pull/6937)
* [Launcher3] Icon Uri crash for Android 14 and older
* [Lawnchair/QSB] Compose QSB does not relinquish space when it's disabled (https://github.com/LawnchairLauncher/lawnchair/pull/6960)
* [Launcher] Guard wallpaper hint with API check to prevent crash on Android 12.0 and older (https://github.com/LawnchairLauncher/lawnchair/pull/6976)
* [Launcher] Limited Android 8.0 and 8.1, and Android 9 support (https://github.com/LawnchairLauncher/lawnchair/pull/6978)
* [Launcher] Don't aggressively optimise common rules (https://github.com/LawnchairLauncher/lawnchair/pull/6987)
* [Lawnchair] Remove restart requires from force monochrome strings
* [Launcher3] Apply icon packs to work/private profile apps (https://github.com/LawnchairLauncher/lawnchair/pull/6990)
* [Launcher3/Allapps] Tighten app drawer spacing around search and tabs (https://github.com/LawnchairLauncher/lawnchair/pull/6991)
* [Launcher/Allapps] Hide work/private badges on their drawer tabs (https://github.com/LawnchairLauncher/lawnchair/pull/6992)
* [Launcher3] Auto-contrast profile tab text against background (https://github.com/LawnchairLauncher/lawnchair/pull/6993)
* [Launcher3] Respect folder colour preference in spring animations (https://github.com/LawnchairLauncher/lawnchair/pull/6994)
* [Launcher3/Allapps] Keep search inactive when switching profile tabs (https://github.com/LawnchairLauncher/lawnchair/pull/6997)
* [Launcher3] Clear stuck workspace blur after drawer/folder close (https://github.com/LawnchairLauncher/lawnchair/pull/6998)
* [Launcher3] Close drawer folders when dismissing allapps via the edge of the sheet (https://github.com/LawnchairLauncher/lawnchair/pull/6999)
* [Lawnchair/QSB] Guard QSB ComposeView measurement in launcher preview to prevent crash (https://github.com/LawnchairLauncher/lawnchair/pull/7013)
* [Launcher3] Align widget visually to the icon (https://github.com/LawnchairLauncher/lawnchair/pull/7047)
* [Lawnchair] Restore default icon after resetting a custom override (https://github.com/LawnchairLauncher/lawnchair/pull/7031)
* [Lawnchair] Show themed icon on customise popup when icon theming is on (https://github.com/LawnchairLauncher/lawnchair/pull/7053)
* [Lawnchair] Restore bottom sheet exit behaviour on icon changed (https://github.com/LawnchairLauncher/lawnchair/pull/7060)
* [Launcher3] Fix Protolog init crash on Q and R (below Release 41) (https://github.com/LawnchairLauncher/lawnchair/pull/7071)
* [Lawnchair] Fix Nightly auto updater preference set on wrong if-condition (https://github.com/LawnchairLauncher/lawnchair/pull/7072)
* [Lawnchair] Cancel GestureController when launcher instance's destroyed (https://github.com/LawnchairLauncher/lawnchair/pull/7078)
* [Launcher3] Prevent clock widgets crashing on Android 14 (https://github.com/LawnchairLauncher/lawnchair/pull/7075)
* [Lawnchair] List item use the incorrect shapes for rendering template (https://github.com/LawnchairLauncher/lawnchair/pull/7089)
* [Launcher3] Avoid calling file related to Protolog under S (https://github.com/LawnchairLauncher/lawnchair/pull/7090)
* [Launcher3] Clear stuck workspace icon blur on home (https://github.com/LawnchairLauncher/lawnchair/pull/7032)
* [Lawnchair] Refresh configured icon gestures (https://github.com/LawnchairLauncher/lawnchair/pull/7097)
* [Lawnchair] Revert align widget visually to the icon (https://github.com/LawnchairLauncher/lawnchair/pull/7095)
* [Lawnchair] Show background for QSB preview (https://github.com/LawnchairLauncher/lawnchair/pull/7118)
* [Lawnchair] Adjust dock preview sizing to show item with 2 hotseat rows (https://github.com/LawnchairLauncher/lawnchair/pull/7119)
* [Launcher3] Reimplement legacy shortcut path (https://github.com/LawnchairLauncher/lawnchair/pull/7027)
* [Launcher3] Invert condition for lifecycle method calls (https://github.com/LawnchairLauncher/lawnchair/pull/6401)
* [Lawnchair] Align app preview list on selecting app in folder (https://github.com/LawnchairLauncher/lawnchair/pull/7128)
* [Launcher3] Drawer folder crashes (https://github.com/LawnchairLauncher/lawnchair/pull/7130)
* [Lawnchair] Stale Live information announcement cache (https://github.com/LawnchairLauncher/lawnchair/pull/7132)
* [Launcher] Lifecycle crash on Android O, O_MR1, Q (https://github.com/LawnchairLauncher/lawnchair/pull/7131)
* [Lawnchair/Search] Make search result padding depends on exact text padding (https://github.com/LawnchairLauncher/lawnchair/pull/7134)
* [Launcher] Apply launcher colour on widget dynamic theming (https://github.com/LawnchairLauncher/lawnchair/pull/7135)
* [Lawnchair] Disable App Prediction for pre Q device (https://github.com/LawnchairLauncher/lawnchair/pull/7139)
* [Lawnchair] Slider pref crash with VibrationAttributes (https://github.com/LawnchairLauncher/lawnchair/pull/7140)
* [Launcher] Use old widget theme implementation on Android 12 and lower (https://github.com/LawnchairLauncher/lawnchair/pull/7147)
* [Launcher3] Blank QSB space being overridden by hotseat grid adjustment (https://github.com/LawnchairLauncher/lawnchair/pull/7148)
* [Launcher3/IDP] Fix init WindowManager in grid preview (https://github.com/LawnchairLauncher/lawnchair/pull/7151)
* [Launcher] Disable managed/private space user on affected 37.2 Beta 3 device (https://github.com/LawnchairLauncher/lawnchair/pull/7172)
* [Launcher] Widget colouring compatibility with Android 13 (https://github.com/LawnchairLauncher/lawnchair/pull/7174)
* [Lawnchair] Prevent crash when themed clock drawable is unavailable (https://github.com/LawnchairLauncher/lawnchair/pull/7157)
* [Launcher] Compatibility layer for config night mode check for API <30 (https://github.com/LawnchairLauncher/lawnchair/pull/7183)
* [Launcher3] Fix inconsistent L3 theming around work pfp and widget selector (https://github.com/LawnchairLauncher/lawnchair/pull/7185)
* [Launcher3] Open prediction settings from Lawnchair instead of system (https://github.com/LawnchairLauncher/lawnchair/pull/7187)
* [Lawnchair] Widget sheet recycler view resource mismatch with AOSP (https://github.com/LawnchairLauncher/lawnchair/pull/7188)
* [Lawnchair] Status bar clock option not responsive on first launch (https://github.com/LawnchairLauncher/lawnchair/pull/7196)
* [Lawnchair] Honor force monochrome icon prefs (https://github.com/LawnchairLauncher/lawnchair/pull/7164)
* [Lawnchair] Legacy shortcut does not show source target app (https://github.com/LawnchairLauncher/lawnchair/pull/7197)
* [Launcher3] Fix infinite scroll wrap animation direction (https://github.com/LawnchairLauncher/lawnchair/pull/6653)
* [Lawnchair] Revert Quickstep Protolog for Baklava
* [Lawnchair] Predictive nav animation is gone after dependency upgrade (https://github.com/LawnchairLauncher/lawnchair/pull/7229)
* [Lawnchair/QSB] Recompose QSB on state changes (https://github.com/LawnchairLauncher/lawnchair/pull/7242)
* [Launcher3] Compensate text style for predicted app icon (https://github.com/LawnchairLauncher/lawnchair/pull/7250)

### 🥞 Development 4 Release 1 (Snapshot 10)

~~Bug fixes only~~ You may see duplicated changelogs in this release because of merged diverged timeline.

In this release, the initial 16-dev branch has now merged to QPR1 branch,
meaning you'll have tons of improvements from upstream Launcher3 source.

Build: BD4.2412 (latest), BD4.2112, BD4.2012, BD4.2311, BS10.2111, BS10.2011

Compatibility list:

| 🏗️ Crash   | 🥞 Fully supported |
|-------------|--------------------|
| Android 8.1 | Android 12.0       |
| Android 9   | Android 12.1       |
| Android 10  | Android 13         |
| Android 11  | Android 14         |
|             | Android 15         |
|             | Android 16         |


#### Features

* [Launcher] Move to Google Sans Flex font (TODO)*
* [Lawnchair] Material 3 Expressive Settings (Phase 2, TODO)*
* ~~[Lawnchair] Better At-a-Glance perceptive wallpaper colour luminance detection*~~
    * ~~Big word that means Lawnchair will take system default hint bright/dark theme and fallback to luminosity detection for bright/dark mode detection in At a Glance.*~~
* ~~[Launcher] Enable Material Expressive Folder Expansion animation flag~~*
    * Disabled due to rendering bugs*
* [Launcher/Font] Variable font for Launcher3 (????????)*
* [Launcher/Popup] Dynamically get app widget popup icon*
* [Launcher] Foldable support (actually real)*
* [Launcher] Google Sans Flex font uses almost the exact same configuration as Pixel*
* [Launcher] Enable bulk loading by default*
* [Launcher] Tablet support (ish)*

#### Fixes
* [Launcher] Fix a lot of internal basic functionality*
* [Lawnchair] Re-added some Lawnchair-specific code*
* [Launcher] Fix workspace navigation*
* [Launcher] Fix allapps navigation*
* [Launcher] Fix folder navigation*
* [Launcher] Support Android 12.0/12.1/13/14/15*
* [Lawnchair/Smartspace] At-a-Glance can't launch activity due to background startup restrictions on Android 14 and above*
* [Launcher] Use Lawnchair theming colour for allapps*
* [WM-Shell] Fix conflict with prebuilts aidl, make Release build work again*
* [Launcher/Desktop] Correct deviceHasLargeScreen check for Baklava*
* [Lawnchair/Search] Make search layout changes work*
* [Lawnchair/Smartspace] Allow disabling the smartspace feature*
* [Launcher3] Widget preview crash for no reason at all on compatible Android version*
* [Launcher3] Correct fallback (blur unsupported) allapps colour

### Snapshot 9 (Development 4 Release 1)

This snapshot marks the first time Bubble Tea QPR1 is able to assemble the APK without errors,
all that's left is bug bash testing. Limited visibility closed testing is available.

Build: BS9.2011

This is a developer-focused change log:
* Re-added searchuilib
* SearchUiLib updated to latest commits before being private
* Exclude disabled variant of Compose launcher3 features
* Fix all errors in Lawnchair side

### Snapshot 8 (Development 4 Release 1)

Build: BS8.1811

This snapshot marks the first time Bubble Tea QPR1 is able to compile ALL of the Launcher3 code
without errors, that leaves Lawnchair code as the remaining task before successfully compiling
Bubble Tea QPR1

This is a developer-focused change log:
* Migrate some functions to new changes
* WM-Shell (and WM-Shell Shared) updated to Android 16-0.0_r3 (Android 16.0.0 Release 3)
* Add Mechanics (SystemUI Platform Library)
* Some unresolved reference in Lawnchair code

### Snapshot 7 (Development 4 Release 1)

Build: BS7.1711

This snapshot marks the first time Bubble Tea QPR1 is able to pass KSP build stage without any
hiccups, the next 1 or 2 snapshots will be focusing on compilation stage, which should be the last
stage before we can get started on pE Development 4.

This is a developer-focused change log:
* Codebase updated to Android 16-0.0_r3 (Android 16.0.0 Release 3)
* Prebuilt updated to Android 16-0.0_r3 (Android 16.0.0 Release 3)
* Platform libs updated to Android 16-0.0_r3 (Android 16.0.0 Release 3)
    * Move ViewCapture to platform lib
    * Add Displaylib
* Flags updated to Android 16-0.0_r3 (Android 16.0.0 Release 3)
* Pull concurrent, dagger (the launcher3) as module
    * TODO? We might need to migrate it to build source like compose instead
* Lots of prebuilt documentations update
* Add compose as part of launcher3 build source
    * Removed test because I hate configuration gradle
    * cc: @validcube fix me, cc: too bad

## Bubble Tea [r2]

Lawnchair 16 pE Development 3 is here! Contributors are encouraged to target this branch instead of
older (i.e., Lawnchair `15-dev`).

### Development 3 Release 3

Build: BD3.2012 (latest), BD3.1312, BD3.0812, BD3.0712

Compatibility list:

| 🏗️ Crash   | 🥞 Fully supported |
|-------------|--------------------|
| Android 8.0 | Android 12.0       |
| Android 8.1 | Android 12.1       |
| Android 9   | Android 13         |
| Android 10  | Android 14         |
|             | Android 15         |
|             | Android 16         |

#### Features
* [Lawnchair] Features from Lawnchair 15-dev 07122025
* [Launcher] Google Sans Flex font uses almost the exact same configuration as Pixel
* [Launcher] Enable bulk loading by default
* [Launcher] Tablet support (ish)
* [Launcher] Refreshed Material 3 Expressive
* [Lawnchair] Refreshed Material 3 Expressive
* [Launcher] Foldable support (ish)
* [Lawnchair] Warn when nightly updater is updating to next major version
* [Lawnchair/Smartspace] Add Lunar calendar option
* [Lawnchair/Smartspace] Promote smartspace calendar to stable
* [Lawnchair] Expressive redesign Phase 2
* [Lawnchair] GestureNavContract toggle in experimental features
* [Lawnchair] Set GestureNavContract on by default on Google device
* [Lawnchair] Set GestureNavContract on by default on Nothing device
* [Lawnchair] Don't show warning on known compatible device
* [Lawnchair] Swipe to dismiss announcement perform haptic on successful dismiss
* [Lawnchair] Remove Inter v3 fonts from Lawnchair entirely (to reduce apk size)
* [Lawnchair] Add Google Sans variable font as fallback to Google Sans Flex (to support the most of the world languages, yes that increases sizes)
* [Launcher] Google Sans variable normal style
* [Lawnchair] Improve Google device compatibility check
* [Lawnchair] Improve Samsung device compatibility check

#### Fixes
* [Launcher3] Widget preview crash for no reason at all on compatible Android version
* [Launcher] Hotseat Google provider failed to open due to Android pending intent restrictions on Android 14/15/16/16.1
* [Launcher3/DeviceProfile] Positioning of first folder during Lawnchair setup
* [Lawnchair/AllApps] Reimplement app drawer opacity
* [Lawnchair/Recents] Reimplement recents overview opacity
* [Lawnchair/Preference] Misaligned slider and text preference
* [Lawnchair/Smartspace] Allow disabling the smartspace feature
* [Lawnchair] Settings now correctly animate expand/shrink items
* [Lawnchair] Correctly display warning in experimental features (race conditions)
* [Project] Support for Android Studio 2025.2.3 Canary 5 (Bump to AGP 9.0.0-beta05)
* [Lawnchair] Offer a toggle to disable/enable suggestions instead of linking it to ASI if the device is not Google Pixel

### Development 3 Release 2

Build: BD3.2211

Compatibility list:

| 🏗️ Crash   | 💫 Limited features | 🥞 Fully supported |
|-------------|---------------------|--------------------|
| Android 8.1 |                     | Android 12.0       |
| Android 9   |                     | Android 12.1       |
| Android 10  |                     | Android 13         |
| Android 11  |                     | Android 14         |
|             |                     | Android 15         |
|             |                     | Android 16         |

#### Features
* [Lawnchair] Updated screenshots compressions and fastlane screenshot
* [Lawnchair] Features from Lawnchair 15-dev
* [Launcher3] Widget preview crash for no reason at all on compatible Android version

#### Fixes
* [Lawnchair] Conflict from Lawnchair 15-dev

### Development 3 Release 1

Build: BD3.1711

The biggest change log ever, this marked the end of Bubble Tea [r2] branch as future development
switched to Bubble Tea [QPR1]. See you at Snapshot 7 or Development 4!

(Again) Originally going to launch D3 if most of the issue on tracker have been resolved, but hit a
stability milestone instead.

This release includes 4 new features, and 33 bug fixes,
Reimplemented some of Lawnchair features, better sizing of home screen, updated README.md screenshot
and the inclusion of Bubble Tea project into the official Lawnchair repository as 16-dev!

This release have been tested with:
* ☁️ Pixel 6 (Android 12.0)
* 📱 Nothing (3a)-series (Android 15, Android 16.0)
* 📱 Vivo Y21 (Android 12.0)
* 📱 HTC Wildfire E3 lite (Android 12.0)
* Many more! Unfortunately I only count build from pE Open testing!

Compatibility list:

| 🏗️ Crash   | 💫 Limited features | 🥞 Fully supported |
|-------------|---------------------|--------------------|
| Android 8.1 |                     | Android 12.0       |
| Android 9   |                     | Android 12.1       |
| Android 10  |                     | Android 13         |
| Android 11  |                     | Android 14         |
|             |                     | Android 15         |
|             |                     | Android 16         |

> [!NOTE]
> QuickSwitch compatibility have not been tested at any time during the development of Bubble Tea!

#### Features
* [Lawnchair] Complex Clover icon shape
* [Lawnchair] Very Sunny icon shape
* [Lawnchair/Font] Update Google Fonts listing to 25102025
* [Lawnchair/Gesture] Allow Open Quick Settings*

#### Fixes
* Disable OEM override on launcher settings, (reimplement `ENABLE_AUTO_INSTALLS_LAYOUT` | c51b2a221838aefb610b7146fc4ef7cb34e5e495)
* [Lawnchair/Iconloaderlib] Reimplement custom app name
* [Lawnchair] Reimplement Launcher3 debug page
* [Lawnchair] Reimplement Caddy and App drawer folder
* [Lawnchair] Reimplement Hotseat toggle
* [Lawnchair] Reimplement Favorite application label
* [Lawnchair] Hotseat positioning with favorite icon label enabled placed the same even if label is disabled
* [Lawnchair] Hotseat background now have a reasonably sized margin compared to D2
* [Lawnchair] Qsb sizing now correctly estimate the width based on width of the app/widget layout or DeviceProfile on device with inlined Qsb
* [Lawnchair] Reimplement Allapps opacity configuration
* [DeviceProfile] Crash from createWindowContext on less than Android 12.0
* [QuickstepLauncher] Ignore trying to set SystemUiProxy icon sizes on less than Android 12.1
* [Lawnchair/BlankActivity] Apply Material 3 Expressive button animations
* [Launcher] Disable add widget button if home screen is locked
* [Lawnchair/Iconloaderlib] Crash when trying to set `null` monochrome icon on less than Android 12.1
* [SystemUI/Unfold] Crash when getting configuration for foldable-specific resources
* [Lawnchair/Iconloaderlib] Don't parse monochrome drawable in Android 12.1 or less
* [Launcher3/AllApps] Allow theming of Expressive allapps
* ~~[Lawnchair] Lawnchair can now be compiled in release mode~~
    * [Lawnchair] Fix crashes with WM-Shell
* [Lawnchair] Bottom sheet blur will only trigger when your device supported blur*
* [Lawnchair/Lazy] Corner radii of lazy component now matched radius of non-lazy*
* [Lawnchair/Debug] Cleanup the debug menu*
* [Lawnchair/Docs] Warn off danger using 16-dev branch*
* [Launcher3] Crash with predictive back on some device using Android 13/14
* [Launcher3] WindowInsets crash in Android 11
* [Launcher3] Widgets crash on some device using Android 12
* [Launcher3/PrivateSpace] Use custom icons of Private Space lock*
* [Launcher3/Iconloaderlib] App badges for work profile*
* [Lawnchair] Update spacing for dock search settings*
* [Launcher3] Quickstep dispatcher crash on Android 13
* [Launcher3] Crash due to missing resources for Android 8.0
* [Lawnchair/Docs] Update screenshot to 16-dev

### Development 2

Originally going to launch D2 if most of the comestic bug fixes have been resolved, but hit a
stability milestone instead.

This release includes 15 new features, and 20 bug fixes,
Lawnchair settings now takes shape of initial material 3 expressive redesign, [(but by no mean finish!)][Lawnget]
launcher should now render icons better than D1 milestone, with auto-adaptive icons feature reimplemented.

This release have been tested with:
* ☁️ Pixel 6 (Android 12.0) - Build: Ad-hoc
* ☁️ Pixel 6a (Android 12.1) - Build: Ad-hoc
* ☁️ Pixel 7 (Android 13) - Build: Ad-hoc
* ☁️ Pixel 9 (Android 15, Android 16.0) - Build: Ad-hoc
* ☁️ Pixel 9 Pro Fold (Android 14, Android 15) - Build: Ad-hoc
* ☁️ Vivo V40 (Android 15) - Build: Ad-hoc
* ☁️ Xiaomi MIX (Android 15) - Build: Ad-hoc
* 📱 Nothing (3a)-series (Android 15) - Build: pE-`15102025`
* 📱 Pixel 9 Pro XL (Android 16.0 QPR2 Beta 2) - Build: pE-`02102025`
* 📱 BLU View 5 Pro (Android 14) - Build: pE-`02102025`
* 📱🔥 Vivo Y21 (Android 12.0) - Build: pE-`08102025`

> [!NOTE]
> QuickSwitch compatibility have not been tested at any time during the development of Bubble Tea!

[Lawnget]: https://www.google.com/teapot

Compatibility list:

| 🏗️ Crash   | 💫 Limited features | 🥞 Fully supported |
|-------------|---------------------|--------------------|
| Android 8.1 | Android 12.0        | Android 12.1       |
| Android 9   |                     | Android 13         |
| Android 10  |                     | Android 14         |
| Android 11  |                     | Android 15         |
|             |                     | Android 16         |

#### Features

* Enable All Apps Blur Flags on Phone (oops, forgot about the allAppsSheetForHandheld flag)
* Make Safe Mode check more reliable
* Smartspace Battery now reports battery charging status of Fast (more than 90% of 20 W) and Slow (less than 90% of 5 W) charging
* Show pseudonym version to Settings
* Resizing workspace calculate items position more accurately
* Update Lawnchair default grid size to 4×7 (or 4×6 with smartspace widget)
* Reimplement Hotseat background customisation
* Make haptic on a locked workspace use Google MSDL vibration
* Make Launcher3 colour more accurate to upstream Android 16
* ProvideComposeSheetHandler now have expressive blur
* Lawnchair Settings now uses Material 3 Expressive
* Animate keyboard on/off state on app drawer search (Try enabling automatically show keyboard in app drawer settings and swipe up and down or directly tap “Apps list” in popup menu) -> (Backport not possible)
* Add LeakCanary check to all debug variant of the application
* [DEBUG] Launcher3 feature status diagnostic check in debug menu
* [Documentation] Add more visibility into both app certificate and SLSA verification for app authenticity check [VERIFICATION.md](VERIFICATION.md)
* [Documentation] Initial drafting of Improve documentation v6 (pave-path)
* [Launcher] Widget animations during resize
* [Iconloaderlib] Enable second hand for the clock app

#### Fixes

* Fix unable to access preview for icon style
* Popup's Arrow Theme now has the correct theme
* Widget should open normally after a workaround (C7evQZDJ)
* Fix (1) Search bar and Dock, (2) Folders and App Drawer settings didn't open due to init problems
* Lawnchair should hopefully remember what grid they should be using
* Most if not all of Lawnchair settings should be usable without crashes
* Correct Baseline Profile from old `market` to `play` variant, and now should calculate profile for `nightly`
* Fix Private Space crash when Lawnchair is set as Launcher due to flags only available on A16
* Fix crash on a device with strict export receiver requirements on A14
* Interactable widget crashing due to App Transition Manager being null (C7evQZDJ)
* Icon not responding to mouse cursor -> (Backported to Lawnchair 15)
* Rare NoSuchMethodError crash on IMS canImeRenderGesturalNavButtons
* [Lawnchair] Reimplement Bulk icons toggle
* SettingsCache crashing with SecurityException with unreadable keys (@hide) in Android 12 and newer (assume false)
* Assume flags `enableMovingContentIntoPrivateSpace` is false when ClassNotFoundException on Android 16 devices
* Rare NoSuchMethodError crash on SurfaceControl setEarlyWakeupStart and setEarlyWakeupEnd
* Properly align built-in smartspace in workspace
* Use WM Proxy from Lawnchair instead of System, fix Android 8.1/9/10/11/12.0/12.1 regarding SE, NSME like SystemBarUtils -> (dWkyIGw9), (reworked CllOXHJv)
    * LawnchairWindowManagerProxy have been migrated to Dagger
    * SystemWindowManagerProxy have been left unused
* [Lawnchair/Iconloaderlib] Update CustomAdaptiveIconDrawable to latest AOSP 13
* [Iconloaderlib] Reset most of the changes to favour more AOSP 16_r02 code then Lawnchair (need rewrite)
    * fix icon loaded in monochrome and always monochrome when it is not supposed to
    * fix notification dots being twice the size with notification count
* [Lawnchair/Iconloaderlib] Reimplement Lawnchair Iconloaderlib (adaptive icons, monochrome, regular icon)

#### Known Bugs
* Preview can't show device wallpaper -> (lIxkAYGg)
* IDP Preview doesn't refresh on settings change -> workaround is to hit apply and re-open the preview -> (ZbLX3438)
* Workspace theme doesn't refresh until restart -> (ZbLX3438) -> Fixed as part of (31lLEflf, 1MevNrzp)
* Lawnchair Colour can't handle restart causing default colour to be used instead -> Fixed? -> Properly fixed as part of (31lLEflf, 1MevNrzp)
* (Investigating) Work profile switch on widget selector *may* have reverted to Lawnchair 15 style
* Full lists: https://trello.com/b/8IdvO81K/pe-lawnchair

### Development 1

First development milestone! Basic launcher functionality should be stable enough.

* Make Lawnchair Launcher launchable in Android 12.1, 13, 14, 15, 16
* Remove two deprecated features (Use Material U Popup, and Use dot pagination)
* Add pseudonym version in debug settings
* Adapt Lawnchair code to Launcher3 16
* Make basic features of Launcher work (App Drawer, Home Screen, Search, Folders, Widgets)
* Enable Material Expressive Flags (Try swiping through launcher page)
* Enable All Apps Blur Flags (Try opening All Apps on supported devices)
* Enable MSDL Haptics Feedback Flags (Try gliding widget or icons across the homescreen)
* Make Predictive Back Gesture work on Android 13, 14, 15, 16 (Try swiping left or right on gesture-based navigational)
* Programmatically set Safe Mode status

#### Known Bugs

* App Icon may sometimes render with less than 0 in height/width causing blank icon to be rendered and crashing ISE on customising icons -> (31lLEflf)
* Any Lawnchair settings using IDP will crash the launcher -> Fixed in Lawnchair 16 pE Development 2
* Icon pack isn't usable -> (DXo69Qzd)
* Dynamic icons will not be themed by launcher
* Full lists: https://trello.com/b/8IdvO81K/pe-lawnchair

### Snapshot 6

This is a developer-focused change log:

This snapshot marks the first time Lawnchair 16 is able to compile and build an APK!

* Fix all issues with Java files in both `lawn` and `src`
* Make Lawnchair compilable (with instant crash)
* Move to KSP for Dagger code generation

### Snapshot 5

This is a developer-focused change log:

This snapshot now able to compile all sources (Kotlin files only)

* Fix MORE MORE MORE `lawn` issues
* Use Gradle Version Catalog for consistent dependency version across all modules (Full implementation @ LawnchairLauncher/Lawnchair#5753)
* Magically fix ASM Instrumentation issues (I didn't do anything, it just works now)
* Fix ALL the issues in kotlin stage (`compileLawnWithQuickstepNightlyDebugKotlin`)
* Reintroduce some features from Lawnchair
* Add compatibility checks and workarounds for them
* Fix most issues with Java files in both `lawn` and `src`

### Snapshot 4

This is a developer-focused change log:

This snapshot marks the first time Lawnchair 16 is able to compile all Launcher3 sources!

* Add `MSDLLib` to `platform_frameworks_libs_systemui`
* Add `contextualeducationlib` to `platform_frameworks_libs_systemui`
* Fix issues in both `lawn` and `src` modules
* Fix AIDL sources
* Resolve Lawnchair/LC-TODO lists
* Merge `wmshell.shared` res with res from `wmshell`
* Consistent build reproducibility by specifying dependencies in `build.gradle`
* Some ASM Instrumentation issues (and re-add some…)
* Update documentations

### Snapshot 3

This is a developer-focused change log:

Not a lot of errors left to go!

* Finish correctly implementing all Dagger functions (?)
* Merge Lawnchair 15 Beta 1 into Bubble Tea
    * Support for 16-kb page size devices
* Repository rebased and dropped commit
    * Switch back from turbine-combined variant to javac variant for prebuilt SystemUI-core-16 because issues with LFS
        * MORE MORE fixes regarding turbine-combined to javac
* Publish `platform_frameworks_libs_systemui` to pe 16-dev branch
* ATLEAST check to almost every launcher3 source file
* `Utils` module (stripped)
* Fix Dagger duplicated classes (because of Dagger dependency ksp/kapt mixing)
* Build reproducibility improvements by specifying dependencies in `build.gradle` files
* Fix some of the issues in both `lawn` and `src` modules

### Snapshot 2

This is a developer-focused change log:

This snapshot milestone marked the first time Lawnchair now able to compile all supplementary
modules, `src` + `lawn` will be in Snapshot 5 or Development 1 milestone.

* Merge flags
* Fix some issues with launcher3 sources.
* A temporary workaround with framworks.jar not adding in anim module.
* Shared not having access to animationlib.
* **Switch from javac variant to turbine-combined variant for prebuilt SystemUI-core-16**.

### From Initial snapshot 0 and 1

This is a developer-focused change log:
* Prebuilt updated to Android 16-0.0_r2 (Android 16.0.0 Release 2)
* Submodule have also been refreshed to A16r2
* Baklava Compatlib (QuickSwitch compatibility not guaranteed)
* Refreshed internal documentation like prebuilt, systemUI
