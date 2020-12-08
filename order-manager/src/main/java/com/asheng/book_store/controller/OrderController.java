package com.asheng.book_store.controller;

import com.asheng.book_store.domain.Order;
import com.asheng.book_store.service.OrderService;
import com.asheng.book_store.utils.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2020-12-02 14:35:27
 */
@Api(tags = "订单相关操作API",value = "这个是values，并不知道有什么作用！")
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;


    /**
     * 根据订单信息查询订单总数【没有条件查询所有】
     * @param order 包含查询条件的订单信息
     * @return 符合条件的订单总数
     */
    @ApiOperation(value="根据订单信息查询订单总数",notes="没有条件查询所有!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="order",value="包含查询条件的订单信息",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getOrderCountByOrder")
    @ResponseBody
    public ResultMsg getOrderCountByOrder(Order order){

        return ResultMsg.SUCCESS;
    }



    /**
     * 根据订单信息查询符合订单信息列表【注意分页】
     * @param order 包含查询条件的订单信息
     * @param offset 数据起始位置
     * @param pageSize 每一页的数据量
     * @return
     */
    @ApiOperation(value="据订单信息查询符合订单信息列表",notes="注意分页!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="order",value="包含查询条件的订单信息",required=true,paramType="Order"),
            @ApiImplicitParam(name="offset",value="数据起始位置",required=true,paramType="Integer"),
            @ApiImplicitParam(name="pageSize",value="每一页的数据量",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getOrderListByOrder")
    @ResponseBody
    public ResultMsg getOrderListByOrder(Order order,Integer offset,Integer pageSize){

        return null;
    }


    /**
     * 根据订单Id查询订单信息
     * @param orderId 订单ID
     * @return 订单信息
     */
    @ApiOperation(value="据订单Id查询订单信息",notes="参数：订单ID!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderId",value="订单ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getOrderByOrderId")
    @ResponseBody
    public ResultMsg getOrderByOrderId(Integer orderId){

        return null;
    }


    /**
     * 根据订单时间范围查询订单列表
     * @param orderGenerationMinTime 时间区间起点
     * @param orderGenerationMaxTime 时间区间终点
     * @return 订单列表
     */
    @ApiOperation(value="根据订单时间范围查询订单列表",notes="参数为两个时间区间!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderGenerationMinTime",value="包含查询条件的订单信息",required=true,paramType="String"),
            @ApiImplicitParam(name="orderGenerationMaxTime",value="包含查询条件的订单信息",required=true,paramType="String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/getOrderListByOrderGenerationTime")
    @ResponseBody
    public ResultMsg getOrderListByOrderGenerationTime(String orderGenerationMinTime ,String orderGenerationMaxTime){

        return null;
    }


    /**
     * 新建订单信息
     * @param order 订单信息
     * @return 添加的记录数
     */
    @ApiOperation(value="新建订单信息",notes="order表单!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="order",value="订单信息",required=true,paramType="Order")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("/addOrder")
    @ResponseBody
    public ResultMsg addOrder(Order order){

        return null;
    }


    /**
     * 修改订单相关信息
     * @param order 包含修改后订单的订单信息
     * @return 修改扥记录数
     */
    @ApiOperation(value="修改订单相关信息",notes="订单ID为必须属性!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="order",value="包含订单ID的订单信息",required=true,paramType="Order")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("/updateOrderByOrderId")
    @ResponseBody
    public ResultMsg updateOrderByOrderId(Order order){

        return null;
    }


    /**
     * 更改订单状态【注意：方法名和请求中含有两个Order，与订单状态表中的修改订单状态属性区分】
     * @param orderId 订单ID
     * @param orderStateId 订单状态ID
     * @return 更新的记录数
     */
    @ApiOperation(value="更改订单状态【】",notes="需要订单ID和订单状态Id，增强复用性!")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderId",value="订单ID",required=true,paramType="Integer"),
            @ApiImplicitParam(name="orderStateId",value="订单状态ID",required=true,paramType="Integer")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("/updateOrderOrderStateByOrderId")
    @ResponseBody
    public ResultMsg updateOrderOrderStateByOrderId(Integer orderId,Integer orderStateId){

        return null;
    }


    /**
     * 强行结束订单
     * @param orderId 订单ID
     * @param orderRemarks 订单结束说明
     * @return 影响的记录数
     */
    @ApiOperation(value="强行结束订单",notes="需要订单ID与结束说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderId",value="订单ID",required=true,paramType="Integer"),
            @ApiImplicitParam(name="orderRemarks",value="订单结束说明",required=true,paramType="String")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PutMapping("/orderForcedEnd")
    @ResponseBody
    public ResultMsg orderForcedEnd(Integer orderId ,String orderRemarks){

        return null;
    }
}