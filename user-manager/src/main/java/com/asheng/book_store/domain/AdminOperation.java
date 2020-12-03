package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (AdminOperation)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:33
 */
public class AdminOperation implements Serializable {
    private static final long serialVersionUID = 213447957321341879L;
    
    private Integer adminId;
    
    private String adminOperationTime;
    
    private String adminOperationUrl;
    
    private String adminOperationResultCode;
    
    private Integer adminOperationGradeId;
    
    private String adminOperationIp;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminOperationTime() {
        return adminOperationTime;
    }

    public void setAdminOperationTime(String adminOperationTime) {
        this.adminOperationTime = adminOperationTime;
    }

    public String getAdminOperationUrl() {
        return adminOperationUrl;
    }

    public void setAdminOperationUrl(String adminOperationUrl) {
        this.adminOperationUrl = adminOperationUrl;
    }

    public String getAdminOperationResultCode() {
        return adminOperationResultCode;
    }

    public void setAdminOperationResultCode(String adminOperationResultCode) {
        this.adminOperationResultCode = adminOperationResultCode;
    }

    public Integer getAdminOperationGradeId() {
        return adminOperationGradeId;
    }

    public void setAdminOperationGradeId(Integer adminOperationGradeId) {
        this.adminOperationGradeId = adminOperationGradeId;
    }

    public String getAdminOperationIp() {
        return adminOperationIp;
    }

    public void setAdminOperationIp(String adminOperationIp) {
        this.adminOperationIp = adminOperationIp;
    }

}