package com.asheng.book_store.controller;

import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.UserService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.Digits;

/**
 * 用户管理控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:33
 */
@Api(tags = "普通用户信息的相关操作API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;



    /**
     * 获取用户总数
     * @return 用户数量
     */
    @ApiOperation(value="获取用户总数",notes="不需要参数")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getUserCount")
    @ResponseBody
    public ResultMsg getUserCount( ) {
        return null;
    }


    /**
     * 根据注册时间段获取注册的用户数量【时间起点-时间终点】【其他条件如年龄，性别】
     * @param startTime 时间起点
     * @param endTime 时间终点
     * @return 用户数量
     */
    @ApiOperation(value="用户查询自己的个人信息",notes="根据用户自己的ID进行查询！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="用户的ID",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getUserByUserRegistrationTime")
    @ResponseBody
    public ResultMsg getUserByUserRegistrationTime(String startTime, String endTime) {
        return null;
    }


    /**
     * 查询所有用户列表
     * @param offset 起始位置
     * @param pageSizes 每页的数据大小
     * @return 用户列表
     */
    @ApiOperation(value="查询所有用户列表",notes="含分页参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSizes",value="每页的数据大小",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getUserListByLimit")
    @ResponseBody
    public ResultMsg getUserListByLimit(Integer offset,Integer pageSizes) {
        return null;
    }


    /**
     * 按照条件查询用户列表
     * @param user 包含筛选条件的用户信息
     * @return 用户列表
     */
    @ApiOperation(value="用户查询自己的个人信息",notes="包含带条件的用户信息对象")
    @ApiImplicitParams({
            @ApiImplicitParam(name="user",value="包含筛选条件的用户信息",required=true,paramType="User")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getUserListByOther")
    @ResponseBody
    public ResultMsg getUserListByOther(User user) {
        return null;
    }


    /**
     * 根据用户ID获取用户的详细信息
     * @param userId 用户ID
     * @return 用户的详细信息
     */
    @ApiOperation(value="用户查询自己的个人信息",notes="根据用户自己的ID进行查询！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="用户的ID",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getUserByUserId")
    @ResponseBody
    public ResultMsg getUserByUserId(Integer userId) {
        return null;
    }


    /**
     * 新添加一个用户即
     * @param user 用户的注册信息
     * @return 用户信息
     */
    @ApiOperation(value="新添加一个用户即",notes="用户注册的逻辑实现!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="user",value="用户的注册信息",required=true,paramType="User")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("addUser")
    @ResponseBody
    public ResultMsg addUser(User user) {
        return null;
    }


    /**
     * 修改用户信息
     * @param user 用户ID
     * @return 修改后的用户信息
     */
    @ApiOperation(value="修改用户信息",notes="user对象中必须包含userId属性")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="用户的ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("updateUserByUserId")
    @ResponseBody
    public ResultMsg updateUserByUserId(User user) {
        return null;
    }


    /**
     * 更改用户的账户状态【禁用或启用】
     * @param userId 用户状态
     * @return 用户修改后的信息
     */
    @ApiOperation(value="更改用户的账户状态",notes="自动改变状态，无需传入状态ID")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="用户的ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("updateUserAccountStateByUserId")
    @ResponseBody
    public ResultMsg updateUserAccountStateByUserId(Integer userId) {
        return null;
    }
}