package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookState;
import com.asheng.book_store.service.BookStateService;
import io.swagger.annotations.Api;
import org.jvnet.staxex.BinaryText;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookState)图书状态控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:26
 */
@Api(tags = "图书状态管理相关API",value = "这个是values，并不知道有什么作用！")
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

    /**
     * 获取状态总数
     */
    @RequestMapping("/getBookStateCount")
    @ResponseBody
    public Integer getBookStateCount(){

        return null;
    }

    /**
     * 查询所有的状态信息列表
     */
    @RequestMapping("/getBookStateList")
    @ResponseBody
    public List<BookState> getBookStateList(){

        return null;
    }


    /**
     * 查询分页的状态信息列表
     */
    @RequestMapping("/getBookStateListByLimit")
    @ResponseBody
    public List<BookState> getBookStateListByLimit(Integer offset, Integer PageSize){

        return null;
    }



    /**
     * 根据stateId查询state信息
     */
    @RequestMapping("/getBookStateByBookStateId")
    @ResponseBody
    public BookState getBookStateByBookStateId(Integer bookStateId){

        return null;
    }


    /**
     * 根据stateId修改state信息
     */
    @RequestMapping("/updateBookStateByBookStateId")
    @ResponseBody
    public Integer updateBookStateByBookStateId(){

        return null;
    }

    /**
     * 删除状态信息【物理删除根据stateId】
     */
    @RequestMapping("/deleteBookStateByBookStateId")
    @ResponseBody
    public Integer deleteBookStateByBookStateId(){

        return null;
    }

    /**
     * 添加图书状态信息
     */
    @RequestMapping("/addBookState")
    @ResponseBody
    public Integer addBookState(){

        return null;
    }



}