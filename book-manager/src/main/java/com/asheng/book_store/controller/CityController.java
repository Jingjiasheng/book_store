package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.City;
import com.asheng.book_store.service.CityService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (City)城市信息控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:26
 */
@Api(tags = "城市信息进行相关操作的相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("city")
public class CityController {
    /**
     * 服务对象
     */
    @Resource
    private CityService cityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public City selectOne(Integer id) {
        return this.cityService.queryById(id);
    }


    //##############查询
    /**
     * 获取城市总数
     */
    @RequestMapping("/getCityCount")
    @ResponseBody
    public Integer getCityCount(){

        return null;
    }


    /**
     * 获取全部的城市列表信息用于加载下拉框，无需分页
     */
    @RequestMapping("/getCityList")
    @ResponseBody
    public List<City> getCityList(){

        return null;
    }

    /**
     * 根据cityId获取city信息
     */
    @RequestMapping("/getCityByCityId")
    @ResponseBody
    public City getCityByCityId(Integer cityId){

        return null;
    }

    /**
     * 实现添加cityId和city【注意：按照国家规定城市码与城市对应关系进行添加】
     */
    @RequestMapping("/addCity")
    @ResponseBody
    public ResultMsg addCity(City city){

        return null;
    }

    /**
     * 修改城市信息【包含cityId与cityName的修改】
     */
    @RequestMapping("/updateCityByCityId")
    @ResponseBody
    public ResultMsg updateCityByCityId(City city){

        return null;
    }

    /**
     * 删除城市信息【物理上删除！注意数据的准确性无务必删除！】
     */
    @RequestMapping("/deleteCityById")
    @ResponseBody
    public ResultMsg deleteCityById(Integer cityId){

        return null;
    }

}