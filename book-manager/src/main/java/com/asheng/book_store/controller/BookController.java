package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.service.BookAboutService;
import com.asheng.book_store.service.BookService;
import com.asheng.book_store.service.CityService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Book)图书基本信息控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:20
 */
@Api(tags = "图书基本信息操作相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("/book")
public class BookController {
    /**
     * 服务对象
     */
    @Resource
    private BookService bookService;

    private BookAboutService bookAboutService;

    private CityService cityService;

    //###########图书查询相关操作

    /**
     * 获取图书入库的总册数【说明：总册数指的是不同的书籍，不是不同用户发布的两本相同的书籍】
     * @return 入册数量
     */
    @ApiOperation(value="获取图书入库的总册数",notes="总册数指的是不同的书籍，不是不同用户发布的两本相同的书籍!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookCount")
    @ResponseBody
    public ResultMsg getBooksCount(){
        ResultMsg<Integer> resultMsg = new ResultMsg<>();
        return ResultMsg.SUCCESS;
    }


    /**
     * 用户浏览图书列表
     * 需要显示的字段：图书ID，图书名称，图书分类，图书作者，图书出版社，所在城市，图书封面,官方原价，现在售价，发布人，
     * @param offset 数据起始位置
     * @param limite 每页的数据量
     * @return 图书列表
     */
    @ApiOperation(value="用户浏览图书列表",notes="用户浏览分页!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="数据起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="limite",value="每页的数据量",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBooksList")
    @ResponseBody
    public List<Book> getBookList(@RequestParam(value = "offset",defaultValue = "1")Integer offset, @RequestParam(value = "limit",defaultValue = "10")Integer limite){
        return null;
    }

    /**
     * 用户根据bookIsbn获取一本图书的基础信息
     * @param bookIsbn 图书ISBN
     * @return 图书的基础信息
     */
    @ApiOperation(value="用户根据bookId获取一本图书的详细信息",notes="图书ISBN!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookIsbn",value="图书ISBN",required=true,paramType="String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookByBookId")
    @ResponseBody
    public Book getBookByBookId(Integer bookIsbn){

        return null;
    }

    /**
     * 用户根据条件查询数据-搜索框数据
     * @param searchKey 搜索关键字
     * @return 返回书籍列表
     */
    @ApiOperation(value="用户根据条件查询数据-搜索框数据",notes="随便传入!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="searchKey",value="搜索关键字",required=true,paramType="String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookListBySearch")
    @ResponseBody
    public List<Book> getBookListBySearch(String searchKey){
        return null;
    }


    /**
     * 根据筛选条件筛选图书-筛选选项
     * @param bookCategoryId 图书分类ID
     * @param bookMinPrice 图书最低价格
     * @param bookMaxPrice 图书最高价格
     * @param cityId 城市
     * @return 符合条件的图书列表
     */
    @ApiOperation(value="根据筛选条件筛选图书-筛选选项",notes="下拉框选择筛选条件")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookCategoryId",value="图书分类ID",required=true,paramType="Integer"),
            @ApiImplicitParam(name="bookMinPrice",value="图书最低价格",required=true,paramType="Float"),
            @ApiImplicitParam(name="bookMaxPrice",value="图书最高价格",required=true,paramType="Float"),
            @ApiImplicitParam(name="cityId",value="城市",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBooksByOthers")
    @ResponseBody
    public List<Book> getBooksByOthers(Integer bookCategoryId,Integer bookMinPrice,Integer bookMaxPrice,Integer cityId){

        return null;
    }



    //###########图书修改相关操作

    /**
     * 管理员根据图书Isbn修改发布的图书信息
     * @param book 图书基本信息
     * @return 修改的记录数
     */
    @ApiOperation(value="管理员根据图书Isbn修改发布的图书信息",notes="需要参数bookISBN!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="book",value="图书基本信息",required=true,paramType="Book")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/updateBookByBookIsbn")
    @ResponseBody
    public ResultMsg updateBookByBookIsbn(Book book){

        return null;
    }

    /**
     * 一键下架所有的一款图书实现
     * @param bookIsbn 下架图书的bookISBN
     * @return
     */
    @ApiOperation(value="一键下架所有的一款图书实现",notes="需要参数bookISBN!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookIsbn",value="下架图书的bookISBN",required=true,paramType="String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/updateBookStateOffShelfByBookIsbn")
    @ResponseBody
    public ResultMsg updateBookStateOffShelf(Integer bookIsbn){

        return null;
    }


    /**
     * 用户添加图书信息【在用户发布图书的时候进行添加，但是用户发布的图书信息需要经过管理员确定】
     * @param book 图书信息
     * @return 影响的行数
     */
    @ApiOperation(value="用户添加图书信息",notes="在用户发布图书的时候进行添加，但是用户发布的图书信息需要经过管理员确定!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="book",value="图书信息",required=true,paramType="Book")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/addBookBySeller")
    @ResponseBody
    public ResultMsg addBookByUser(Book book ){

        return null;
    }


    /**
     * 管理员添加图书信息
     * @param book 添加的书籍信息
     * @return 影响的行数
     */
    @ApiOperation(value="管理员添加图书信息",notes="传入图书基本信息!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="book",value="添加的书籍信息",required=true,paramType="Book")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/addBookByAdmin")
    @ResponseBody
    public ResultMsg addBookByAdmin(Book book ){

        return null;
    }


    //###########图书删除相关操作

    /**
     * 与下架不同，下架图书在用户订单列表仍然可以显示，用户有机会进行再次上架和修改信息，但是删除之后数据库保留数据，更改状态为删除
     * @param bookIsbn 书籍ISBN
     * @return
     */
    @ApiOperation(value="删除上架的一册图书",notes="逻辑删除一本书籍!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookIsbn",value="书籍ISBN",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/deleteBookByBookIsbn")
    @ResponseBody
    public ResultMsg deleteBookByBookIsbn(String bookIsbn){

        return null;
    }


    //================================================================================后台页面请求
    //#########图书查询相关操作

    /**
     * 获取图书主要信息列表用于展示，并分页
     * @param offset 数据起始位置
     * @param pageSize 每页数据量大小
     * @return 图书列表
     */
    @ApiOperation(value="获取图书主要信息列表用于展示，并分页",notes="需要分页参数!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="数据起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="每页数据量大小",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookListByLimit")
    @ResponseBody
    public List<Book> getBookListByLimit(Integer offset,Integer pageSize){

        return null;
    }


    /**
     * 根据条件查询书籍信息列表，主要筛选条件有：bookName,bookIsbn,bookAuthor,
     * @param bookName 图书名称
     * @param bookIsbn 图书ISBN
     * @param bookAuthor 图书作者
     * @return 图书列表
     */
    @ApiOperation(value="根据条件查询书籍信息列表",notes="要筛选条件有：bookName,bookIsbn,bookAuthor!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="bookName",value="图书名称",required=true,paramType="session"),
            @ApiImplicitParam(name="bookIsbn",value="图书ISBN",required=true,paramType="session"),
            @ApiImplicitParam(name="bookAuthor",value="图书作者",required=true,paramType="session")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getBookListByAdmin")
    @ResponseBody
    public List<Book> getBookListByAdmin(String bookName,String bookIsbn,String bookAuthor){

        return null;
    }

}