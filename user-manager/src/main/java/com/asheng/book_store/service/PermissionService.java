package com.asheng.book_store.service;


import com.asheng.book_store.domain.Permission;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (Permission)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:29
 */
public interface PermissionService {

    /**
     * 查询所有权限数量
     * @return 权限数量
     */
    public Integer getPermissionCount( );



    /**
     * 查询所有的权限列表，不分页
     * @return 权限列表
     */
    public List<Permission> getPermissionList();


    /**
     * 查询所有的权限列表，分页
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return 权限列表
     */
    public List<Permission> getPermissionListByLimit(Integer offset,Integer pageSize) ;


    /**
     * 根据ID获取一个权限的详细信息
     * @param permissionId 权限ID
     * @return 权限信息
     */
    public Permission getPermissionByPermissionId(Integer permissionId) ;


    /**
     * 修改一个权限的信息
     * @param permission 修改后的权限信息
     * @return 修改后的权限信息
     */
    public Permission updatePermissionByPermissionId(Permission permission);


    /**
     * 新添加一个权限的信息
     * @param permission 权限信息
     * @return 新增的权限信息
     */
    public Permission addPermission(Permission permission);


    /**
     * 删除一个权限的信息【可批量】
     * @param request 含有权限ID数组的对象
     * @return 删除的权限的数量
     */
    public Integer deletePermissionByPermissionIds(HttpServletRequest request) ;

}