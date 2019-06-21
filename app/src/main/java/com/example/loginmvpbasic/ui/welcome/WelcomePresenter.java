package com.example.loginmvpbasic.ui.welcome;

import com.example.loginmvpbasic.data.AppDataManager;
import com.example.loginmvpbasic.ui.base.BasePresenter;

import javax.inject.Inject;

public class WelcomePresenter<V extends WelcomeMvpView> extends BasePresenter<V> implements WelcomeMvpPresenter<V> {

    @Inject
    public WelcomePresenter(AppDataManager dataManager) {
        super(dataManager);
    }


    @Override
    public void termsOfUseClicked() {
        getMvpView().openTermsOfUse();
    }

    @Override
    public void createAccountClicked() {
        getMvpView().openCreateAccount();
    }

    @Override
    public void learnMoreClicked() {
        getMvpView().openLearnMore();
    }

    @Override
    public void loginClicked() {
        getMvpView().openLogin();
    }
}
