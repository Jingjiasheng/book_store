package com.asheng.book_store.service.serviceImpl;


import com.asheng.book_store.dao.BookPressDao;
import com.asheng.book_store.domain.BookPress;
import com.asheng.book_store.service.BookPressService;
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


    @Override
    public Integer getBookPressCount() {
        return null;
    }

    @Override
    public List<BookPress> getBookListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public List<BookPress> getBookList() {
        return null;
    }

    @Override
    public BookPress getBookPressByBookPressId(Integer bookPressId) {
        return null;
    }

    @Override
    public BookPress updateBookPressByBookPressId(BookPress bookPress) {
        return null;
    }

    @Override
    public BookPress addBookPress(BookPress bookPress) {
        return null;
    }

    @Override
    public Integer deleteBookPressByBookPressId(Integer bookPressId) {
        return null;
    }
}