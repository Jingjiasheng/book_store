package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Admin;
import com.asheng.book_store.domain.AdminRole;
import com.asheng.book_store.domain.Role;
import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.AdminRoleService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户角色关联表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:18
 */
@Api(tags = "管理员与角色相关操作API", value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("adminRole")
public class AdminRoleController {
    /**
     * 服务对象
     */
    @Resource
    private AdminRoleService adminRoleService;


    /**
     * 查询所有管理员角色关联记录总数
     *
     * @return 记录总数
     */
    @ApiOperation(value = "查询所有管理员角色关联记录总数", notes = "无需参数!")
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminRoleCount")
    @ResponseBody
    public ResultMsg getAdminRoleCount() {
        return null;
    }

    //

    /**
     * 根据管理员ID获取其拥有的所有的角色信息
     *
     * @param adminId 管理员ID
     * @return role列表
     */
    @ApiOperation(value = "根据管理员ID获取其拥有的所有的角色信息", notes = "参数管理员ID")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员ID", required = true, paramType = "Integer")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getRolesByAdminId")
    @ResponseBody
    public ResultMsg getRolesByAdminId(Integer adminId) {
        return null;
    }


    /**
     * 根据角色信息获取所有拥有该角色的管理员信息
     *
     * @param roleId 角色ID
     * @return 管理员列表
     */
    @ApiOperation(value = "根据角色信息获取所有拥有该角色的管理员信息", notes = "参数为角色ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roleId", value = "角色ID", required = true, paramType = "Integer")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminsByRoleId")
    @ResponseBody
    public ResultMsg getAdminsByRoleId(Integer roleId) {
        return null;
    }


    /**
     * 根据管理员ID批量添加角色
     *
     * @param request 包含管理员ID与角色ID数组的对象
     * @return 添加的角色的数量
     */
    @ApiOperation(value = "根据管理员ID批量添加角色", notes = "涉及数组采用request方式传值!")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "request", value = "包含管理员ID与角色ID数组的对象", required = true, paramType = "HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @PostMapping("addRolesToAdminByAdminId")
    @ResponseBody
    public ResultMsg addRolesToAdminByAdminId(HttpServletRequest request) {
        return null;
    }


    /**
     * 根据角色ID批量添加管理员拥有角色
     *
     * @param request 包含管理员ID数组与角色ID的对象
     * @return 更新的管理员数量
     */
    @ApiOperation(value = "根据角色ID批量添加管理员拥有角色", notes = " 涉及数组采用request方式传值!")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "request", value = "包含管理员ID数组与角色ID的对象", required = true, paramType = "HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @PostMapping("addAdminsToRole")
    @ResponseBody
    public ResultMsg addAdminsToRole(HttpServletRequest request) {
        return null;
    }


    /**
     * 删除管理员拥有的角色信息【批量-角色ID为数组】
     *
     * @param request 包含管理员ID与角色ID数组的对象
     * @return 移除的角色的数量
     */
    @ApiOperation(value = "删除管理员拥有的角色信息【批量-角色ID为数组】", notes = " 涉及数组采用request方式传值!")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "request", value = "包含管理员ID与角色ID数组的对象", required = true, paramType = "HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @PutMapping("removeRolesFromAdmin")
    @ResponseBody
    public ResultMsg removeRolesFromAdmin(HttpServletRequest request) {
        return null;
    }


    /**
     * 根据角色移除管理员拥有的角色【批量-管理员ID为数组】
     *
     * @param request 包含管理员ID数组与角色ID的对象
     * @return 移除的管理员的数量
     */
    @ApiOperation(value = "用户查询自己的个人信息", notes = " 涉及数组采用request方式传值")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "request", value = "包含管理员ID数组与角色ID的对象", required = true, paramType = "HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @PutMapping("removeAdminsFromRole")
    @ResponseBody
    public ResultMsg removeAdminsFromRole(HttpServletRequest request) {
        return null;
    }

}