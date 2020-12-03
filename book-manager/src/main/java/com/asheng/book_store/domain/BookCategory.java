package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (BookCategory)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class BookCategory implements Serializable {
    private static final long serialVersionUID = 798701299824803130L;
    
    private Integer bookCategoryId;
    
    private String bookCategoryExplain;


    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public String getBookCategoryExplain() {
        return bookCategoryExplain;
    }

    public void setBookCategoryExplain(String bookCategoryExplain) {
        this.bookCategoryExplain = bookCategoryExplain;
    }

}