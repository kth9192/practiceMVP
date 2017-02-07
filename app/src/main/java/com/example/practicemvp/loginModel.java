package com.example.practicemvp;

/**
 * Created by kth919 on 2017-02-05.
 */

public class loginModel implements loginInteractor {

    private String memberEmail;
    private String memberPW;
    private loginInteractor.CheckInteractor mCheckInteractor;

    public loginModel(loginInteractor.CheckInteractor checkInteractor){
        mCheckInteractor = checkInteractor;
    }

    public void setMemberEmail(String memberEmail){
        this.memberEmail = memberEmail;
    }

    public String getMemberEmail(){
        return memberEmail;
    }

    public void setmemberPW(String memberPW){
        this.memberPW = memberPW;
    }

    public String getmemberPW(){
        return memberPW;
    }

    @Override
    public void checkData(String email, String password) {

        if(email == memberEmail || password == memberPW ){
            mCheckInteractor.successLogin();
        }
        else {
            mCheckInteractor.failedLogin();
        }

    }
}
