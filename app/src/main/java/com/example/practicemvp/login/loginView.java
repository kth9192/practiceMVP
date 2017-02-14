package com.example.practicemvp.login;

/**
 * Created by kth919 on 2017-02-07.
 */

public interface loginView {

    void initUI();

    void login_trigger(String email , String pw);

    void join_trigger();

    void login_Message();

    void login_errorMessage();

}
