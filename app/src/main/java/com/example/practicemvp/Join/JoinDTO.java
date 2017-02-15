package com.example.practicemvp.Join;

/**
 * Created by kth919 on 2017-02-15.
 */

public class JoinDTO {
    String email;
    String password;
    String nickName;

    public JoinDTO(String email, String password, String nickName ){
        this.email = email;
        this.password = password;
        this.nickName = nickName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setpassword(String password){
        this.password = password;
    }

    public String getpassword(){
        return password;
    }

    public void setnickName(String nickName){
        this.nickName = nickName;
    }

    public String getnickName(){
        return nickName;
    }


}
