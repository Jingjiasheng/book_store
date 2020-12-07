package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.OrderStateDao;
import com.asheng.book_store.domain.OrderState;
import com.asheng.book_store.service.OrderStateService;
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


    @Override
    public Integer getOrderStateCount() {
        return null;
    }

    @Override
    public OrderState getOrderStateByOrderStateId(Integer orderStateId) {
        return null;
    }

    @Override
    public List<OrderState> getOrderStateList() {
        return null;
    }

    @Override
    public OrderState updateOrderStateByOrderStateId(OrderState orderState) {
        return null;
    }

    @Override
    public OrderState addOrderState(OrderState orderState) {
        return null;
    }

    @Override
    public Integer deleteOrderStateByOrderStateId(Integer orderStateId) {
        return null;
    }
}