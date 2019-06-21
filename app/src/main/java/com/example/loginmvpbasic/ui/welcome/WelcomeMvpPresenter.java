package com.example.loginmvpbasic.ui.welcome;

import com.example.loginmvpbasic.di.PerActivity;
import com.example.loginmvpbasic.ui.base.MvpPresenter;

@PerActivity
public interface WelcomeMvpPresenter<V extends WelcomeMvpView> extends MvpPresenter<V> {

    void termsOfUseClicked();

    void createAccountClicked();

    void learnMoreClicked();

    void loginClicked();
}
