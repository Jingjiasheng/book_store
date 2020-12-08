package com.asheng.book_store.service;

import com.asheng.book_store.domain.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:32
 */
public interface UserService {

    /**
     * 获取用户总数
     * @return 用户数量
     */
    public Integer getUserCount( ) ;


    /**
     * 根据注册时间段获取注册的用户数量【时间起点-时间终点】【其他条件如年龄，性别】
     * @param startTime 时间起点
     * @param endTime 时间终点
     * @return 用户数量
     */
    public Integer getUserByUserRegistrationTime(String startTime, String endTime) ;


    /**
     * 查询所有用户列表
     * @param offset 起始位置
     * @param pageSizes 每页的数据大小
     * @return 用户列表
     */
    public List<User> getUserListByLimit(Integer offset,Integer pageSizes) ;


    /**
     * 按照条件查询用户列表
     * @param user 包含筛选条件的用户信息
     * @return 用户列表
     */
    public List<User> getUserListByOther(User user);


    /**
     * 根据用户ID获取用户的详细信息
     * @param userId 用户ID
     * @return 用户的详细信息
     */
    public User getUserByUserId(Integer userId);


    /**
     * 新添加一个用户即
     * @param user 用户的注册信息
     * @return 用户信息
     */
    public User addUser(User user) ;


    /**
     * 修改用户信息
     * @param user 用户ID
     * @return 修改后的用户信息
     */
    public User updateUserByUserId(User user) ;


    /**
     * 更改用户的账户状态【禁用或启用】
     * @param userId 用户状态
     * @return 用户修改后的信息
     */
    public User updateUserAccountStateByUserId(Integer userId) ;

}