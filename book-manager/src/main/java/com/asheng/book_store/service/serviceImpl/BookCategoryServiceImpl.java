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


    @Override
    public Integer getBookCategoryCount() {
        return null;
    }

    @Override
    public List<BookCategory> getBookCategoryList() {
        return null;
    }

    @Override
    public List<BookCategory> getBookCategoryBylimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public BookCategory getBookCategoryByBookCategoryId(Integer bookCategoryId) {
        return null;
    }

    @Override
    public Integer getBookCountByBookCateporyId(Integer bookCategoryId) {
        return null;
    }

    @Override
    public BookCategory addBookCategory(BookCategory bookCategory) {
        return null;
    }

    @Override
    public BookCategory updateBookCategoryByBookCategoryId(BookCategory bookCategory) {
        return null;
    }

    @Override
    public Integer deleteBookCategoryByBookCategoryId(Integer bookCategoryId) {
        return null;
    }
}