package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (BookPress)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class BookPress implements Serializable {
    private static final long serialVersionUID = 462806115189442181L;
    /**
     * 书籍出版社ID
     */
    private Integer bookPressId;
    /**
     * 书籍出版社名称
     */
    private String bookPressName;


    public Integer getBookPressId() {
        return bookPressId;
    }

    public void setBookPressId(Integer bookPressId) {
        this.bookPressId = bookPressId;
    }

    public String getBookPressName() {
        return bookPressName;
    }

    public void setBookPressName(String bookPressName) {
        this.bookPressName = bookPressName;
    }

}