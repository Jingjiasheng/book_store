package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Permission;
import com.asheng.book_store.domain.Role;
import com.asheng.book_store.domain.RolePermission;
import com.asheng.book_store.service.RolePermissionService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 角色权限关联表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:32
 */
@Api(tags = "角色与权限相关联操作API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("rolePermission")
public class RolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private RolePermissionService rolePermissionService;

    //

    /**
     * 查询所有角色和权限关联记录数量
     * @return 角色权限关联记录数量
     */
    @ApiOperation(value="查询所有角色和权限关联记录数量",notes="无需参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getRolePermissionCount")
    @ResponseBody
    public ResultMsg getRolePermissionCount( ) {
        return null;
    }



    /**
     * 获取角色与权限的对照表【不分页，查询使用】
     * @return 角色权限关联记录
     */
    @ApiOperation(value="获取角色与权限的对照表【不分页，查询使用】",notes="查询使用")
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getRolePermissionList")
    @ResponseBody
    public ResultMsg getRolePermissionList() {
        return null;
    }



    /**
     * 根据角色获取拥有的权限列表
     * @param roleId 角色ID
     * @return 权限信息列表
     */
    @ApiOperation(value="根据角色获取拥有的权限列表",notes=" 参数角色ID")
    @ApiImplicitParams({
            @ApiImplicitParam(name="roleId",value="角色ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getPermissionsByRoleId")
    @ResponseBody
    public ResultMsg getPermissionsByRoleId(Integer roleId) {
        return null;
    }



    /**
     * 根据权限获取拥有该权限的角色列表
     * @param permissionId 权限ID
     * @return 角色ID列表
     */
    @ApiOperation(value="根据权限获取拥有该权限的角色列表",notes="根据用户自己的ID进行查询！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="permissionId",value="权限ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getRolesByPermissionId")
    @ResponseBody
    public ResultMsg getRolesByPermissionId(Integer permissionId) {
        return null;
    }


    //根据角色ID批量添加权限

    /**
     * 根据角色ID批量添加权限
     * @param request 含有权限ID数组与角色ID的对象
     * @return 添加的权限的数量
     */
    @ApiOperation(value="根据角色ID批量添加权限",notes="数组类型采用request获取!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="request",value="含有权限ID数组与角色ID的对象",required=true,paramType="HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("addPermissionToRole")
    @ResponseBody
    public ResultMsg addPermissionToRole(HttpServletRequest request) {
        return null;
    }



    /**
     * 根据权限，批量赋予权限给角色
     * @param request 含有权限ID和角色ID数组的对象
     * @return 更新角色的数量
     */
    @ApiOperation(value="用户查询自己的个人信息",notes="根据用户自己的ID进行查询！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="request",value="含有权限ID和角色ID数组的对象",required=true,paramType="HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("addRolesToPermission")
    @ResponseBody
    public ResultMsg addRolesToPermission(HttpServletRequest request) {
        return null;
    }



    /**
     * 根据角色ID批量移除拥有的权限
     * @param request 包含移除权限ID的数组和角色ID
     * @return 移除的数量
     */
    @ApiOperation(value="用户查询自己的个人信息",notes="request传递数组")
    @ApiImplicitParams({
            @ApiImplicitParam(name="request",value="包含移除权限ID的数组和角色ID",required=true,paramType="HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("removePermissionsFromRole")
    @ResponseBody
    public ResultMsg removePermissionsFromRole(HttpServletRequest request) {
        return null;
    }



    /**
     * 根据权限批量移除拥有该权限的角色
     * @param request 含有角色ID数组与权限ID的对象
     * @return 删除权限的角色数量
     */
    @ApiOperation(value="根据权限批量移除拥有该权限的角色",notes=" request传递数组")
    @ApiImplicitParams({
            @ApiImplicitParam(name="request",value="含有角色ID数组与权限ID的对象",required=true,paramType="HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("removeRolesFromPermission")
    @ResponseBody
    public ResultMsg removeRolesFromPermission(HttpServletRequest request) {
        return null;
    }

}