package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Book;
import com.asheng.book_store.domain.City;
import com.asheng.book_store.service.CityService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
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
    @ApiOperation(value="获取数据库记录的城市总数",notes="无需执行参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getCityCount")
    @ResponseBody
    public Integer getCityCount(){

        return null;
    }


    /**
     * 获取全部的城市列表信息用于加载下拉框，无需分页
     */
    @ApiOperation(value="获取全部的城市列表信息用于加载下拉框，无需分页",notes="无需参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getCityList")
    @ResponseBody
    public List<City> getCityList(){

        return null;
    }

    /**
     * 获取全部的城市列表信息用于加载下拉框，无需分页
     */
    @ApiOperation(value="获取全部的城市列表信息用于加载下拉框，需分页",notes="需要两个分页参数!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="offset",value="数据列表的起始位置",required=true,paramType="int"),
            @ApiImplicitParam(name="pageSize",value="获取的数据量【即页面记录数】",required=true,paramType="int")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getCityListByLimit")
    @ResponseBody
    public List<City> getCityListByLimit(Integer offset,Integer pageSize){

        return null;
    }

    /**
     * 根据cityId获取city信息
     */
    @ApiOperation(value="根据cityId获取city信息",notes="根据cityID进行查询！参数名为userId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="cityId",value="城市ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getCityByCityId")
    @ResponseBody
    public City getCityByCityId(Integer cityId){

        return null;
    }

    /**
     * 实现添加cityId和city【注意：按照国家规定城市码与城市对应关系进行添加】
     */
    @ApiOperation(value="添加城市信息",notes="一般为管理员执行操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name="city",value="城市信息包含城市名称和城市代码",required=true,paramType="City")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/addCity")
    @ResponseBody
    public ResultMsg addCity(City city){

        return null;
    }

    /**
     * 修改城市信息【包含cityNumber与cityName的修改】
     */
    @ApiOperation(value="修改城市信息【包含cityNumber与cityName的修改】",notes="根据cityId进行修改！参数名为cityId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="city",value="城市信息里面一定包含cityId",required=true,paramType="City")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/updateCityByCityId")
    @ResponseBody
    public ResultMsg updateCityByCityId(City city){

        return null;
    }

    /**
     * 删除城市信息【物理上删除！注意数据的准确性无务必删除！】
     */
    @ApiOperation(value="根据cityId删除城市信息",notes="为保证数据准确性执行物理删除，参数名为cityId!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="cityId",value="城市ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/deleteCityById")
    @ResponseBody
    public ResultMsg deleteCityById(Integer cityId){

        return null;
    }

}