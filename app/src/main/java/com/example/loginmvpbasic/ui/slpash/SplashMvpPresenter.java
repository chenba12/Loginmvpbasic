package com.example.loginmvpbasic.ui.slpash;

import com.example.loginmvpbasic.di.PerActivity;
import com.example.loginmvpbasic.ui.base.MvpPresenter;

@PerActivity
public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();


}