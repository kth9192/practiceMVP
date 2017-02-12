package com.example.practicemvp.Database;

import java.util.HashMap;

/**
 * Created by kth919 on 2017-02-11.
 */

public interface DaoService {

    HashMap<String, String> dataLoad();

    void dataSave();

}
