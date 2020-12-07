package com.asheng.book_store.service;


import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
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

 /**
    * 获取图书入库的总册数【说明：总册数指的是不同的书籍，不是不同用户发布的两本相同的书籍】
    * @return 入册数量
    */
   public Integer getBooksCount();


   /**
    * 用户浏览图书列表
    * 需要显示的字段：图书ID，图书名称，图书分类，图书作者，图书出版社，所在城市，图书封面,官方原价，现在售价，发布人，
    * @param offset 数据起始位置
    * @param limite 每页的数据量
    * @return 图书列表
    */
   public List<Book> getBookList(Integer offset,Integer limite);
   /**
    * 用户根据bookIsbn获取一本图书的基础信息
    * @param bookIsbn 图书ISBN
    * @return 图书的基础信息
    */
   public Book getBookByBookId(Integer bookIsbn);

   /**
    * 用户根据条件查询数据-搜索框数据
    * @param searchKey 搜索关键字
    * @return 返回书籍列表
    */
   public List<Book> getBookListBySearch(String searchKey);


   /**
    * 根据筛选条件筛选图书-筛选选项
    * @param bookCategoryId 图书分类ID
    * @param bookMinPrice 图书最低价格
    * @param bookMaxPrice 图书最高价格
    * @param cityId 城市
    * @return 符合条件的图书列表
    */
   public List<Book> getBooksByOthers(Integer bookCategoryId,Integer bookMinPrice,Integer bookMaxPrice,Integer cityId);



   //###########图书修改相关操作

   /**
    * 管理员根据图书Isbn修改发布的图书信息
    * @param book 图书基本信息
    * @return 修改的记录数
    */
   public Book updateBookByBookIsbn(Book book);

   /**
    * 一键下架所有的一款图书实现
    * @param bookIsbn 下架图书的bookISBN
    * @return
    */
   public Book updateBookStateOffShelf(Integer bookIsbn);


   /**
    * 用户添加图书信息【在用户发布图书的时候进行添加，但是用户发布的图书信息需要经过管理员确定】
    * @param book 图书信息
    * @return 影响的行数
    */
   public Book addBookByUser(Book book );


   /**
    * 管理员添加图书信息
    * @param book 添加的书籍信息
    * @return 影响的行数
    */
   public Book addBookByAdmin(Book book );


   //###########图书删除相关操作

   /**
    * 与下架不同，下架图书在用户订单列表仍然可以显示，用户有机会进行再次上架和修改信息，但是删除之后数据库保留数据，更改状态为删除
    * @param bookIsbn 书籍ISBN
    * @return
    */
   public Book deleteBookByBookIsbn(String bookIsbn);


   //#########图书查询相关操作

   /**
    * 获取图书主要信息列表用于展示，并分页
    * @param offset 数据起始位置
    * @param pageSize 每页数据量大小
    * @return 图书列表
    */
   public List<Book> getBookListByLimit(Integer offset,Integer pageSize);


   /**
    * 根据条件查询书籍信息列表，主要筛选条件有：bookName,bookIsbn,bookAuthor,
    * @param bookName 图书名称
    * @param bookIsbn 图书ISBN
    * @param bookAuthor 图书作者
    * @return 图书列表
    */
   public List<Book> getBookListByAdmin(String bookName,String bookIsbn,String bookAuthor);


}