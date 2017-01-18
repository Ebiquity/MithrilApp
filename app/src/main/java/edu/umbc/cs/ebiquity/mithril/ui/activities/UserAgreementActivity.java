package edu.umbc.cs.ebiquity.mithril.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import edu.umbc.cs.ebiquity.mithril.R;

public class UserAgreementActivity extends AppCompatActivity {
    private Button mShowUserAgreementBtn;
    private Button mIAgreeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_agreement);

        mShowUserAgreementBtn = (Button) findViewById(R.id.showUserAgreementBtn);
        mIAgreeBtn = (Button) findViewById(R.id.iAgreeBtn);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setOnclickListeners();
    }

    private void setOnclickListeners() {
        mShowUserAgreementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showUserAgreementIntent = new Intent(v.getContext(), ShowUserAgreementActivity.class);
                startActivity(showUserAgreementIntent);
            }
        });

        mIAgreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}