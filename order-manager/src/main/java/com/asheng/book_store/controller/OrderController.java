package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Order;
import com.asheng.book_store.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:27
 */
@Api(tags = "订单相关操作API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Order selectOne(String id) {
        return this.orderService.queryById(id);
    }

}