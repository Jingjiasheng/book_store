package com.asheng.book_store.service;


import com.asheng.book_store.domain.Admin;
import com.asheng.book_store.domain.AdminRole;
import com.asheng.book_store.domain.Role;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (AdminRole)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:18
 */
public interface AdminRoleService {

    /**
     * 查询所有管理员角色关联记录总数
     * @return 记录总数
     */
    public Integer getAdminRoleCount( ) ;

    //

    /**
     * 根据管理员ID获取其拥有的所有的角色信息
     * @param adminId 管理员ID
     * @return role列表
     */
    public List<Role> getRolesByAdminId(Integer adminId) ;


    /**
     * 根据角色信息获取所有拥有该角色的管理员信息
     * @param roleId 角色ID
     * @return 管理员列表
     */
    public List<Admin> getAdminsByRoleId(Integer roleId) ;


    /**
     * 根据管理员ID批量添加角色
     * @param request 包含管理员ID与角色ID数组的对象
     * @return 添加的角色的数量
     */
    public Integer addRolesToAdminByAdminId(HttpServletRequest request) ;


    /**
     * 根据角色ID批量添加管理员拥有角色
     * @param request 包含管理员ID数组与角色ID的对象
     * @return 更新的管理员数量
     */
    public Integer addAdminsToRole(HttpServletRequest request);


    /**
     * 删除管理员拥有的角色信息【批量-角色ID为数组】
     * @param request 包含管理员ID与角色ID数组的对象
     * @return 移除的角色的数量
     */
    public Integer removeRolesFromAdmin(HttpServletRequest request) ;


    /**
     * 根据角色移除管理员拥有的角色【批量-管理员ID为数组】
     * @param request 包含管理员ID数组与角色ID的对象
     * @return 移除的管理员的数量
     */
    public Integer removeAdminsFromRole(HttpServletRequest request) ;


}