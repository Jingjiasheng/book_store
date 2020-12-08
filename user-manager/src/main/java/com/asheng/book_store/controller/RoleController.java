package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Role;
import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.RoleService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色管理控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:30
 */
@Api(tags = "角色操作相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;


    /**
     * 查询所有角色数量
     * @return 角色总数量
     */
    @ApiOperation(value="查询所有角色数量",notes="没有参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getRoleCount")
    public ResultMsg getRoleCount( ) {
        return null;
    }



    /**
     * 获取角色列表【不分页,其他地方调用备用】
     * @return 角色列表
     */
    @ApiOperation(value="获取角色列表",notes="【不分页,其他地方调用备用】")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="用户的ID",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getRoleList")
    public ResultMsg getRoleList( ) {
        return null;
    }

    /**
     *获取角色列表分页
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return 角色数据列表
     */
    @ApiOperation(value="获取角色列表分页",notes="分页，用于列表展示")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="用户的ID",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getRoleListByLimit")
    public ResultMsg getRoleListByLimit(Integer offset,Integer pageSize ) {
        return null;
    }



    /**
     * 根据ID获取一个角色详细信息
     * @param roleId 角色ID
     * @return 角色信息
     */
    @ApiOperation(value="根据ID获取一个角色详细信息",notes="需要参数角色ID")
    @ApiImplicitParams({
            @ApiImplicitParam(name="roleId",value="角色ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getRoleByRoleId")
    public ResultMsg getRoleByRoleId(Integer roleId) {
        return null;
    }


    /**
     * 添加一个角色
     * @param role 角色信息
     * @return 添加的角色信息
     */
    @ApiOperation(value="添加一个角色",notes=" 参角色信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="role",value="角色信息",required=true,paramType="Role")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("addRole")
    public ResultMsg addRole(Role role) {
        return null;
    }


    /**
     * 根据ID修改一个角色的信息
     * @param role 修改后的role
     * @return 修改后的role
     */
    @ApiOperation(value="根据ID修改一个角色的信息",notes=" 必须包含权限ID属性")
    @ApiImplicitParams({
            @ApiImplicitParam(name="role",value="修改后的role",required=true,paramType="Role")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("updateRoleByRoleId")
    public ResultMsg updateRoleByRoleId(Role role) {
        return null;
    }


    /**
     * 删除一个角色的信息
     * @param roleId 角色ID
     * @return 删除的角色数量
     */
    @ApiOperation(value="删除一个角色的信息",notes="参数角色ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="roleId",value="角色ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("deleteRoleByRoleId")
    public ResultMsg deleteRoleByRoleId(Integer roleId) {
        return null;
    }

}