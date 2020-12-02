package com.asheng.book_store.domain.controller;

import com.asheng.book_store.domain.entity.BookPress;
import com.asheng.book_store.domain.service.BookPressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BookPress)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:25
 */
@RestController
@RequestMapping("bookPress")
public class BookPressController {
    /**
     * 服务对象
     */
    @Resource
    private BookPressService bookPressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BookPress selectOne(Integer id) {
        return this.bookPressService.queryById(id);
    }

}