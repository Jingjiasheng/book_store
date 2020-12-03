package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (BookState)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class BookState implements Serializable {
    private static final long serialVersionUID = 773774195941241659L;
    
    private Integer bookStateId;
    
    private String bookStateExplain;


    public Integer getBookStateId() {
        return bookStateId;
    }

    public void setBookStateId(Integer bookStateId) {
        this.bookStateId = bookStateId;
    }

    public String getBookStateExplain() {
        return bookStateExplain;
    }

    public void setBookStateExplain(String bookStateExplain) {
        this.bookStateExplain = bookStateExplain;
    }

}