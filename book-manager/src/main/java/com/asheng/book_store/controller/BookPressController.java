package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookPress;
import com.asheng.book_store.service.BookPressService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookPress)出版社
 *
 * @author makejava
 * @since 2020-12-02 14:35:25
 */
@Api(tags = "图书出版社相关操作API",value = "这个是values，并不知道有什么作用！")
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


    /**
     * 获取出版社总数
     */
    @RequestMapping("/getBookPressCount")
    @ResponseBody
    public Integer getBookPressCount(){

        return null;
    }

    /**
     * 查询出版社列表，含分页
     */
    @RequestMapping("/getBookListByLimit")
    @ResponseBody
    public List<BookPress> getBookListByLimit(Integer offset, Integer pageSize){

        return null;
    }

    /**
     * 查询出版社列表，含分页
     */
    @RequestMapping("/getBookList")
    @ResponseBody
    public List<BookPress> getBookList(){

        return null;
    }

    /**
     * 根据出版社Id查询出版社信息
     */
    @RequestMapping("/getBookPressByBookPressId")
    @ResponseBody
    public BookPress getBookPressByBookPressId(Integer bookPressId){

        return null;
    }

    /**
     *根据bookPressId修改出版社信息【包含编码与出版名称，务必保证与网络上一致】
     */
    @RequestMapping("/updateBookPressByBookPressId")
    @ResponseBody
    public Integer updateBookPressByBookPressId(Integer bookPressId){

        return null;
    }

    /**
     * 添加出版社信息
     */
    @RequestMapping("/addBookPress")
    @ResponseBody
    public BookPress addBookPress(BookPress bookPress){

        return null;
    }

    /**
     * 删除出版社信息，一般很少使用
     */
    @RequestMapping("/deleteBookPressByBookPressId")
    @ResponseBody
    public Integer deleteBookPressByBookPressId(Integer bookPressId){

        return null;
    }

}