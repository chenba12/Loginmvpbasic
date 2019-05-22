package com.example.loginmvpbasic.ui.base;

import android.content.Context;

import com.example.loginmvpbasic.data.DataManager;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private Context context;
    DataManager mDataManager;
    private V mMvpView;


    public BasePresenter(Context context) {
        this.context = context;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }


}
