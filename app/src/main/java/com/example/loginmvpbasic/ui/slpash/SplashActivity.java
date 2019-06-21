package com.example.loginmvpbasic.ui.slpash;

import android.content.Intent;
import android.os.Bundle;

import com.example.loginmvpbasic.R;
import com.example.loginmvpbasic.ui.base.BaseActivity;
import com.example.loginmvpbasic.ui.home.HomeActivity;
import com.example.loginmvpbasic.ui.welcome.WelcomeActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    private static final String TAG = "SplashActivity";

    @Inject
    SplashPresenter<SplashActivity> mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mSplashPresenter.onAttach(this);

        setTitle(getResources().getString(R.string.md1_talent_title));

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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSplashPresenter.onDetach();
    }
}
