package edu.umbc.ebiquity.mithril.util.specialtasks.permissions;

import android.Manifest;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.umbc.ebiquity.mithril.MithrilAC;
import edu.umbc.ebiquity.mithril.util.specialtasks.root.RootAccess;

/**
 * Created by Prajit on 11/21/2016.
 */

public class PermissionHelper {
    private static final List<String> permissionsRequired = Arrays.asList(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.READ_CALENDAR,
            Manifest.permission.WRITE_CALENDAR,
            Manifest.permission.KILL_BACKGROUND_PROCESSES
    );

    public static void quitMithril(Context context) {
        Toast.makeText(context, "You denied permissions I desperately needed, please uninstall me :(", Toast.LENGTH_LONG).show();
        context.startActivity(new Intent(
                Intent.ACTION_DELETE, Uri.parse(
                "package:" + context.getPackageName())));
    }

    public static void quitMithril(Context context, String message) {
//        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        context.startActivity(new Intent(
                Intent.ACTION_DELETE, Uri.parse(
                "package:" + context.getPackageName())));
        toastAndFinish(context, message);
    }

    public static void toastAndFinish(Context context, String message) {
        toast(context, message, Toast.LENGTH_SHORT);
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    public static void toast(Context context, String message) {
        toast(context, message, Toast.LENGTH_LONG);
    }

    public static void toast(Context context, String message, int toastLength) {
        Toast.makeText(context, message, toastLength).show();
    }

    private static List<String> getPermissionsRequired() {
        return permissionsRequired;
    }

    public static List<String> getPermissionsThatCanBeRequested(final Context context) {
        List<String> permissionsThatCanBeRequested = new ArrayList<>();
        for (String permission : getPermissionsRequired()) {
            if (isPermissionGranted(context, permission) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, permission)) {
                    Toast.makeText(context, "You denied " + permission + " permission. This might disrupt some functionality!", Toast.LENGTH_SHORT).show();
                } else {
                    permissionsThatCanBeRequested.add(permission);
                }
            }
        }
        return permissionsThatCanBeRequested;
    }

    public static boolean isAllRequiredPermissionsGranted(Context context) {
        for (String permission : getPermissionsRequired())
            if (isPermissionGranted(context, permission) == PackageManager.PERMISSION_DENIED)
                return false;
        return true;
    }

    public static int isPermissionGranted(Context context, String permission) {
        return ContextCompat.checkSelfPermission(context, permission);
    }

    public static boolean isExplicitPermissionAcquisitionNecessary() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }

    public static boolean needsUpdateAppOpsPermission(Context context) {
        return postLollipop() && !hasUpdateAppOpsPermissionA(context);
    }

    public static boolean needsUsageStatsPermission(Context context) {
        return postLollipop() && !hasUsageStatsPermission(context);
    }

    public static boolean needsWriteSettingsPermission(Context context) {
        return postLollipop() && !hasWriteSettingsPermission(context);
    }

    public static boolean needsSystemAlertWindowPermission(Context context) {
        return postLollipop() && !hasSystemAlertWindowPermission(context);
    }

    public static boolean needsRootPrivileges(Context context) {
        Log.d(MithrilAC.getDebugTag(),
                "REAL_GET_TASKS: " + String.valueOf(
                        PermissionHelper.isPermissionGranted(context,
                                "android.permission.REAL_GET_TASKS"
                        )
                )
        );
        Log.d(MithrilAC.getDebugTag(),
                "WRITE_SECURE_SETTINGS: " + String.valueOf(
                        PermissionHelper.isPermissionGranted(context,
                                "android.permission.WRITE_SECURE_SETTINGS"
                        )
                )
        );
        Log.d(MithrilAC.getDebugTag(),
                "UPDATE_APP_OPS_STATS: " + String.valueOf(
                        PermissionHelper.isPermissionGranted(context,
                                "android.permission.UPDATE_APP_OPS_STATS"
                        )
                )
        );
        Log.d(MithrilAC.getDebugTag(),
                "MANAGE_APP_OPS_RESTRICTIONS: " + String.valueOf(
                        PermissionHelper.isPermissionGranted(context,
                                "android.permission.MANAGE_APP_OPS_RESTRICTIONS"
                        )
                )
        );
        Log.d(MithrilAC.getDebugTag(),
                "GET_APP_OPS_STATS: " + String.valueOf(
                        PermissionHelper.isPermissionGranted(context,
                                "android.permission.GET_APP_OPS_STATS"
                        )
                )
        );
        if (RootAccess.isRooted(context) &&
                PermissionHelper.isPermissionGranted(
                        context,
                        "android.permission.GET_APP_OPS_STATS") ==
                        PackageManager.PERMISSION_GRANTED &&
                PermissionHelper.isPermissionGranted(
                        context,
                        "android.permission.WRITE_SECURE_SETTINGS") ==
                        PackageManager.PERMISSION_GRANTED)
            return false;
        return true;
    }

    public static boolean postLollipop() {
        return android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    private static boolean hasUsageStatsPermission(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(Context.APP_OPS_SERVICE);
        int mode = appOpsManager.checkOpNoThrow(AppOpsManager.OPSTR_GET_USAGE_STATS, android.os.Process.myUid(), context.getPackageName());
        Log.d(MithrilAC.getDebugTag(), "hasUsageStatsPermission: " + Integer.toString(mode));
        return mode == AppOpsManager.MODE_ALLOWED;
    }

    private static boolean hasWriteSettingsPermission(Context context) {
        if (Settings.System.canWrite(context))
            return true;
        return false;
    }

    private static boolean hasSystemAlertWindowPermission(Context context) {
        if (Settings.canDrawOverlays(context))
            return true;
        return false;
    }

    private static boolean hasUpdateAppOpsPermissionA(Context context) {
        return PermissionHelper.isPermissionGranted(context, "android.permission.UPDATE_APP_OPS_STATS") == PackageManager.PERMISSION_GRANTED;
    }
}