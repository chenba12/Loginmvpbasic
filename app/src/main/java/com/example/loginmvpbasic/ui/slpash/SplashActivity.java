package com.example.loginmvpbasic.ui.slpash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.loginmvpbasic.R;
import com.example.loginmvpbasic.ui.home.HomeActivity;
import com.example.loginmvpbasic.ui.welcome.WelcomeActivity;

public class SplashActivity extends AppCompatActivity implements SplashMvpView {

    private static final String TAG = "SplashActivity";

    private SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mSplashPresenter = new SplashPresenter(this);
        mSplashPresenter.onAttach(this);
        mSplashPresenter.decideNextActivity();


    }

    @Override
    public void openHomeActivity() {

        Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void openWelcomeActivity() {
        Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
        startActivity(intent);
        finish();
    }
}
