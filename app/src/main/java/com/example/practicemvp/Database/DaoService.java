package com.example.practicemvp.Database;

import java.util.HashMap;

/**
 * Created by kth919 on 2017-02-11.
 */

public interface daoService {

    HashMap<String, String> dataLoad();

    void dataSave();

}
