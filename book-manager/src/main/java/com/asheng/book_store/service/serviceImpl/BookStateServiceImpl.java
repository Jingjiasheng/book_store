package com.asheng.book_store.service.serviceImpl;


import com.asheng.book_store.dao.BookStateDao;
import com.asheng.book_store.domain.BookState;
import com.asheng.book_store.service.BookStateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BookState)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:25
 */
@Service("bookStateService")
public class BookStateServiceImpl implements BookStateService {
    @Resource
    private BookStateDao bookStateDao;


    @Override
    public Integer getBookStateCount() {
        return null;
    }

    @Override
    public List<BookState> getBookStateList() {
        return null;
    }

    @Override
    public List<BookState> getBookStateListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public BookState getBookStateByBookStateId(Integer bookStateId) {
        return null;
    }

    @Override
    public BookState updateBookStateByBookStateId(BookState bookState) {
        return null;
    }

    @Override
    public Integer deleteBookStateByBookStateId(Integer bookSateId) {
        return null;
    }

    @Override
    public BookState addBookState(BookState bookState) {
        return null;
    }
}