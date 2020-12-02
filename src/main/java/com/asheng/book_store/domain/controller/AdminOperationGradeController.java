package com.asheng.book_store.domain.controller;

import com.asheng.book_store.domain.entity.AdminOperationGrade;
import com.asheng.book_store.domain.service.AdminOperationGradeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AdminOperationGrade)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:17
 */
@RestController
@RequestMapping("adminOperationGrade")
public class AdminOperationGradeController {
    /**
     * 服务对象
     */
    @Resource
    private AdminOperationGradeService adminOperationGradeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdminOperationGrade selectOne(Integer id) {
        return this.adminOperationGradeService.queryById(id);
    }

}