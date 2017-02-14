package com.example.practicemvp.Join;

/**
 * Created by kth919 on 2017-02-14.
 */

public class JoinPresenterImpl implements joinPresenter, joinInteractor.presenterUse {

    private joinView mjoinView;
    private JoinModel joinModel;

    public JoinPresenterImpl(joinView joinView){
        mjoinView = joinView;
        joinModel = new JoinModel(this);
    }

    @Override
    public void join(String email, String password, String nickName) {
        joinModel.checkData(email, password, nickName);
    }

    @Override
    public void join_flag(boolean flag) {
        if(flag){
            mjoinView.join_message();

        }else {
            mjoinView.join_error();
        }
    }

}
