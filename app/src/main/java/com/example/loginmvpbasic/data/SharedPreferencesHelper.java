package com.example.loginmvpbasic.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesHelper {


    public static final String MY_PREFS = "MY_PREFS";
    private static final String IS_LOGGED_IN = "IS_LOGGED_IN";

    private SharedPreferences mSharedPreferences;

    public SharedPreferencesHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);

    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean(IS_LOGGED_IN,false);
    }

    public void setLoggedInMode(boolean loggedInMode) {
        mSharedPreferences.edit().putBoolean(IS_LOGGED_IN,loggedInMode).apply();
    }


}
