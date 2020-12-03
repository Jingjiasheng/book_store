package com.asheng.book_store.dao;

import com.asheng.book_store.domain.AdminRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (AdminRole)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
@Repository
@Mapper
public interface AdminRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param adminRoleId 主键
     * @return 实例对象
     */
    AdminRole queryById(Integer adminRoleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdminRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param adminRole 实例对象
     * @return 对象列表
     */
    List<AdminRole> queryAll(AdminRole adminRole);

    /**
     * 新增数据
     *
     * @param adminRole 实例对象
     * @return 影响行数
     */
    int insert(AdminRole adminRole);

    /**
     * 修改数据
     *
     * @param adminRole 实例对象
     * @return 影响行数
     */
    int update(AdminRole adminRole);

    /**
     * 通过主键删除数据
     *
     * @param adminRoleId 主键
     * @return 影响行数
     */
    int deleteById(Integer adminRoleId);

}