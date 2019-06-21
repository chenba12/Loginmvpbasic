package com.example.loginmvpbasic.ui.login;

import com.example.loginmvpbasic.data.AppDataManager;
import com.example.loginmvpbasic.ui.base.BasePresenter;

import javax.inject.Inject;

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {


    @Inject
    public LoginPresenter(AppDataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void validateData(String email, String password) {
        if (password != null && !email.isEmpty()) {
            startLogin(email, password);
        }
    }

    @Override
    public void startLogin(String email, String password) {
        getDataManager().saveEmail(email);
        getDataManager().savePassword(password);
        getDataManager().setLoggedInMode(true);
        getMvpView().openHomeActivity();
    }


}
