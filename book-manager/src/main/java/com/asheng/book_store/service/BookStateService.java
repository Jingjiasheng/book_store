package com.asheng.book_store.service;


import com.asheng.book_store.domain.BookState;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * (BookState)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:25
 */
public interface BookStateService {

    /**
     * 获取图书状态总数
     * @return 图书状态总数
     */
    public Integer getBookStateCount();

    /**
     * 查询所有的状态信息列表
     * @return 状态信息列表
     */
    public List<BookState> getBookStateList();


    /**
     * 查询分页的状态信息列表
     * @param offset 数据起始位置
     * @param pageSize 数据量大小
     * @return 状态列表
     */
    public List<BookState> getBookStateListByLimit(Integer offset, Integer pageSize);


    /**
     * 根据stateId查询state信息
     * @param bookStateId 图书状态ID
     * @return 图书状态信息
     */
    public BookState getBookStateByBookStateId(Integer bookStateId);


    /**
     * 根据stateId修改state信息
     * @param bookState 图书状态信息
     * @return 修改的记录数
     */
    public BookState updateBookStateByBookStateId(BookState bookState);

    /**
     * 删除状态信息【物理删除根据stateId】
     * @param bookSateId 图书状态ID
     * @return 删除的数量
     */
    public Integer deleteBookStateByBookStateId(Integer bookSateId);

    /**
     * 添加图书状态信息
     * @param bookState 图书状态信息
     * @return
     */
    public BookState addBookState(BookState bookState);

}