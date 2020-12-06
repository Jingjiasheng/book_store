package com.asheng.book_store.controller;

import com.asheng.book_store.domain.BookCategory;
import com.asheng.book_store.service.BookCategoryService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookCategory)图书分类控制层
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

    /**
     * 获取分类总数
     * @return 总记录数
     */
    @RequestMapping("/getBookCategoryCount")
    @ResponseBody
    public Integer getBookCategoryCount(){

        return null;
    }

    /**
     * 获取图书分类的全部列表
     * @return 分类列表
     */
    @RequestMapping("/getBookCategoryList")
    @ResponseBody
    public List<BookCategory> getBookCategoryList(){

        return null;
    }

    /**
     * 按照分页获取图书分类列表
     * @param offset 起始位置
     * @param pageSize 每页的记录数
     * @return 返回分类列表
     */
    @RequestMapping("/getBookCategoryBylimit")
    @ResponseBody
    public List<BookCategory> getBookCategoryBylimit(Integer offset,Integer pageSize){

        return null;
    }

    /**
     * 根据分类Id进行分类信息的查询
     * @param bookCategoryId 图书分类的ID
     * @return 返回分类信息
     */
    @RequestMapping("/getBookCategoryByBookCategoryId")
    @ResponseBody
    public BookCategory getBookCategoryByBookCategoryId(Integer bookCategoryId){

        return null;
    }

    /**
     * 根据分类的Id该分类下图书的数量
     * @param bookCategoryId 分类的Id
     * @return 图书的数量
     */
    @RequestMapping("/getBookCountByBookId")
    @ResponseBody
    public Object getBookCountByBookCateporyId(Integer bookCategoryId){

        return null;
    }

    /**
     * 添加图书分类
     * @param bookCategory 分类信息
     * @return 返回影响的记录数
     */
    @RequestMapping("/addBookCategory")
    @ResponseBody
    public Integer addBookCategory(BookCategory bookCategory){

        return null;
    }

    /**
     * 根据bookCategoryId修改某个分类的信息
     * @param bookCategory 修改后的分类信息
     * @return
     */
    @RequestMapping("/updateBookCategoryByBookCategoryId")
    @ResponseBody
    public Integer updateBookCategoryByBookCategoryId(BookCategory bookCategory){

        return null;
    }

    @RequestMapping("/deleteBookCategoryByBookCategoryId")
    @ResponseBody
    public Integer deleteBookCategoryByBookCategoryId(Integer bookCategoryid){

        return null;
    }
}