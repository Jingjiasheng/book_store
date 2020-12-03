package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -57001716870083490L;
    
    private Integer roleId;
    
    private String roleName;
    
    private String roleDetail;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDetail() {
        return roleDetail;
    }

    public void setRoleDetail(String roleDetail) {
        this.roleDetail = roleDetail;
    }

}