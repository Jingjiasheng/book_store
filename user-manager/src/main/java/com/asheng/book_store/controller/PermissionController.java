package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Permission;
import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.PermissionService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 权限管理控制层
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
     * 查询所有权限数量
     * @return 权限数量
     */
    @ApiOperation(value="查询所有权限数量",notes=" 无需参数")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getPermissionCount")
    @ResponseBody
    public ResultMsg getPermissionCount( ) {
        return null;
    }



    /**
     * 查询所有的权限列表，不分页
     * @return 权限列表
     */
    @ApiOperation(value="查询所有的权限列表，不分页",notes="用于下拉框数据加载!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getPermissionList")
    @ResponseBody
    public ResultMsg getPermissionList() {
        return null;
    }


    /**
     * 查询所有的权限列表，分页
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return 权限列表
     */
    @ApiOperation(value="查询所有的权限列表，分页",notes="含分页参数!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="数据起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="每页的数据量大小",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getPermissionListByLimit")
    @ResponseBody
    public ResultMsg getPermissionListByLimit(Integer offset,Integer pageSize) {
        return null;
    }


    /**
     * 根据ID获取一个权限的详细信息
     * @param permissionId 权限ID
     * @return 权限信息
     */
    @ApiOperation(value="根据ID获取一个权限的详细信息",notes="需要权限ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="permissionId",value="权限ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getPermissionByPermissionId")
    @ResponseBody
    public ResultMsg getPermissionByPermissionId(Integer permissionId) {
        return null;
    }


    /**
     * 修改一个权限的信息
     * @param permission 修改后的权限信息
     * @return 修改后的权限信息
     */
    @ApiOperation(value="修改一个权限的信息",notes="必须携带属性值PermissionId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="permission",value="修改后的权限信息",required=true,paramType="Permission")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("updatePermissionByPermissionId")
    @ResponseBody
    public ResultMsg updatePermissionByPermissionId(Permission permission) {
        return null;
    }


    /**
     * 新添加一个权限的信息
     * @param permission 权限信息
     * @return 新增的权限信息
     */
    @ApiOperation(value="新添加一个权限的信息",notes="参数为权限信息对象!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="permission",value="权限信息",required=true,paramType="Permission")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("addPermission")
    @ResponseBody
    public ResultMsg addPermission(Permission permission) {
        return null;
    }


    /**
     * 删除一个权限的信息【可批量】
     * @param request 含有权限ID数组的对象
     * @return 删除的权限的数量
     */
    @ApiOperation(value="删除一个权限的信息【可批量】",notes="数组对象使用request,物理删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name="request",value="含有权限ID数组的对象",required=true,paramType="HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @DeleteMapping("deletePermissionByPermissionIds")
    @ResponseBody
    public ResultMsg deletePermissionByPermissionIds(HttpServletRequest request) {
        return null;
    }
}