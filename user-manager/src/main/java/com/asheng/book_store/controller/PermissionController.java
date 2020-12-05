package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Permission;
import com.asheng.book_store.service.PermissionService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Permission)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:29
 */
@Api(tags = "权限操作相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("permission")
public class PermissionController {
    /**
     * 服务对象
     */
    @Resource
    private PermissionService permissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Permission selectOne(Integer id) {
        return this.permissionService.queryById(id);
    }

}