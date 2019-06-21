package com.example.loginmvpbasic.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.loginmvpbasic.di.ApplicationContext;

import javax.inject.Inject;

public class SharedPreferencesHelper implements SharedPref {


    private static final String MY_PREFS = "MY_PREFS";
    private static final String IS_LOGGED_IN = "IS_LOGGED_IN";
    private static final String EMAIL = "EMAIL";
    private static final String PASSWORD = "PASSWORD";

    private SharedPreferences mSharedPreferences;

    @Inject
    public SharedPreferencesHelper(@ApplicationContext Context context) {
        mSharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean(IS_LOGGED_IN, false);
    }

    public void setLoggedInMode(boolean loggedInMode) {
        mSharedPreferences.edit().putBoolean(IS_LOGGED_IN, loggedInMode).apply();
    }

    public void saveEmail(String email) {
        mSharedPreferences.edit().putString(EMAIL, email).apply();
    }

    public String getEmail() {
        return mSharedPreferences.getString(EMAIL, null);
    }

    public void savePassword(String password) {
        mSharedPreferences.edit().putString(PASSWORD, password).apply();
    }

    @Override
    public String getPassword() {
        return mSharedPreferences.getString(PASSWORD, null);
    }


    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }
}
