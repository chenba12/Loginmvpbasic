package com.example.loginmvpbasic.ui.welcome;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.loginmvpbasic.R;
import com.example.loginmvpbasic.ui.base.BaseActivity;
import com.example.loginmvpbasic.ui.create_account.CreateAccountActivity;
import com.example.loginmvpbasic.ui.learn_more.LearnMoreActivity;
import com.example.loginmvpbasic.ui.login.LoginActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends BaseActivity implements WelcomeMvpView {

    private static final String TAG = "WelcomeActivity";

    @Inject
    WelcomePresenter<WelcomeActivity> mWelcomePresenter;

    @BindView(R.id.login_button)
    Button mLogin;

    @BindView(R.id.create_account_button)
    Button mCreateAccount;

    @BindView(R.id.learn_more_button)
    Button mLearnMore;

    @BindView(R.id.terms_of_use_textview)
    TextView mTermsOfUse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mWelcomePresenter.onAttach(this);

        setTitle(getResources().getString(R.string.welcome_title));


    }


    @Override
    public void openTermsOfUse() {
        Uri uri = Uri.parse("https://1mdtalent.com/term-of-use");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    public void openCreateAccount() {
        Intent intent = new Intent(WelcomeActivity.this, CreateAccountActivity.class);
        startActivity(intent);
    }

    @Override
    public void openLogin() {
        Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void openLearnMore() {
        Intent intent = new Intent(WelcomeActivity.this, LearnMoreActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.login_button)
    public void loginSubmit(View view) {
        mWelcomePresenter.loginClicked();
    }

    @OnClick(R.id.create_account_button)
    public void createAccountSubmit(View view) {
        mWelcomePresenter.createAccountClicked();
    }

    @OnClick(R.id.learn_more_button)
    public void learnMoreSubmit(View view) {
        mWelcomePresenter.learnMoreClicked();
    }

    @OnClick(R.id.terms_of_use_textview)
    public void termsOfUseSubmit(View view) {
        mWelcomePresenter.termsOfUseClicked();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mWelcomePresenter.onDetach();
    }
}
