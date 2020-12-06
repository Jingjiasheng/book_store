package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.service.BookAboutService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.Api;
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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BookAbout selectOne(int id) {
        return this.bookAboutService.queryById(id);
    }


    /**
     * 获取用户总发布图书扽数量
     * @return 图书数量
     */
    @RequestMapping("/getBookAboutCount")
    @ResponseBody
    public Integer getBookAboutCount(){
        return null;
    }

    /**
     * 根据买家的Id查询一共买到的书籍数量
     * @param buyerId 买家Id
     * @return 购买的书籍的数量
     */
    @RequestMapping("/getBookAboutCountBybuyerId")
    @ResponseBody
    public Integer getBookAboutCountBybuyerId(Integer buyerId){

        return null;
    }


    /**
     *获取卖家购买到的书籍的数量
     * @param sellerId 卖家的Id
     * @return 卖家一共发布的书籍数量
     */
    @RequestMapping("/getBookAboutCountBySellerId")
    @ResponseBody
    public Integer getBookAboutCountBySellerId(Integer sellerId){

        return null;
    }


    /**
     * 根据书籍Id获取某本图书的发布信息
     * @param bookId 平台发布的图书Id
     * @return 返回图书发布信息和图书基本信息
     */
    @RequestMapping("getBookAboutByBookId")
    @ResponseBody
    public BookAbout getBookAboutByBookId(Integer bookId){

        return null;
    }


    /**
     * 根据bookId查询一本书的详细信息，基本上包括所有信息，原始属性设置为禁用！不可修改
     */
    @RequestMapping("/getBookAllInfoByBookId")
    @ResponseBody
    public Book getBookAllInfoByBookId(Integer bookId){

        return null;
    }


    /**
     * 用户查看自己发布的书籍信息，根据卖家ID获取书籍列表
     * 传入数据：sellerID
     * 显示数据：所有字段，按需显示或隐藏即可
     */
    @RequestMapping("/getBooksBySellerId")
    @ResponseBody
    public List<Book> getBooksBySellerId(Integer sellerId){

        return null;
    }

    /**
     * 用户查看自己购买的书籍信息，根据买家ID获取书籍列表
     * 传入数据：buyerID
     * 显示数据：所有字段，按需显示或隐藏即可
     */
    @RequestMapping("/getBooksByBuyerId")
    @ResponseBody
    public List<Book> getBooksByBuyerId(Integer buyerId){

        return null;
    }


    /**
     * 获取某一册书在平台所有的发布信息
     * @param bookIsbn 书籍的Isbn
     * @return 某册书的所有发布信息
     */
    @RequestMapping("/getBookAboutListByBookIsbn")
    @ResponseBody
    public List<BookAbout> getBookAboutListByBookIsbn(String bookIsbn){

        return null;
    }

    /**
     * 获取所有发布的的图书信息
     * @return 发布的图书信息列表
     */
    @RequestMapping("/getBookAboutList")
    @ResponseBody
    public List<BookAbout> getBookAboutList(){

        return null;
    }

    /**
     * 分页后的发布信息列表
     * @param offset 起始位置
     * @param pageSize 每页数据量
     * @return 返回发布的图书的数量
     */
    @RequestMapping("/getBookAboutListByLimit")
    @ResponseBody
    public List<BookAbout> getBookAboutListByLimit(Integer offset,Integer pageSize){

        return null;
    }

    /**
     * 用户或者管理员根据发布图书Id更改发布内容
     * @param bookAbout 发布的图书信息
     * @return 应该返回的是修改后的图书信息
     */
    @RequestMapping("/updateBookAboutByBookAboutId")
    @ResponseBody
    public Integer updateBookAboutByBookAboutId(BookAbout bookAbout){

        return null;
    }

    /**
     * 管理员或者用户下架发布图书信息
     * @param bookId 图书Id
     * @return 下架图书信息
     */
    @RequestMapping("/updateBookAboutStateOffShelf")
    @ResponseBody
    public Integer updateBookAboutStateOffShelf(Integer bookId){

        return null;
    }


    /**
     * 用户新发布基础图书信息
     * 传入数据userId，book信息
     * 发布成功弹框提示跳转到图书详情页面
     */
    @RequestMapping("/addBookAboutBySeller")
    @ResponseBody
    public ResultMsg addBookByUser(BookAbout bookAbout){

        return null;
    }




}