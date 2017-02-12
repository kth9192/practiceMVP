package com.example.practicemvp.login;

import android.content.Context;
import android.util.Log;

/**
 * Created by kth919 on 2017-02-05.
 */

//프레젠터
public class PresenterImpl implements loginPresenter  , loginInteractor.CheckInteractor{

    private String TAG = PresenterImpl.class.getName();

    private loginView mview;
    private loginModel mloginModel;

    public PresenterImpl(loginView mview){
        this.mview = mview;
        mloginModel = new loginModel(this);
    }

    @Override
    public void login(String email, String password, Context context) {
        mloginModel.checkData(email, password, context);
        Log.d(TAG, "로그인 모델 호출");
    }

    @Override
    public void successLogin() {
        mview.login_Message();
    }

    @Override
    public void failedLogin() {
        mview.login_errorMessage();
    }
}
