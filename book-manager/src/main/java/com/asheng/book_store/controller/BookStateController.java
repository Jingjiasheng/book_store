package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookState;
import com.asheng.book_store.service.BookStateService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.jvnet.staxex.BinaryText;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookState)图书状态控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:26
 */
@Api(tags = "图书状态管理相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("bookState")
public class BookStateController {
    /**
     * 服务对象
     */
    @Resource
    private BookStateService bookStateService;


    /**
     * 获取图书状态总数
     * @return 图书状态总数
     */
    @ApiOperation(value="获取图书状态总数",notes="没有参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getBookStateCount")
    @ResponseBody
    public ResultMsg getBookStateCount(){

        return null;
    }

    /**
     * 查询所有的状态信息列表
     * @return 状态信息列表
     */
    @ApiOperation(value="查询所有的状态信息列表",notes="不分页")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getBookStateList")
    @ResponseBody
    public ResultMsg getBookStateList(){

        return null;
    }


    /**
     * 查询分页的状态信息列表
     * @param offset 数据起始位置
     * @param pageSize 数据量大小
     * @return 状态列表
     */
    @ApiOperation(value="查询分页的状态信息列表",notes="分页带分页参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="数据起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="数据量大小",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getBookStateListByLimit")
    @ResponseBody

    public ResultMsg getBookStateListByLimit(Integer offset, Integer pageSize){

        return null;
    }


    /**
     * 根据stateId查询state信息
     * @param bookStateId 图书状态ID
     * @return 图书状态信息
     */
    @ApiOperation(value="根据stateId查询state信息",notes="需要参数bookStateId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookStateId",value="图书状态ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getBookStateByBookStateId")
    @ResponseBody
    public ResultMsg getBookStateByBookStateId(Integer bookStateId){

        return null;
    }


    /**
     * 根据stateId修改state信息
     * @param bookState 图书状态信息
     * @return 修改的记录数
     */
    @ApiOperation(value="根据stateId修改state信息",notes="需要参数bookStateID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookState",value="图书状态信息",required=true,paramType="BookState")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("/updateBookStateByBookStateId")
    @ResponseBody
    public ResultMsg updateBookStateByBookStateId(BookState bookState){

        return null;
    }

    /**
     * 删除状态信息【物理删除根据stateId】
     * @param bookSateId 图书状态ID
     * @return 删除的数量
     */
    @ApiOperation(value="删除状态信息",notes="物理删除根据stateId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookSateId",value="图书状态ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @DeleteMapping("/deleteBookStateByBookStateId")
    @ResponseBody
    public ResultMsg deleteBookStateByBookStateId(Integer bookSateId){

        return null;
    }

    /**
     * 添加图书状态信息
     * @param bookState 图书状态信息
     * @return 添加的图书信息
     */
    @ApiOperation(value="添加图书状态信息",notes="图书状态信息BookState!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookState",value="图书状态信息",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("/addBookState")
    @ResponseBody
    public ResultMsg addBookState(BookState bookState){

        return null;
    }



}