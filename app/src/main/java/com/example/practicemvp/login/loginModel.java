package com.example.practicemvp.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.practicemvp.Database.daoDAO;

import java.util.HashMap;

/**
 * Created by kth919 on 2017-02-05.
 */

public class loginModel implements loginInteractor {

    private String TAG = loginModel.class.getName();

    private String memberEmail;
    private String memberPW;
    private loginInteractor.CheckInteractor mCheckInteractor;
    private int login_flag = 0;

    daoDAO memberDAO;
    private SQLiteDatabase db;

    public loginModel(loginInteractor.CheckInteractor checkInteractor){
        mCheckInteractor = checkInteractor;
    }

    @Override
    public void checkData(String email, String password, Context context) {

        HashMap<String, String> memberSourceMap = new HashMap<>();
        HashMap<String, String> memberInfoMap = new HashMap<>();

        memberDAO = new daoDAO();
        memberInfoMap = memberDAO.dataLoad();


        Log.d(TAG, String.valueOf(context));

        for(int i = 0; i<memberInfoMap.size(); i++){
            if (memberInfoMap.containsKey(email) &&  password == memberInfoMap.get(i))
            {
                login_flag = 1;
            }
        }

        if (login_flag == 1)
        {
            mCheckInteractor.successLogin();
        }else {
            mCheckInteractor.failedLogin();
        }

    }
}
