package com.example.practicemvp;

/**
 * Created by kth919 on 2017-02-05.
 */

//프레젠터
public class PresenterImpl implements loginPresenter  , loginInteractor.CheckInteractor{

    private loginView mview;
    private loginModel mloginModel;

    public PresenterImpl(loginView mview){
        this.mview = mview;
        mloginModel = new loginModel(this);
    }

    @Override
    public void login(String email, String password) {
        mloginModel.checkData(email, password);
    }

    @Override
    public void successLogin() {

    }

    @Override
    public void failedLogin() {

    }
}
