package com.asheng.book_store.domain.controller;

import com.asheng.book_store.domain.entity.BookCategory;
import com.asheng.book_store.domain.service.BookCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BookCategory)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:23
 */
@RestController
@RequestMapping("bookCategory")
public class BookCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private BookCategoryService bookCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BookCategory selectOne(Integer id) {
        return this.bookCategoryService.queryById(id);
    }

}