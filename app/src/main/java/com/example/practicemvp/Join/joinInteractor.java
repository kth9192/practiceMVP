package com.example.practicemvp.Join;

/**
 * Created by kth919 on 2017-02-14.
 */

public interface joinInteractor {

    void checkDataToJoin(String email, String password, String nickName);

    interface presenterUse{
        void join_flag(boolean flag);

    }

}
