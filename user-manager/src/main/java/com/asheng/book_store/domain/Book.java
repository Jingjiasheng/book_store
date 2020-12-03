package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (Book)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 618258460056886890L;
    
    private Integer bookId;
    
    private String bookIsbn;
    
    private String bookName;
    
    private Integer bookCategoryId;
    
    private String bookAuthor;
    
    private Integer booPressId;
    
    private String bookPublicationTime;
    
    private String bookRemarks;
    
    private Double bookOriginalPrice;


    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Integer getBooPressId() {
        return booPressId;
    }

    public void setBooPressId(Integer booPressId) {
        this.booPressId = booPressId;
    }

    public String getBookPublicationTime() {
        return bookPublicationTime;
    }

    public void setBookPublicationTime(String bookPublicationTime) {
        this.bookPublicationTime = bookPublicationTime;
    }

    public String getBookRemarks() {
        return bookRemarks;
    }

    public void setBookRemarks(String bookRemarks) {
        this.bookRemarks = bookRemarks;
    }

    public Double getBookOriginalPrice() {
        return bookOriginalPrice;
    }

    public void setBookOriginalPrice(Double bookOriginalPrice) {
        this.bookOriginalPrice = bookOriginalPrice;
    }

}