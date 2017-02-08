package com.example.practicemvp.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.practicemvp.Database.DBHelper;

/**
 * Created by kth919 on 2017-02-05.
 */

public class loginModel implements loginInteractor {

    private String TAG = loginModel.class.getName();

    private String memberEmail;
    private String memberPW;
    private loginInteractor.CheckInteractor mCheckInteractor;

    DBHelper dbHelper;
    private SQLiteDatabase db;

    public loginModel(loginInteractor.CheckInteractor checkInteractor){
        mCheckInteractor = checkInteractor;
    }

    public void setMemberEmail(String memberEmail){
        this.memberEmail = memberEmail;
    }

    public String getMemberEmail(){
        return memberEmail;
    }

    public void setmemberPW(String memberPW){
        this.memberPW = memberPW;
    }

    public String getmemberPW(){
        return memberPW;
    }

    public void DBagent(){

    }

    @Override
    public void checkData(String email, String password, Context context) {

        dbHelper  = new DBHelper(context);
        db = dbHelper.getWritableDatabase();

        Log.d(TAG, String.valueOf(context));

        if(email == memberEmail || password == memberPW ){
            mCheckInteractor.successLogin();
        }
        else {
            mCheckInteractor.failedLogin();
        }

    }
}
