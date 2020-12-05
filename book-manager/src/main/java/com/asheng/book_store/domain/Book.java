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
    /**
     * 书籍在平台中存放的ID
     */
    private Integer bookId;
    /**
     * 书籍的ISBN
     */
    private String bookIsbn;
    /**
     * 书籍名称
     */
    private String bookName;
    /**
     * 书籍类别ID
     */
    private Integer bookCategoryId;
    /**
     * 书籍第一作者
     */
    private String bookAuthor;
    /**
     * 书籍出版社ID
     */
    private Integer booPressId;
    /**
     * 书籍在平台的上架时间
     */
    private String bookPublicationTime;
    /**
     * 书籍备注
     */
    private String bookRemarks;
    /**
     * 书籍官方零售价
     */
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