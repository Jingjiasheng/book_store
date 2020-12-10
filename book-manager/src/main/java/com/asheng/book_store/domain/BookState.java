package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (BookState)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class BookState implements Serializable {
    //未发布
    private static final long NOT_PUBLISH = 201;
    //正在发布，暂未购买
    private static final long PUBLISHING = 202;
    //正在交易
    private static final long TRANSACTION = 203;
    //被购买
    private static final long PURCHASED = 204;
    //已下架
    private static final long OFF_THE_SHELF = 205;
    //被删除
    private static final long DELETED = 206;

    private static final long serialVersionUID = 773774195941241659L;
    /**
     * 书籍在平台中存放的状态ID
     */
    private Integer bookStateId;
    /**
     * 书籍在平台中存放的状态ID
     */
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