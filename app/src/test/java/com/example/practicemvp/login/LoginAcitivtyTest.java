package com.example.practicemvp.login;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Created by kth919 on 2017-02-13.
 */
public class LoginAcitivtyTest {

    @Mock
    private loginView mloginView;

    private LoginPresenterImpl mLoginPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mLoginPresenter = new LoginPresenterImpl(mloginView);
    }

    @Test
    public void login_trigger() throws Exception {
        mLoginPresenter.login("kth919", "1584");
    }

    @Test
    public void login_Message() throws Exception {

    }

    @Test
    public void login_errorMessage() throws Exception {

    }

}