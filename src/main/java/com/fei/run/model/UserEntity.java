package com.fei.run.model;


import java.io.Serializable;

public class UserEntity implements Serializable {

    private Long userId;
    private String nickName;
    private String passWord;

    public UserEntity(String nickName, String passWord) {
        this.nickName = nickName;
        this.passWord = passWord;
        this.userId = System.currentTimeMillis();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
