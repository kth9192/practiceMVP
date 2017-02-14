package com.example.practicemvp.Database;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by kth919 on 2017-02-13.
 */
public class DaoDaoTest {

    @Mock
    private daoService mdaoService;

    private DaoDao daoDao;

    ArrayList<String> emailList = new ArrayList<>();
    ArrayList<String> PWList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        daoDao = new DaoDao();

    }

    @Test
    public void dataLoadTest() throws Exception {
        HashMap<String, String> memberMap = daoDao.dataLoad();

        assertThat(memberMap.get("kth919"), is("1234"));
    }
}