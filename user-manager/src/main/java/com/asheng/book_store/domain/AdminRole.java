package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (AdminRole)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class AdminRole implements Serializable {
    private static final long serialVersionUID = -64727488136936486L;
    
    private Integer adminRoleId;
    
    private Integer adminId;
    
    private Integer roleId;


    public Integer getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(Integer adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}