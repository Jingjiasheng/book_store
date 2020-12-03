package com.asheng.book_store.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回结果集实体类
 * @param <T> 返回数据对象
 */
@ApiModel("统一的响应数据结果集类")
@Data
public class ResultMsg<T> implements Serializable {

    /**
     * 错误码
     */
    @ApiModelProperty(value = "返回数据请求的响应码")
    private Integer errorCode;

    /**
     * 错误信息，一般为前端提示信息
     */
    @ApiModelProperty(value = "返回请求结果成功与否的简要信息")
    private String errorMsg;

    /**
     * 返回值，一般为成功后返回的数据
     */
    @ApiModelProperty(value = "返回对象")
    private T data;

    /**
     * 错误详情，一般为失败后的详细原因，如空指针之类的
     */
    @ApiModelProperty(value = "返回请求结果出错时的的详细信息")
    private String errorDetail;

    public ResultMsg() {}

    public ResultMsg(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ResultMsg(Integer errorCode, String errorMsg, T data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    /**
     * 配合静态对象直接设置 data 参数
     * @param data
     * @return
     */
    public ResultMsg setNewData(T data) {
        ResultMsg error = new ResultMsg();
        error.setErrorCode(this.errorCode);
        error.setErrorMsg(this.errorMsg);
        error.setErrorDetail(this.errorDetail);
        error.setData(data);
        return error;
    }

    /**
     * 配合静态对象直接设置 errorMsg 参数
     * @param errorMsg
     * @return
     */
    public ResultMsg setNewErrorMsg(String errorMsg) {
        ResultMsg error = new ResultMsg();
        error.setErrorCode(this.errorCode);
        error.setErrorMsg(errorMsg);
        error.setErrorDetail(this.errorDetail);
        error.setData(this.data);
        return error;
    }

    public static final ResultMsg SUCCESS = new ResultMsg(200, "成功");

    public static final ResultMsg INSERT_SUCCESS = new ResultMsg(200, "新增成功");

    public static final ResultMsg UPDATE_SUCCESS = new ResultMsg(200, "更新成功");

    public static final ResultMsg DELETE_SUCCESS = new ResultMsg(200, "删除成功");

    public static final ResultMsg UPLOAD_SUCCESS = new ResultMsg(200, "上传成功");

    public static final ResultMsg DOWNLOAD_SUCCESS = new ResultMsg(200, "下载成功");

    public static final ResultMsg LOGIN_SUCCESS = new ResultMsg(200, "登陆成功");

    public static final ResultMsg LOGOUT_SUCCESS = new ResultMsg(200, "退出成功");

    public static final ResultMsg LOGIN_ERROR = new ResultMsg(201, "登陆错误");

    public static final ResultMsg LOGIN_EXPIRE = new ResultMsg(202, "登陆过期");

    public static final ResultMsg ACCESS_LIMITED = new ResultMsg(301, "访问受限");

    public static final ResultMsg ARGS_ERROR = new ResultMsg(501, "参数错误");

    public static final ResultMsg UNKOWN_ERROR = new ResultMsg(502, "系统异常");

    public static final ResultMsg INSERT_ERROR = new ResultMsg(503, "新增错误");

    public static final ResultMsg UPDATE_ERROR = new ResultMsg(504, "更新错误");

    public static final ResultMsg DELETE_ERROR = new ResultMsg(506, "删除错误");

    public static final ResultMsg UPLOAD_ERROR = new ResultMsg(507, "上传错误");

    public static final ResultMsg DOWNLOAD_ERROR = new ResultMsg(508, "下载错误");

    public static final ResultMsg OTHER_SYSTEM_ERROR = new ResultMsg(509, "调用系统异常");

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
