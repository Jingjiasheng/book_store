package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.OrderDao;
import com.asheng.book_store.domain.Order;
import com.asheng.book_store.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:27
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;


    @Override
    public Integer getOrderCountByOrder(Order order) {
        return null;
    }

    @Override
    public List<Order> getOrderListByOrder(Order order, Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public Order getOrderByOrderId(Integer orderId) {
        return null;
    }

    @Override
    public List<Order> getOrderListByOrderGenerationTime(String orderGenerationMinTime, String orderGenerationMaxTime) {
        return null;
    }

    @Override
    public Order addOrder(Order order) {
        return null;
    }

    @Override
    public Order updateOrderByOrderId(Order order) {
        return null;
    }

    @Override
    public Order updateOrderOrderStateByOrderId(Integer orderId, Integer orderStateId) {
        return null;
    }

    @Override
    public Order orderForcedEnd(Integer orderId, String orderRemarks) {
        return null;
    }
}