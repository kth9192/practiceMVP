package com.example.practicemvp.Join;

import android.os.Build;
import android.util.Log;

import com.example.practicemvp.Database.Dao;
import com.example.practicemvp.Database.joinDaoService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by kth919 on 2017-02-14.
 */

public class JoinModel implements joinInteractor, joinDaoService.joinModel {

    private String TAG = JoinModel.class.getName();

    private joinInteractor.presenterUse mpresenterUse;
    private Dao dao;
    private String email;
    private String password;
    private String nickName;

    public JoinModel(joinInteractor.presenterUse presenterUse){

        mpresenterUse = presenterUse;
        dao = new Dao(this);
    }

    @Override
    public void checkDataToJoin(String email, String password, String nickName) {

        this.email = email;
        this.password = password;
        this.nickName = nickName;

        dao.joindataLoad();

        Log.d(TAG, "회원가입 db 접속");
        Log.d(TAG, "전달 변수값검사" + email + "," + password
                + "," + nickName);
    }

    @Override
    public void Joinlogic(HashMap<String, JoinDTO> memberList) {
        //회원가입 중복검사 후 db에 변수 save
        Log.d(TAG, "회원가입 중복검사");

        JoinDTO joinDTO = new JoinDTO(email, password, nickName);
        Log.d(TAG, "joinDTO 변수값검사" + email + "," + password
                + "," + nickName);
        Log.d(TAG, "memberList 검사" + memberList.get(email).email +"," + memberList.get(email).nickName);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if(Objects.equals(memberList.get(email).email, email) && Objects.equals(memberList.get(email).password, password)
                    && Objects.equals(memberList.get(email).nickName, nickName)) {
                dao.joindataSave();
            }else {
                join_thrower(false);
            }
        }
    }

    public void join_thrower(boolean flag) {
        if (flag) {
            mpresenterUse.join_flag(true);
            Log.d(TAG, "회원가입 성공");
        } else {
            mpresenterUse.join_flag(false);
            Log.d(TAG, "중복으로 인한 회원가입 실패");
        }
    }


}
