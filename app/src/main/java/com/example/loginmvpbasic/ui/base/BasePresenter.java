package com.example.loginmvpbasic.ui.base;

import android.content.Context;

import com.example.loginmvpbasic.data.DataManager;

import javax.inject.Inject;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {


    private final DataManager mDataManager;
    private Context context;
    private V mMvpView;

    @Inject
    public BasePresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }


    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mMvpView = null;
    }

    public V getMvpView() {
        return mMvpView;
    }


}
