package com.asheng.book_store.service;

import com.asheng.book_store.domain.BookPress;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * (BookPress)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:23
 */
public interface BookPressService {

    /**
     * 获取出版社总数
     * @return 出版社
     */
    public Integer getBookPressCount();

    /**
     * 查询出版社列表，含分页
     * @param offset 数据起始位置
     * @param pageSize 每页的数据量大小
     * @return
     */
    public List<BookPress> getBookListByLimit(Integer offset, Integer pageSize);

    /**
     * 查询出版社列表，不分页
     */
    public List<BookPress> getBookList();

    /**
     * 根据出版社Id查询出版社信息
     * @param bookPressId 出版社ID
     * @return 出版社信息
     */
    public BookPress getBookPressByBookPressId(Integer bookPressId);

    /**
     * 根据bookPressId修改出版社信息【包含编码与出版名称，务必保证与网络上一致】
     * @param bookPress 出版社信息
     * @return 修改的数量
     */
    public BookPress updateBookPressByBookPressId(BookPress bookPress);

    /**
     * 添加出版社信息
     * @param bookPress 出版社信息
     * @return 添加出版社的数量
     */
    public BookPress addBookPress(BookPress bookPress);

    /**
     * 删除出版社信息，物理删除
     * @param bookPressId 出版社ID
     * @return 删除的数量
     */
    public Integer deleteBookPressByBookPressId(Integer bookPressId);
}