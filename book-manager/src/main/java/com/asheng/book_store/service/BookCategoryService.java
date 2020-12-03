package com.asheng.book_store.service;


import com.asheng.book_store.domain.BookCategory;

import java.util.List;

/**
 * (BookCategory)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:22
 */
public interface BookCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param bookCategoryId 主键
     * @return 实例对象
     */
    BookCategory queryById(Integer bookCategoryId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bookCategory 实例对象
     * @return 实例对象
     */
    BookCategory insert(BookCategory bookCategory);

    /**
     * 修改数据
     *
     * @param bookCategory 实例对象
     * @return 实例对象
     */
    BookCategory update(BookCategory bookCategory);

    /**
     * 通过主键删除数据
     *
     * @param bookCategoryId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bookCategoryId);

}