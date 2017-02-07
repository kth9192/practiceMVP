package com.example.practicemvp;

/**
 * Created by kth919 on 2017-02-05.
 */

//프레젠터
public class PresenterImpl implements loginPresenter {

    private loginView mview;
    private loginModel mloginModel;

    public PresenterImpl(loginView mview){
        this.mview = mview;
        mloginModel = new loginModel();
    }

    @Override
    public String permission_check(String email, String password) {
        return null;
    }

    @Override
    public void login() {

    }
}
