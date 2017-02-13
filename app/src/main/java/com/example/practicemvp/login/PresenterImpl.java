package com.example.practicemvp.login;

/**
 * Created by kth919 on 2017-02-05.
 */

//프레젠터
public class PresenterImpl implements loginPresenter  , loginInteractor.CheckInteractor{

    private String TAG = PresenterImpl.class.getName();

    private loginView mview;
    private LoginModel mloginModel;

    public PresenterImpl(loginView mview){
        this.mview = mview;
        mloginModel = new LoginModel(this);
    }

    @Override
    public void login(String email, String password) {
        mloginModel.checkData(email, password);
//        Log.d(TAG, "로그인 모델 호출");
    }

    @Override
    public void login_flag(boolean flag) {
        if (flag){
            mview.login_Message();

        }else {
            mview.login_errorMessage();

        }
    }
}
