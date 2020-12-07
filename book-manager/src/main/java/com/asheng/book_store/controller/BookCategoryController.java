package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookCategory;
import com.asheng.book_store.service.BookCategoryService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookCategory)图书分类控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:23
 */
@Api(tags = "图书类别操作相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("bookCategory")
public class BookCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private BookCategoryService bookCategoryService;


    /**
     * 获取分类总数
     * @return 总记录数
     */
    @ApiOperation(value="获取分类总数",notes="没有参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookCategoryCount")
    @ResponseBody
    public ResultMsg getBookCategoryCount(){

        return null;
    }

    /**
     * 获取图书分类的全部列表
     * @return 分类列表
     */
    @ApiOperation(value="获取图书分类的全部列表",notes="无需参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookCategoryList")
    @ResponseBody
    public ResultMsg getBookCategoryList(){

        return null;
    }

    /**
     * 按照分页获取图书分类列表
     * @param offset 起始位置
     * @param pageSize 每页的记录数
     * @return 返回分类列表
     */
    @ApiOperation(value="按照分页获取图书分类列表",notes="需要两个分页参数!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="每页的记录数",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookCategoryBylimit")
    @ResponseBody
    public ResultMsg getBookCategoryBylimit(Integer offset,Integer pageSize){

        return null;
    }

    /**
     * 根据分类Id进行分类信息的查询
     * @param bookCategoryId 图书分类的ID
     * @return 返回分类信息
     */
    @ApiOperation(value="根据分类Id进行分类信息的查询",notes="需要图书分类的ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookCategoryId",value="图书分类的ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookCategoryByBookCategoryId")
    @ResponseBody
    public ResultMsg getBookCategoryByBookCategoryId(Integer bookCategoryId){

        return null;
    }

    /**
     * 根据分类的Id该分类下图书的数量
     * @param bookCategoryId 分类的Id
     * @return 图书的数量
     */
    @ApiOperation(value="根据分类的Id该分类下图书的数量",notes="需要分类ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookCategoryId",value="分类的Id",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookCountByBookId")
    @ResponseBody
    public ResultMsg getBookCountByBookCateporyId(Integer bookCategoryId){

        return null;
    }

    /**
     * 添加图书分类
     * @param bookCategory 分类信息
     * @return 返回影响的记录数
     */
    @ApiOperation(value="添加图书分类",notes="需要图书分类信息!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookCategory",value="分类信息",required=true,paramType="BookCategory")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/addBookCategory")
    @ResponseBody
    public ResultMsg addBookCategory(BookCategory bookCategory){

        return null;
    }

    /**
     * 根据bookCategoryId修改某个分类的信息
     * @param bookCategory 修改后的分类信息
     * @return
     */
    @ApiOperation(value="根据bookCategoryId修改某个分类的信息",notes="需要图书分类ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookCategory",value="修改后的分类信息",required=true,paramType="BookCategory")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/updateBookCategoryByBookCategoryId")
    @ResponseBody
    public ResultMsg updateBookCategoryByBookCategoryId(BookCategory bookCategory){

        return null;
    }

    /**
     * 执行图书种类信息的删除
     * @param bookCategoryId 图书分类ID
     * @return 返回影响的结果数
     */
    @ApiOperation(value="执行图书种类信息的删除",notes="需要参数图书分类ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookCategoryId",value="图书分类ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/deleteBookCategoryByBookCategoryId")
    @ResponseBody
    public ResultMsg deleteBookCategoryByBookCategoryId(Integer bookCategoryId){

        return null;
    }
}