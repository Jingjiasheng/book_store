package com.asheng.book_store.dao;

import com.asheng.book_store.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (City)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
@Repository
@Mapper
public interface CityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cityId 主键
     * @return 实例对象
     */
    City queryById(Integer cityId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<City> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param city 实例对象
     * @return 对象列表
     */
    List<City> queryAll(City city);

    /**
     * 新增数据
     *
     * @param city 实例对象
     * @return 影响行数
     */
    int insert(City city);

    /**
     * 修改数据
     *
     * @param city 实例对象
     * @return 影响行数
     */
    int update(City city);

    /**
     * 通过主键删除数据
     *
     * @param cityId 主键
     * @return 影响行数
     */
    int deleteById(Integer cityId);

}