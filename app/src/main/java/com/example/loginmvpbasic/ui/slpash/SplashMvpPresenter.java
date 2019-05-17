package com.example.loginmvpbasic.ui.slpash;

import com.example.loginmvpbasic.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();


}
