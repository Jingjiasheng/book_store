package com.asheng.book_store.service;

import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * (BookAbout)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:21
 */
public interface BookAboutService {

    /**
     * 获取用户总发布图书的数量
     * @return 图书数量
     */
    public Integer getBookAboutCount();

    /**
     * 根据买家的Id查询一共买到的书籍数量
     * @param buyerId 买家Id
     * @return 购买的书籍的数量
     */
    public Integer getBookAboutCountBybuyerId(Integer buyerId);


    /**
     *获取卖家购买到的书籍的数量
     * @param sellerId 卖家的Id
     * @return 卖家一共发布的书籍数量
     */
    public Integer getBookAboutCountBySellerId(Integer sellerId);


    /**
     * 根据书籍Id获取某本图书的发布信息
     * @param bookId 平台发布的图书Id
     * @return 返回图书发布信息和图书基本信息
     */
    public BookAbout getBookAboutByBookId(Integer bookId);


    /**
     * 根据bookId查询一本书的详细信息，基本上包括所有信息，原始属性设置为禁用！不可修改
     * @param bookId 平台图书ID
     * @return book+bookAbout
     */
    public BookAbout getBookAllInfoByBookId(Integer bookId);


    /**
     * 用户查看自己发布的书籍信息，根据卖家ID获取书籍列表
     * @param sellerId 卖家ID
     * @return 图书列表
     */
    public List<Book> getBooksBySellerId(Integer sellerId);

    /**
     * 用户查看自己购买的书籍信息，根据买家ID获取书籍列表
     * @param buyerId 买家ID
     * @return 购买到的书籍列表
     */
    public List<Book> getBooksByBuyerId(Integer buyerId);


    /**
     * 获取某一册书在平台所有的发布信息
     * @param bookIsbn 书籍的Isbn
     * @return 某册书的所有发布信息
     */
    public List<BookAbout> getBookAboutListByBookIsbn(String bookIsbn);

    /**
     * 获取所有发布的的图书信息
     * @return 发布的图书信息列表
     */
    public List<BookAbout> getBookAboutList();

    /**
     * 分页后的发布信息列表
     * @param offset 起始位置
     * @param pageSize 每页数据量
     * @return 返回发布的图书的数量
     */
    public List<BookAbout> getBookAboutListByLimit(Integer offset,Integer pageSize);

    /**
     * 用户或者管理员根据发布图书Id更改发布内容
     * @param bookAbout 发布的图书信息
     * @return 应该返回的是修改后的图书信息
     */
    public BookAbout updateBookAboutByBookAboutId(BookAbout bookAbout);

    /**
     * 管理员或者用户下架发布图书信息
     * @param bookId 图书Id
     * @return 下架图书信息
     */
    public BookAbout updateBookAboutStateOffShelf(Integer bookId);


    /**
     * 用户发布图书信息
     * @param bookAbout 图书发布信息
     * @return 影响的记录数
     */
    public BookAbout addBookAboutByUser(BookAbout bookAbout);

}