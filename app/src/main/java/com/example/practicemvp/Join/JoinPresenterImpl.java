package com.example.practicemvp.Join;

import android.util.Log;

import com.example.practicemvp.login.LoginModel;

/**
 * Created by kth919 on 2017-02-14.
 */

public class JoinPresenterImpl implements joinPresenter, joinInteractor.presenterUse {

    private String TAG = JoinPresenterImpl.class.getName();

    private joinView mjoinView;
    private JoinModel joinModel;

    public JoinPresenterImpl(joinView joinView){
        mjoinView = joinView;
        joinModel = new JoinModel(this);
    }

    @Override
    public void join(String email, String password, String nickName) {
        joinModel.checkDataToJoin(email, password, nickName);
        Log.d(TAG, "회원가입 실행");
    }

    @Override
    public void join_flag(boolean flag) {
        if(flag){
            mjoinView.join_message();
        }else {
            mjoinView.join_error();
        }
    }

}
