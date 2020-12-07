package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Order;
import com.asheng.book_store.domain.OrderState;
import com.asheng.book_store.service.OrderStateService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderState)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:28
 */
@Api(tags = "订单状态操作相关API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("orderState")
public class OrderStateController {
    /**
     * 服务对象
     */
    @Resource
    private OrderStateService orderStateService;


    /**
     * 查询订单状态总数
     * @return 订单总数
     */
    @ApiOperation(value="查询订单状态总数",notes="没有参数!")
    @ApiResponses({
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getOrderStateCount")
    @ResponseBody
    public ResultMsg getOrderStateCount(){

        return null;
    }



    /**
     * 根据Id查询一个订单状态信息
     * @param orderStateId 订单状态ID
     * @return 订单状态信息
     */
    @ApiOperation(value="根据Id查询一个订单状态信息",notes="参数订单状态ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderStateId",value="订单状态ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getOrderStateByOrderStateId")
    @ResponseBody
    public ResultMsg getOrderStateByOrderStateId(Integer orderStateId){

        return null;
    }


    //不分页查询所有订单状态信息

    /**
     * 不分页查询所有订单状态信息
     * @return 返回不分页的状态信息列表
     */
    @ApiOperation(value="不分页查询所有订单状态信息",notes="管理员与用户均不需要")
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/getOrderStateList")
    @ResponseBody
    public ResultMsg getOrderStateList(){

        return null;
    }


    /**
     * 根据订单Id修改订单状态信息
     * @param orderState 修改后的订单信息
     * @return 更新的订单数量
     */
    @ApiOperation(value="根据订单Id修改订单状态信息",notes="状态信息中必须包含订单ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderState",value="修改后的订单信息",required=true,paramType="OrderState")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/updateOrderStateByOrderStateId")
    @ResponseBody
    public ResultMsg updateOrderStateByOrderStateId(OrderState orderState){

        return null;
    }

    /**
     * 添加订单状态信息
     * @param orderState 订单状态信息
     * @return 添加的记录数
     */
    @ApiOperation(value="根据订单信息查询订单总数",notes="没有条件查询所有!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderState",value="订单状态信息",required=true,paramType="OrderState")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/addOrderState")
    @ResponseBody
    public ResultMsg addOrderState(OrderState orderState){

        return null;
    }


    /**
     * 删除订单状态信息
     * @param orderStateId 要删除的订单状态Id
     * @return 删掉的记录数
     */
    @ApiOperation(value="删除订单状态信息",notes="参数订单状态ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderStateId",value="要删除的订单状态Id",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping("/deleteOrderStateByOrderStateId")
    @ResponseBody
    public ResultMsg deleteOrderStateByOrderStateId(Integer orderStateId){

        return null;
    }
}