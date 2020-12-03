package com.asheng.book_store.service.serviceImpl;


import com.asheng.book_store.dao.AdminRoleDao;
import com.asheng.book_store.domain.AdminRole;
import com.asheng.book_store.service.AdminRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    /**
     * 通过ID查询单条数据
     *
     * @param adminRoleId 主键
     * @return 实例对象
     */
    @Override
    public AdminRole queryById(Integer adminRoleId) {
        return this.adminRoleDao.queryById(adminRoleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdminRole> queryAllByLimit(int offset, int limit) {
        return this.adminRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adminRole 实例对象
     * @return 实例对象
     */
    @Override
    public AdminRole insert(AdminRole adminRole) {
        this.adminRoleDao.insert(adminRole);
        return adminRole;
    }

    /**
     * 修改数据
     *
     * @param adminRole 实例对象
     * @return 实例对象
     */
    @Override
    public AdminRole update(AdminRole adminRole) {
        this.adminRoleDao.update(adminRole);
        return this.queryById(adminRole.getAdminRoleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param adminRoleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer adminRoleId) {
        return this.adminRoleDao.deleteById(adminRoleId) > 0;
    }
}