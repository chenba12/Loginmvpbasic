package com.example.loginmvpbasic.ui.slpash;

import android.content.Context;
import android.os.Handler;

import com.example.loginmvpbasic.data.DataManager;
import com.example.loginmvpbasic.ui.base.BasePresenter;
import com.example.loginmvpbasic.ui.base.MvpView;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    private Context context;
    private static final long TIME = 2000;
    public SplashPresenter(Context context) {
        super(context);
        this.context=context;
    }

    @Override
    public void decideNextActivity() {
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (DataManager.getInstance(context).getLoggedInMode()) {
                    getMvpView().openHomeActivity();
                } else {
                    getMvpView().openWelcomeActivity();
                }
            }
        }, TIME);


    }


}
