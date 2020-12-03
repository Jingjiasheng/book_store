package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Book;
import com.asheng.book_store.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Book)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:20
 */
@RestController
@RequestMapping("book")
public class BookController {
    /**
     * 服务对象
     */
    @Resource
    private BookService bookService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Book selectOne(Integer id) {
        return this.bookService.queryById(id);
    }

}