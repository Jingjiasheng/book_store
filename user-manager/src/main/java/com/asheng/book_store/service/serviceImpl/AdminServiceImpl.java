package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.AdminDao;
import com.asheng.book_store.domain.Admin;
import com.asheng.book_store.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Admin)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:34:34
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;


    @Override
    public Integer getAdminCount() {
        return null;
    }

    @Override
    public List<Admin> getAdminListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public Admin getAdminByAdminId(Integer adminId) {
        return null;
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return null;
    }

    @Override
    public Admin updateAdminByAdminId(Admin admin) {
        return null;
    }

    @Override
    public Admin updateAdminAccountStateByAdminId(Integer adminId) {
        return null;
    }
}