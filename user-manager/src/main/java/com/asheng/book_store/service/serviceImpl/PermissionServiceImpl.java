package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.PermissionDao;
import com.asheng.book_store.domain.Permission;
import com.asheng.book_store.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (Permission)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:29
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionDao permissionDao;


    @Override
    public Integer getPermissionCount() {
        return null;
    }

    @Override
    public List<Permission> getPermissionList() {
        return null;
    }

    @Override
    public List<Permission> getPermissionListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public Permission getPermissionByPermissionId(Integer permissionId) {
        return null;
    }

    @Override
    public Permission updatePermissionByPermissionId(Permission permission) {
        return null;
    }

    @Override
    public Permission addPermission(Permission permission) {
        return null;
    }

    @Override
    public Integer deletePermissionByPermissionIds(HttpServletRequest request) {
        return null;
    }
}