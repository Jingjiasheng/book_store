package com.asheng.book_store.dao;

import com.asheng.book_store.domain.BookState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (BookState)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
@Repository
@Mapper
public interface BookStateDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bookStateId 主键
     * @return 实例对象
     */
    BookState queryById(Integer bookStateId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookState> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bookState 实例对象
     * @return 对象列表
     */
    List<BookState> queryAll(BookState bookState);

    /**
     * 新增数据
     *
     * @param bookState 实例对象
     * @return 影响行数
     */
    int insert(BookState bookState);

    /**
     * 修改数据
     *
     * @param bookState 实例对象
     * @return 影响行数
     */
    int update(BookState bookState);

    /**
     * 通过主键删除数据
     *
     * @param bookStateId 主键
     * @return 影响行数
     */
    int deleteById(Integer bookStateId);

}