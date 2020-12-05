package com.asheng.book_store.controller;

import com.asheng.book_store.domain.AdminRole;
import com.asheng.book_store.service.AdminRoleService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (AdminRole)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:18
 */
@Api(tags = "管理员与角色相关操作API",value = "这个是values，并不知道有什么作用！")
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