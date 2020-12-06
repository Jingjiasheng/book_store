package com.asheng.book_store.service.serviceImpl;


import com.asheng.book_store.dao.BookDao;
import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.BookAbout;
import com.asheng.book_store.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Book)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:20
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;


    @Override
    public Integer getBooksCount() {
        return null;
    }

    @Override
    public List<Book> getBookList(Integer limite) {
        return null;
    }

    @Override
    public Book getBookByBookId(Integer bookId) {
        return null;
    }

    @Override
    public List<Book> getBookListBySearch(String searchKey) {
        return null;
    }

    @Override
    public List<Book> getBooksByOthers(Integer bookCategoryId, Integer bookMinPrice, Integer bookMaxPrice, Integer cityId) {
        return null;
    }

    @Override
    public List<Book> getBooksByUserId(Integer userId) {
        return null;
    }

    @Override
    public Integer updateBookByBookId(Integer bookId) {
        return null;
    }

    @Override
    public Integer updateBookStateOffShelf(Integer bookId) {
        return null;
    }

    @Override
    public Integer addBookByUser(Book book, BookAbout bookAbout) {
        return null;
    }

    @Override
    public Integer deleteBookByBookId(Integer bookId) {
        return null;
    }

    @Override
    public List<Book> getBookListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public List<Book> getBookListByAdmin(Integer userId, String bookName, String bookIsbn, String bookAuthor, Integer cityId) {
        return null;
    }

    @Override
    public Book getBookAllInfoByBookId(Integer bookId) {
        return null;
    }

    @Override
    public Integer updateBookInfoByBookId(Integer bookId) {
        return null;
    }
}