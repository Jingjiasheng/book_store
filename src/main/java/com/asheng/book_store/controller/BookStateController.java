package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookState;
import com.asheng.book_store.service.BookStateService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BookState)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:26
 */
@RestController
@RequestMapping("bookState")
public class BookStateController {
    /**
     * 服务对象
     */
    @Resource
    private BookStateService bookStateService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BookState selectOne(Integer id) {
        return this.bookStateService.queryById(id);
    }

}