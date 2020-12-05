package com.asheng.book_store.controller;

import com.asheng.book_store.domain.AdminOperation;
import com.asheng.book_store.service.AdminOperationService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (AdminOperation)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:13
 */
@Api(tags = "管理员操作相关API",value = "这个是values，并不知道有什么作用！")
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