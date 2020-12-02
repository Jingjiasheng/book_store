package com.asheng.book_store.domain.service.impl;

import com.asheng.book_store.domain.entity.AdminOperation;
import com.asheng.book_store.domain.dao.AdminOperationDao;
import com.asheng.book_store.domain.service.AdminOperationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AdminOperation)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:34:36
 */
@Service("adminOperationService")
public class AdminOperationServiceImpl implements AdminOperationService {
    @Resource
    private AdminOperationDao adminOperationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public AdminOperation queryById( ) {
        return this.adminOperationDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdminOperation> queryAllByLimit(int offset, int limit) {
        return this.adminOperationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adminOperation 实例对象
     * @return 实例对象
     */
    @Override
    public AdminOperation insert(AdminOperation adminOperation) {
        this.adminOperationDao.insert(adminOperation);
        return adminOperation;
    }

    /**
     * 修改数据
     *
     * @param adminOperation 实例对象
     * @return 实例对象
     */
    @Override
    public AdminOperation update(AdminOperation adminOperation) {
        this.adminOperationDao.update(adminOperation);
        return this.queryById(adminOperation.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.adminOperationDao.deleteById() > 0;
    }
}