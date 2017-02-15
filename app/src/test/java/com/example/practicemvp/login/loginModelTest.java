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

        mloginModel.checkData("kth919" , "1234");

    }

}