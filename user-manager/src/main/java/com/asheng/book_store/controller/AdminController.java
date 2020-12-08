package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Admin;
import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.AdminService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 管理员管理控制层
 *
 * @author makejava
 * @since 2020-12-02 14:34:35
 */
@Api(tags = "管理员信息管理相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;


    /**
     * 查询管理员总数
     * @return 管理员总数
     */
    @ApiOperation(value="查询管理员总数",notes="无需参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminCount")
    @ResponseBody
    public ResultMsg getAdminCount() {
        return null;
    }


    /**
     * 获取管理员列表分页
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return 管理员列表
     */
    @ApiOperation(value="获取管理员列表分页",notes="分页参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="数据起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="每页的数据量大小",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminListByLimit")
    public ResultMsg getAdminListByLimit(Integer offset,Integer pageSize) {
        return null;
    }


    /**
     * 根据管理员ID获取一个管理员的信息
     * @param adminId 管理员ID
     * @return 管理员详细信息
     */
    @ApiOperation(value="根据管理员ID获取一个管理员的信息",notes="需要管理员ID")
    @ApiImplicitParams({
            @ApiImplicitParam(name="adminId",value="管理员ID",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminByAdminId")
    public ResultMsg getAdminByAdminId(Integer adminId) {
        return null;
    }


    //

    /**
     * 添加管理员信息
     * @param admin 管理员信息
     * @return 新添加的管理员信息
     */
    @ApiOperation(value="添加管理员信息",notes="管理员信息!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="admin",value="管理员信息",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("addAdmin")
    public ResultMsg addAdmin(Admin admin) {
        return null;
    }


    /**
     * 根据管理员ID修改管理员信息
     * @param admin 管理员ID
     * @return 修改后的管理员信息
     */
    @ApiOperation(value="根据管理员ID修改管理员信息",notes="必须含有参数adminId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="admin",value="修改后的信息",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("updateAdminByAdminId")
    public ResultMsg updateAdminByAdminId(Admin admin) {
        return null;
    }

    //

    /**
     * 禁用账号/启用账号
     * @param adminId 管理员ID
     * @return 修改后的管理员的信息
     */
    @ApiOperation(value="禁用账号/启用账号",notes="不执行管理员的信息物理删除，只对其账号状态进行管理!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="adminId",value="管理员ID",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("updateAdminAccountStateByAdminId")
    public ResultMsg updateAdminAccountStateByAdminId(Integer adminId) {
        return null;
    }

}