package com.asheng.book_store.domain.service;

import com.asheng.book_store.domain.entity.BookPress;
import java.util.List;

/**
 * (BookPress)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:23
 */
public interface BookPressService {

    /**
     * 通过ID查询单条数据
     *
     * @param bookPressId 主键
     * @return 实例对象
     */
    BookPress queryById(Integer bookPressId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookPress> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bookPress 实例对象
     * @return 实例对象
     */
    BookPress insert(BookPress bookPress);

    /**
     * 修改数据
     *
     * @param bookPress 实例对象
     * @return 实例对象
     */
    BookPress update(BookPress bookPress);

    /**
     * 通过主键删除数据
     *
     * @param bookPressId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bookPressId);

}