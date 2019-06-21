package com.example.loginmvpbasic.ui.login;

import com.example.loginmvpbasic.di.PerActivity;
import com.example.loginmvpbasic.ui.base.MvpPresenter;

@PerActivity
public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void validateData(String email, String password);

    void startLogin(String email, String password);
}
