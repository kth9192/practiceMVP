package com.example.practicemvp.login;

import com.example.practicemvp.Database.DaoDao;
import com.example.practicemvp.Database.daoService;

import java.util.HashMap;

/**
 * Created by kth919 on 2017-02-05.
 */

public class LoginModel implements loginInteractor  {

    private String TAG = LoginModel.class.getName();

    private loginInteractor.CheckInteractor mCheckInteractor;

    DaoDao memberDAO;

    public LoginModel(loginInteractor.CheckInteractor checkInteractor){
        mCheckInteractor = checkInteractor;
    }

    @Override
    public void checkData(String email, String password) {

        HashMap<String, String> memberSourceMap = new HashMap<>();
        HashMap<String, String> memberInfoMap = new HashMap<>();

        memberDAO = new DaoDao();
        memberInfoMap = memberDAO.dataLoad();

            for(int i = 0; i<memberInfoMap.size(); i++){

            if (memberInfoMap.containsKey(email) &&  password == memberInfoMap.get(i))
            {
                login_thrower(true);
            }else {
                login_thrower(false);
            }
        }
    }

    public void login_thrower(boolean flag) {
        if (flag) {
            mCheckInteractor.login_flag(true);
        } else {
            mCheckInteractor.login_flag(false);
        }
    }

//    @Override
//    public HashMap<String, String> dataLoad() {
//        return null;
//    }
//
//    @Override
//    public void dataSave() {
//
//    }
}
