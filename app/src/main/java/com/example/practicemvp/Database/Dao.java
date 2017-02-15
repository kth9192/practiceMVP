package com.example.practicemvp.Database;

import android.util.Log;

import com.example.practicemvp.Join.JoinDTO;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kth919 on 2017-02-08.
 */

public class Dao implements loginDaoService,joinDaoService {
    //포트포워딩 문제로 해쉬맵을 통한 가상 db.

    private String TAG = Dao.class.getName();
    private ArrayList<String> emailList = new ArrayList<>();
    private ArrayList<String> PWList = new ArrayList<>();
    private ArrayList<String> NickList = new ArrayList<>();

    private loginDaoService.loginModel mloginModel;
    private joinDaoService.joinModel mjoinModel;

    //원래는 db에서 받아오면서 초기화
    public Dao(loginDaoService.loginModel mloginModel) {
        this.mloginModel = mloginModel;
        emailList.add("kth919");
        PWList.add("1234");
        NickList.add("zzz");
    }

    public Dao(joinDaoService.joinModel mjoinModel){
        this.mjoinModel = mjoinModel;
        emailList.add("kth919");
        PWList.add("1234");
        NickList.add("zzz");
    }

    @Override
    public void logindataLoad() {

        HashMap<String, String> memberMap = new HashMap<>();
        for (int i=0; i<emailList.size(); i++) {
            memberMap.put(emailList.get(i), PWList.get(i));
            Log.d(TAG, emailList.get(i) + "," + PWList.get(i));
        }
        Log.d(TAG , memberMap.get("kth919"));

        mloginModel.checkDatalogic(memberMap);

    }

    @Override
    public void joindataLoad() {

        HashMap<String, JoinDTO>  memberList = new HashMap<>();
        for (int i =0; i<emailList.size(); i++){
            memberList.put(emailList.get(i) ,
                    new JoinDTO(emailList.get(i), PWList.get(i), NickList.get(i)));

        }

        mjoinModel.Joinlogic(memberList);
        Log.d(TAG, "db데이터 전송 - 회원가입");

    }

    @Override
    public void joindataSave() {
        //db에 정보 저장 후 회원가입 성공 메시지 전달
        Log.d(TAG, "회원가입 메시지 전달");
        mjoinModel.join_thrower(true);

    }
}
