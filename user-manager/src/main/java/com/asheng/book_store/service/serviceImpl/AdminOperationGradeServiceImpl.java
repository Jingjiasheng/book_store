package com.asheng.book_store.service.serviceImpl;


import com.asheng.book_store.dao.AdminOperationGradeDao;
import com.asheng.book_store.domain.AdminOperationGrade;
import com.asheng.book_store.service.AdminOperationGradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AdminOperationGrade)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:15
 */
@Service("adminOperationGradeService")
public class AdminOperationGradeServiceImpl implements AdminOperationGradeService {
    @Resource
    private AdminOperationGradeDao adminOperationGradeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param adminOperationGradeId 主键
     * @return 实例对象
     */
    @Override
    public AdminOperationGrade queryById(Integer adminOperationGradeId) {
        return this.adminOperationGradeDao.queryById(adminOperationGradeId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdminOperationGrade> queryAllByLimit(int offset, int limit) {
        return this.adminOperationGradeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adminOperationGrade 实例对象
     * @return 实例对象
     */
    @Override
    public AdminOperationGrade insert(AdminOperationGrade adminOperationGrade) {
        this.adminOperationGradeDao.insert(adminOperationGrade);
        return adminOperationGrade;
    }

    /**
     * 修改数据
     *
     * @param adminOperationGrade 实例对象
     * @return 实例对象
     */
    @Override
    public AdminOperationGrade update(AdminOperationGrade adminOperationGrade) {
        this.adminOperationGradeDao.update(adminOperationGrade);
        return this.queryById(adminOperationGrade.getAdminOperationGradeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param adminOperationGradeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer adminOperationGradeId) {
        return this.adminOperationGradeDao.deleteById(adminOperationGradeId) > 0;
    }
}