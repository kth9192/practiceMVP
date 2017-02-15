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
public class DatabaseDaoTest {

    @Mock
    private loginDaoService mdaoService;

    private Dao databaseDao;

    ArrayList<String> emailList = new ArrayList<>();
    ArrayList<String> PWList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        databaseDao = new Dao();

    }

    @Test
    public void dataLoadTest() throws Exception {
        HashMap<String, String> memberMap = databaseDao.logindataLoad();

        assertThat(memberMap.get("kth919"), is("1234"));
    }
}