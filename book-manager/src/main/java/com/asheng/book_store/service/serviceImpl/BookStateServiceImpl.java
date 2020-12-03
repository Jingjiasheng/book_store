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

    /**
     * 通过ID查询单条数据
     *
     * @param bookStateId 主键
     * @return 实例对象
     */
    @Override
    public BookState queryById(Integer bookStateId) {
        return this.bookStateDao.queryById(bookStateId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BookState> queryAllByLimit(int offset, int limit) {
        return this.bookStateDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bookState 实例对象
     * @return 实例对象
     */
    @Override
    public BookState insert(BookState bookState) {
        this.bookStateDao.insert(bookState);
        return bookState;
    }

    /**
     * 修改数据
     *
     * @param bookState 实例对象
     * @return 实例对象
     */
    @Override
    public BookState update(BookState bookState) {
        this.bookStateDao.update(bookState);
        return this.queryById(bookState.getBookStateId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bookStateId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bookStateId) {
        return this.bookStateDao.deleteById(bookStateId) > 0;
    }
}