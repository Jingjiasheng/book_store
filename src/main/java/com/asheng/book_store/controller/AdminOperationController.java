package com.asheng.book_store.controller;

import com.asheng.book_store.domain.AdminOperation;
import com.asheng.book_store.service.AdminOperationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AdminOperation)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:13
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
    public AdminOperation selectOne(int id) {
        return this.adminOperationService.queryById(id);
    }

}