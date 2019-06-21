package com.example.loginmvpbasic.data;

public interface SharedPref {

    boolean getLoggedInMode();

    void setLoggedInMode(boolean loggedInMode);

    void saveEmail(String email);

    String getEmail();

    void savePassword(String password);

    String getPassword();

    void clear();
}
