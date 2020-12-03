package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.PermissionDao;
import com.asheng.book_store.domain.Permission;
import com.asheng.book_store.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象
     */
    @Override
    public Permission queryById(Integer permissionId) {
        return this.permissionDao.queryById(permissionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Permission> queryAllByLimit(int offset, int limit) {
        return this.permissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public Permission insert(Permission permission) {
        this.permissionDao.insert(permission);
        return permission;
    }

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public Permission update(Permission permission) {
        this.permissionDao.update(permission);
        return this.queryById(permission.getPermissionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer permissionId) {
        return this.permissionDao.deleteById(permissionId) > 0;
    }
}