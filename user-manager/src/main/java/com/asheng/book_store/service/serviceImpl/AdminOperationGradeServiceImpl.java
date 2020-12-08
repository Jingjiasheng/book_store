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


    @Override
    public Integer getAdminOperationGradeCount() {
        return null;
    }

    @Override
    public List<AdminOperationGrade> getAdminOperationList() {
        return null;
    }

    @Override
    public AdminOperationGrade getAdminOperationGradeByAdminOperationGradeId(Integer adminOperationGradeId) {
        return null;
    }

    @Override
    public AdminOperationGrade addAdminOperationGrade(AdminOperationGrade adminOperationGrade) {
        return null;
    }

    @Override
    public AdminOperationGrade updateAdminOperationGradeByAdminOperationGradeId(AdminOperationGrade adminOperationGrade) {
        return null;
    }

    @Override
    public Integer deleteAdminOperationGradeByAdminOperationGradeId(Integer adminOperationGradeId) {
        return null;
    }
}