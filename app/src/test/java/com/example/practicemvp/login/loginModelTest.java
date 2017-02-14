package com.example.practicemvp.login;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

/**
 * Created by kth919 on 2017-02-13.
 */
public class loginModelTest{

    @Mock
    private loginView mloginView;

    @Mock
    private loginInteractor.CheckInteractor mCheckInteractor;

    @Mock
    private loginPresenter mloginPresenter;

    private LoginModel mloginModel;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        mloginModel = new LoginModel(mCheckInteractor);

    }

    @Test
    public void checkData() throws Exception {

//        HashMap<String, String> memberInfoMap = new HashMap<>();
//
//        for(int i = 0; i<memberInfoMap.size(); i++){
//
//            if (memberInfoMap.containsKey(email) &&  password == memberInfoMap.get(i))
//            {
//                login_thrower(true);
//            }else {
//                login_thrower(false);
//            }
//        }
//
        mloginModel.checkData("kth919" , "1234");
//
//
//    }
//
//    @Test
//    public void login_thrower() {
//        if (true) {
//            mCheckInteractor.login_flag(true);
//        } else {
//            mCheckInteractor.login_flag(false);
//        }
    }

}