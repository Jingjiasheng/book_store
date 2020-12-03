package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.service.BookAboutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BookAbout)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:22
 */
@RestController
@RequestMapping("bookAbout")
public class BookAboutController {
    /**
     * 服务对象
     */
    @Resource
    private BookAboutService bookAboutService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BookAbout selectOne(int id) {
        return this.bookAboutService.queryById(id);
    }

}