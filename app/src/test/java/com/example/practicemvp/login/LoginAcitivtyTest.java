package com.example.practicemvp.login;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;

/**
 * Created by kth919 on 2017-02-13.
 */
public class LoginAcitivtyTest {

    private LoginAcitivty loginAcitivty;

    @Mock
    private loginView mloginView;

    private LoginPresenterImpl mLoginPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        loginAcitivty = new LoginAcitivty();
        mLoginPresenter = new LoginPresenterImpl(mloginView);
    }

    @Test
    public void loginTest() {
        mLoginPresenter.login("kth919" , "1234");
        mLoginPresenter.login_flag(true);
        loginAcitivty.login_Message();
    }

}