package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.service.BookAboutService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookAbout)卖家发布书籍相关信息控制器
 *
 * @author makejava
 * @since 2020-12-02 14:35:22
 */
@Api(tags = "卖家发布的图书相关信息操作API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("bookAbout")
public class BookAboutController {
    /**
     * 服务对象
     */
    @Resource
    private BookAboutService bookAboutService;


    /**
     * 获取用户总发布图书的数量
     * @return 图书数量
     */
    @ApiOperation(value="获取用户总发布图书的数量",notes="没有参数!")
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookAboutCount")
    @ResponseBody
    public ResultMsg getBookAboutCount(){
        return null;
    }

    /**
     * 根据买家的Id查询一共买到的书籍数量
     * @param buyerId 买家Id
     * @return 购买的书籍的数量
     */
    @ApiOperation(value="根据买家的Id查询一共买到的书籍数量",notes="根据用户自己的ID进行查询！参数名为buyerId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="buyerId",value="买家ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookAboutCountBybuyerId")
    @ResponseBody
    public ResultMsg getBookAboutCountBybuyerId(Integer buyerId){

        return null;
    }


    /**
     *获取卖家购买到的书籍的数量
     * @param sellerId 卖家的Id
     * @return 卖家一共发布的书籍数量
     */
    @ApiOperation(value="获取卖家购买到的书籍的数量",notes="根据用户自己的ID进行查询！参数名为sellerId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="sellerId",value="卖家的Id",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookAboutCountBySellerId")
    @ResponseBody
    public ResultMsg getBookAboutCountBySellerId(Integer sellerId){

        return null;
    }


    /**
     * 根据书籍Id获取某本图书的发布信息
     * @param bookId 平台发布的图书Id
     * @return 返回图书发布信息和图书基本信息
     */
    @ApiOperation(value="根据书籍Id获取某本图书的发布信息",notes="根据平台上图书的ID进行查询！参数名为bookId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookId",value="平台发布的图书Id",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("getBookAboutByBookId")
    @ResponseBody
    public ResultMsg getBookAboutByBookId(Integer bookId){

        return null;
    }


    /**
     * 根据bookId查询一本书的详细信息，基本上包括所有信息，原始属性设置为禁用！不可修改
     * @param bookId 平台图书ID
     * @return book+bookAbout
     */
    @ApiOperation(value="根据bookId查询一本书的详细信息，基本上包括所有信息",notes="根据平台上图书的ID进行查询！参数名为bookId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookId",value="平台图书ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookAllInfoByBookId")
    @ResponseBody
    public ResultMsg getBookAllInfoByBookId(Integer bookId){

        return null;
    }


    /**
     * 用户查看自己发布的书籍信息，根据卖家ID获取书籍列表
     * @param sellerId 卖家ID
     * @return 图书列表
     */
    @ApiOperation(value="用户查看自己发布的书籍信息",notes="根根据卖家ID获取书籍列表！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="sellerId",value="卖家ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBooksBySellerId")
    @ResponseBody
    public ResultMsg getBooksBySellerId(Integer sellerId){

        return null;
    }

    /**
     * 用户查看自己购买的书籍信息，根据买家ID获取书籍列表
     * @param buyerId 买家ID
     * @return 购买到的书籍列表
     */
    @ApiOperation(value="用户查看自己购买的书籍信息",notes="根据买家ID获取书籍列表!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="buyerId",value="买家ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBooksByBuyerId")
    @ResponseBody
    public ResultMsg getBooksByBuyerId(Integer buyerId){

        return null;
    }


    /**
     * 获取某一册书在平台所有的发布信息
     * @param bookIsbn 书籍的Isbn
     * @return 某册书的所有发布信息
     */
    @ApiOperation(value="获取某一册书在平台所有的发布信息",notes="获取某一册书的所有发布书籍!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookIsbn",value="书籍的Isbn",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookAboutListByBookIsbn")
    @ResponseBody
    public ResultMsg getBookAboutListByBookIsbn(String bookIsbn){

        return null;
    }

    /**
     * 获取所有发布的的图书信息
     * @return 发布的图书信息列表
     */
    @ApiOperation(value="获取所有发布的的图书信息",notes="不分页!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookAboutList")
    @ResponseBody
    public ResultMsg getBookAboutList(){

        return null;
    }

    /**
     * 分页后的发布信息列表
     * @param offset 起始位置
     * @param pageSize 每页数据量
     * @return 返回发布的图书的数量
     */
    @ApiOperation(value="分页后的发布信息列表",notes="需要分页参数!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="每页数据量",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookAboutListByLimit")
    @ResponseBody
    public ResultMsg getBookAboutListByLimit(Integer offset,Integer pageSize){

        return null;
    }

    /**
     * 用户或者管理员根据发布图书Id更改发布内容
     * @param bookAbout 发布的图书信息
     * @return 应该返回的是修改后的图书信息
     */
    @ApiOperation(value="用户或者管理员根据发布图书Id更改发布内容",notes="需要参数！")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookAbout",value="发布的图书信息",required=true,paramType="BookAbout")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/updateBookAboutByBookAboutId")
    @ResponseBody
    public ResultMsg updateBookAboutByBookAboutId(BookAbout bookAbout){

        return null;
    }

    /**
     * 管理员或者用户下架发布图书信息
     * @param bookId 图书Id
     * @return 下架图书信息
     */
    @ApiOperation(value="管理员或者用户下架发布图书信息",notes="需要下架图书的iD!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookId",value="图书Id",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/updateBookAboutStateOffShelf")
    @ResponseBody
    public ResultMsg updateBookAboutStateOffShelf(Integer bookId){

        return null;
    }


    /**
     * 用户发布图书信息
     * @param bookAbout 图书发布信息
     * @return 影响的记录数
     */
    @ApiOperation(value="用户发布图书信息",notes="根据用户自己的ID进行查询！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookAbout",value="图书发布信息",required=true,paramType="BookAbout")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/addBookAboutBySeller")
    @ResponseBody
    public ResultMsg addBookAboutByUser(BookAbout bookAbout){

        return null;
    }




}