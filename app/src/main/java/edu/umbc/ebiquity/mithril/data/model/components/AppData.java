package edu.umbc.ebiquity.mithril.data.model.components;

import android.graphics.Bitmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Helper class for managing content
 */
public class AppData implements Comparable<AppData> {
    private String appDescription;
    private Map<String, Boolean> permissions;
    private String appCategory;
    private int targetSdkVersion;
    private Bitmap icon;
    private String appName;
    private String packageName;
    private String versionInfo;
    private boolean installed;
    private String appType;
    private double risk;
    private int uid;
    private boolean adLibraryUsed; // This information should either come from PrivacyGrade or it should be extracted
    private int id;
    private String requesterCategory; // app_category: 54 Google Play Store Categories
    private String requesterContentRating; // content_rating
    private String requesterCreatorName; // developer_name
    private String requesterName; // app_name
    private String requesterPrivilegeLevel; // privilege_level: /data/app/ /system/app/ /system/priv-app/ /system/framework/ /vendor/app/
    private String requesterReviewCount; // review_count
    private String requesterReviewRating; // review_rating
    private String requesterUsageCount;    // installs

    public AppData(String appDescription,
                   String appCategory,
                   int targetSdkVersion,
                   Bitmap icon,
                   String appName,
                   String packageName,
                   String versionInfo,
                   String appType,
                   int uid,
                   double risk) {
        setAppDescription(appDescription);
        setAppCategory(appCategory);
        setTargetSdkVersion(targetSdkVersion);
        setIcon(icon);
        setAppName(appName);
        setPackageName(packageName);
        setVersionInfo(versionInfo);
        setAppType(appType);
        setUid(uid);
        setRisk(risk);
        permissions = new HashMap<>();
    }

    public AppData() {
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public Map<String, Boolean> getPermissions() {
        return permissions;
    }

    public void setPermissions(Map<String, Boolean> permissions) {
        this.permissions = permissions;
    }

    public String getGrantedPermissions() {
        StringBuffer permissionString = new StringBuffer();
        for (Map.Entry<String, Boolean> entry : permissions.entrySet())
            if (entry.getValue()) {
                permissionString.append(entry.getKey().split("\\.")[entry.getKey().split("\\.").length - 1].toLowerCase().replace('_', ' '));
                permissionString.append(", ");
            }
        return permissionString.toString();
    }

    public void addPermission(String permission, boolean granted) {
        permissions.put(permission, granted);
    }

    public String getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(String appCategory) {
        if (appCategory == null)
            throw new NullPointerException();
        this.appCategory = appCategory;
    }

    public int getTargetSdkVersion() {
        return targetSdkVersion;
    }

    public void setTargetSdkVersion(int targetSdkVersion) {
        this.targetSdkVersion = targetSdkVersion;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public int compareTo(AppData another) {
        return this.getAppName().compareTo(another.getAppName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppData)) return false;

        AppData appData = (AppData) o;

        if (getTargetSdkVersion() != appData.getTargetSdkVersion()) return false;
        if (isInstalled() != appData.isInstalled()) return false;
        if (getUid() != appData.getUid()) return false;
        if (!getAppDescription().equals(appData.getAppDescription())) return false;
        if (!getPermissions().equals(appData.getPermissions())) return false;
        if (!getAppCategory().equals(appData.getAppCategory())) return false;
        if (!getIcon().equals(appData.getIcon())) return false;
        if (!getAppName().equals(appData.getAppName())) return false;
        if (!getPackageName().equals(appData.getPackageName())) return false;
        if (!getVersionInfo().equals(appData.getVersionInfo())) return false;
        return getAppType().equals(appData.getAppType());

    }

    @Override
    public int hashCode() {
        int result = getAppDescription().hashCode();
        result = 31 * result + getPermissions().hashCode();
        result = 31 * result + getAppCategory().hashCode();
        result = 31 * result + getTargetSdkVersion();
        result = 31 * result + getIcon().hashCode();
        result = 31 * result + getAppName().hashCode();
        result = 31 * result + getPackageName().hashCode();
        result = 31 * result + getVersionInfo().hashCode();
        result = 31 * result + (isInstalled() ? 1 : 0);
        result = 31 * result + getAppType().hashCode();
        result = 31 * result + getUid();
        return result;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "appDescription='" + appDescription + '\'' +
                ", permissions=" + permissions +
                ", appCategory='" + appCategory + '\'' +
                ", targetSdkVersion=" + targetSdkVersion +
                ", icon=" + icon +
                ", appName='" + appName + '\'' +
                ", packageName='" + packageName + '\'' +
                ", versionInfo='" + versionInfo + '\'' +
                ", installed=" + installed +
                ", appType='" + appType + '\'' +
                ", uid=" + uid +
                '}';
    }
}