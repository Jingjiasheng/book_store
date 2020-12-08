package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookPress;
import com.asheng.book_store.service.BookPressService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookPress)出版社
 *
 * @author makejava
 * @since 2020-12-02 14:35:25
 */
@Api(tags = "图书出版社相关操作API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("bookPress")
public class BookPressController {
    /**
     * 服务对象
     */
    @Resource
    private BookPressService bookPressService;


    /**
     * 获取出版社总数
     * @return 出版社
     */
    @ApiOperation(value="获取出版社总数",notes="不需要参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getBookPressCount")
    @ResponseBody
    public ResultMsg getBookPressCount(){

        return null;
    }

    /**
     * 查询出版社列表，含分页
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return
     */
    @ApiOperation(value="查询出版社列表，含分页",notes="需要分页参数!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="数据起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="每页的数据量大小",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getBookListByLimit")
    @ResponseBody
    public ResultMsg getBookListByLimit(Integer offset, Integer pageSize){

        return null;
    }

    /**
     * 查询出版社列表，不分页
     */
    @ApiOperation(value="查询出版社列表，不分页",notes="无需参数，页面下拉列表选择专用!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getBookList")
    @ResponseBody
    public ResultMsg getBookList(){

        return null;
    }

    /**
     * 根据出版社Id查询出版社信息
     * @param bookPressId 出版社ID
     * @return 出版社信息
     */
    @ApiOperation(value="根据出版社Id查询出版社信息",notes="需要参数出版社ID")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookPressId",value="出版社ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getBookPressByBookPressId")
    @ResponseBody
    public ResultMsg getBookPressByBookPressId(Integer bookPressId){

        return null;
    }

    /**
     * 根据bookPressId修改出版社信息【包含编码与出版名称，务必保证与网络上一致】
     * @param bookPress 出版社信息
     * @return 修改的数量
     */
    @ApiOperation(value="根据bookPressId修改出版社信息",notes="包含编码与出版名称，务必保证与网络上一致!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookPress",value="出版社信息",required=true,paramType="BookPress")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("/updateBookPressByBookPressId")
    @ResponseBody
    public ResultMsg updateBookPressByBookPressId(BookPress bookPress){

        return null;
    }

    /**
     * 添加出版社信息
     * @param bookPress 出版社信息
     * @return 添加出版社的数量
     */
    @ApiOperation(value="添加出版社信息",notes="参数为出版社信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookPress",value="出版社信息",required=true,paramType="BookPress")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("/addBookPress")
    @ResponseBody
    public ResultMsg addBookPress(BookPress bookPress){

        return null;
    }

    /**
     * 删除出版社信息，物理删除
     * @param bookPressId 出版社ID
     * @return 删除的数量
     */
    @ApiOperation(value="删除出版社信息",notes="根据出版社ID删除出版社的信息一定要保证数据准确，执行物理删除!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookPressId",value="出版社ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @DeleteMapping("/deleteBookPressByBookPressId")
    @ResponseBody
    public ResultMsg deleteBookPressByBookPressId(Integer bookPressId){

        return null;
    }

}