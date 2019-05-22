package com.example.loginmvpbasic.ui.welcome;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.loginmvpbasic.R;

public class WelcomeActivity extends AppCompatActivity implements WelcomeMvpView {

    private static final String TAG = "WelcomeActivity";

    private WelcomePresenter mWelcomePresenter;

    private TextView termsOfUse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        termsOfUse=(TextView) findViewById(R.id.terms_of_use_textview);


        mWelcomePresenter = new WelcomePresenter(this);
        mWelcomePresenter.onAttach(this);
        mWelcomePresenter.decideNextActivity();

        termsOfUse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWelcomePresenter.o
            }
        });

    }


    @Override
    public void openTermsOfUse() {

    }

    @Override
    public void openCreateAccount() {

    }

    @Override
    public void openLogin() {

    }

    @Override
    public void openLearnMore() {
        Uri uri = Uri.parse("https://1mdtalent.com/term-of-use");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
