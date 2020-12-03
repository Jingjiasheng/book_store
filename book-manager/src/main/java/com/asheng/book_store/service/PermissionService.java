package com.asheng.book_store.service;


import com.asheng.book_store.domain.Permission;

import java.util.List;

/**
 * (Permission)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:29
 */
public interface PermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象
     */
    Permission queryById(Integer permissionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Permission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    Permission insert(Permission permission);

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    Permission update(Permission permission);

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer permissionId);

}