package com.asheng.book_store.service;


import com.asheng.book_store.domain.OrderState;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * (OrderState)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:28
 */
public interface OrderStateService {

    /**
     * 查询订单状态总数
     * @return 订单总数
     */
    public Integer getOrderStateCount();



    /**
     * 根据Id查询一个订单状态信息
     * @param orderStateId 订单状态ID
     * @return 订单状态信息
     */
    public OrderState getOrderStateByOrderStateId(Integer orderStateId);


    //不分页查询所有订单状态信息

    /**
     * 不分页查询所有订单状态信息
     * @return 返回不分页的状态信息列表
     */
    public List<OrderState> getOrderStateList();


    /**
     * 根据订单Id修改订单状态信息
     * @param orderState 修改后的订单信息
     * @return 更新的订单数量
     */
    public OrderState updateOrderStateByOrderStateId(OrderState orderState);

    /**
     * 添加订单状态信息
     * @param orderState 订单状态信息
     * @return 添加的记录数
     */
    public OrderState addOrderState(OrderState orderState);


    /**
     * 删除订单状态信息
     * @param orderStateId 要删除的订单状态Id
     * @return 删掉的记录数
     */
    public Integer deleteOrderStateByOrderStateId(Integer orderStateId);
}