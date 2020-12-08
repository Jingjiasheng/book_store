package com.asheng.book_store.service;

import com.asheng.book_store.domain.AdminOperation;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (AdminOperation)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:13
 */
public interface AdminOperationService {

    /**
     * 查询所有管理员的操作记录总数
     * @return 管理员的总操作记录数
     */
    public Integer getAdminOperationCount() ;



    /**
     * 查询所有管理员的操作记录，并按照时间倒叙排列【展示最新的操作记录】
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return 管理员操作信息列表
     */
    public List<AdminOperation> getAdminOperationListByLimit(Integer offset, Integer pageSize);


    /**
     * 按照管理员姓名，管理员ID，请求名称，操作等级进行查询操作记录
     * @param adminOperation 包含查询信息的操作信息
     * @return 操作记录列表
     */
    public List<AdminOperation> getAdminOperationListByOther(AdminOperation adminOperation) ;


    /**
     * 添加管理员操作记录【由切面类完成，不显示调用controller方法】
     * @param adminOperation 管理员的操作信息
     * @return 管理员的操作信息
     */
    public AdminOperation addAdminOperation(AdminOperation adminOperation);

    //

    /**
     * 删除管理员操作记录【主要用于释放内存】
     * @param request  操作记录ID数组
     * @return 删除的记录数
     */
    public Integer deleteAdminOperation(HttpServletRequest request);


    /**
     * 根据操作记录的ID查询一条操作记录的详细信息
     * @param adminOperationId 操作记录的ID
     * @return 操作记录详细信息
     */
    public AdminOperation getAdminOperationByAdminOperationId(Integer adminOperationId) ;



}