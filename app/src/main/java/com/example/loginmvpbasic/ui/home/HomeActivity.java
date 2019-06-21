package com.example.loginmvpbasic.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.loginmvpbasic.R;
import com.example.loginmvpbasic.ui.base.BaseActivity;
import com.example.loginmvpbasic.ui.welcome.WelcomeActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements HomeMvpView {

    @Inject
    HomePresenter<HomeActivity> mHomePresenter;


    @BindView(R.id.welcome_user)
    TextView mWelcomeUserTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle(getResources().getString(R.string.home_page_title));

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mHomePresenter.onAttach(this);


        mHomePresenter.setEmail(mWelcomeUserTextView);


    }

    @Override
    public void openWelcomeActivity() {
        Intent intent = new Intent(HomeActivity.this, WelcomeActivity.class);
        startActivity(intent);
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sign_out:
                mHomePresenter.startLogout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
