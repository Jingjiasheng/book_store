package com.asheng.book_store.domain.service;

import com.asheng.book_store.domain.entity.AdminOperation;
import java.util.List;

/**
 * (AdminOperation)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:34:36
 */
public interface AdminOperationService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    AdminOperation queryById( );

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdminOperation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adminOperation 实例对象
     * @return 实例对象
     */
    AdminOperation insert(AdminOperation adminOperation);

    /**
     * 修改数据
     *
     * @param adminOperation 实例对象
     * @return 实例对象
     */
    AdminOperation update(AdminOperation adminOperation);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}