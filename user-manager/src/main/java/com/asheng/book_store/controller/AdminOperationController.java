package com.asheng.book_store.controller;

import com.asheng.book_store.domain.AdminOperation;
import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.AdminOperationService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 管理员操作管理控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:13
 */
@Api(tags = "管理员操作记录相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("adminOperation")
public class AdminOperationController {
    /**
     * 服务对象
     */
    @Resource
    private AdminOperationService adminOperationService;


    /**
     * 查询所有管理员的操作记录总数
     * @return 管理员的总操作记录数
     */
    @ApiOperation(value="查询所有管理员的操作记录总数",notes="无必须参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminOperationCount")
    @ResponseBody
    public ResultMsg getAdminOperationCount() {
        return null;
    }



    /**
     * 查询所有管理员的操作记录，并按照时间倒叙排列【展示最新的操作记录】
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return 管理员操作信息列表
     */
    @ApiOperation(value="查询所有管理员的操作信息分页，",notes="并按照时间倒叙排列【展示最新的操作记录】!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="数据起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="每页的数据量大小",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminOperationListByLimit")
    @ResponseBody
    public ResultMsg getAdminOperationListByLimit(Integer offset, Integer pageSize) {

        return null;
    }


    /**
     * 按照管理员姓名，管理员ID，请求名称，操作等级进行查询操作记录
     * @param adminOperation 包含查询信息的操作信息
     * @return 操作记录列表
     */
    @ApiOperation(value="按照条件进行查询操作记录",notes="按照管理员姓名，管理员ID，请求名称，操作等级进行查询操作记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="adminOperation",value="包含查询信息的操作信息",required=true,paramType="AdminOperation")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminOperationListByOther")
    @ResponseBody
    public ResultMsg getAdminOperationListByOther(AdminOperation adminOperation) {
        return null;
    }


    /**
     * 添加管理员操作记录【由切面类完成，不显示调用controller方法】
     * @param adminOperation 管理员的操作信息
     * @return 管理员的操作信息
     */
    @ApiOperation(value="添加管理员操作记录",notes="由切面类完成，不显示调用controller方法")
    @ApiImplicitParams({
            @ApiImplicitParam(name="adminOperation",value="管理员的操作信息",required=true,paramType="AdminOperation")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("addAdminOperation")
    @ResponseBody
    public ResultMsg addAdminOperation(AdminOperation adminOperation) {
        return null;
    }

    //

    /**
     * 删除管理员操作记录【主要用于释放内存】
     * @param request  操作记录ID数组
     * @return 删除的记录数
     */
    @ApiOperation(value="删除管理员操作记录",notes="主要用于释放内存!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="request",value="获取数组的request对象",required=true,paramType="HttpServletRequest")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @DeleteMapping("deleteAdminOperation")
    @ResponseBody
    public ResultMsg deleteAdminOperation(HttpServletRequest request) {
        return null;
    }


    /**
     * 根据操作记录的ID查询一条操作记录的详细信息
     * @param adminOperationId 操作记录的ID
     * @return 操作记录详细信息
     */
    @ApiOperation(value="用户查询自己的个人信息",notes="根据用户自己的ID进行查询！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="adminOperationId",value="操作记录的ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminOperationByAdminOperationId")
    @ResponseBody
    public ResultMsg getAdminOperationByAdminOperationId(Integer adminOperationId) {
        return null;
    }




}