package com.example.loginmvpbasic.ui.home;

import com.example.loginmvpbasic.di.PerActivity;
import com.example.loginmvpbasic.ui.base.MvpPresenter;

@PerActivity
public interface HomeMvpPresenter<V extends HomeMvpView> extends MvpPresenter<V> {

    void startLogout();

}
