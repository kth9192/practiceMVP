package com.example.practicemvp.login;

import android.content.Context;

/**
 * Created by kth919 on 2017-02-07.
 */

//데이터 베이스 , 서버 등에서 데이터를 가저오고 데이터를 받은 후 프레젠터로 데이터를 넘겨주어
// ui를 갱신시킴
public interface loginInteractor {

    //로그인 체크
    void checkData(String email, String password);

    interface CheckInteractor{ // db등에서 데이터를 가져오는 getData와 따로 쓰기 위해 분리
     void login_flag(boolean flag);
    }

}
