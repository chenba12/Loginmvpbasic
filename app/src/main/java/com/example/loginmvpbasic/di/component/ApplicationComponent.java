package com.example.loginmvpbasic.di.component;


import android.app.Application;
import android.content.Context;

import com.example.loginmvpbasic.data.DataManager;
import com.example.loginmvpbasic.di.ApplicationContext;
import com.example.loginmvpbasic.di.module.ApplicationModule;
import com.example.loginmvpbasic.ui.MvpApp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
