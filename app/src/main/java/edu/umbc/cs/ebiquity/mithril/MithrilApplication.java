package edu.umbc.cs.ebiquity.mithril;

import android.app.Application;

/**
 * Created by Prajit Kumar Das on 5/1/2016.
 */
public class MithrilApplication extends Application {
    public static final int CONST_ALL_PERMISSIONS_MITHRIL_REQUEST_CODE = 1;
    private static final String READ_LOGS_PERMISSION_FOR_APP_CMD = "pm grant edu.umbc.cs.ebiquity.mithril android.permission.READ_LOGS";
    private static final String PACKAGE_USAGE_STATS_PERMISSION_FOR_APP_CMD = "pm grant edu.umbc.cs.ebiquity.mithril android.permission.PACKAGE_USAGE_STATS";
    private static final String ROOT_PRIVILEGE_CMD = "su -c";
    private static final String DETECT_APP_LAUNCH_CMD = "logcat ActivityManager:I *:S | grep \"LAUNCHER\"";
    private static final String CONST_COMMAND_APP_BROADCAST_INTENT = "edu.umbc.ebiquity.mithril.command.intent.action.DATA_REQUEST";
    private static final String PREF_KEY_HOME_LOC = "homeLocation";
    private static final String PREF_KEY_WORK_LOC = "workLocation";
    private static final String PREF_KEY_START_TIME = "startTime";
    private static final String PREF_KEY_END_TIME = "endTime";
    private static final String PREF_KEY_WORKING_HOURS_ENABLED = "workingHoursEnabled";
    private static final String CONST_DATABASE_NAME = "mithril.db";
    private static final String CONST_DEBUG_TAG = "MITHRIL_DEBUG_TAG";
    private static final String CONST_NO_GROUP_FOR_PERMISSION = "No group";
    private static final String CONST_PERMISSION_PROTECTION_LEVEL_UNKNOWN = "unknown";
    private static final String CONST_PERMISSION_PROTECTION_LEVEL_NORMAL = "normal";
    private static final String CONST_PERMISSION_PROTECTION_LEVEL_DANGEROUS = "dangerous";
    private static final String CONST_PERMISSION_PROTECTION_LEVEL_SIGNATURE = "signature";
    private static final String CONST_PERMISSION_PROTECTION_LEVEL_PRIVILEGED = "privileged";
    private static final String CONST_PERMISSION_FLAG_COSTS_MONEY = "costs-money";
    private static final String CONST_PERMISSION_FLAG_INSTALLED = "installed";
    private static final String CONST_PERMISSION_FLAG_NONE = "no-flags";
    private static final String CONST_MITHRIL_MONITORING_SERVICE_STOPPED = "edu.umbc.cs.ebiquity.mithril.SERVICE_STOPPED";
    /**
     * This is for detecting app launch
     */
    private static final String CONST_LOG_LAUNCH_INTENT_TXT = "android.intent.category.LAUNCHER";
    /**
     * Context constants
     * TODO Change the constants as per the ontology and ensure that you generate some rules to be modified by the automated script
     * The following constants are made up and not in sync with the ontology
     */
    private static final String CONST_ARRAY_ACTIVITY[] = {"Activity", "Personal_Activity", "Professional_Activity", "Date", "Enterntainment",
            "Exercising", "Sleeping", "Partying", "Playing", "Running"};
    private static final String CONST_ARRAY_LOCATION[] = {"Location", "Place", "Classroom", "Home", "Library", "Movie_Theatre", "Office",
            "Department_Office", "Lab", "Supervisor_Office", "Government_Office", "Post_Office", "Secure_Government_Office"};
    private static final String CONST_ARRAY_PRESENCE_INFO_IDENTITY[] = {"Public", "Professional_Network", "Personal_Network", "Superior",
            "Subordinate", "Colleague", "Family", "Friends", "Private"};
    private static final String CONST_ARRAY_TIME[] = {"Week_Day", "Working_Hours", "Weekend", "Off_Hours"};
    /**
     * Resource constants
     */
    private static final String CONST_ARRAY_RESOURCE_CATEGORY[] = {
            "Default_Resource", "Camera", "Microphone", "Light_Sensor", "Pressure_Sensor", "Relative_Humidity_Sensor", "Temperature_Sensor",
            "Network_Location", "WiFi_Location", "GPS_Location", "Accelerometer", "Gravity_Sensor", "Gyroscope", "Rotation", "Bluetooth",
            "Cellular_Network", "WiFi_Network", "Geomagnetic_Field_Sensor", "Orientation_Sensor", "Proximity_Sensor", "Calendar", "Call_Logs",
            "Contacts", "Email", "Audio_Files", "Non_Media_Files", "Image_Files", "Video_Files", "Messages", "User_Dictionary", "Device_Id"};
    /**
     * Requester constants
     */
    private static final String CONST_ARRAY_REQUESTER_CATEGORY[] = {
            "Default_App_Category", "Books_And_Reference", "Business", "Comics", "Communication", "Education", "Entertainment", "Finance",
            "Health_And_Fitness", "Libraries_And_Demo", "Lifestyle", "App_Wallpaper", "Media_And_Video", "Medical", "Music_And_Audio",
            "News_And_Magazines", "Personalization", "Photography", "Productivity", "Shopping", "Social", "Sports", "Tools", "Transportation",
            "Travel_And_Local", "Weather", "App_Widgets", "Game", "Game_Action", "Game_Adventure", "Game_Arcade", "Game_Board", "Game_Card",
            "Game_Casino", "Game_Casual", "Game_Educational", "Game_Family", "Game_Music", "Game_Puzzle", "Game_Racing", "Game_Role_Playing",
            "Game_Simulation", "Game_Sports", "Game_Strategy", "Game_Trivia", "Game_Word"};
    private static final String CONST_CONTEXT_DEFAULT_TIME = "Default Time";
    private static final String CONST_CONTEXT_DEFAULT_ACTIVITY = "Default Activity";
    private static final String CONST_CONTEXT_DEFAULT_LOCATION = "Default Location";
    private static final String CONST_CONTEXT_DEFAULT_IDENTITY = "John Doe";
    private static final String CONST_POL_RUL_NAME_SOCIAL_MEDIA_CAMERA_ACCESS_RULE = "Social_Media_Camera_Access_Rule";
    private static final String CONST_POL_RUL_DEFAULT_RULE = "Default policy rule name";
    private static final String CONST_DEFAULT_DESCRIPTION = "Default description";
    private static final String CONST_KEY_POLICY_RULE_ID = "PolicyRuleId";
    private static final String CONST_KEY_POLICY_RULE_NAME = "PolicyRuleName";
    private static final String CONST_PRESENCE_INFO_HEADER = "Presence Info";
    private static final String CONST_REQUESTER_INFO_HEADER = "Requester Info";
    private static final String CONST_USER_ACTIVITY_HEADER = "User Activity";
    private static final String CONST_USER_IDENTITY_HEADER = "User SemanticIdentity";
    private static final String CONST_USER_LOCATION_HEADER = "User Location";
    private static final String CONST_USER_TIME_HEADER = "Date and Time";
    private static final String CONST_TOAST_MESSAGE_RULE_DELETED = " rule was deleted";
    private static final String CONST_TOAST_MESSAGE_TRUE_VIOLATION_NOTED = " the \"true violation\" has been noted. User will not be asked again "
            + "about the same violation";
    private static final String CONST_TOAST_MESSAGE_DATABASE_NOT_RELOADED = "Data was not relaoded!";
    private static final String sharedPreferencesName = "edu.umbc.cs.ebiquity.mithril.mithrilappmanager";
    private static final String debugTag = "MithrilAppManagerDebugTag";
    private static final String allAppsDisplayTag = "allApps";
    private static final String systemAppsDisplayTag = "systemApps";
    private static final String userAppsDisplayTag = "userApps";
    private static final String appDisplayTypeTag = "AppDisplayTypeTag";
    private static final String appPkgNameTag = "AppPkgNameTag";
    private static final String sharedPreferenceAppCount = "AppCount";

    public static String getPrefKeyWorkingHoursEnabled() {
        return PREF_KEY_WORKING_HOURS_ENABLED;
    }

    public static String getPrefKeyHomeLoc() {
        return PREF_KEY_HOME_LOC;
    }

    public static String getPrefKeyWorkLoc() {
        return PREF_KEY_WORK_LOC;
    }

    public static String getPrefKeyStartTime() {
        return PREF_KEY_START_TIME;
    }

    public static String getPrefKeyEndTime() {
        return PREF_KEY_END_TIME;
    }

    public static String getConstCommandAppBroadcastIntent() {
        return CONST_COMMAND_APP_BROADCAST_INTENT;
    }

    public static String getConstDatabaseName() {
        return CONST_DATABASE_NAME;
    }

    public static String getConstDebugTag() {
        return CONST_DEBUG_TAG;
    }

    public static String[] getConstArrayActivity() {
        return CONST_ARRAY_ACTIVITY;
    }

    public static String[] getConstArrayLocation() {
        return CONST_ARRAY_LOCATION;
    }

    public static String[] getConstArrayPresenceInfoIdentity() {
        return CONST_ARRAY_PRESENCE_INFO_IDENTITY;
    }

    public static String[] getConstArrayTime() {
        return CONST_ARRAY_TIME;
    }

    public static String getConstContextDefaultTime() {
        return CONST_CONTEXT_DEFAULT_TIME;
    }

    public static String getConstContextDefaultActivity() {
        return CONST_CONTEXT_DEFAULT_ACTIVITY;
    }

    public static String getConstContextDefaultLocation() {
        return CONST_CONTEXT_DEFAULT_LOCATION;
    }

    public static String getConstContextDefaultIdentity() {
        return CONST_CONTEXT_DEFAULT_IDENTITY;
    }

    public static String getConstPolRulNameSocialMediaCameraAccessRule() {
        return CONST_POL_RUL_NAME_SOCIAL_MEDIA_CAMERA_ACCESS_RULE;
    }

    public static String getConstPolRulDefaultRule() {
        return CONST_POL_RUL_DEFAULT_RULE;
    }

    public static String getConstDefaultDescription() {
        return CONST_DEFAULT_DESCRIPTION;
    }

    public static String getConstKeyPolicyRuleId() {
        return CONST_KEY_POLICY_RULE_ID;
    }

    public static String getConstKeyPolicyRuleName() {
        return CONST_KEY_POLICY_RULE_NAME;
    }

    public static String getConstPresenceInfoHeader() {
        return CONST_PRESENCE_INFO_HEADER;
    }

    public static String getConstRequesterInfoHeader() {
        return CONST_REQUESTER_INFO_HEADER;
    }

    public static String getConstUserActivityHeader() {
        return CONST_USER_ACTIVITY_HEADER;
    }

    public static String getConstUserIdentityHeader() {
        return CONST_USER_IDENTITY_HEADER;
    }

    public static String getConstUserLocationHeader() {
        return CONST_USER_LOCATION_HEADER;
    }

    public static String getConstUserTimeHeader() {
        return CONST_USER_TIME_HEADER;
    }

    public static String getConstToastMessageRuleDeleted() {
        return CONST_TOAST_MESSAGE_RULE_DELETED;
    }

    public static String getConstToastMessageTrueViolationNoted() {
        return CONST_TOAST_MESSAGE_TRUE_VIOLATION_NOTED;
    }

    public static String getConstToastMessageDatabaseNotReloaded() {
        return CONST_TOAST_MESSAGE_DATABASE_NOT_RELOADED;
    }

    public static String[] getConstArrayRequesterCategory() {
        return CONST_ARRAY_REQUESTER_CATEGORY;
    }

    public static String[] getConstArrayResourceCategory() {
        return CONST_ARRAY_RESOURCE_CATEGORY;
    }

    public static String getAllAppsDisplayTag() {
        return allAppsDisplayTag;
    }

    public static String getSystemAppsDisplayTag() {
        return systemAppsDisplayTag;
    }

    public static String getUserAppsDisplayTag() {
        return userAppsDisplayTag;
    }

    public static String getAppDisplayTypeTag() {
        return appDisplayTypeTag;
    }

    public static String getSharedPreferenceAppCount() {
        return sharedPreferenceAppCount;
    }

    public static String getSharedPreferencesName() {
        return sharedPreferencesName;
    }

    public static String getDebugTag() {
        return debugTag;
    }

    public static String getAppPkgNameTag() {
        return appPkgNameTag;
    }

    public static String getConstNoGroupForPermission() {
        return CONST_NO_GROUP_FOR_PERMISSION;
    }

    public static String getConstPermissionProtectionLevelUnknown() {
        return CONST_PERMISSION_PROTECTION_LEVEL_UNKNOWN;
    }

    public static String getConstPermissionProtectionLevelNormal() {
        return CONST_PERMISSION_PROTECTION_LEVEL_NORMAL;
    }

    public static String getConstPermissionProtectionLevelDangerous() {
        return CONST_PERMISSION_PROTECTION_LEVEL_DANGEROUS;
    }

    public static String getConstPermissionProtectionLevelSignature() {
        return CONST_PERMISSION_PROTECTION_LEVEL_SIGNATURE;
    }

    public static String getConstPermissionProtectionLevelPrivileged() {
        return CONST_PERMISSION_PROTECTION_LEVEL_PRIVILEGED;
    }

    public static String getConstPermissionFlagCostsMoney() {
        return CONST_PERMISSION_FLAG_COSTS_MONEY;
    }

    public static String getConstPermissionFlagInstalled() {
        return CONST_PERMISSION_FLAG_INSTALLED;
    }

    public static String getConstPermissionFlagNone() {
        return CONST_PERMISSION_FLAG_NONE;
    }

    public static String getReadLogsPermissionForAppCmd() {
        return READ_LOGS_PERMISSION_FOR_APP_CMD;
    }

    public static String getConstLogLaunchIntentTxt() {
        return CONST_LOG_LAUNCH_INTENT_TXT;
    }

    public static String getRootPrivilegeCmd() {
        return ROOT_PRIVILEGE_CMD;
    }

    public static int getConstAllPermissionsMithrilRequestCode() {
        return CONST_ALL_PERMISSIONS_MITHRIL_REQUEST_CODE;
    }

    public static String getConstMithrilMonitoringServiceStopped() {
        return CONST_MITHRIL_MONITORING_SERVICE_STOPPED;
    }

    public static String getDetectAppLaunchCmd() {
        return DETECT_APP_LAUNCH_CMD;
    }

    public static String getPackageUsageStatsPermissionForAppCmd() {
        return PACKAGE_USAGE_STATS_PERMISSION_FOR_APP_CMD;
    }
}