package com.example.loginmvpbasic.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.loginmvpbasic.di.component.ActivityComponent;
import com.example.loginmvpbasic.di.component.DaggerActivityComponent;
import com.example.loginmvpbasic.di.module.ActivityModule;
import com.example.loginmvpbasic.ui.MvpApp;

import butterknife.Unbinder;

public class BaseActivity extends AppCompatActivity
        implements MvpView, BaseFragment.Callback {

    private Unbinder mUnBinder;
    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityComponent = DaggerActivityComponent.builder().
                activityModule(new ActivityModule(this)).
                applicationComponent(((MvpApp) getApplication()).getComponent())
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }


    public void setUnBinder(Unbinder unBinder) {
        mUnBinder = unBinder;
    }

    @Override
    protected void onDestroy() {

        if (mUnBinder != null) {
            mUnBinder.unbind();
        }
        super.onDestroy();
    }

    @Override
    public void onFragmentAttached() {

    }

    @Override
    public void onFragmentDetached(String tag) {

    }
}
