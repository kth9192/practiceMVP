package com.example.practicemvp.Database;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kth919 on 2017-02-08.
 */

public class daoDAO implements DaoService {
    //포트포워딩 문제로 해쉬맵을 통한 가상 db.

    private String TAG = daoDAO.class.getName();
    private ArrayList<String> emailList = new ArrayList<>();
    private ArrayList<String> PWList = new ArrayList<>();
    private ArrayList<String> NickList = new ArrayList<>();


    //원래는 db에서 받아오면서 초기화
    public daoDAO() {
        emailList.add("kth919");
        PWList.add("1234");
        NickList.add("ㅋㅋㅋ");
    }

//    public class dataModel{
//        String email;
//        String passWord;
//
//        public dataModel(String email, String passWord) {
//
//            this.email = email;
//            this.passWord = passWord;
//        }
//
//        public void setEmail(String email){
//            this.email = email;
//        }
//
//        public String getEmail(){
//            return email;
//        }
//
//        public void setPassWord(String passWord){
//            this.passWord = passWord;
//        }
//
//        public String getPassWord(){
//            return email;
//        }
//
//    }

    @Override
    public HashMap<String, String> dataLoad() {

        HashMap<String, String> memberMap = new HashMap<>();
        for (int i=0; i<emailList.size(); i++) {
            memberMap.put(emailList.get(i), PWList.get(i));
            Log.d(TAG, "key" + i + emailList.get(i)+ " , " + PWList.get(i));
        }
        return memberMap;
    }

    @Override
    public void dataSave() {

    }


}