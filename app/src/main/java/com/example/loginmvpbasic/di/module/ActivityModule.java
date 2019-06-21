/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.example.loginmvpbasic.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.loginmvpbasic.di.ActivityContext;
import com.example.loginmvpbasic.di.PerActivity;
import com.example.loginmvpbasic.ui.home.HomeMvpPresenter;
import com.example.loginmvpbasic.ui.home.HomeMvpView;
import com.example.loginmvpbasic.ui.home.HomePresenter;
import com.example.loginmvpbasic.ui.learn_more.LearnMoreMvpPresenter;
import com.example.loginmvpbasic.ui.learn_more.LearnMoreMvpView;
import com.example.loginmvpbasic.ui.learn_more.LearnMorePresenter;
import com.example.loginmvpbasic.ui.login.LoginMvpPresenter;
import com.example.loginmvpbasic.ui.login.LoginMvpView;
import com.example.loginmvpbasic.ui.login.LoginPresenter;
import com.example.loginmvpbasic.ui.slpash.SplashMvpPresenter;
import com.example.loginmvpbasic.ui.slpash.SplashMvpView;
import com.example.loginmvpbasic.ui.slpash.SplashPresenter;
import com.example.loginmvpbasic.ui.welcome.WelcomeMvpPresenter;
import com.example.loginmvpbasic.ui.welcome.WelcomeMvpView;
import com.example.loginmvpbasic.ui.welcome.WelcomePresenter;

import dagger.Module;
import dagger.Provides;


@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }


    @Provides
    WelcomeMvpPresenter<WelcomeMvpView> provideWelcomePresenter(
            WelcomePresenter<WelcomeMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LearnMoreMvpPresenter<LearnMoreMvpView> provideLearnMorePresenter(
            LearnMorePresenter<LearnMoreMvpView> presenter) {
        return presenter;
    }

    @Provides
    HomeMvpPresenter<HomeMvpView> provideHomePresenter(
            HomePresenter<HomeMvpView> presenter) {
        return presenter;
    }


}
