package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (OrderState)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class OrderState implements Serializable {
    private static final long serialVersionUID = 647471477067491263L;
    //发布中
    private static final long ORDER_PUBLISHING = 647471477067491263L;
    //被下单
    private static final long ORDER_PLACE = 647471477067491263L;
    //支付中
    private static final long ORDER_PAYING = 647471477067491263L;
    //支付失败
    private static final long ORDER_PAY_FAIL = 647471477067491263L;
    //支付成功
    private static final long OEDER_PAY_SUCCESS = 647471477067491263L;
    //已发货
    private static final long ORDER_GOODS_DELIVERED = 647471477067491263L;
    //货物异常
    private static final long ORDER_GOODS_ABNORMAL = 647471477067491263L;
    //已收货
    private static final long ORDER_GOOD_RECEIVIED = 647471477067491263L;
    //订单正常结束
    private static final long ORDER_END_NORMAL = 647471477067491263L;
    //订单异常结束
    private static final long ORDER_END_ABNORMAL = 647471477067491263L;

    private Integer orderStateId;
    
    private String orderStateExplain;


    public Integer getOrderStateId() {
        return orderStateId;
    }

    public void setOrderStateId(Integer orderStateId) {
        this.orderStateId = orderStateId;
    }

    public String getOrderStateExplain() {
        return orderStateExplain;
    }

    public void setOrderStateExplain(String orderStateExplain) {
        this.orderStateExplain = orderStateExplain;
    }

}