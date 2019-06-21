package com.example.loginmvpbasic.ui.slpash;

import android.content.Context;
import android.os.Handler;

import com.example.loginmvpbasic.data.AppDataManager;
import com.example.loginmvpbasic.ui.base.BasePresenter;

import javax.inject.Inject;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    private static final long TIME = 2000;
    private Context mContext;

    @Inject
    public SplashPresenter(AppDataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (getDataManager().getLoggedInMode()) {
                    getMvpView().openHomeActivity();
                } else {
                    getMvpView().openWelcomeActivity();
                }
            }
        }, TIME);


    }


}
