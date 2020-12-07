package com.asheng.book_store.service;


import com.asheng.book_store.domain.BookCategory;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * (BookCategory)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:22
 */
public interface BookCategoryService {

    /**
     * 获取分类总数
     * @return 总记录数
     */
    public Integer getBookCategoryCount();

    /**
     * 获取图书分类的全部列表
     * @return 分类列表
     */
    public List<BookCategory> getBookCategoryList();

    /**
     * 按照分页获取图书分类列表
     * @param offset 起始位置
     * @param pageSize 每页的记录数
     * @return 返回分类列表
     */
    public List<BookCategory> getBookCategoryBylimit(Integer offset,Integer pageSize);

    /**
     * 根据分类Id进行分类信息的查询
     * @param bookCategoryId 图书分类的ID
     * @return 返回分类信息
     */
    public BookCategory getBookCategoryByBookCategoryId(Integer bookCategoryId);

    /**
     * 根据分类的Id该分类下图书的数量
     * @param bookCategoryId 分类的Id
     * @return 图书的数量
     */
    public Integer getBookCountByBookCateporyId(Integer bookCategoryId);

    /**
     * 添加图书分类
     * @param bookCategory 分类信息
     * @return 返回影响的记录数
     */
    public BookCategory addBookCategory(BookCategory bookCategory);

    /**
     * 根据bookCategoryId修改某个分类的信息
     * @param bookCategory 修改后的分类信息
     * @return
     */
    public BookCategory updateBookCategoryByBookCategoryId(BookCategory bookCategory);

    /**
     * 执行图书种类信息的删除
     * @param bookCategoryId 图书分类ID
     * @return 返回影响的结果数
     */
    public Integer deleteBookCategoryByBookCategoryId(Integer bookCategoryId);
}