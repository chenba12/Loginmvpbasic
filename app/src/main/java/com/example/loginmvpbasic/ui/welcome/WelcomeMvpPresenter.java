package com.example.loginmvpbasic.ui.welcome;

import com.example.loginmvpbasic.ui.base.MvpPresenter;
import com.example.loginmvpbasic.ui.slpash.SplashMvpView;

public interface WelcomeMvpPresenter<V extends WelcomeMvpView> extends MvpPresenter<V> {

    public void decideNextActivity();
}
