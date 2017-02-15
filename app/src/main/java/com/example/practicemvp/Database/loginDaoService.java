package com.example.practicemvp.Database;

import java.util.HashMap;
import java.util.List;

/**
 * Created by kth919 on 2017-02-11.
 */

public interface loginDaoService {

    void logindataLoad();

    interface loginModel{
        void checkDatalogic(HashMap<String, String> memberinfoMap);
    }

}
