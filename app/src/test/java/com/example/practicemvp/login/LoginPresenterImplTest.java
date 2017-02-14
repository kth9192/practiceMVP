package com.example.practicemvp.login;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Created by kth919 on 2017-02-13.
 */
public class LoginPresenterImplTest {
    @Mock
    private loginPresenter mloginPresenter;

    @Mock
    private loginInteractor.CheckInteractor mCheckInteractor;

    @Mock
    private loginView mloginView;

    private LoginPresenterImpl loginPresenterImpl;

    private LoginModel mloginModel;

    @Before
    public void setUp() throws Exception {

       MockitoAnnotations.initMocks(this);
       loginPresenterImpl = new LoginPresenterImpl(mloginView);
        mloginModel = new LoginModel(mCheckInteractor);

    }

    @Test
    public void login() throws Exception {
        mloginModel.checkData("kth919" , "1234");

    }

    @Test
    public void login_flag() throws Exception {
        if (true){
            mloginView.login_Message();

        }else {
            mloginView.login_errorMessage();

        }
    }

}