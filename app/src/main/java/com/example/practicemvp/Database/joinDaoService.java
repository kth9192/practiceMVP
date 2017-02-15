package com.example.practicemvp.Database;

import com.example.practicemvp.Join.JoinDTO;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kth919 on 2017-02-15.
 */

public interface joinDaoService {
    void joindataLoad();

    void joindataSave();

    interface joinModel{
        void Joinlogic(HashMap<String, JoinDTO> memberinfoMap);

        void join_thrower(boolean condition);

    }

}
