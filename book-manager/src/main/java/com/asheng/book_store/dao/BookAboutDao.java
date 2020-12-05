package com.asheng.book_store.dao;

import com.asheng.book_store.domain.BookAbout;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (BookAbout)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
@Repository
@Mapper
public interface BookAboutDao {

    /**
     * 通过ID查询单条数据
     *
     * @param   bookId 主键
     * @return 实例对象
     */
    BookAbout queryById(int bookId );

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookAbout> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bookAbout 实例对象
     * @return 对象列表
     */
    List<BookAbout> queryAll(BookAbout bookAbout);

    /**
     * 新增数据
     *
     * @param bookAbout 实例对象
     * @return 影响行数
     */
    int insert(BookAbout bookAbout);

    /**
     * 修改数据
     *
     * @param bookAbout 实例对象
     * @return 影响行数
     */
    int update(BookAbout bookAbout);

    /**
     * 通过主键删除数据
     *
     * @param  bookId 主键
     * @return 影响行数
     */
    int deleteById(int bookId );

}