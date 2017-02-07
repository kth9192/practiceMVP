package com.example.practicemvp;

/**
 * Created by kth919 on 2017-02-06.
 */

public interface loginPresenter {

     String permission_check(String email, String password);

     void login();
}
