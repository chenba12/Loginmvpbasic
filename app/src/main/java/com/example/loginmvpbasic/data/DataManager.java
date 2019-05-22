package com.example.loginmvpbasic.data;
import android.content.Context;
public class DataManager {
    private static  DataManager instance;

    private SharedPreferencesHelper mSharedPreferencesHelper;


    private DataManager(Context context) {
        mSharedPreferencesHelper= new SharedPreferencesHelper(context);
    }

    public  static synchronized DataManager getInstance(Context context){
        if (instance==null) {
            instance = new DataManager(context);
        }
        return instance;
    }
    public boolean getLoggedInMode() {
        return mSharedPreferencesHelper.getLoggedInMode();
    }

    public void setLoggedInMode(boolean loggedInMode) {
        mSharedPreferencesHelper.setLoggedInMode(loggedInMode);
    }




}