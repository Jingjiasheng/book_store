package com.asheng.book_store.controller;

import com.asheng.book_store.domain.AdminOperationGrade;
import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.AdminOperationGradeService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 管理员操作等级管理控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:17
 */
@Api(tags = "管理员操作等级相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("adminOperationGrade")
public class AdminOperationGradeController {
    /**
     * 服务对象
     */
    @Resource
    private AdminOperationGradeService adminOperationGradeService;


    /**
     * 查询所有管理员的操作等级数量
     * @return 所有管理员的操作等级数量
     */
    @ApiOperation(value="查询所有管理员的操作等级数量",notes="无需参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminOperationGradeCount")
    @ResponseBody
    public ResultMsg getAdminOperationGradeCount( ) {
        return null;
    }


    //

    /**
     * 获取操作等级列表不用分页【以备其他地方引用】
     * @return 操作等级列表
     */
    @ApiOperation(value="获取操作等级列表不用分页",notes="无需分页!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminOperationList")
    @ResponseBody
    public ResultMsg getAdminOperationList( ) {
        return null;
    }


    /**
     * 根据等级ID获取操作等级的详细信息
     * @param adminOperationGradeId 操作等级ID
     * @return 操作等级详细信息
     */
    @ApiOperation(value="根据等级ID获取操作等级的详细信息",notes="需要参数ID")
    @ApiImplicitParams({
            @ApiImplicitParam(name="adminOperationGradeId",value="操作等级ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("getAdminOperationGradeByAdminOperationGradeId")
    @ResponseBody
    public ResultMsg getAdminOperationGradeByAdminOperationGradeId(Integer adminOperationGradeId) {
        return null;
    }


    /**
     * 添加操作等级定义
     * @param adminOperationGrade 操作等级信息
     * @return 新增的操作等级信息
     */
    @ApiOperation(value="用户查询自己的个人信息",notes="有参数：操作等级信息!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="adminOperationGrade",value="操作等级信息",required=true,paramType="AdminOperationGrade")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("addAdminOperationGrade")
    @ResponseBody
    public ResultMsg addAdminOperationGrade(AdminOperationGrade adminOperationGrade) {
        return null;
    }


    /**
     * 修改操作等级的定义
     * @param adminOperationGrade 修改后的等级定义信息
     * @return 修改后的等级定义信息
     */
    @ApiOperation(value="修改操作等级的定义",notes="必须包含等级ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="adminOperationGrade",value="修改后的等级定义信息",required=true,paramType="AdminOperationGrade")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("updateAdminOperationGradeByAdminOperationGradeId")
    @ResponseBody
    public ResultMsg updateAdminOperationGradeByAdminOperationGradeId(AdminOperationGrade adminOperationGrade) {
        return null;
    }


    /**
     * 删除操作等级的定义
     * @param adminOperationGradeId 操作等级ID
     * @return 删除的数量
     */
    @ApiOperation(value="删除操作等级的定义",notes="物理删除，保证数据准确性!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId",value="用户的ID",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @DeleteMapping("deleteAdminOperationGradeByAdminOperationGradeId")
    @ResponseBody
    public ResultMsg deleteAdminOperationGradeByAdminOperationGradeId(Integer adminOperationGradeId) {
        return null;
    }
}