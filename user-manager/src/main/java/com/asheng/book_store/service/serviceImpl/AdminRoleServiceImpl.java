package com.asheng.book_store.service.serviceImpl;


import com.asheng.book_store.dao.AdminRoleDao;
import com.asheng.book_store.domain.Admin;
import com.asheng.book_store.domain.AdminRole;
import com.asheng.book_store.domain.Role;
import com.asheng.book_store.service.AdminRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (AdminRole)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:18
 */
@Service("adminRoleService")
public class AdminRoleServiceImpl implements AdminRoleService {
    @Resource
    private AdminRoleDao adminRoleDao;


    @Override
    public Integer getAdminRoleCount() {
        return null;
    }

    @Override
    public List<Role> getRolesByAdminId(Integer adminId) {
        return null;
    }

    @Override
    public List<Admin> getAdminsByRoleId(Integer roleId) {
        return null;
    }

    @Override
    public Integer addRolesToAdminByAdminId(HttpServletRequest request) {
        return null;
    }

    @Override
    public Integer addAdminsToRole(HttpServletRequest request) {
        return null;
    }

    @Override
    public Integer removeRolesFromAdmin(HttpServletRequest request) {
        return null;
    }

    @Override
    public Integer removeAdminsFromRole(HttpServletRequest request) {
        return null;
    }
}