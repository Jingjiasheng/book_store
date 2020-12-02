package com.asheng.book_store.dao;

import com.asheng.book_store.domain.BookPress;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (BookPress)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public interface BookPressDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bookPressId 主键
     * @return 实例对象
     */
    BookPress queryById(Integer bookPressId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookPress> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bookPress 实例对象
     * @return 对象列表
     */
    List<BookPress> queryAll(BookPress bookPress);

    /**
     * 新增数据
     *
     * @param bookPress 实例对象
     * @return 影响行数
     */
    int insert(BookPress bookPress);

    /**
     * 修改数据
     *
     * @param bookPress 实例对象
     * @return 影响行数
     */
    int update(BookPress bookPress);

    /**
     * 通过主键删除数据
     *
     * @param bookPressId 主键
     * @return 影响行数
     */
    int deleteById(Integer bookPressId);

}