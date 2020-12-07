package com.asheng.book_store.service;


import com.asheng.book_store.domain.Order;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:27
 */
public interface OrderService {



    /**
     * 根据订单信息查询订单总数【没有条件查询所有】
     * @param order 包含查询条件的订单信息
     * @return 符合条件的订单总数
     */
    public Integer getOrderCountByOrder(Order order);



    /**
     * 根据订单信息查询符合订单信息列表【注意分页】
     * @param order 包含查询条件的订单信息
     * @param offset 数据起始位置
     * @param pageSize 每一页的数据量
     * @return
     */
    public List<Order> getOrderListByOrder(Order order,Integer offset,Integer pageSize);


    /**
     * 根据订单Id查询订单信息
     * @param orderId 订单ID
     * @return 订单信息
     */
    public Order getOrderByOrderId(Integer orderId);


    /**
     * 根据订单时间范围查询订单列表
     * @param orderGenerationMinTime 时间区间起点
     * @param orderGenerationMaxTime 时间区间终点
     * @return 订单列表
     */
    public List<Order> getOrderListByOrderGenerationTime(String orderGenerationMinTime ,String orderGenerationMaxTime);


    /**
     * 新建订单信息
     * @param order 订单信息
     * @return 添加的记录数
     */
    public Order addOrder(Order order);


    /**
     * 修改订单相关信息
     * @param order 包含修改后订单的订单信息
     * @return 修改扥记录数
     */
    public Order updateOrderByOrderId(Order order);


    /**
     * 更改订单状态【注意：方法名和请求中含有两个Order，与订单状态表中的修改订单状态属性区分】
     * @param orderId 订单ID
     * @param orderStateId 订单状态ID
     * @return 更新的记录数
     */
    public Order updateOrderOrderStateByOrderId(Integer orderId,Integer orderStateId);


    /**
     * 强行结束订单
     * @param orderId 订单ID
     * @param orderRemarks 订单结束说明
     * @return 影响的记录数
     */
    public Order orderForcedEnd(Integer orderId ,String orderRemarks);

}