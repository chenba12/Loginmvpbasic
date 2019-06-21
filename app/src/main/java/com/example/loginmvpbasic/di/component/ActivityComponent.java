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

package com.example.loginmvpbasic.di.component;

import com.example.loginmvpbasic.di.PerActivity;
import com.example.loginmvpbasic.di.module.ActivityModule;
import com.example.loginmvpbasic.ui.home.HomeActivity;
import com.example.loginmvpbasic.ui.learn_more.LearnMoreActivity;
import com.example.loginmvpbasic.ui.login.LoginActivity;
import com.example.loginmvpbasic.ui.slpash.SplashActivity;
import com.example.loginmvpbasic.ui.welcome.WelcomeActivity;

import dagger.Component;

/**
 * Created by janisharali on 27/01/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {


    void inject(LoginActivity loginActivity);

    void inject(SplashActivity splashActivity);

    void inject(HomeActivity homeActivity);

    void inject(LearnMoreActivity learnMoreActivity);

    void inject(WelcomeActivity welcomeActivity);


}
