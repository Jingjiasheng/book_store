package com.asheng.book_store.service;


import com.asheng.book_store.domain.Permission;
import com.asheng.book_store.domain.Role;
import com.asheng.book_store.domain.RolePermission;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (RolePermission)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:31
 */
public interface RolePermissionService {

    /**
     * 查询所有角色和权限关联记录数量
     * @return 角色权限关联记录数量
     */
    public Integer getRolePermissionCount( );



    /**
     * 获取角色与权限的对照表【不分页，查询使用】
     * @return 角色权限关联记录
     */
    public List<RolePermission> getRolePermissionList();



    /**
     * 根据角色获取拥有的权限列表
     * @param roleId 角色ID
     * @return 权限信息列表
     */
    public List<Permission> getPermissionsByRoleId(Integer roleId);



    /**
     * 根据权限获取拥有该权限的角色列表
     * @param permissionId 权限ID
     * @return 角色ID列表
     */
    public List<Role> getRolesByPermissionId(Integer permissionId) ;


    //根据角色ID批量添加权限

    /**
     * 根据角色ID批量添加权限
     * @param request 含有权限ID数组与角色ID的对象
     * @return 添加的权限的数量
     */
    public Integer addPermissionToRole(HttpServletRequest request) ;



    /**
     * 根据权限，批量赋予权限给角色
     * @param request 含有权限ID和角色ID数组的对象
     * @return 更新角色的数量
     */
    public Integer addRolesToPermission(HttpServletRequest request);



    /**
     * 根据角色ID批量移除拥有的权限
     * @param request 包含移除权限ID的数组和角色ID
     * @return 移除的数量
     */
    public Integer removePermissionsFromRole(HttpServletRequest request) ;



    /**
     * 根据权限批量移除拥有该权限的角色
     * @param request 含有角色ID数组与权限ID的对象
     * @return 删除权限的角色数量
     */
    public Integer removeRolesFromPermission(HttpServletRequest request);

}