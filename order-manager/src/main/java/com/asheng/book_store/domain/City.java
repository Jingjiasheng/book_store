package com.asheng.book_store.domain;

import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2020-12-02 14:32:56
 */
public class City implements Serializable {
    private static final long serialVersionUID = -80439607715456760L;
    
    private Integer cityId;
    
    private String cityExplain;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityExplain() {
        return cityExplain;
    }

    public void setCityExplain(String cityExplain) {
        this.cityExplain = cityExplain;
    }

}