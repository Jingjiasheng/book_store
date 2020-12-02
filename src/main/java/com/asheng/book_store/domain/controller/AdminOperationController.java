package com.asheng.book_store.domain.controller;

import com.asheng.book_store.domain.entity.AdminOperation;
import com.asheng.book_store.domain.service.AdminOperationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AdminOperation)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:34:37
 */
@RestController
@RequestMapping("adminOperation")
public class AdminOperationController {
    /**
     * 服务对象
     */
    @Resource
    private AdminOperationService adminOperationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdminOperation selectOne( id) {
        return this.adminOperationService.queryById(id);
    }

}