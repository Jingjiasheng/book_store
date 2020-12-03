package com.asheng.book_store.service;


import com.asheng.book_store.domain.RolePermission;

import java.util.List;

/**
 * (RolePermission)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:31
 */
public interface RolePermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param rolePermissionId 主键
     * @return 实例对象
     */
    RolePermission queryById(Integer rolePermissionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RolePermission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rolePermission 实例对象
     * @return 实例对象
     */
    RolePermission insert(RolePermission rolePermission);

    /**
     * 修改数据
     *
     * @param rolePermission 实例对象
     * @return 实例对象
     */
    RolePermission update(RolePermission rolePermission);

    /**
     * 通过主键删除数据
     *
     * @param rolePermissionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rolePermissionId);

}