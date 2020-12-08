package com.asheng.book_store.service.serviceImpl;


import com.asheng.book_store.dao.AdminOperationDao;
import com.asheng.book_store.domain.AdminOperation;
import com.asheng.book_store.service.AdminOperationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (AdminOperation)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:13
 */
@Service("adminOperationService")
public class AdminOperationServiceImpl implements AdminOperationService {
    @Resource
    private AdminOperationDao adminOperationDao;


    @Override
    public Integer getAdminOperationCount() {
        return null;
    }

    @Override
    public List<AdminOperation> getAdminOperationListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public List<AdminOperation> getAdminOperationListByOther(AdminOperation adminOperation) {
        return null;
    }

    @Override
    public AdminOperation addAdminOperation(AdminOperation adminOperation) {
        return null;
    }

    @Override
    public Integer deleteAdminOperation(HttpServletRequest request) {
        return null;
    }

    @Override
    public AdminOperation getAdminOperationByAdminOperationId(Integer adminOperationId) {
        return null;
    }
}