package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 732819131848890365L;
    
    private String orderId;
    
    private Integer orderBuyerId;
    
    private Integer orderSellerId;
    
    private Integer orderBookId;
    
    private String orderGenerationTime;
    
    private Double orderAmount;
    
    private Integer orderStateId;
    
    private Double orderProfitAmount;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderBuyerId() {
        return orderBuyerId;
    }

    public void setOrderBuyerId(Integer orderBuyerId) {
        this.orderBuyerId = orderBuyerId;
    }

    public Integer getOrderSellerId() {
        return orderSellerId;
    }

    public void setOrderSellerId(Integer orderSellerId) {
        this.orderSellerId = orderSellerId;
    }

    public Integer getOrderBookId() {
        return orderBookId;
    }

    public void setOrderBookId(Integer orderBookId) {
        this.orderBookId = orderBookId;
    }

    public String getOrderGenerationTime() {
        return orderGenerationTime;
    }

    public void setOrderGenerationTime(String orderGenerationTime) {
        this.orderGenerationTime = orderGenerationTime;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderStateId() {
        return orderStateId;
    }

    public void setOrderStateId(Integer orderStateId) {
        this.orderStateId = orderStateId;
    }

    public Double getOrderProfitAmount() {
        return orderProfitAmount;
    }

    public void setOrderProfitAmount(Double orderProfitAmount) {
        this.orderProfitAmount = orderProfitAmount;
    }

}