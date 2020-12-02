package com.asheng.book_store.domain.controller;

import com.asheng.book_store.domain.entity.OrderState;
import com.asheng.book_store.domain.service.OrderStateService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OrderState)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:28
 */
@RestController
@RequestMapping("orderState")
public class OrderStateController {
    /**
     * 服务对象
     */
    @Resource
    private OrderStateService orderStateService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrderState selectOne(Integer id) {
        return this.orderStateService.queryById(id);
    }

}