package com.example.loginmvpbasic.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.loginmvpbasic.R;
import com.example.loginmvpbasic.ui.base.BaseActivity;
import com.example.loginmvpbasic.ui.home.HomeActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginActivity extends BaseActivity implements LoginMvpView {

    @Inject
    LoginPresenter<LoginActivity> mLoginPresenter;

    @BindView(R.id.edit_text_email)
    EditText mEmailEditText;

    @BindView(R.id.edit_text_password)
    EditText mPasswordEditText;

    @BindView(R.id.login_activity_login_button)
    Button mLoginButton;

    @OnClick(R.id.login_activity_login_button)
    public void loginSubmit(View view) {
        mLoginPresenter.validateData(mEmailEditText.getText().toString(), mPasswordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mLoginPresenter.onAttach(this);
    }

    @Override
    public void openHomeActivity() {

        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
