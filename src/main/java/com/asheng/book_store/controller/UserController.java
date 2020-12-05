package com.asheng.book_store.controller;

import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.UserService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)用户控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:33
 */
@Api(tags = "前台普通用户进行用户操作的相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param userId 主键
     * @return 单条数据
     */
    @ApiOperation(value="用户查询自己的个人信息",notes="根据用户自己的ID进行查询！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="用户的ID",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("selectOne")
    public User selectOne(Integer userId) {
        return this.userService.queryById(userId);
    }

}