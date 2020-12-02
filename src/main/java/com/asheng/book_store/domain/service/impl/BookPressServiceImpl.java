package com.asheng.book_store.domain.service.impl;

import com.asheng.book_store.domain.entity.BookPress;
import com.asheng.book_store.domain.dao.BookPressDao;
import com.asheng.book_store.domain.service.BookPressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookPress)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:24
 */
@Service("bookPressService")
public class BookPressServiceImpl implements BookPressService {
    @Resource
    private BookPressDao bookPressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bookPressId 主键
     * @return 实例对象
     */
    @Override
    public BookPress queryById(Integer bookPressId) {
        return this.bookPressDao.queryById(bookPressId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BookPress> queryAllByLimit(int offset, int limit) {
        return this.bookPressDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bookPress 实例对象
     * @return 实例对象
     */
    @Override
    public BookPress insert(BookPress bookPress) {
        this.bookPressDao.insert(bookPress);
        return bookPress;
    }

    /**
     * 修改数据
     *
     * @param bookPress 实例对象
     * @return 实例对象
     */
    @Override
    public BookPress update(BookPress bookPress) {
        this.bookPressDao.update(bookPress);
        return this.queryById(bookPress.getBookPressId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bookPressId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bookPressId) {
        return this.bookPressDao.deleteById(bookPressId) > 0;
    }
}