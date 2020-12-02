package com.asheng.book_store.service;


import com.asheng.book_store.domain.BookState;

import java.util.List;

/**
 * (BookState)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:25
 */
public interface BookStateService {

    /**
     * 通过ID查询单条数据
     *
     * @param bookStateId 主键
     * @return 实例对象
     */
    BookState queryById(Integer bookStateId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookState> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bookState 实例对象
     * @return 实例对象
     */
    BookState insert(BookState bookState);

    /**
     * 修改数据
     *
     * @param bookState 实例对象
     * @return 实例对象
     */
    BookState update(BookState bookState);

    /**
     * 通过主键删除数据
     *
     * @param bookStateId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bookStateId);

}