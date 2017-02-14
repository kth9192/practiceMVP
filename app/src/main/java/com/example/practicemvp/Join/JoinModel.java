package com.example.practicemvp.Join;

/**
 * Created by kth919 on 2017-02-14.
 */

public class JoinModel implements joinInteractor {

    private joinInteractor.presenterUse mpresenterUse;

    public JoinModel(joinInteractor.presenterUse presenterUse){
        mpresenterUse = presenterUse;
    }

    @Override
    public void checkData(String email, String password, String nickName) {

    }

}
