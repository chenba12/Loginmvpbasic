package com.example.loginmvpbasic.ui.home;

import android.widget.TextView;

import com.example.loginmvpbasic.data.AppDataManager;
import com.example.loginmvpbasic.ui.base.BasePresenter;

import javax.inject.Inject;

public class HomePresenter<V extends HomeMvpView> extends BasePresenter<V> implements HomeMvpPresenter<V> {

    @Inject
    public HomePresenter(AppDataManager dataManager) {
        super(dataManager);
    }


    @Override
    public void startLogout() {
        getDataManager().clear();
        getMvpView().openWelcomeActivity();

    }


    public void setEmail(TextView view) {
        view.setText(getDataManager().getEmail());
    }
}
