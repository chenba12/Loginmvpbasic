package com.example.loginmvpbasic.data;

import android.content.SharedPreferences;

public class DataManager {

    SharedPreferencesHelper mSharedPreferencesHelper;


    public DataManager(SharedPreferencesHelper mSharedPreferencesHelper) {
        this.mSharedPreferencesHelper = mSharedPreferencesHelper;
    }

    public void clear() {
        mSharedPreferencesHelper.clear();
    }
}
