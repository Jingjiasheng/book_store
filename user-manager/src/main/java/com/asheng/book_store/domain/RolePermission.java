package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (RolePermission)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class RolePermission implements Serializable {
    private static final long serialVersionUID = 730818062541184239L;
    
    private Integer rolePermissionId;
    
    private Integer roleId;
    
    private Integer permissionId;


    public Integer getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Integer rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

}