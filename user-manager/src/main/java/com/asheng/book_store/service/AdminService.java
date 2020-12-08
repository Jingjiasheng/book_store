package com.asheng.book_store.service;

import com.asheng.book_store.domain.Admin;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * (Admin)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:34:32
 */
public interface AdminService {

    /**
     * 查询管理员总数
     * @return 管理员总数
     */
    public Integer getAdminCount();


    /**
     * 获取管理员列表分页
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return 管理员列表
     */
    public List<Admin> getAdminListByLimit(Integer offset,Integer pageSize);

    /**
     * 根据管理员ID获取一个管理员的信息
     * @param adminId 管理员ID
     * @return 管理员详细信息
     */
    public Admin getAdminByAdminId(Integer adminId) ;


    //

    /**
     * 添加管理员信息
     * @param admin 管理员信息
     * @return 新添加的管理员信息
     */
    public Admin addAdmin(Admin admin) ;


    /**
     * 根据管理员ID修改管理员信息
     * @param admin 管理员ID
     * @return 修改后的管理员信息
     */
    public Admin updateAdminByAdminId(Admin admin) ;
    //

    /**
     * 禁用账号/启用账号
     * @param adminId 管理员ID
     * @return 修改后的管理员的信息
     */
    public Admin updateAdminAccountStateByAdminId(Integer adminId) ;

}