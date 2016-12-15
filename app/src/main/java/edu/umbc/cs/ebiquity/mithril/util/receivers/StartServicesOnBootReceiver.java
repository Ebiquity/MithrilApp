package edu.umbc.cs.ebiquity.mithril.util.receivers;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;

import edu.umbc.cs.ebiquity.mithril.MithrilApplication;
import edu.umbc.cs.ebiquity.mithril.util.services.AppLaunchDetectorService;
import edu.umbc.cs.ebiquity.mithril.util.services.LocationUpdateService;
import edu.umbc.cs.ebiquity.mithril.util.specialtasks.permissions.PermissionHelper;

public class StartServicesOnBootReceiver extends BroadcastReceiver {
    private SharedPreferences sharedPref;

    @Override
    public void onReceive(Context context, Intent intent) {
        sharedPref = context.getSharedPreferences(MithrilApplication.getSharedPreferencesName(), Context.MODE_PRIVATE);
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            if (PermissionHelper.isExplicitPermissionAcquisitionNecessary()) {
                PermissionHelper.requestAllNecessaryPermissions(context);
                if (PermissionHelper.getUsageStatsPermisison(context))
                    context.startService(new Intent(context, AppLaunchDetectorService.class));
                if (PermissionHelper.isPermissionGranted(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                    boolean updatesRequested = false;
                    /*
                    * Get any previous setting for location updates
                    * Gets "false" if an error occurs
                    */
                    if (sharedPref.contains(MithrilApplication.getPrefKeyLocationUpdateServiceState())) {
                        updatesRequested = sharedPref.getBoolean(MithrilApplication.getPrefKeyLocationUpdateServiceState(), false);
                    }
                    if (updatesRequested) {
                        context.startService(new Intent(context, LocationUpdateService.class));
                    }
                }
            }
//            if (PermissionHelper.isExplicitPermissionAcquisitionNecessary()) {
//                if (PermissionHelper.getUsageStatsPermisison(context)) {
//                    ComponentName service = context.startService(new Intent(context, AppLaunchDetectorService.class));
//
//                    if (null == service) {
//                        // something really wrong here
//                        Log.e(MithrilApplication.getDebugTag(), "Could not start service " + AppLaunchDetectorService.class.getName().toString());
//                    }
//                }
//
//                if (PermissionHelper.isPermissionGranted(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
//                    boolean updatesRequested = false;
//                    /*
//                    * Get any previous setting for location updates
//                    * Gets "false" if an error occurs
//                    */
//                    if (sharedPref.contains(MithrilApplication.getPrefKeyLocationUpdateServiceState())) {
//                        updatesRequested = sharedPref.getBoolean(MithrilApplication.getPrefKeyLocationUpdateServiceState(), false);
//                    }
//                    if (updatesRequested) {
//                        ComponentName service = context.startService(new Intent(context, LocationUpdateService.class));
//
//                        if (null == service) {
//                            // something really wrong here
//                            Log.e(MithrilApplication.getDebugTag(), "Could not start service " + LocationUpdateService.class.getName().toString());
//                        }
//                    }
//                }
//            }
        } else {
            Log.e(MithrilApplication.getDebugTag(), "Received unexpected intent " + intent.toString());
        }
    }
}