package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.service.BookAboutService;
import com.asheng.book_store.service.BookService;
import com.asheng.book_store.service.CityService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Book)图书基本信息控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:20
 */
@Api(tags = "图书基本信息操作相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("/book")
public class BookController {
    /**
     * 服务对象
     */
    @Resource
    private BookService bookService;

    private BookAboutService bookAboutService;

    private CityService cityService;

    //###########图书查询相关操作

    /**
     * 获取图书入库的总册数【说明：总册数指的是不同的书籍，不是不同用户发布的两本相同的书籍】
     * @return 入册数量
     */
    @RequestMapping("/getBookCount")
    @ResponseBody
    public Integer getBooksCount(){
        ResultMsg<Integer> resultMsg = new ResultMsg<>();
        return null;
    }


    /**
     * 用户浏览图书列表
     * 需要显示的字段：图书ID，图书名称，图书分类，图书作者，图书出版社，所在城市，图书封面,官方原价，现在售价，发布人，
     */
    @RequestMapping("/getBooksList")
    @ResponseBody
    public List<Book> getBookList(@RequestParam(value = "offset",defaultValue = "1")Integer offset, @RequestParam(value = "limit",defaultValue = "10")Integer limite){
        return null;
    }

    /**
     * 用户根据ID获取一本图书的详细信息
     * 需要获取的字段 bookId
     * 需要显示的字段：所有字段均需要，但是按要求隐藏部分非必须字段
     */
    @RequestMapping("/getBookByBookIsbn")
    @ResponseBody
    public Book getBookByBookId(Integer bookIsbn){

        return null;
    }

    /**
     * 用户根据条件查询数据-搜索框数据
     * 可传入数据：isbn，book_name,book_author
     * 显示的内容与图书列表相同，共用一个前端页面
     */
    @RequestMapping("/getBookListBySearch")
    @ResponseBody
    public List<Book> getBookListBySearch(String searchKey){
        return null;
    }


    /**
     * 根据筛选条件筛选图书-筛选选项
     * 可传入数据：出版社：book_category_id,图书售价：book_price[范围],所在城市:city_id
     */
    @RequestMapping("/getBooksByOthers")
    @ResponseBody
    public List<Book> getBooksByOthers(Integer bookCategoryId,Integer bookMinPrice,Integer bookMaxPrice,Integer cityId){

        return null;
    }



    //###########图书修改相关操作
    /**
     *  管理员根据图书Isbn修改发布的图书信息
     * 传入数据：bookIsbn 修改后的book信息
     * 显示数据：弹窗显示成功与否，然后回到这本图书的图书详情页
     */
    @RequestMapping("/updateBookByBookIsbn")
    @ResponseBody
    public ResultMsg updateBookByBookIsbn(Book book){

        return null;
    }

    /**
     *一键下架所有的一款图书实现
     * 传入数据：bookIsbn
     * 显示数据，弹窗显示下架结果，并跳转到下架图书详情页面
     * 返回一共下架了多少条本已经发布的书籍
     */
    @RequestMapping("/updateBookStateOffShelfByBookIsbn")
    @ResponseBody
    public ResultMsg updateBookStateOffShelf(Integer bookIsbn){

        return null;
    }


    /**
     * 用户添加图书信息【在用户发布图书的时候进行添加，但是用户发布的图书信息需要经过管理员确定】
     * book信息
     * 发布成功弹框提示跳转到图书详情页面
     */
    @RequestMapping("/addBookBySeller")
    @ResponseBody
    public ResultMsg addBookByUser(Book book ){

        return null;
    }


    /**
     * 管理员添加图书信息
     * book信息
     * 发布成功弹框提示跳转到图书详情页面
     */
    @RequestMapping("/addBookByAdmin")
    @ResponseBody
    public ResultMsg addBookByAdmin(Book book ){

        return null;
    }


    //###########图书删除相关操作
    /**
     * 与下架不同，下架图书在用户订单列表仍然可以显示，用户有机会进行再次上架和修改信息，但是删除之后数据库保留数据，更改状态为删除
     * 传入数据bookId
     * 显示删除成功，跳转到用户的图书列表的页面
     */
    @RequestMapping("/deleteBookByBookIsbn")
    @ResponseBody
    public ResultMsg deleteBookByBookIsbn(String bookIsbn){

        return null;
    }


    //================================================================================后台页面请求
    //#########图书查询相关操作
    /**
     * 获取图书主要信息列表用于展示，并分页
     * 传入查询参数：第几页，每页的记录数
     * 显示数据字段：bookId,bookIsbn,bookName,bookAuthor,bookPrice,bookSellerId
     */
    @RequestMapping("/getBookListByLimit")
    @ResponseBody
    public List<Book> getBookListByLimit(Integer offset,Integer pageSize){

        return null;
    }


    /**
     * 根据条件查询书籍信息列表，主要筛选条件有：userId，bookName,bookIsbn,bookAuthor,city
     * 列表共用
     */
    @RequestMapping("/getBookListByAdmin")
    @ResponseBody
    public List<Book> getBookListByAdmin(Integer userId,String bookName,String bookIsbn,String bookAuthor,Integer cityId){

        return null;
    }

}