package com.example.loginmvpbasic.ui.learn_more.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private String[] tabTitles = new String[]{"About", "Login", "Videos"};

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutFragment();
            case 1:
                return new LoginFragment();
            case 2:
                return new VideoFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
