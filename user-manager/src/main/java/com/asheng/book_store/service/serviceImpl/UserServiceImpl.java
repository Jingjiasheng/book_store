package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.UserDao;
import com.asheng.book_store.domain.User;
import com.asheng.book_store.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:32
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


    @Override
    public Integer getUserCount() {
        return null;
    }

    @Override
    public Integer getUserByUserRegistrationTime(String startTime, String endTime) {
        return null;
    }

    @Override
    public List<User> getUserListByLimit(Integer offset, Integer pageSizes) {
        return null;
    }

    @Override
    public List<User> getUserListByOther(User user) {
        return null;
    }

    @Override
    public User getUserByUserId(Integer userId) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUserByUserId(User user) {
        return null;
    }

    @Override
    public User updateUserAccountStateByUserId(Integer userId) {
        return null;
    }
}