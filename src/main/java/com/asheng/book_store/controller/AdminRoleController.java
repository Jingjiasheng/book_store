package com.asheng.book_store.controller;

import com.asheng.book_store.domain.AdminRole;
import com.asheng.book_store.service.AdminRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AdminRole)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:18
 */
@RestController
@RequestMapping("adminRole")
public class AdminRoleController {
    /**
     * 服务对象
     */
    @Resource
    private AdminRoleService adminRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdminRole selectOne(Integer id) {
        return this.adminRoleService.queryById(id);
    }

}