package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.RoleDao;
import com.asheng.book_store.domain.Role;
import com.asheng.book_store.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Role)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:30
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;


    @Override
    public Integer getRoleCount() {
        return null;
    }

    @Override
    public List<Role> getRoleList() {
        return null;
    }

    @Override
    public List<Role> getRoleListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public Role getRoleByRoleId(Integer roleId) {
        return null;
    }

    @Override
    public Role addRole(Role role) {
        return null;
    }

    @Override
    public Role updateRoleByRoleId(Role role) {
        return null;
    }

    @Override
    public Integer deleteRoleByRoleId(Integer roleId) {
        return null;
    }
}