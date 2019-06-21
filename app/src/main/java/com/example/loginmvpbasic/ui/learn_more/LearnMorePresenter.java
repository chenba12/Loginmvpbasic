package com.example.loginmvpbasic.ui.learn_more;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.loginmvpbasic.data.AppDataManager;
import com.example.loginmvpbasic.ui.base.BasePresenter;
import com.example.loginmvpbasic.ui.learn_more.Fragment.FragmentAdapter;

import javax.inject.Inject;

public class LearnMorePresenter<V extends LearnMoreMvpView> extends BasePresenter<V> implements LearnMoreMvpPresenter<V> {

    @Inject
    public LearnMorePresenter(AppDataManager dataManager) {
        super(dataManager);
    }


    @Override
    public void setAdapters(FragmentAdapter fragmentAdapter, ViewPager viewPager, TabLayout tabLayout) {
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
