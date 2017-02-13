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

    @Mock
    private loginView mloginView;

    private PresenterImpl mPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mPresenter = new PresenterImpl(mloginView);
    }

    @Test
    public void login_trigger() throws Exception {
        mPresenter.login("kth919", "1584");
    }

    @Test
    public void login_Message() throws Exception {

    }

    @Test
    public void login_errorMessage() throws Exception {

    }

}