package com.asheng.book_store.domain.service.impl;

import com.asheng.book_store.domain.entity.OrderState;
import com.asheng.book_store.domain.dao.OrderStateDao;
import com.asheng.book_store.domain.service.OrderStateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderState)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:28
 */
@Service("orderStateService")
public class OrderStateServiceImpl implements OrderStateService {
    @Resource
    private OrderStateDao orderStateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderStateId 主键
     * @return 实例对象
     */
    @Override
    public OrderState queryById(Integer orderStateId) {
        return this.orderStateDao.queryById(orderStateId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderState> queryAllByLimit(int offset, int limit) {
        return this.orderStateDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderState 实例对象
     * @return 实例对象
     */
    @Override
    public OrderState insert(OrderState orderState) {
        this.orderStateDao.insert(orderState);
        return orderState;
    }

    /**
     * 修改数据
     *
     * @param orderState 实例对象
     * @return 实例对象
     */
    @Override
    public OrderState update(OrderState orderState) {
        this.orderStateDao.update(orderState);
        return this.queryById(orderState.getOrderStateId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderStateId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer orderStateId) {
        return this.orderStateDao.deleteById(orderStateId) > 0;
    }
}