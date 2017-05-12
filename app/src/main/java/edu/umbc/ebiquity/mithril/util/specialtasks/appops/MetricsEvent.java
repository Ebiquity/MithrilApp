package edu.umbc.ebiquity.mithril.util.specialtasks.appops;

/**
 * Created by Prajit on 5/7/2017.
 */

public class MetricsEvent {
    /*
    // Unknown view
    public int VIEW_UNKNOWN = 0;

    // OBSOLETE
    public int MAIN_SETTINGS = 1;

    // OPEN: Settings > Accessibility
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCESSIBILITY = 2;

    // OPEN: Settings > Accessibility > Captions
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCESSIBILITY_CAPTION_PROPERTIES = 3;

    // OPEN: Settings > Accessibility > [Service]
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCESSIBILITY_SERVICE = 4;

    // OPEN: Settings > Accessibility > Color correction
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int  ACCESSIBILITY_TOGGLE_DALTONIZER = 5;

    // OPEN: Settings > Accessibility > Accessibility shortcut
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCESSIBILITY_TOGGLE_GLOBAL_GESTURE = 6;

    // OPEN: Settings > Accessibility > Magnification gestures
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCESSIBILITY_TOGGLE_SCREEN_MAGNIFICATION = 7;

    // OPEN: Settings > Accounts
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCOUNT = 8;

    // OPEN: Settings > Accounts > [Single Account Sync Settings]
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCOUNTS_ACCOUNT_SYNC = 9;

    // OPEN: Settings > Accounts > Add an account
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCOUNTS_CHOOSE_ACCOUNT_ACTIVITY = 10;

    // OPEN: Settings > Accounts > [List of accounts when more than one]
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int ACCOUNTS_MANAGE_ACCOUNTS = 11;

    // OPEN: Settings > Cellular network settings > APNs
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int APN = 12;

    // OPEN: Settings > More > Cellular network settings > APNs > [Edit APN]
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int APN_EDITOR = 13;
    */

    // OBSOLETE
    public static final int APP_OPS_DETAILS = 14;

    // OBSOLETE
    public static final int APP_OPS_SUMMARY = 15;

    /*
    // OBSOLETE
    public int APPLICATION = 16;

    // OPEN: Settings > Apps > Configure apps > App links > [App]
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int APPLICATIONS_APP_LAUNCH = 17;

    // OBSOLETE
    public int APPLICATIONS_APP_PERMISSION = 18;

    // OPEN: Settings > Internal storage > Apps storage > [App]
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int APPLICATIONS_APP_STORAGE = 19;

    // OPEN: Settings > Apps > [App info]
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int APPLICATIONS_INSTALLED_APP_DETAILS = 20;

    // OPEN: Settings > Memory > App usage > [App Memory usage]
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int APPLICATIONS_PROCESS_STATS_DETAIL = 21;

    // OBSOLETE
    public int APPLICATIONS_PROCESS_STATS_MEM_DETAIL = 22;

    // OPEN: Settings > Memory > App usage
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int APPLICATIONS_PROCESS_STATS_UI = 23;

    // OPEN: Settings > Bluetooth
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int BLUETOOTH = 24;

    // OPEN: Choose Bluetooth device (ex: when sharing)
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int BLUETOOTH_DEVICE_PICKER = 25;

    // OBSOLETE
    public int BLUETOOTH_DEVICE_PROFILES = 26;

    // OPEN: Settings > Security > Choose screen lock
    // CATEGORY: SETTINGS
    // OS: 6.0
    public int CHOOSE_LOCK_GENERIC = 27;

    // OPEN: Settings > Security > Choose screen lock > Choose your password
    // CATEGORY: SETTINGS
    // OS: 6.0
    CHOOSE_LOCK_PASSWORD = 28;

    // OPEN: Settings > Security > Choose screen lock > Choose your pattern
    // CATEGORY: SETTINGS
    // OS: 6.0
    CHOOSE_LOCK_PATTERN = 29;

    // OPEN: Settings > Security > Choose screen lock > Confirm your password
    // CATEGORY: SETTINGS
    // OS: 6.0
    CONFIRM_LOCK_PASSWORD = 30;

    // OPEN: Settings > Security > Choose screen lock > Confirm your pattern
    // CATEGORY: SETTINGS
    // OS: 6.0
    CONFIRM_LOCK_PATTERN = 31;

    // OPEN: Settings > Security > Encrypt phone
    // CATEGORY: SETTINGS
    // OS: 6.0
    CRYPT_KEEPER = 32;

    // OPEN: Settings > Security > Encrypt phone > Confirm
    // CATEGORY: SETTINGS
    // OS: 6.0
    CRYPT_KEEPER_CONFIRM = 33;

    // OPEN: Settings > Search results
    // CATEGORY: SETTINGS
    // OS: 6.0
    DASHBOARD_SEARCH_RESULTS = 34;

    // OPEN: Settings (Root page)
    // CATEGORY: SETTINGS
    // OS: 6.0
    DASHBOARD_SUMMARY = 35;

    // OBSOLETE
    DATA_USAGE = 36;

    // OPEN: Settings > Data usage
    // CATEGORY: SETTINGS
    // OS: 6.0
    DATA_USAGE_SUMMARY = 37;

    // OPEN: Settings > Date & time
    // CATEGORY: SETTINGS
    // OS: 6.0
    DATE_TIME = 38;

    // OPEN: Settings > Developer options
    // CATEGORY: SETTINGS
    // OS: 6.0
    DEVELOPMENT = 39;

    // OPEN: Settings > About phone
    // CATEGORY: SETTINGS
    // OS: 6.0
    DEVICEINFO = 40;

    // OPEN: Settings > About phone > Status > IMEI information
    // CATEGORY: SETTINGS
    // OS: 6.0
    DEVICEINFO_IMEI_INFORMATION = 41;

    // OPEN: Settings > Internal storage
    // CATEGORY: SETTINGS
    // OS: 6.0
    DEVICEINFO_STORAGE = 42;

    // OPEN: Settings > About phone > Status > SIM status
    // CATEGORY: SETTINGS
    // OS: 6.0
    DEVICEINFO_SIM_STATUS = 43;

    // OPEN: Settings > About phone > Status
    // CATEGORY: SETTINGS
    // OS: 6.0
    DEVICEINFO_STATUS = 44;

    // OBSOLETE
    DEVICEINFO_USB = 45;

    // OPEN: Settings > Display
    // CATEGORY: SETTINGS
    // OS: 6.0
    DISPLAY = 46;

    // OPEN: Settings > Display > Daydream
    // CATEGORY: SETTINGS
    // OS: 6.0
    DREAM = 47;

    // OPEN: Settings > Security > Screen lock > Secure start-up
    // CATEGORY: SETTINGS
    // OS: 6.0
    ENCRYPTION = 48;

    // OPEN: Settings > Security > Nexus Imprint
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT = 49;

    // OBSOLETE
    FINGERPRINT_ENROLL = 50;

    // OPEN: Settings > Battery > History details
    // CATEGORY: SETTINGS
    // OS: 6.0
    FUELGAUGE_BATTERY_HISTORY_DETAIL = 51;

    // OPEN: Settings > Battery > Battery saver
    // CATEGORY: SETTINGS
    // OS: 6.0
    FUELGAUGE_BATTERY_SAVER = 52;

    // OPEN: Settings > Battery > [App Use details]
    // CATEGORY: SETTINGS
    // OS: 6.0
    FUELGAUGE_POWER_USAGE_DETAIL = 53;

    // OPEN: Settings > Battery
    // CATEGORY: SETTINGS
    // OS: 6.0
    FUELGAUGE_POWER_USAGE_SUMMARY = 54;

    // OPEN: Settings > Home
    // CATEGORY: SETTINGS
    // OS: 6.0
    HOME = 55;

    // OPEN: Settings > Security > SIM card lock settings
    // CATEGORY: SETTINGS
    // OS: 6.0
    ICC_LOCK = 56;

    // OPEN: Settings > Language & input
    // CATEGORY: SETTINGS
    // OS: 6.0
    INPUTMETHOD_LANGUAGE = 57;

    // OPEN: Settings > Language & input > Physical keyboard
    // CATEGORY: SETTINGS
    // OS: 6.0
    INPUTMETHOD_KEYBOARD = 58;

    // OPEN: Settings > Language & input > Spell checker
    // CATEGORY: SETTINGS
    // OS: 6.0
    INPUTMETHOD_SPELL_CHECKERS = 59;

    // OBSOLETE
    INPUTMETHOD_SUBTYPE_ENABLER = 60;

    // OPEN: Settings > Language & input > Personal dictionary
    // CATEGORY: SETTINGS
    // OS: 6.0
    INPUTMETHOD_USER_DICTIONARY = 61;

    // OPEN: Settings > Language & input > Add word
    // CATEGORY: SETTINGS
    // OS: 6.0
    INPUTMETHOD_USER_DICTIONARY_ADD_WORD = 62;

    // OPEN: Settings > Location
    // CATEGORY: SETTINGS
    // OS: 6.0
    LOCATION = 63;

    // OPEN: Settings > Location > Location mode
    // CATEGORY: SETTINGS
    // OS: 6.0
    LOCATION_MODE = 64;

    // OPEN: Settings > Apps
    // CATEGORY: SETTINGS
    // OS: 6.0
    MANAGE_APPLICATIONS = 65;

    // OPEN: Settings > Backup & reset > Factory data reset
    // CATEGORY: SETTINGS
    // OS: 6.0
    MASTER_CLEAR = 66;

    // OPEN: Settings > Backup & reset > Factory data reset > Confirm
    // CATEGORY: SETTINGS
    // OS: 6.0
    MASTER_CLEAR_CONFIRM = 67;

    // OPEN: Settings > Data usage > Network restrictions
    // CATEGORY: SETTINGS
    // OS: 6.0
    NET_DATA_USAGE_METERED = 68;

    // OPEN: Settings > More > Android Beam
    // CATEGORY: SETTINGS
    // OS: 6.0
    NFC_BEAM = 69;

    // OPEN: Settings > Tap & pay
    // CATEGORY: SETTINGS
    // OS: 6.0
    NFC_PAYMENT = 70;

    // OPEN: Settings > Sound & notification
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION = 71;

    // OPEN: Settings > Sound & notification > App notifications > [App]
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_APP_NOTIFICATION = 72;

    // OPEN: Settings > Sound & notification > Other sounds
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_OTHER_SOUND = 73;

    // OBSOLETE
    NOTIFICATION_REDACTION = 74;

    // OPEN: Settings Widget > Notification log
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_STATION = 75;

    // OPEN: Settings > Sound & notification > Do not disturb
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_ZEN_MODE = 76;

    // OPEN: OBSOLETE
    OWNER_INFO = 77;

    // OPEN: Print job notification > Print job settings
    // CATEGORY: SETTINGS
    // OS: 6.0
    PRINT_JOB_SETTINGS = 78;

    // OPEN: Settings > Printing > [Print Service]
    // CATEGORY: SETTINGS
    // OS: 6.0
    PRINT_SERVICE_SETTINGS = 79;

    // OPEN: Settings > Printing
    // CATEGORY: SETTINGS
    // OS: 6.0
    PRINT_SETTINGS = 80;

    // OPEN: Settings > Backup & reset
    // CATEGORY: SETTINGS
    // OS: 6.0
    PRIVACY = 81;

    //OBSOLETE
    PROXY_SELECTOR = 82;

    // OPEN: Settings > Backup & reset > Network settings reset
    // CATEGORY: SETTINGS
    // OS: 6.0
    RESET_NETWORK = 83;

    // OPEN: Settings > Backup & reset > Network settings reset > Confirm
    // CATEGORY: SETTINGS
    // OS: 6.0
    RESET_NETWORK_CONFIRM = 84;

    // OPEN: Settings > Developer Options > Running Services
    // CATEGORY: SETTINGS
    // OS: 6.0
    RUNNING_SERVICE_DETAILS = 85;

    // OPEN: Settings > Security > Screen pinning
    // CATEGORY: SETTINGS
    // OS: 6.0
    SCREEN_PINNING = 86;

    // OPEN: Settings > Security
    // CATEGORY: SETTINGS
    // OS: 6.0
    SECURITY = 87;

    // OPEN: Settings > SIM cards
    // CATEGORY: SETTINGS
    // OS: 6.0
    SIM = 88;

    // OBSOLETE
    TESTING = 89;

    // OPEN: Settings > More > Tethering & portable hotspot
    // CATEGORY: SETTINGS
    // OS: 6.0
    TETHER = 90;

    // OPEN: Settings > Security > Trust agents
    // CATEGORY: SETTINGS
    // OS: 6.0
    TRUST_AGENT = 91;

    // OPEN: Settings > Security > Trusted credentials
    // CATEGORY: SETTINGS
    // OS: 6.0
    TRUSTED_CREDENTIALS = 92;

    // OPEN: Settings > Language & input > TTS output > [Engine] > Settings
    // CATEGORY: SETTINGS
    // OS: 6.0
    TTS_ENGINE_SETTINGS = 93;

    // OPEN: Settings > Language & input > Text-to-speech output
    // CATEGORY: SETTINGS
    // OS: 6.0
    TTS_TEXT_TO_SPEECH = 94;

    // OPEN: Settings > Security > Apps with usage access
    // CATEGORY: SETTINGS
    // OS: 6.0
    USAGE_ACCESS = 95;

    // OPEN: Settings > Users
    // CATEGORY: SETTINGS
    // OS: 6.0
    USER = 96;

    // OPEN: Settings > Users > [Restricted profile app & content access]
    // CATEGORY: SETTINGS
    // OS: 6.0
    USERS_APP_RESTRICTIONS = 97;

    // OPEN: Settings > Users > [User settings]
    // CATEGORY: SETTINGS
    // OS: 6.0
    USER_DETAILS = 98;

    // OBSOLETE
    VOICE_INPUT = 99;

    // OPEN: Settings > More > VPN
    // CATEGORY: SETTINGS
    // OS: 6.0
    VPN = 100;

    // OPEN: Settings > Display > Choose wallpaper from
    // CATEGORY: SETTINGS
    // OS: 6.0
    WALLPAPER_TYPE = 101;

    // OPEN: Settings > Display > Cast
    // CATEGORY: SETTINGS
    // OS: 6.0
    WFD_WIFI_DISPLAY = 102;

    // OPEN: Settings > Wi-Fi
    // CATEGORY: SETTINGS
    // OS: 6.0
    WIFI = 103;

    // OPEN: Settings > Wi-Fi > Advanced Wi-Fi
    // CATEGORY: SETTINGS
    // OS: 6.0
    WIFI_ADVANCED = 104;

    // OPEN: Settings > More > Wi-Fi Calling
    // CATEGORY: SETTINGS
    // OS: 6.0
    WIFI_CALLING = 105;

    // OPEN: Settings > Wi-Fi > Saved networks
    // CATEGORY: SETTINGS
    // OS: 6.0
    WIFI_SAVED_ACCESS_POINTS = 106;

    // OBSOLETE
    WIFI_APITEST = 107;

    // OBSOLETE
    WIFI_INFO = 108;

    // OPEN: Settings > Wi-Fi > Advanced Wi-Fi > Wi-Fi Direct
    // CATEGORY: SETTINGS
    // OS: 6.0
    WIFI_P2P = 109;

    // OPEN: Settings > More
    // CATEGORY: SETTINGS
    // OS: 6.0
    WIRELESS = 110;

    // OPEN: Quick Settings Panel
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_PANEL = 111;

    // OPEN: QS Airplane mode tile shown
    // ACTION: QS Airplane mode tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_AIRPLANEMODE = 112;

    // OPEN: QS Bluetooth tile shown
    // ACTION: QS Bluetooth tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_BLUETOOTH = 113;

    // OPEN: QS Cast tile shown
    // ACTION: QS Cast tile tapped
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_CAST = 114;

    // OPEN: QS Cellular tile shown
    // ACTION: QS Cellular tile tapped
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_CELLULAR = 115;

    // OPEN: QS Color inversion tile shown
    // ACTION: QS Color inversion tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_COLORINVERSION = 116;

    // OPEN: QS Cellular tile > Cellular detail panel
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_DATAUSAGEDETAIL = 117;

    // OPEN: QS Do not disturb tile shown
    // ACTION: QS Do not disturb tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_DND = 118;

    // OPEN: QS Flashlight tile shown
    // ACTION: QS Flashlight tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_FLASHLIGHT = 119;

    // OPEN: QS Hotspot tile shown
    // ACTION: QS Hotspot tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_HOTSPOT = 120;

    // OPEN: QS 3P tile shown
    // ACTION: QS 3P tile tapped
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_INTENT = 121;

    // OPEN: QS Location tile shown
    // ACTION: QS Location tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_LOCATION = 122;

    // OPEN: QS Rotation tile shown
    // ACTION: QS Rotation tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_ROTATIONLOCK = 123;

    // OBSOLETE
    QS_USERDETAILITE = 124;

    // OPEN: QS User list panel
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_USERDETAIL = 125;

    // OPEN: QS WiFi tile shown
    // ACTION: QS WiFi tile tapped
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_WIFI = 126;

    // OPEN: Notification Panel (including lockscreen)
    // CATEGORY: NOTIFICATION
    // OS: 5.1.1
    NOTIFICATION_PANEL = 127;

    // OPEN: Notification in panel became visible.
    //   PACKAGE: App that posted the notification.
    // ACTION: Notification is tapped.
    //   PACKAGE: App that posted the notification
    // DETAIL: Notification is expanded by user.
    //   PACKAGE: App that posted the notification
    // DISMISS: Notification is dismissed.
    //   PACKAGE: App that posted the notification
    //   SUBTYPE: Dismiss reason from NotificationManagerService.java
    // CATEGORY: NOTIFICATION
    // OS: 5.1.1
    NOTIFICATION_ITEM = 128;

    // ACTION: User tapped notification action
    //   PACKAGE: App that posted the notification
    //   SUBTYPE: Index of action on notification
    // CATEGORY: NOTIFICATION
    // OS: 5.0
    NOTIFICATION_ITEM_ACTION = 129;

    // OPEN: Settings > Apps > Configure apps > App permissions
    // CATEGORY: SETTINGS
    // OS: 6.0
    APPLICATIONS_ADVANCED = 130;

    // OPEN: Settings > Location > Scanning
    // CATEGORY: SETTINGS
    // OS: 6.0
    LOCATION_SCANNING = 131;

    // OBSOLETE
    MANAGE_APPLICATIONS_ALL = 132;

    // OPEN: Settings > Sound & notification > App notifications
    // CATEGORY: SETTINGS
    // OS: 6.0
    MANAGE_APPLICATIONS_NOTIFICATIONS = 133;

    // ACTION: Settings > Wi-Fi > Overflow > Add Network
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_WIFI_ADD_NETWORK = 134;

    // ACTION: Settings > Wi-Fi > [Long press network] > Connect to network
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_WIFI_CONNECT = 135;

    // ACTION: Settings > Wi-Fi > Overflow > Refresh
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_WIFI_FORCE_SCAN = 136;

    // ACTION: Settings > Wi-Fi > [Long press network] > Forget network
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_WIFI_FORGET = 137;

    // ACTION: Settings > Wi-Fi > Toggle off
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_WIFI_OFF = 138;

    // ACTION: Settings > Wi-Fi > Toggle on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_WIFI_ON = 139;

    // OBSOLETE
    MANAGE_PERMISSIONS = 140;

    // OPEN: Settings > Sound & notification > DND > Priority only allows
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_ZEN_MODE_PRIORITY = 141;

    // OPEN: Settings > Sound & notification > DND > Automatic rules
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_ZEN_MODE_AUTOMATION = 142;

    // OPEN: Settings > Apps > Configure apps > App links
    // CATEGORY: SETTINGS
    // OS: 6.0
    MANAGE_DOMAIN_URLS = 143;

    // OPEN: Settings > Sound & notification > DND > [Time based rule]
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_ZEN_MODE_SCHEDULE_RULE = 144;

    // OPEN: Settings > Sound & notification > DND > [External rule]
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_ZEN_MODE_EXTERNAL_RULE = 145;

    // OPEN: Settings > Sound & notification > DND > [Event rule]
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_ZEN_MODE_EVENT_RULE = 146;

    // ACTION: App notification settings > Block Notifications
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_BAN_APP_NOTES = 147;

    // ACTION: Notification shade > Dismiss all button
    // CATEGORY: NOTIFICATION
    // OS: 6.0
    ACTION_DISMISS_ALL_NOTES = 148;

    // OPEN: QS Do Not Disturb detail panel
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_DND_DETAILS = 149;

    // OPEN: QS Bluetooth detail panel
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_BLUETOOTH_DETAILS = 150;

    // OPEN: QS Cast detail panel
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_CAST_DETAILS = 151;

    // OPEN: QS Wi-Fi detail panel
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_WIFI_DETAILS = 152;

    // ACTION: QS Wi-Fi detail panel > Wi-Fi toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_WIFI_TOGGLE = 153;

    // ACTION: QS Bluetooth detail panel > Bluetooth toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_BLUETOOTH_TOGGLE = 154;

    // ACTION: QS Cellular detail panel > Cellular toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_CELLULAR_TOGGLE = 155;

    // ACTION: QS User list panel > Select different user
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_SWITCH_USER = 156;

    // ACTION: QS Cast detail panel > Select cast device
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_CAST_SELECT = 157;

    // ACTION: QS Cast detail panel > Disconnect cast device
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_CAST_DISCONNECT = 158;

    // ACTION: Settings > Bluetooth > Toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_BLUETOOTH_TOGGLE = 159;

    // ACTION: Settings > Bluetooth > Overflow > Refresh
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_BLUETOOTH_SCAN = 160;

    // ACTION: Settings > Bluetooth > Overflow > Rename this device
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_BLUETOOTH_RENAME = 161;

    // ACTION: Settings > Bluetooth > Overflow > Show received files
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_BLUETOOTH_FILES = 162;

    // ACTION: QS DND details panel > Increase / Decrease exit time
    //   SUBTYPE: true is increase, false is decrease
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_DND_TIME = 163;

    // ACTION: QS DND details panel > [Exit condition]
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_DND_CONDITION_SELECT = 164;

    // ACTION: QS DND details panel > [DND mode]
    //  SUBTYPE: 1 is priority, 2 is silence, 3 is alarms only
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_DND_ZEN_SELECT = 165;

    // ACTION: QS DND detail panel > DND toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    QS_DND_TOGGLE = 166;

    // ACTION: DND Settings > Priority only allows > Reminder toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_ALLOW_REMINDERS = 167;

    // ACTION: DND Settings > Priority only allows > Event toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_ALLOW_EVENTS = 168;

    // ACTION: DND Settings > Priority only allows > Messages
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_ALLOW_MESSAGES = 169;

    // ACTION: DND Settings > Priority only allows > Calls
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_ALLOW_CALLS = 170;

    // ACTION: DND Settings > Priority only allows > Repeat callers toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_ALLOW_REPEAT_CALLS = 171;

    // ACTION: DND Settings > Automatic rules > Add rule
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_ADD_RULE = 172;

    // ACTION: DND Settings > Automatic rules > Add rule > OK
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_ADD_RULE_OK = 173;

    // ACTION: DND Settings > Automatic rules > [Rule] > Delete rule
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_DELETE_RULE = 174;

    // ACTION: DND Settings > Automatic rules > [Rule] > Delete rule > Delete
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_DELETE_RULE_OK = 175;

    // ACTION: DND Settings > Automatic rules > [Rule] > Toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ZEN_ENABLE_RULE = 176;

    // ACTION: Settings > More > Airplane mode toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_AIRPLANE_TOGGLE = 177;

    // ACTION: Settings > Data usage > Cellular data toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_CELL_DATA_TOGGLE = 178;

    // OPEN: Settings > Sound & notification > Notification access
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_ACCESS = 179;

    // OPEN: Settings > Sound & notification > Do Not Disturb access
    // CATEGORY: SETTINGS
    // OS: 6.0
    NOTIFICATION_ZEN_MODE_ACCESS = 180;

    // OPEN: Settings > Apps > Configure apps > Default Apps
    // CATEGORY: SETTINGS
    // OS: 6.0
    APPLICATIONS_DEFAULT_APPS = 181;

    // OPEN: Settings > Internal storage > Apps storage
    // CATEGORY: SETTINGS
    // OS: 6.0
    APPLICATIONS_STORAGE_APPS = 182;

    // OPEN: Settings > Security > Usage access
    // CATEGORY: SETTINGS
    // OS: 6.0
    APPLICATIONS_USAGE_ACCESS_DETAIL = 183;

    // OPEN: Settings > Battery > Battery optimization
    // CATEGORY: SETTINGS
    // OS: 6.0
    APPLICATIONS_HIGH_POWER_APPS = 184;

    // OBSOLETE
    FUELGAUGE_HIGH_POWER_DETAILS = 185;

    // ACTION: Lockscreen > Unlock gesture
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    ACTION_LS_UNLOCK = 186;

    // ACTION: Lockscreen > Pull shade open
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    ACTION_LS_SHADE = 187;

    // ACTION: Lockscreen > Tap on lock, shows hint
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    ACTION_LS_HINT = 188;

    // ACTION: Lockscreen > Camera
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    ACTION_LS_CAMERA = 189;

    // ACTION: Lockscreen > Dialer
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    ACTION_LS_DIALER = 190;

    // ACTION: Lockscreen > Tap on lock, locks phone
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    ACTION_LS_LOCK = 191;

    // ACTION: Lockscreen > Tap on notification, false touch rejection
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    ACTION_LS_NOTE = 192;

    // ACTION: Lockscreen > Swipe down to open quick settings
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_LS_QS = 193;

    // ACTION: Swipe down to open quick settings when unlocked
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_SHADE_QS_PULL = 194;

    // ACTION: Notification shade > Tap to open quick settings
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_SHADE_QS_TAP = 195;

    // OPEN: Lockscreen
    //   SUBTYPE: 0 is unsecure, 1 is secured by password / pattern / PIN
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    LOCKSCREEN = 196;

    // OPEN: Lockscreen > Screen to enter password / pattern / PIN
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    BOUNCER = 197;

    // OPEN: Screen turned on
    //   SUBTYPE: 2 is user action
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    SCREEN = 198;

    // OPEN: Notification caused sound, vibration, and/or LED blink
    //   SUBTYPE: 1 is buzz, 2 is beep, blink is 4, or'd together
    // CATEGORY: NOTIFICATION
    // OS: 5.1.1
    NOTIFICATION_ALERT = 199;

    // ACTION: Lockscreen > Emergency Call button
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 5.1.1
    ACTION_EMERGENCY_CALL = 200;

    // OPEN: Settings > Apps > Configure > Default apps > Assist & voice input
    // CATEGORY: SETTINGS
    // OS: 6.0
    APPLICATIONS_MANAGE_ASSIST = 201;

    // OPEN: Settings > Memory
    // CATEGORY: SETTINGS
    // OS: 6.0
    PROCESS_STATS_SUMMARY = 202;

    // ACTION: Settings > Display > When device is rotated
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_ROTATION_LOCK = 203;

    // ACTION: Long press on notification to view controls
    // CATEGORY: NOTIFICATION
    // OS: 6.0
    ACTION_NOTE_CONTROLS = 204;

    // ACTION: Notificatoin controls > Info button
    // CATEGORY: NOTIFICATION
    // OS: 6.0
    ACTION_NOTE_INFO = 205;

    // ACTION: Notification controls > Settings button
    // CATEGORY: NOTIFICATION
    // OS: 6.0
    ACTION_APP_NOTE_SETTINGS = 206;

    // OPEN: Volume Dialog (with hardware buttons)
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    VOLUME_DIALOG = 207;

    // OPEN: Volume dialog > Expanded volume dialog (multiple sliders)
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    VOLUME_DIALOG_DETAILS = 208;

    // ACTION: Volume dialog > Adjust volume slider
    //   SUBTYPE: volume level (0-7)
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_VOLUME_SLIDER = 209;

    // ACTION: Volume dialog > Select non-active stream
    //   SUBTYPE: stream (defined in AudioSystem.java)
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_VOLUME_STREAM = 210;

    // ACTION: Adjust volume with hardware key
    //   SUBTYPE: volume level (0-7)
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_VOLUME_KEY = 211;

    // ACTION: Volume dialog > Mute a stream by tapping icon
    //   SUBTYPE: mute is 1, audible is 2
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_VOLUME_ICON = 212;

    // ACTION: Volume dialog > Change ringer mode by tapping icon
    //   SUBTYPE: 2 is audible, 3 is vibrate
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_RINGER_MODE = 213;

    // ACTION: Chooser shown (share target, file open, etc.)
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_ACTIVITY_CHOOSER_SHOWN = 214;

    // ACTION: Chooser > User taps an app target
    //   SUBTYPE: Index of target
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_ACTIVITY_CHOOSER_PICKED_APP_TARGET = 215;

    // ACTION: Chooser > User taps a service target
    //   SUBTYPE: Index of target
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_ACTIVITY_CHOOSER_PICKED_SERVICE_TARGET = 216;

    // ACTION: Chooser > User taps a standard target
    //   SUBTYPE: Index of target
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_ACTIVITY_CHOOSER_PICKED_STANDARD_TARGET = 217;

    // ACTION: QS Brightness Slider (with auto brightness disabled)
    //   SUBTYPE: slider value
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    ACTION_BRIGHTNESS = 218;

    // ACTION: QS Brightness Slider (with auto brightness enabled)
    //   SUBTYPE: slider value
    // CATEGORY: QUICK_SETTINGS
    // OS: 6.0
    ACTION_BRIGHTNESS_AUTO = 219;

    // OPEN: Settings > Display > Brightness Slider
    // CATEGORY: SETTINGS
    // OS: 6.0
    BRIGHTNESS_DIALOG = 220;

    // OPEN: Settings > Apps > Configure Apps > Draw over other apps
    // CATEGORY: SETTINGS
    // OS: 6.0
    SYSTEM_ALERT_WINDOW_APPS = 221;

    // OPEN: Display has entered dream mode
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    DREAMING = 222;

    // OPEN: Display has entered ambient notification mode
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    DOZING = 223;

    // OPEN: Overview
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    OVERVIEW_ACTIVITY = 224;

    // OPEN: Settings > About phone > Legal information
    // CATEGORY: SETTINGS
    // OS: 6.0
    ABOUT_LEGAL_SETTINGS = 225;

    // OPEN: Settings > Search > Perform search
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_SEARCH_RESULTS = 226;

    // OPEN: Settings > System UI Tuner
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER = 227;

    // OPEN: Settings > System UI Tuner > Quick Settings
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_QS = 228;

    // OPEN: Settings > System UI Tuner > Demo mode
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_DEMO_MODE = 229;

    // ACTION: Settings > System UI Tuner > Quick Settings > Move tile
    //   PACKAGE: Tile
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_QS_REORDER = 230;

    // ACTION: Settings > System UI Tuner > Quick Settings > Add tile
    //   PACKAGE: Tile
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_QS_ADD = 231;

    // ACTION: Settings > System UI Tuner > Quick Settings > Remove tile
    //   PACKAGE: Tile
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_QS_REMOVE = 232;

    // ACTION: Settings > System UI Tuner > Status bar > Enable icon
    //   PACKAGE: Icon
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_STATUS_BAR_ENABLE = 233;

    // ACTION: Settings > System UI Tuner > Status bar > Disable icon
    //   PACKAGE: Icon
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_STATUS_BAR_DISABLE = 234;

    // ACTION: Settings > System UI Tuner > Demo mode > Enable demo mode
    //   SUBTYPE: false is disabled, true is enabled
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_DEMO_MODE_ENABLED = 235;

    // ACTION: Settings > System UI Tuner > Demo mode > Show demo mode
    //   SUBTYPE: false is disabled, true is enabled
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_DEMO_MODE_ON = 236;

    // ACTION: Settings > System UI Tuner > Show embedded battery percentage
    //   SUBTYPE: 0 is disabled, 1 is enabled
    // CATEGORY: SETTINGS
    // OS: 6.0
    TUNER_BATTERY_PERCENTAGE = 237;

    // OPEN: Settings > Developer options > Inactive apps
    // CATEGORY: SETTINGS
    // OS: 6.0
    FUELGAUGE_INACTIVE_APPS = 238;

    // ACTION: Long press home to bring up assistant
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_ASSIST_LONG_PRESS = 239;

    // OPEN: Settings > Security > Nexus Imprint > Add Fingerprint
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLLING = 240;

    // OPEN: Fingerprint Enroll > Find Sensor
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_FIND_SENSOR = 241;

    // OPEN: Fingerprint Enroll > Fingerprint Enrolled!
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLL_FINISH = 242;

    // OPEN: Fingerprint Enroll introduction
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLL_INTRO = 243;

    // OPEN: Fingerprint Enroll onboarding
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLL_ONBOARD = 244;

    // OPEN: Fingerprint Enroll > Let's Start!
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLL_SIDECAR = 245;

    // OPEN: Fingerprint Enroll SUW > Let's Start!
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLLING_SETUP = 246;

    // OPEN: Fingerprint Enroll SUW > Find Sensor
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_FIND_SENSOR_SETUP = 247;

    // OPEN: Fingerprint Enroll SUW > Fingerprint Enrolled!
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLL_FINISH_SETUP = 248;

    // OPEN: Fingerprint Enroll SUW introduction
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLL_INTRO_SETUP = 249;

    // OPEN: Fingerprint Enroll SUW onboarding
    // CATEGORY: SETTINGS
    // OS: 6.0
    FINGERPRINT_ENROLL_ONBOARD_SETUP = 250;

    // ACTION: Add fingerprint > Enroll fingerprint
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_FINGERPRINT_ENROLL = 251;

    // ACTION: Authenticate using fingerprint
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_FINGERPRINT_AUTH = 252;

    // ACTION: Settings > Security > Nexus Imprint > [Fingerprint] > Delete
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_FINGERPRINT_DELETE = 253;

    // ACTION: Settings > Security > Nexus Imprint > [Fingerprint] > Rename
    // CATEGORY: SETTINGS
    // OS: 6.0
    ACTION_FINGERPRINT_RENAME = 254;

    // ACTION: Double tap camera shortcut
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_DOUBLE_TAP_POWER_CAMERA_GESTURE = 255;

    // ACTION: Double twist camera shortcut
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: 6.0
    ACTION_WIGGLE_CAMERA_GESTURE = 256;

    // OPEN: QS Work Mode tile shown
    // ACTION: QS Work Mode tile tapped
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: N
    QS_WORKMODE = 257;

    // OPEN: Settings > Developer Options > Background Check
    // CATEGORY: SETTINGS
    // OS: N
    BACKGROUND_CHECK_SUMMARY = 258;

    // OPEN: QS Lock tile shown
    // ACTION: QS Lock tile tapped
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: N
    QS_LOCK_TILE = 259;

    // OPEN: QS User Tile shown
    // CATEGORY: QUICK_SETTINGS
    // OS: N
    QS_USER_TILE = 260;

    // OPEN: QS Battery tile shown
    // CATEGORY: QUICK_SETTINGS
    // OS: N
    QS_BATTERY_TILE = 261;

    // OPEN: Settings > Sound > Do not disturb > Visual interruptions
    // CATEGORY: SETTINGS
    // OS: N
    NOTIFICATION_ZEN_MODE_VISUAL_INTERRUPTIONS = 262;

    // ACTION: Visual interruptions > No screen interuptions toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_ZEN_ALLOW_WHEN_SCREEN_OFF = 263;

    // ACTION: Visual interruptions > No notification light toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_ZEN_ALLOW_LIGHTS = 264;

    // OPEN: Settings > Notifications > [App] > Topic Notifications
    // CATEGORY: SETTINGS
    // OS: N
    NOTIFICATION_TOPIC_NOTIFICATION = 265;

    // ACTION: Settings > Apps > Default Apps > Select different SMS app
    //   PACKAGE: Selected SMS app
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_DEFAULT_SMS_APP_CHANGED = 266;

    // OPEN: QS Color modification tile shown
    // ACTION: QS Color modification tile tapped
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    // OS: N
    QS_COLOR_MATRIX = 267;

    // OPEN: QS Custom tile shown
    // ACTION: QS Work Mode tile tapped
    // CATEGORY: QUICK_SETTINGS
    // OS: N
    QS_CUSTOM = 268;

    // ACTION: Visual interruptions > Never turn off the screen toggle
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_ZEN_ALLOW_WHEN_SCREEN_ON = 269;

    // ACTION: Overview > Long-press task, drag to enter split-screen
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_WINDOW_DOCK_DRAG_DROP = 270;

    // ACTION: In App > Long-press Overview button to enter split-screen
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_WINDOW_DOCK_LONGPRESS = 271;

    // ACTION: In App > Swipe Overview button to enter split-screen
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_WINDOW_DOCK_SWIPE = 272;

    // ACTION: Launch profile-specific app > Confirm credentials
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    PROFILE_CHALLENGE = 273;

    // OPEN: QS Battery detail panel
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    QS_BATTERY_DETAIL = 274;

    // OPEN: Overview > History
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    OVERVIEW_HISTORY = 275;

    // ACTION: Overview > Page by tapping Overview button
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_OVERVIEW_PAGE = 276;

    // ACTION: Overview > Select app
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_OVERVIEW_SELECT = 277;

    // ACTION: View emergency info
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_VIEW_EMERGENCY_INFO = 278;

    // ACTION: Edit emergency info activity
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_EDIT_EMERGENCY_INFO = 279;

    // ACTION: Edit emergency info field
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_EDIT_EMERGENCY_INFO_FIELD = 280;

    // ACTION: Add emergency contact
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_ADD_EMERGENCY_CONTACT = 281;

    // ACTION: Delete emergency contact
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_DELETE_EMERGENCY_CONTACT = 282;

    // ACTION: Call emergency contact
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_CALL_EMERGENCY_CONTACT = 283;

    // OPEN: QS Data Saver tile shown
    // ACTION: QS Data Saver tile tapped
    // CATEGORY: QUICK_SETTINGS
    QS_DATA_SAVER = 284;

    // OPEN: Settings > Security > User credentials
    // CATEGORY: Settings
    // OS: N
    USER_CREDENTIALS = 285;

    // ACTION: In App (splitscreen) > Long-press Overview to exit split-screen
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_WINDOW_UNDOCK_LONGPRESS = 286;

    // Logged when the user scrolls through overview manually
    OVERVIEW_SCROLL = 287;

    // Logged when the overview times out automatically selecting an app
    OVERVIEW_SELECT_TIMEOUT = 288;

    // Logged when a user dismisses a task in overview
    OVERVIEW_DISMISS = 289;

    // Logged when the user modifying the notification importance slider.
    ACTION_MODIFY_IMPORTANCE_SLIDER = 290;

    // Logged when the user saves a modification to notification importance. Negative numbers
    // indicate the user lowered the importance; positive means they increased it.
    ACTION_SAVE_IMPORTANCE = 291;

    // ACTION: Long-press power button, then tap "Take bug report" option.
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_BUGREPORT_FROM_POWER_MENU_INTERACTIVE = 292;

    // ACTION: Long-press power button, then long-press "Take bug report" option.
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_BUGREPORT_FROM_POWER_MENU_FULL = 293;

    // ACTION: Settings -> Developer Options -> Take bug report -> Interactive report
    // CATEGORY: SETTINGS
    // OS: N
    // Interactive bug report initiated from Settings.
    ACTION_BUGREPORT_FROM_SETTINGS_INTERACTIVE = 294;

    // ACTION: Settings -> Developer Options -> Take bug report -> Full report
    // CATEGORY: SETTINGS
    // OS: N
    // Interactive bug report initiated from Settings.
    ACTION_BUGREPORT_FROM_SETTINGS_FULL = 295;

    // ACTION: User tapped notification action to cancel a bug report
    // CATEGORY: NOTIFICATION
    // OS: N
    ACTION_BUGREPORT_NOTIFICATION_ACTION_CANCEL = 296;

    // ACTION: User tapped notification action to launch bug report details screen
    // CATEGORY: NOTIFICATION
    // OS: N
    ACTION_BUGREPORT_NOTIFICATION_ACTION_DETAILS = 297;

    // ACTION: User tapped notification action to take adition screenshot on bug report
    // CATEGORY: NOTIFICATION
    // OS: N
    ACTION_BUGREPORT_NOTIFICATION_ACTION_SCREENSHOT = 298;

    // ACTION: User tapped notification to share bug report
    // CATEGORY: NOTIFICATION
    // OS: N
    ACTION_BUGREPORT_NOTIFICATION_ACTION_SHARE = 299;

    // ACTION: User changed bug report name using the details screen
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_BUGREPORT_DETAILS_NAME_CHANGED = 300;

    // ACTION: User changed bug report title using the details screen
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_BUGREPORT_DETAILS_TITLE_CHANGED = 301;

    // ACTION: User changed bug report description using the details screen
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_BUGREPORT_DETAILS_DESCRIPTION_CHANGED = 302;

    // ACTION: User tapped Save in the bug report details screen.
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_BUGREPORT_DETAILS_SAVED = 303;

    // ACTION: User tapped Cancel in the bug report details screen.
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_BUGREPORT_DETAILS_CANCELED = 304;

    // Tuner: Open/close calibrate dialog.
    TUNER_CALIBRATE_DISPLAY = 305;

    // Tuner: Open/close color and appearance.
    TUNER_COLOR_AND_APPEARANCE = 306;

    // Tuner: Apply calibrate dialog.
    ACTION_TUNER_CALIBRATE_DISPLAY_CHANGED = 307;

    // Tuner: Open/close night mode.
    TUNER_NIGHT_MODE = 308;

    // Tuner: Change night mode.
    ACTION_TUNER_NIGHT_MODE = 309;

    // Tuner: Change night mode auto.
    ACTION_TUNER_NIGHT_MODE_AUTO = 310;

    // Tuner: Change night mode adjust dark theme.
    ACTION_TUNER_NIGHT_MODE_ADJUST_DARK_THEME = 311;

    // Tuner: Change night mode adjust tint.
    ACTION_TUNER_NIGHT_MODE_ADJUST_TINT = 312;

    // Tuner: Change night mode adjust brightness.
    ACTION_TUNER_NIGHT_MODE_ADJUST_BRIGHTNESS = 313;

    // Tuner: Change do not disturb in volume panel.
    ACTION_TUNER_DO_NOT_DISTURB_VOLUME_PANEL = 314;

    // Tuner: Change do not disturb volume buttons shortcut.
    ACTION_TUNER_DO_NOT_DISTURB_VOLUME_SHORTCUT = 315;

    // Logs the action the user takes when an app crashed.
    ACTION_APP_CRASH = 316;

    // Logs the action the user takes when an app ANR'd.
    ACTION_APP_ANR = 317;

    // Logged when a user double taps the overview button to launch the previous task
    OVERVIEW_LAUNCH_PREVIOUS_TASK = 318;

    // Logged when we execute an app transition. This indicates the total delay from startActivity
    // until the app transition is starting to animate, in milliseconds.
    APP_TRANSITION_DELAY_MS = 319;

    // Logged when we execute an app transition. This indicates the reason why the transition
    // started. Must be one of ActivityManagerInternal.APP_TRANSITION_* reasons.
    APP_TRANSITION_REASON = 320;

    // Logged when we execute an app transition and we drew a starting window. This indicates the
    // delay from startActivity until the starting window was drawn.
    APP_TRANSITION_STARTING_WINDOW_DELAY_MS = 321;

    // Logged when we execute an app transition and all windows of the app got drawn. This indicates
    // the delay from startActivity until all windows have been drawn.
    APP_TRANSITION_WINDOWS_DRAWN_DELAY_MS = 322;

    // Logged when we execute an app transition. This indicates the component name of the current
    // transition.
    APP_TRANSITION_COMPONENT_NAME = 323;

    // Logged when we execute an app transition. This indicates whether the process was already
    // running.
    APP_TRANSITION_PROCESS_RUNNING = 324;

    // Logged when we execute an app transition. This indicates the device uptime in seconds when
    // the transition was executed.
    APP_TRANSITION_DEVICE_UPTIME_SECONDS = 325;

    // ACTION: app requested access to a scoped directory, user granted it.
    //   SUBTYPE: directory's index on Environment.STANDARD_DIRECTORIES
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_SCOPED_DIRECTORY_ACCESS_GRANTED_BY_FOLDER = 326;

    // ACTION: app requested access to a scoped directory, user denied it.
    //   SUBTYPE: directory's index on Environment.STANDARD_DIRECTORIES
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_SCOPED_DIRECTORY_ACCESS_DENIED_BY_FOLDER = 327;

    // ACTION: app requested access to a scoped directory, user granted it.
    //   PACKAGE: app that requested access
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_SCOPED_DIRECTORY_ACCESS_GRANTED_BY_PACKAGE = 328;

    // ACTION: app requested access to a scoped directory, user denied it.
    //   PACKAGE: app that requested access.
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_SCOPED_DIRECTORY_ACCESS_DENIED_BY_PACKAGE = 329;

    // ACTION: app requested access to a directory user has already been granted
    // access before.
    //   SUBTYPE: directory's index on Environment.STANDARD_DIRECTORIES.
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_SCOPED_DIRECTORY_ACCESS_ALREADY_GRANTED_BY_FOLDER = 330;

    // ACTION: app requested access to a directory user has already been granted
    // access before.
    //   PACKAGE: app that requested access.
    // CATEGORY: GLOBAL_SYSTEM_UI
    // OS: N
    ACTION_SCOPED_DIRECTORY_ACCESS_ALREADY_GRANTED_BY_PACKAGE = 331;

    // ACTION: Logged when the user slides a notification and reveals the gear
    // beneath it.
    // CATEGORY: NOTIFICATION
    // OS: N
    ACTION_REVEAL_GEAR = 332;

    // ACTION: Logged when the user taps on the gear beneath a notification.
    // CATEGORY: NOTIFICATION
    // OS: N
    ACTION_TOUCH_GEAR = 333;

    // Logs that the user has edited the enabled VR listeners.
    // CATEGORY: SETTINGS
    // OS: N
    VR_MANAGE_LISTENERS = 334;

    // Settings -> Accessibility -> Click after pointer stops moving
    // CATEGORY: SETTINGS
    // OS: N
    ACCESSIBILITY_TOGGLE_AUTOCLICK = 335;

    // Settings -> Sound
    // CATEGORY: SETTINGS
    // OS: N
    SOUND = 336;

    // Settings -> Notifications -> Gear
    // CATEGORY: SETTINGS
    // OS: N
    CONFIGURE_NOTIFICATION = 337;

    // Settings -> Wi-Fi -> Gear
    // CATEGORY: SETTINGS
    // OS: N
    CONFIGURE_WIFI = 338;

    // Settings -> Display -> Display size
    // OS: N
    DISPLAY_SCREEN_ZOOM = 339;

    // Settings -> Display -> Font size
    // CATEGORY: SETTINGS
    // OS: N
    ACCESSIBILITY_FONT_SIZE = 340;

    // Settings -> Data usage -> Cellular/Wi-Fi data usage
    // CATEGORY: SETTINGS
    // OS: N
    DATA_USAGE_LIST = 341;

    // Settings -> Data usage -> Billing cycle or DATA_USAGE_LIST -> Gear
    // CATEGORY: SETTINGS
    // OS: N
    BILLING_CYCLE = 342;

    // DATA_USAGE_LIST -> Any item or App info -> Data usage
    // CATEGORY: SETTINGS
    // OS: N
    APP_DATA_USAGE = 343;

    // Settings -> Language & input -> Language
    // CATEGORY: SETTINGS
    // OS: N
    USER_LOCALE_LIST = 344;

    // Settings -> Language & input -> Virtual keyboard
    // CATEGORY: SETTINGS
    // OS: N
    VIRTUAL_KEYBOARDS = 345;

    // Settings -> Language & input -> Physical keyboard
    // CATEGORY: SETTINGS
    // OS: N
    PHYSICAL_KEYBOARDS = 346;

    // Settings -> Language & input -> Virtual keyboard -> Add a virtual keyboard
    // CATEGORY: SETTINGS
    // OS: N
    ENABLE_VIRTUAL_KEYBOARDS = 347;

    // Settings -> Data usage -> Data Saver
    // CATEGORY: SETTINGS
    // OS: N
    DATA_SAVER_SUMMARY = 348;

    // Settings -> Data usage -> Data Saver -> Unrestricted data access
    // CATEGORY: SETTINGS
    // OS: N
    DATA_USAGE_UNRESTRICTED_ACCESS = 349;

    // Used for generic logging of Settings Preference Persistence, should not be used
    // outside SharedPreferencesLogger.
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_GENERIC_PACKAGE = 350;

    // Settings -> Apps -> Gear -> Special access
    SPECIAL_ACCESS = 351;

    // Logs that the user docks window via shortcut key.
    WINDOW_DOCK_SHORTCUTS = 352;

    // User already denied access to the request folder; action takes an integer
    // representing the folder's index on Environment.STANDARD_DIRECTORIES
    // (or -2 for root access, or -1 or unknown directory).
    ACTION_SCOPED_DIRECTORY_ACCESS_ALREADY_DENIED_BY_FOLDER = 353;

    // User already denied access to the request folder; action pass package name
    // of calling package.
    ACTION_SCOPED_DIRECTORY_ACCESS_ALREADY_DENIED_BY_PACKAGE = 354;

    // User denied access to the request folder and checked 'Do not ask again';
    // action takes an integer representing the folder's index on Environment.STANDARD_DIRECTORIES
    // (or -2 for root access, or -1 or unknown directory).
    ACTION_SCOPED_DIRECTORY_ACCESS_DENIED_AND_PERSIST_BY_FOLDER = 355;

    // User denied access to the request folder and checked 'Do not ask again';
    // action pass package name of calling package.
    ACTION_SCOPED_DIRECTORY_ACCESS_DENIED_AND_PERSIST_BY_PACKAGE = 356;

    // Logged when a user dismisses all task in overview
    OVERVIEW_DISMISS_ALL = 357;

    // Quick Settings -> Edit
    QS_EDIT = 358;

    // Quick Settings -> Edit -> Overflow -> Reset
    ACTION_QS_EDIT_RESET = 359;

    // QS -> Edit - Drag a tile out of the active tiles.
    // The _SPEC contains either the spec of the tile or
    // the package of the 3rd party app in the PKG field.
    ACTION_QS_EDIT_REMOVE_SPEC = 360;
    ACTION_QS_EDIT_REMOVE = 361;

    // QS -> Edit - Drag a tile into the active tiles.
    // The _SPEC contains either the spec of the tile or
    // the package of the 3rd party app in the PKG field.
    ACTION_QS_EDIT_ADD_SPEC = 362;
    ACTION_QS_EDIT_ADD = 363;

    // QS -> Edit - Drag a tile within the active tiles.
    // The _SPEC contains either the spec of the tile or
    // the package of the 3rd party app in the PKG field.
    ACTION_QS_EDIT_MOVE_SPEC = 364;
    ACTION_QS_EDIT_MOVE = 365;

    // Long-press on a QS tile. Tile spec in package field.
    ACTION_QS_LONG_PRESS = 366;

    // OPEN: SUW Welcome Screen -> Vision Settings
    // CATEGORY: SETTINGS
    // OS: N
    SUW_ACCESSIBILITY = 367;

    // OPEN: SUW Welcome Screen -> Vision Settings -> Magnification gesture
    // ACTION: New magnification gesture configuration is chosen
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: N
    SUW_ACCESSIBILITY_TOGGLE_SCREEN_MAGNIFICATION = 368;

    // OPEN: SUW Welcome Screen -> Vision Settings -> Font size
    // ACTION: New font size is chosen
    //  SUBTYPE: 0 is small, 1 is default, 2 is large, 3 is largest
    // CATEGORY: SETTINGS
    // OS: N
    SUW_ACCESSIBILITY_FONT_SIZE = 369;

    // OPEN: SUW Welcome Screen -> Vision Settings -> Display size
    // ACTION: New display size is chosen
    //  SUBTYPE: 0 is small, 1 is default, 2 is large, 3 is larger, 4 is largest
    // CATEGORY: SETTINGS
    // OS: N
    SUW_ACCESSIBILITY_DISPLAY_SIZE = 370;

    // OPEN: SUW Welcome Screen -> Vision Settings -> TalkBack
    // ACTION: New screen reader configuration is chosen
    //  SUBTYPE: 0 is off, 1 is on
    // CATEGORY: SETTINGS
    // OS: N
    SUW_ACCESSIBILITY_TOGGLE_SCREEN_READER = 371;

    // ------- Begin N Settings conditionals -----
    // Conditionals are the green bars at the top of the settings dashboard
    // All conditionals will have visible/hide events onResume/onPause
    // but they will also be used as extra ints in the
    // dismiss/expand/collapse/click/button events

    // swipe away conditional
    ACTION_SETTINGS_CONDITION_DISMISS = 372;

    // click on collapsed conditional or clicks expand button
    ACTION_SETTINGS_CONDITION_EXPAND = 373;

    // click collapse button on expanded conditional
    ACTION_SETTINGS_CONDITION_COLLAPSE = 374;

    // click main area of expanded conditional
    ACTION_SETTINGS_CONDITION_CLICK = 375;

    // click a direct button on expanded conditional
    ACTION_SETTINGS_CONDITION_BUTTON = 376;

    // Airplane mode on
    SETTINGS_CONDITION_AIRPLANE_MODE = 377;
    // AKA Data saver on
    SETTINGS_CONDITION_BACKGROUND_DATA = 378;
    // Battery saver on
    SETTINGS_CONDITION_BATTERY_SAVER = 379;
    // Cellular data off
    SETTINGS_CONDITION_CELLULAR_DATA = 380;
    // Do not disturb on
    SETTINGS_CONDITION_DND = 381;
    // Hotspot on
    SETTINGS_CONDITION_HOTSPOT = 382;
    // Work profile off
    SETTINGS_CONDITION_WORK_MODE = 383;

    // ------- Begin N Settings suggestions -----
    // Since suggestions come from system apps, suggestions will
    // have generic constants and the package providing the suggestion
    // will be put in the package field.  For suggestions in the Settings
    // package, the class name will be filled in instead (since settings
    // provides several suggetions).

    // Settings shown/hidden on main settings dashboard.
    // These are actually visibility events, but visible/hidden doesn't
    // take a package, so these are being logged as actions.
    ACTION_SHOW_SETTINGS_SUGGESTION = 384;
    ACTION_HIDE_SETTINGS_SUGGESTION = 385;

    // Click on a suggestion.
    ACTION_SETTINGS_SUGGESTION = 386;

    // Suggestion -> Overflow -> Remove.
    ACTION_SETTINGS_DISMISS_SUGGESTION = 387;

    // Settings > Apps > Gear > Special Access > Premium SMS access
    PREMIUM_SMS_ACCESS = 388;

    // Logged when the user resizes the docked stack. Arguments:
    // 0: Split 50:50
    // 1: Docked smaller
    // 2: Docked larger
    ACTION_WINDOW_DOCK_RESIZE = 389;

    // User exits split-screen by dragging the divider to the side of the screen. Arguments
    // 0: Docked gets maximized
    // 1: Fullscreen gets maximized
    ACTION_WINDOW_UNDOCK_MAX = 390;

    // User tried to dock an unresizable app.
    ACTION_WINDOW_DOCK_UNRESIZABLE = 391;

    // System UI Tuner > Other > Power notification controls
    TUNER_POWER_NOTIFICATION_CONTROLS = 392;

    // System UI Tuner > Other > Power notification controls > Toggle on/off
    ACTION_TUNER_POWER_NOTIFICATION_CONTROLS = 393;

    // Action: user enable / disabled data saver using Settings
    // OPEN: Settings -> Data Usage -> Data saver -> On/off toggle
    // VALUE: 1 for enabled, 0 for disabled
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_DATA_SAVER_MODE = 394;

    // User whitelisted an app for Data Saver mode; action pass package name of app
    // Action: user enable / disabled data saver using Settings
    // OPEN: Settings -> Data Usage -> Data saver -> Unrestricted data access > APP toggle turned on
    //       or
    //       Settings -> Apps -> APP -> Data usage -> Unrestricted data usage toggle turned on
    // VALUE: package name of APP
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_DATA_SAVER_WHITELIST = 395;

    // User blacklisted an app for Data Saver mode; action pass package name of app
    // OPEN: Settings -> Apps -> APP -> Data usage -> Background data toggle turned off
    // VALUE: package name of APP
    // CATEGORY: SETTINGS
    // OS: N
    ACTION_DATA_SAVER_BLACKLIST = 396;

    // User opened a remote input view associated with a notification. Passes package name of app
    // that posted the notification. Note that this can also happen transiently during notification
    // reinflation.
    ACTION_REMOTE_INPUT_OPEN = 397;

    // User attempt to send data through a remote input view associated with a notification.
    // Passes package name of app that posted the notification. May succeed or fail.
    ACTION_REMOTE_INPUT_SEND = 398;

    // Failed attempt to send data through a remote input view associated with a
    // notification. Passes package name of app that posted the notification.
    ACTION_REMOTE_INPUT_FAIL = 399;

    // User closed a remote input view associated with a notification. Passes package name of app
    // that posted the notification. Note that this can also happen transiently during notification
    // reinflation.
    ACTION_REMOTE_INPUT_CLOSE = 400;

    // OPEN: Settings > Accounts > Work profile settings
    // CATEGORY: SETTINGS
    ACCOUNTS_WORK_PROFILE_SETTINGS = 401;

    // Settings -> Dev options -> Convert to file encryption
    CONVERT_FBE = 402;

    // Settings -> Dev options -> Convert to file encryption -> WIPE AND CONVERT...
    CONVERT_FBE_CONFIRM = 403;

    // Settings -> Dev options -> Running services
    RUNNING_SERVICES = 404;

    // The dialog shown by 3P intent to change current webview implementation.
    WEBVIEW_IMPLEMENTATION = 405;

    // Settings launched from expanded quick settings.
    ACTION_QS_EXPANDED_SETTINGS_LAUNCH = 406;

    // Notification expansion state toggled by the expand affordance.
    ACTION_NOTIFICATION_EXPANDER = 407;

    // Notification group expansion state toggled by the expand affordance.
    ACTION_NOTIFICATION_GROUP_EXPANDER = 408;


    // Notification expansion state toggled by the expand gesture.
    ACTION_NOTIFICATION_GESTURE_EXPANDER = 409;

    // Notification group expansion state toggled by the expand gesture.
    ACTION_NOTIFICATION_GROUP_GESTURE_EXPANDER = 410;

    // User performs gesture that activates the ambient display
    // 1: Gesture performed is Nudge
    // 2: Gesture performed is Pickup
    // 4: Gesture performed is Double Tap
    ACTION_AMBIENT_GESTURE = 411;

    // ---- End N Constants, all N constants go above this line ----

    // ------- Begin N App Disambig Shade -----
    // Application disambig shade opened or closed with a featured app.
    // These are actually visibility events, but visible/hidden doesn't
    // take a package, so these are being logged as actions.
    // Package: Calling app on open, called app on close
    ACTION_SHOW_APP_DISAMBIG_APP_FEATURED = 451;
    ACTION_HIDE_APP_DISAMBIG_APP_FEATURED = 452;

    // Application disambig shade opened or closed without a featured app.
    // These are actually visibility events, but visible/hidden doesn't
    // take a package, so these are being logged as actions.
    // Package: Calling app on open, called app on close
    ACTION_SHOW_APP_DISAMBIG_NONE_FEATURED = 453;
    ACTION_HIDE_APP_DISAMBIG_NONE_FEATURED = 454;

    // User opens in an app by pressing “Always” in the application disambig shade.
    // Subtype: Index of selection
    ACTION_APP_DISAMBIG_ALWAYS = 455;

    // User opens in an app by pressing “Just Once” in the application disambig shade.
    // Subtype: Index of selection
    ACTION_APP_DISAMBIG_JUST_ONCE = 456;

    // User opens in an app by tapping on its name in the application disambig shade.
    // Subtype: Index of selection
    ACTION_APP_DISAMBIG_TAP = 457;

    // OPEN: Settings > Internal storage > Storage manager
    // CATEGORY: SETTINGS
    STORAGE_MANAGER_SETTINGS = 458;

    // OPEN: Settings -> Gestures
    // CATEGORY: SETTINGS
    SETTINGS_GESTURES = 459;

    // ------ Begin Deletion Helper ------
    // ACTION: Settings > Storage > Free Up Space > Photos & Videos > Toggle
    //   SUBTYPE: false is off, true is on
    // CATEGORY: SETTINGS
    ACTION_DELETION_SELECTION_PHOTOS = 460;

    // ACTION: Settings > Storage > Free Up Space > Apps > Toggle
    //   SUBTYPE: false is off, true is on
    // CATEGORY: SETTINGS
    ACTION_DELETION_SELECTION_ALL_APPS = 461;

    // ACTION: Settings > Storage > Free Up Space > Apps > Click an unchecked app
    // CATEGORY: SETTINGS
    //   PACKAGE: Unchecked app
    ACTION_DELETION_SELECTION_APP_ON = 462;

    // ACTION: Settings > Storage > Free Up Space > Apps > Click a checked app
    // CATEGORY: SETTINGS
    //   PACKAGE: Checked app
    ACTION_DELETION_SELECTION_APP_OFF = 463;

    // ACTION: Settings > Storage > Free Up Space > Apps > Click category
    //   SUBTYPE: false is expanded, true is collapsed
    // CATEGORY: SETTINGS
    ACTION_DELETION_APPS_COLLAPSED = 464;

    // ACTION: Settings > Storage > Free Up Space > Downloads > Check On
    //   SUBTYPE: false is off, true is on
    // CATEGORY: SETTINGS
    ACTION_DELETION_SELECTION_DOWNLOADS = 465;

    // ACTION: Settings > Storage > Free Up Space > Downloads > Click category
    //   SUBTYPE: false is expanded, true is collapsed
    // CATEGORY: SETTINGS
    ACTION_DELETION_DOWNLOADS_COLLAPSED = 466;

    // ACTION: Settings > Storage > Free Up Space > Free up ... GB
    // CATEGORY: SETTINGS
    ACTION_DELETION_HELPER_CLEAR = 467;

    // ACTION: Settings > Storage > Free Up Space > Cancel
    // CATEGORY: SETTINGS
    ACTION_DELETION_HELPER_CANCEL = 468;

    // ACTION: Settings > Storage > Free Up Space > Free up ... GB > Remove
    // CATEGORY: SETTINGS
    ACTION_DELETION_HELPER_REMOVE_CONFIRM = 469;

    // ACTION: Settings > Storage > Free Up Space > Free up ... GB > Cancel
    // CATEGORY: SETTINGS
    ACTION_DELETION_HELPER_REMOVE_CANCEL = 470;

    // Deletion helper encountered an error during package deletion.
    ACTION_DELETION_HELPER_APPS_DELETION_FAIL = 471;

    // Deletion helper encountered an error during downloads folder deletion.
    ACTION_DELETION_HELPER_DOWNLOADS_DELETION_FAIL = 472;

    // Deletion helper encountered an error during photo and video deletion.
    ACTION_DELETION_HELPER_PHOTOS_VIDEOS_DELETION_FAIL = 473;

    // OPEN: Settings (root page if there are multiple tabs)
    // CATEGORY: SETTINGS
    DASHBOARD_CONTAINER = 474;

    // OPEN: Settings -> SUPPORT TAB
    // CATEGORY: SETTINGS
    SUPPORT_FRAGMENT = 475;

    // ACTION: Settings -> Select summary tab.
    // CATEGORY: SETTINGS
    ACTION_SELECT_SUMMARY=476;

    // ACTION: Settings -> Select support tab.
    // CATEGORY: SETTINGS
    ACTION_SELECT_SUPPORT_FRAGMENT = 477;

    // ACTION: Settings -> Support -> Tips & tricks
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_TIPS_AND_TRICKS = 478;

    // ACTION: Settings -> Support -> Help & feedback
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_HELP_AND_FEEDBACK = 479;

    // ACTION: Settings -> Support -> Sign in
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_SIGN_IN = 480;

    // ACTION: Settings -> Support -> Phone
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_PHONE = 481;

    // ACTION: Settings -> Support -> Chat
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_CHAT = 482;

    // ACTION: Settings -> Support -> Phone/Chat -> Disclaimer Cancel
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_DISCLAIMER_CANCEL = 483;

    // ACTION: Settings -> Support -> Phone/Chat -> Disclaimer OK
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_DISCLAIMER_OK = 484;

    // ACTION: Settings -> Support -> Toll-Free Phone
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_DAIL_TOLLFREE = 485;

    // ACTION: Settings -> Support -> "Travel Abroad" Button
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_VIEW_TRAVEL_ABROAD_DIALOG = 486;

    // ACTION: Settings -> Support -> "Travel Abroad" Button -> Tolled Phone
    // CATEGORY: SETTINGS
    ACTION_SUPPORT_DIAL_TOLLED = 487;

    // OPEN: Settings > Display > Night Light
    // CATEGORY: SETTINGS
    NIGHT_DISPLAY_SETTINGS = 488;

    // ACTION: Settings -> Storage -> Manage storage -> Click Storage Manager
    //   SUBTYPE: false is off, true is on
    ACTION_TOGGLE_STORAGE_MANAGER = 489;

    // Settings launched from collapsed quick settings.
    ACTION_QS_COLLAPSED_SETTINGS_LAUNCH = 490;

    // OPEN: QS Night Light tile shown
    // ACTION: QS Night Light tile tapped
    //   SUBTYPE: 0 is off, 1 is on
    // CATEGORY: QUICK_SETTINGS
    QS_NIGHT_DISPLAY = 491;

    // Night Light on
    SETTINGS_CONDITION_NIGHT_DISPLAY = 492;

    // System navigation key up.
    ACTION_SYSTEM_NAVIGATION_KEY_UP = 493;

    // System navigation key down.
    ACTION_SYSTEM_NAVIGATION_KEY_DOWN = 494;

    // OPEN: Settings > Display -> Ambient Display
    // CATEGORY: SETTINGS
    ACTION_AMBIENT_DISPLAY = 495;

    // ACTION: Settings -> [sub settings activity] -> Options menu -> Help & Support
    //   SUBTYPE: sub settings classname
    ACTION_SETTING_HELP_AND_FEEDBACK = 496;

    // ---- End N-MR1 Constants, all N-MR1 constants go above this line ----

    // Add new aosp constants above this line.
    // END OF AOSP CONSTANTS
*/
}