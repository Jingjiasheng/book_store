package com.asheng.book_store.service;


import com.asheng.book_store.domain.City;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * (City)表服务接口
 *
 * @author makejava
 * @since 2020-12-02 14:35:26
 */
public interface CityService {


    /**
     * 获取城市总数
     */
    public Integer getCityCount();

    /**
     * 获取全部的城市列表信息用于加载下拉框，无需分页
     */
    public List<City> getCityList();

    /**
     * 获取全部的城市列表信息用于加载下拉框，无需分页
     */
    public List<City> getCityListByLimit(Integer offset,Integer pageSize);

    /**
     * 根据cityId获取city信息
     */
    public City getCityByCityId(Integer cityId);

    /**
     * 实现添加cityId和city【注意：按照国家规定城市码与城市对应关系进行添加】
     */
    public City addCity(City city);

    /**
     * 修改城市信息【包含cityNumber与cityName的修改】
     */
    public City updateCityByCityId(City city);

    /**
     * 删除城市信息【物理上删除！注意数据的准确性无务必删除！】
     */
    public Integer deleteCityById(Integer cityId);

}