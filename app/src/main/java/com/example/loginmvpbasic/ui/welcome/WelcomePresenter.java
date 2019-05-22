package com.example.loginmvpbasic.ui.welcome;

import android.content.Context;

import com.example.loginmvpbasic.ui.base.BasePresenter;

public class WelcomePresenter<V extends WelcomeMvpView> extends BasePresenter<V> implements WelcomeMvpPresenter<V> {

    private Context context;
    public WelcomePresenter(Context context) {
        super(context);
        this.context=context;
    }

    @Override
    public void decideNextActivity() {

    }
}
