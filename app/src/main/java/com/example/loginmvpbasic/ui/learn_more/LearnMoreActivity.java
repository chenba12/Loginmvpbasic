package com.example.loginmvpbasic.ui.learn_more;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.loginmvpbasic.R;
import com.example.loginmvpbasic.ui.base.BaseActivity;
import com.example.loginmvpbasic.ui.learn_more.Fragment.FragmentAdapter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LearnMoreActivity extends BaseActivity implements LearnMoreMvpView {

    @Inject
    LearnMorePresenter<LearnMoreActivity> mLearnMorePresenter;

    FragmentAdapter mFragmentAdapter;

    @BindView(R.id.viewpager)
    ViewPager mViewPager;

    @BindView(R.id.sliding_tabs)
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mLearnMorePresenter.onAttach(this);

        setTitle(getResources().getString(R.string.learn_more_title));
        mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        mLearnMorePresenter.setAdapters(mFragmentAdapter, mViewPager, mTabLayout);
    }
}
