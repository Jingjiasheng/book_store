package com.asheng.book_store.service;

import com.asheng.book_store.domain.Role;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * (Role)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:30
 */
public interface RoleService {

    /**
     * 查询所有角色数量
     * @return 角色总数量
     */
    public Integer getRoleCount( ) ;



    /**
     * 获取角色列表【不分页,其他地方调用备用】
     * @return 角色列表
     */
    public List<Role> getRoleList( );

    /**
     *获取角色列表分页
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return 角色数据列表
     */
    public List<Role> getRoleListByLimit(Integer offset,Integer pageSize ) ;



    /**
     * 根据ID获取一个角色详细信息
     * @param roleId 角色ID
     * @return 角色信息
     */
    public Role getRoleByRoleId(Integer roleId) ;


    /**
     * 添加一个角色
     * @param role 角色信息
     * @return 添加的角色信息
     */
    public Role addRole(Role role) ;


    /**
     * 根据ID修改一个角色的信息
     * @param role 修改后的role
     * @return 修改后的role
     */
    public Role updateRoleByRoleId(Role role);


    /**
     * 删除一个角色的信息
     * @param roleId 角色ID
     * @return 删除的角色数量
     */
    public Integer deleteRoleByRoleId(Integer roleId) ;

}