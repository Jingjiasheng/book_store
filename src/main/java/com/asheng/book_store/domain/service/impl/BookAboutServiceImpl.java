package com.asheng.book_store.domain.service.impl;

import com.asheng.book_store.domain.entity.BookAbout;
import com.asheng.book_store.domain.dao.BookAboutDao;
import com.asheng.book_store.domain.service.BookAboutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookAbout)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:21
 */
@Service("bookAboutService")
public class BookAboutServiceImpl implements BookAboutService {
    @Resource
    private BookAboutDao bookAboutDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public BookAbout queryById( ) {
        return this.bookAboutDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BookAbout> queryAllByLimit(int offset, int limit) {
        return this.bookAboutDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bookAbout 实例对象
     * @return 实例对象
     */
    @Override
    public BookAbout insert(BookAbout bookAbout) {
        this.bookAboutDao.insert(bookAbout);
        return bookAbout;
    }

    /**
     * 修改数据
     *
     * @param bookAbout 实例对象
     * @return 实例对象
     */
    @Override
    public BookAbout update(BookAbout bookAbout) {
        this.bookAboutDao.update(bookAbout);
        return this.queryById(bookAbout.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.bookAboutDao.deleteById() > 0;
    }
}