package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.BookCategoryDao;
import com.asheng.book_store.domain.BookCategory;
import com.asheng.book_store.service.BookCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:22
 */
@Service("bookCategoryService")
public class BookCategoryServiceImpl implements BookCategoryService {
    @Resource
    private BookCategoryDao bookCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bookCategoryId 主键
     * @return 实例对象
     */
    @Override
    public BookCategory queryById(Integer bookCategoryId) {
        return this.bookCategoryDao.queryById(bookCategoryId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BookCategory> queryAllByLimit(int offset, int limit) {
        return this.bookCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bookCategory 实例对象
     * @return 实例对象
     */
    @Override
    public BookCategory insert(BookCategory bookCategory) {
        this.bookCategoryDao.insert(bookCategory);
        return bookCategory;
    }

    /**
     * 修改数据
     *
     * @param bookCategory 实例对象
     * @return 实例对象
     */
    @Override
    public BookCategory update(BookCategory bookCategory) {
        this.bookCategoryDao.update(bookCategory);
        return this.queryById(bookCategory.getBookCategoryId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bookCategoryId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bookCategoryId) {
        return this.bookCategoryDao.deleteById(bookCategoryId) > 0;
    }
}