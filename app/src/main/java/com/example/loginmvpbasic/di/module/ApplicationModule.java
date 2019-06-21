package com.example.loginmvpbasic.di.module;

import android.app.Application;
import android.content.Context;

import com.example.loginmvpbasic.data.AppDataManager;
import com.example.loginmvpbasic.data.DataManager;
import com.example.loginmvpbasic.data.SharedPref;
import com.example.loginmvpbasic.data.SharedPreferencesHelper;
import com.example.loginmvpbasic.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @ApplicationContext
    public Context provideContext() {
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    SharedPref providePreferencesHelper(SharedPreferencesHelper sharedPreferencesHelper) {
        return sharedPreferencesHelper;
    }
}
