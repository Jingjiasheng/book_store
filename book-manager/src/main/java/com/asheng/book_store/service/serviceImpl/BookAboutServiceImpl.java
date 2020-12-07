package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.BookAboutDao;
import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.service.BookAboutService;
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


    @Override
    public Integer getBookAboutCount() {
        return null;
    }

    @Override
    public Integer getBookAboutCountBybuyerId(Integer buyerId) {
        return null;
    }

    @Override
    public Integer getBookAboutCountBySellerId(Integer sellerId) {
        return null;
    }

    @Override
    public BookAbout getBookAboutByBookId(Integer bookId) {
        return null;
    }

    @Override
    public BookAbout getBookAllInfoByBookId(Integer bookId) {
        return null;
    }

    @Override
    public List<Book> getBooksBySellerId(Integer sellerId) {
        return null;
    }

    @Override
    public List<Book> getBooksByBuyerId(Integer buyerId) {
        return null;
    }

    @Override
    public List<BookAbout> getBookAboutListByBookIsbn(String bookIsbn) {
        return null;
    }

    @Override
    public List<BookAbout> getBookAboutList() {
        return null;
    }

    @Override
    public List<BookAbout> getBookAboutListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public BookAbout updateBookAboutByBookAboutId(BookAbout bookAbout) {
        return null;
    }

    @Override
    public BookAbout updateBookAboutStateOffShelf(Integer bookId) {
        return null;
    }

    @Override
    public BookAbout addBookAboutByUser(BookAbout bookAbout) {
        return null;
    }
}