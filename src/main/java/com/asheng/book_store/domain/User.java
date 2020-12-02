package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class User implements Serializable {
    private static final long serialVersionUID = -68057352592101898L;
    
    private Integer userId;
    
    private String userNickname;
    
    private String userLoginName;
    
    private String userTelephoneNumber;
    
    private String userLoginPassword;
    
    private String userLoginSalt;
    
    private String userName;
    
    private String userIdCardNumber;
    
    private String userAlipayAccount;
    
    private String userWechatPaymentAccount;
    
    private String userRegistrationTime;
    
    private Integer userCredit;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserTelephoneNumber() {
        return userTelephoneNumber;
    }

    public void setUserTelephoneNumber(String userTelephoneNumber) {
        this.userTelephoneNumber = userTelephoneNumber;
    }

    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword;
    }

    public String getUserLoginSalt() {
        return userLoginSalt;
    }

    public void setUserLoginSalt(String userLoginSalt) {
        this.userLoginSalt = userLoginSalt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIdCardNumber() {
        return userIdCardNumber;
    }

    public void setUserIdCardNumber(String userIdCardNumber) {
        this.userIdCardNumber = userIdCardNumber;
    }

    public String getUserAlipayAccount() {
        return userAlipayAccount;
    }

    public void setUserAlipayAccount(String userAlipayAccount) {
        this.userAlipayAccount = userAlipayAccount;
    }

    public String getUserWechatPaymentAccount() {
        return userWechatPaymentAccount;
    }

    public void setUserWechatPaymentAccount(String userWechatPaymentAccount) {
        this.userWechatPaymentAccount = userWechatPaymentAccount;
    }

    public String getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(String userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    public Integer getUserCredit() {
        return userCredit;
    }

    public void setUserCredit(Integer userCredit) {
        this.userCredit = userCredit;
    }

}