package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.RolePermissionDao;
import com.asheng.book_store.domain.Permission;
import com.asheng.book_store.domain.Role;
import com.asheng.book_store.domain.RolePermission;
import com.asheng.book_store.service.RolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (RolePermission)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:31
 */
@Service("rolePermissionService")
public class RolePermissionServiceImpl implements RolePermissionService {
    @Resource
    private RolePermissionDao rolePermissionDao;


    @Override
    public Integer getRolePermissionCount() {
        return null;
    }

    @Override
    public List<RolePermission> getRolePermissionList() {
        return null;
    }

    @Override
    public List<Permission> getPermissionsByRoleId(Integer roleId) {
        return null;
    }

    @Override
    public List<Role> getRolesByPermissionId(Integer permissionId) {
        return null;
    }

    @Override
    public Integer addPermissionToRole(HttpServletRequest request) {
        return null;
    }

    @Override
    public Integer addRolesToPermission(HttpServletRequest request) {
        return null;
    }

    @Override
    public Integer removePermissionsFromRole(HttpServletRequest request) {
        return null;
    }

    @Override
    public Integer removeRolesFromPermission(HttpServletRequest request) {
        return null;
    }
}