package com.example.loginmvpbasic.ui.learn_more;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.loginmvpbasic.di.PerActivity;
import com.example.loginmvpbasic.ui.base.MvpPresenter;
import com.example.loginmvpbasic.ui.learn_more.Fragment.FragmentAdapter;

@PerActivity
public interface LearnMoreMvpPresenter<V extends LearnMoreMvpView> extends MvpPresenter<V> {


    void setAdapters(FragmentAdapter mFragmentAdapter, ViewPager mViewPager, TabLayout mTabLayout);
}
