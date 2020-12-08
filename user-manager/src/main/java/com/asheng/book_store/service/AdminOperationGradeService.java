package com.asheng.book_store.service;


import com.asheng.book_store.domain.AdminOperationGrade;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * (AdminOperationGrade)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:13
 */
public interface AdminOperationGradeService {

    /**
     * 查询所有管理员的操作等级数量
     *
     * @return 所有管理员的操作等级数量
     */
    public Integer getAdminOperationGradeCount();


    //

    /**
     * 获取操作等级列表不用分页【以备其他地方引用】
     *
     * @return 操作等级列表
     */
    public List<AdminOperationGrade> getAdminOperationList();


    /**
     * 根据等级ID获取操作等级的详细信息
     *
     * @param adminOperationGradeId 操作等级ID
     * @return 操作等级详细信息
     */
    public AdminOperationGrade getAdminOperationGradeByAdminOperationGradeId(Integer adminOperationGradeId);


    /**
     * 添加操作等级定义
     *
     * @param adminOperationGrade 操作等级信息
     * @return 新增的操作等级信息
     */
    public AdminOperationGrade addAdminOperationGrade(AdminOperationGrade adminOperationGrade);


    /**
     * 修改操作等级的定义
     *
     * @param adminOperationGrade 修改后的等级定义信息
     * @return 修改后的等级定义信息
     */
    public AdminOperationGrade updateAdminOperationGradeByAdminOperationGradeId(AdminOperationGrade adminOperationGrade);


    /**
     * 删除操作等级的定义
     *
     * @param adminOperationGradeId 操作等级ID
     * @return 删除的数量
     */
    public Integer deleteAdminOperationGradeByAdminOperationGradeId(Integer adminOperationGradeId);

}