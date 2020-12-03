package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:31:14
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -14794329980160903L;
    
    private Integer adminId;
    
    private String adminName;
    
    private String adminIdCardNumber;
    
    private String adminLoginName;
    
    private String adminLoginPassword;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminIdCardNumber() {
        return adminIdCardNumber;
    }

    public void setAdminIdCardNumber(String adminIdCardNumber) {
        this.adminIdCardNumber = adminIdCardNumber;
    }

    public String getAdminLoginName() {
        return adminLoginName;
    }

    public void setAdminLoginName(String adminLoginName) {
        this.adminLoginName = adminLoginName;
    }

    public String getAdminLoginPassword() {
        return adminLoginPassword;
    }

    public void setAdminLoginPassword(String adminLoginPassword) {
        this.adminLoginPassword = adminLoginPassword;
    }

}