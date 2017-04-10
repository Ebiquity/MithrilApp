package edu.umbc.ebiquity.mithril.ui.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import java.util.List;

import edu.umbc.ebiquity.mithril.MithrilApplication;
import edu.umbc.ebiquity.mithril.R;
import edu.umbc.ebiquity.mithril.util.specialtasks.permissions.PermissionHelper;

public class PermissionAcquisitionActivity extends AppCompatActivity {
    private SharedPreferences.Editor editor;

    private ToggleButton mGenericPermToggleButton;
    private ToggleButton mSpecialPermToggleButton;
    private Button mQuitAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        makeFullScreen();
        testPermissionsAndLaunchNextActivity();
        initViews();
    }

    @Override
    protected void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    private void makeFullScreen() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    private void initViews() {
        setContentView(R.layout.activity_permission_acquisition);
        editor = getSharedPreferences(MithrilApplication.getSharedPreferencesName(), Context.MODE_PRIVATE).edit();

        mGenericPermToggleButton = (ToggleButton) findViewById(R.id.genericPermToggleButton);
        mSpecialPermToggleButton = (ToggleButton) findViewById(R.id.specialPermToggleButton);
        mQuitAppButton = (Button) findViewById(R.id.quitAppButton);

        if (PermissionHelper.isAllRequiredPermissionsGranted(this))
            mGenericPermToggleButton.setChecked(true);
        if (!PermissionHelper.needsUsageStatsPermission(this))
            mSpecialPermToggleButton.setChecked(true);

        setOnClickListeners();
        setOnCheckedChangeListener();
    }

    private void setOnClickListeners() {
        mQuitAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PermissionHelper.quitMithril(v.getContext(), MithrilApplication.MITHRIL_BYE_BYE_MESSAGE);
            }
        });
    }

    private void setOnCheckedChangeListener() {
        mGenericPermToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!buttonView.isChecked())
                    buttonView.setChecked(true);
                else
                    buttonView.setChecked(false);
                if (!PermissionHelper.isAllRequiredPermissionsGranted(buttonView.getContext()))
                    requestAllNecessaryPermissions();
                else
                    PermissionHelper.toast(buttonView.getContext(), "We have the permissions already. Thank you!");
            }
        });
        mSpecialPermToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!buttonView.isChecked())
                    buttonView.setChecked(true);
                else
                    buttonView.setChecked(false);
                if (PermissionHelper.needsUsageStatsPermission(buttonView.getContext()))
                    startActivityForResult(new Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS), MithrilApplication.USAGE_STATS_PERMISSION_REQUEST_CODE);
                else
                    PermissionHelper.toast(buttonView.getContext(), "We have PACKAGE_USAGE_STATS permission already. Thank you!");
            }
        });
    }

    public void requestAllNecessaryPermissions() {
        List<String> permissionsThatCanBeRequested = PermissionHelper.getPermissionsThatCanBeRequested(this);
        String[] permissionStrings = new String[permissionsThatCanBeRequested.size()];
        int permIdx = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (String permission : permissionsThatCanBeRequested) {
            permissionStrings[permIdx++] = permission;
            stringBuffer.append(permission);
        }
        if (permissionStrings.length > 0)
            ActivityCompat.requestPermissions(this, permissionStrings, MithrilApplication.ALL_PERMISSIONS_MITHRIL_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case MithrilApplication.ALL_PERMISSIONS_MITHRIL_REQUEST_CODE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0) {
                    for (int i = 0; i < grantResults.length; i++) {
                        if (grantResults[i] == PackageManager.PERMISSION_DENIED) {
                            // permission denied, boo! Disable the
                            // functionality that depends on this permission.
                            resultCanceled();
                        } else {
                            resultOkay();
                            // permission was granted, yay! Do the
                            // contacts-related task you need to do.
                        }
                    }
                }
            }
            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    private void resultOkay() {
        editor.putBoolean(MithrilApplication.getPrefKeyUserDeniedPermissions(), false);
        editor.apply();
        if (isPermissionAcquisitionComplete())
            startNextActivity(this, CoreActivity.class);
    }

    private void resultCanceled() {
        editor.putBoolean(MithrilApplication.getPrefKeyUserDeniedPermissions(), true);
        editor.apply();
        PermissionHelper.quitMithril(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MithrilApplication.USAGE_STATS_PERMISSION_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                editor.putBoolean(MithrilApplication.getPrefKeyUserDeniedPermissions(), false);
                editor.apply();
                if (isPermissionAcquisitionComplete()) {
                    startNextActivity(this, CoreActivity.class);
                }
            } else {
                editor.putBoolean(MithrilApplication.getPrefKeyUserDeniedPermissions(), true);
                editor.apply();
            }
        }
    }

    private void testPermissionsAndLaunchNextActivity() {
        if (PermissionHelper.isAllRequiredPermissionsGranted(this) && !PermissionHelper.needsUsageStatsPermission(this))
            startNextActivity(this, LoadKBActivity.class);
    }

    private boolean isPermissionAcquisitionComplete() {
        return PermissionHelper.isAllRequiredPermissionsGranted(this) && !PermissionHelper.needsUsageStatsPermission(this);
    }

    @Override
    public void onBackPressed() {
        finish(); // quit app
    }

    private void startNextActivity(Context context, Class activityClass) {
        Intent launchNextActivity = new Intent(context, activityClass);
        launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        launchNextActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(launchNextActivity);
    }
}