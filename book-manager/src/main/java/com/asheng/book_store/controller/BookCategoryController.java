package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookCategory;
import com.asheng.book_store.service.BookCategoryService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BookCategory)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:23
 */
@Api(tags = "图书类别操作相关API",value = "这个是values，并不知道有什么作用！")
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