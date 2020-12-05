package com.asheng.book_store.controller;

import com.asheng.book_store.domain.City;
import com.asheng.book_store.service.CityService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (City)城市信息控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:26
 */
@Api(tags = "对城市信息进行相关操作的相关API",value = "这个是values，并不知道有什么作用！")
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


    /**
     * 获取全部的城市列表信息用于加载下拉框，无需分页
     */

    /**
     * 根绝cityId获取city信息
     */

    /**
     * 实现添加cityId和city【注意：按照国家规定城市码与城市对应关系进行添加】
     */

    /**
     * 修改城市码信息【包含cityId与cityName的修改】
     */

    /**
     * 删除城市信息【物理上删除！注意数据的准确性无务必删除！】
     */

}