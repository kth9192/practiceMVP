package com.example.practicemvp.login;

import android.os.Build;
import android.util.Log;

import com.example.practicemvp.Database.Dao;
import com.example.practicemvp.Database.loginDaoService;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by kth919 on 2017-02-05.
 */

public class LoginModel implements loginInteractor, loginDaoService.loginModel {

    private String TAG = LoginModel.class.getName();

    private loginInteractor.CheckInteractor mCheckInteractor;
    private boolean flag = false;
    private String email;
    private String password;

    Dao memberDAO;

    public LoginModel(loginInteractor.CheckInteractor checkInteractor){
        mCheckInteractor = checkInteractor;
        memberDAO = new Dao(this);

    }



    @Override
    public void checkData(String email, String password) {

        this.email = email;
        this.password = password;

        memberDAO.logindataLoad();

    }

    @Override
    public void checkDatalogic(HashMap<String, String> memberInfoMapDB) {
        HashMap<String, String> memberInfoMap = new HashMap<>();
        memberInfoMap.putAll(memberInfoMapDB);

        Log.d(TAG, memberInfoMap.containsKey("kth919") + ", " + memberInfoMap.get("kth919"));

        for(int i = 0; i<memberInfoMap.size(); i++){

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                if (memberInfoMap.containsKey(email) && Objects.equals(password, memberInfoMap.get(email)))
                {
                    Log.d(TAG, email + "번에 있음");
                    flag = true;
                    break;
                } else {
                    Log.d(TAG, email + "번에 없음");
                }
            }
        }
        login_thrower(flag);
    }

    public void login_thrower(boolean flag) {
        if (flag) {
            mCheckInteractor.login_flag(true);
        } else {
            mCheckInteractor.login_flag(false);
        }
    }
}
