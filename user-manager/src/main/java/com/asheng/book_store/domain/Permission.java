package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 126064925293535162L;
    
    private Integer permissionId;
    
    private String permissionName;
    
    private String permissionUrl;


    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

}