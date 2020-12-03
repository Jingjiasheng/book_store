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