package com.asheng.book_store.service;

import com.asheng.book_store.domain.BookAbout;

import java.util.List;

/**
 * (BookAbout)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:21
 */
public interface BookAboutService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    BookAbout queryById(int bookId );

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookAbout> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bookAbout 实例对象
     * @return 实例对象
     */
    BookAbout insert(BookAbout bookAbout);

    /**
     * 修改数据
     *
     * @param bookAbout 实例对象
     * @return 实例对象
     */
    BookAbout update(BookAbout bookAbout);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById(int bookId );

}