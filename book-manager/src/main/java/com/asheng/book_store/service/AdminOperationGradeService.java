package com.asheng.book_store.service;


import com.asheng.book_store.domain.AdminOperationGrade;

import java.util.List;

/**
 * (AdminOperationGrade)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:13
 */
public interface AdminOperationGradeService {

    /**
     * 通过ID查询单条数据
     *
     * @param adminOperationGradeId 主键
     * @return 实例对象
     */
    AdminOperationGrade queryById(Integer adminOperationGradeId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdminOperationGrade> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adminOperationGrade 实例对象
     * @return 实例对象
     */
    AdminOperationGrade insert(AdminOperationGrade adminOperationGrade);

    /**
     * 修改数据
     *
     * @param adminOperationGrade 实例对象
     * @return 实例对象
     */
    AdminOperationGrade update(AdminOperationGrade adminOperationGrade);

    /**
     * 通过主键删除数据
     *
     * @param adminOperationGradeId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer adminOperationGradeId);

}