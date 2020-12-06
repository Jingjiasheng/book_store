package com.asheng.book_store.service;


import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.utils.ResultMsg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * (Book)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:19
 */
public interface BookService {
//###########图书查询相关操作
    /**
     * 获取图书总册数
     */
    public Integer getBooksCount();


    /**
     * 用户浏览图书列表
     * 需要显示的字段：图书ID，图书名称，图书分类，图书作者，图书出版社，所在城市，图书封面,官方原价，现在售价，发布人，
     */

 public List<Book> getBookList(Integer limite);
    /**
     * 用户根据ID获取一本图书的详细信息
     * 需要获取的字段 bookId
     * 需要显示的字段：所有字段均需要，但是按要求隐藏部分非必须字段
     */
    public Book getBookByBookId(Integer bookId);

    /**
     * 用户根据条件查询数据-搜索框数据
     * 可传入数据：isbn，book_name,book_author
     * 显示的内容与图书列表相同，共用一个前端页面
     */
    public List<Book> getBookListBySearch(String searchKey);


    /**
     * 根据筛选条件筛选图书-筛选选项
     * 可传入数据：出版社：book_category_id,图书售价：book_price[范围],所在城市:city_id
     */
    public List<Book> getBooksByOthers(Integer bookCategoryId,Integer bookMinPrice,Integer bookMaxPrice,Integer cityId);


    /**
     * 用户查看自己发布的书籍信息，根据用户ID获取书籍列表
     * 传入数据：userID
     * 显示数据：所有字段，按需显示或隐藏即可
     */
    public List<Book> getBooksByUserId(Integer userId);

    //###########图书修改相关操作
    /**
     *用户根据图书ID修改发布的图书信息
     * 传入数据：bookId 修改后的book信息
     * 显示数据：弹窗显示成功与否，然后回到这本图书的图书详情页
     */
    public Integer updateBookByBookId(Integer bookId);
    /**
     *一键下架图书实现
     * 传入数据：bookId
     * 显示数据，弹窗显示下架结果，并跳转到下架图书详情页面
     */
    public Integer updateBookStateOffShelf(Integer bookId);

    //###########图书添加相关操作
    /**
     * 用户新发布图书信息
     * 传入数据userId，book信息
     * 发布成功弹框提示跳转到图书详情页面
     */

    public Integer addBookByUser(Book book, BookAbout bookAbout);


    //###########图书删除相关操作
    /**
     * 与下架不同，下架图书在用户订单列表仍然可以显示，用户有机会进行再次上架和修改信息，但是删除之后数据库保留数据，更改状态为删除
     * 传入数据bookId
     * 显示删除成功，跳转到用户的图书列表的页面
     */
    public Integer deleteBookByBookId(Integer bookId);
    //================================================================================后台页面请求

    //#########图书查询相关操作
    /**
     * 获取图书主要信息列表用于展示，并分页
     * 传入查询参数：第几页，每页的记录数
     * 显示数据字段：bookId,bookIsbn,bookName,bookAuthor,bookPrice,bookSellerId
     */
    public List<Book> getBookListByLimit(Integer offset,Integer pageSize);
    /**
     * 根据条件查询书籍信息列表，主要筛选条件有：userId，bookName,bookIsbn,bookAuthor,city
     * 列表共用
     */
    public List<Book> getBookListByAdmin(Integer userId,String bookName,String bookIsbn,String bookAuthor,Integer cityId);

    /**
     * 根据bookId查询一本书的详细信息，基本上包括所有信息，原始属性设置为禁用！不可修改
     */
    public Book getBookAllInfoByBookId(Integer bookId);



    //#########图书修改相关操作
    /**
     * 修改图书的像详细信息，先获取图书详细信息
     * 传入参数book
     * 显示修改成功后的图书详情页面
     */
    public Integer updateBookInfoByBookId(Integer bookId);


}