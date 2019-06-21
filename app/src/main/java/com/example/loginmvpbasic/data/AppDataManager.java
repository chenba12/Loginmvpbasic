package com.example.loginmvpbasic.data;

import android.content.Context;

import com.example.loginmvpbasic.di.ApplicationContext;

import javax.inject.Inject;

public class AppDataManager implements DataManager {
    private final Context mContext;
    private final SharedPreferencesHelper mSharedPreferencesHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context, SharedPreferencesHelper sharedPreferencesHelper) {
        this.mContext = context;
        this.mSharedPreferencesHelper = sharedPreferencesHelper;
    }


    public boolean getLoggedInMode() {
        return mSharedPreferencesHelper.getLoggedInMode();
    }

    public void setLoggedInMode(boolean loggedInMode) {
        mSharedPreferencesHelper.setLoggedInMode(loggedInMode);
    }

    public void saveEmail(String email) {
        mSharedPreferencesHelper.saveEmail(email);
    }

    public String getEmail() {
        return mSharedPreferencesHelper.getEmail();
    }

    public void savePassword(String password) {
        mSharedPreferencesHelper.savePassword(password);
    }

    public String getPassword() {
        return mSharedPreferencesHelper.getPassword();
    }

    public void clear() {
        mSharedPreferencesHelper.clear();
    }
}