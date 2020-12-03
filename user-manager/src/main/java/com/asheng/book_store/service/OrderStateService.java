package com.asheng.book_store.service;


import com.asheng.book_store.domain.OrderState;

import java.util.List;

/**
 * (OrderState)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:28
 */
public interface OrderStateService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderStateId 主键
     * @return 实例对象
     */
    OrderState queryById(Integer orderStateId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderState> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderState 实例对象
     * @return 实例对象
     */
    OrderState insert(OrderState orderState);

    /**
     * 修改数据
     *
     * @param orderState 实例对象
     * @return 实例对象
     */
    OrderState update(OrderState orderState);

    /**
     * 通过主键删除数据
     *
     * @param orderStateId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer orderStateId);

}