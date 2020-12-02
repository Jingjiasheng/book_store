package com.asheng.book_store.dao;

import com.asheng.book_store.domain.AdminOperation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AdminOperation)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-02 14:32:33
 */
public interface AdminOperationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    AdminOperation queryById( );

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdminOperation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param adminOperation 实例对象
     * @return 对象列表
     */
    List<AdminOperation> queryAll(AdminOperation adminOperation);

    /**
     * 新增数据
     *
     * @param adminOperation 实例对象
     * @return 影响行数
     */
    int insert(AdminOperation adminOperation);

    /**
     * 修改数据
     *
     * @param adminOperation 实例对象
     * @return 影响行数
     */
    int update(AdminOperation adminOperation);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById( );

}