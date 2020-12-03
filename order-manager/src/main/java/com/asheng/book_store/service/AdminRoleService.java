package com.asheng.book_store.service;


import com.asheng.book_store.domain.AdminRole;

import java.util.List;

/**
 * (AdminRole)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:18
 */
public interface AdminRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param adminRoleId 主键
     * @return 实例对象
     */
    AdminRole queryById(Integer adminRoleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdminRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adminRole 实例对象
     * @return 实例对象
     */
    AdminRole insert(AdminRole adminRole);

    /**
     * 修改数据
     *
     * @param adminRole 实例对象
     * @return 实例对象
     */
    AdminRole update(AdminRole adminRole);

    /**
     * 通过主键删除数据
     *
     * @param adminRoleId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer adminRoleId);

}