package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (BookAbout)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class BookAbout implements Serializable {
    private static final long serialVersionUID = 861402345528892733L;
    
    private Integer bookId;
    
    private String bookOldDegree;
    
    private String bookPurchaseChannels;
    
    private Object bookUseAge;
    
    private Integer bookStateId;
    
    private Integer bookSellerId;
    
    private Integer bookBuyerId;
    
    private String bookDetailedAddress;
    
    private Integer bookCityId;


    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookOldDegree() {
        return bookOldDegree;
    }

    public void setBookOldDegree(String bookOldDegree) {
        this.bookOldDegree = bookOldDegree;
    }

    public String getBookPurchaseChannels() {
        return bookPurchaseChannels;
    }

    public void setBookPurchaseChannels(String bookPurchaseChannels) {
        this.bookPurchaseChannels = bookPurchaseChannels;
    }

    public Object getBookUseAge() {
        return bookUseAge;
    }

    public void setBookUseAge(Object bookUseAge) {
        this.bookUseAge = bookUseAge;
    }

    public Integer getBookStateId() {
        return bookStateId;
    }

    public void setBookStateId(Integer bookStateId) {
        this.bookStateId = bookStateId;
    }

    public Integer getBookSellerId() {
        return bookSellerId;
    }

    public void setBookSellerId(Integer bookSellerId) {
        this.bookSellerId = bookSellerId;
    }

    public Integer getBookBuyerId() {
        return bookBuyerId;
    }

    public void setBookBuyerId(Integer bookBuyerId) {
        this.bookBuyerId = bookBuyerId;
    }

    public String getBookDetailedAddress() {
        return bookDetailedAddress;
    }

    public void setBookDetailedAddress(String bookDetailedAddress) {
        this.bookDetailedAddress = bookDetailedAddress;
    }

    public Integer getBookCityId() {
        return bookCityId;
    }

    public void setBookCityId(Integer bookCityId) {
        this.bookCityId = bookCityId;
    }

}