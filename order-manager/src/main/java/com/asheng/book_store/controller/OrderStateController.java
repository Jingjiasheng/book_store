package com.asheng.book_store.controller;

import com.asheng.book_store.domain.OrderState;
import com.asheng.book_store.service.OrderStateService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (OrderState)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:28
 */
@Api(tags = "订单状态操作相关API",value = "这个是values，并不知道有什么作用！")
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