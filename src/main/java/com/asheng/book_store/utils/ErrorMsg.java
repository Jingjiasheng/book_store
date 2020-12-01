package com.asheng.book_store.utils;

import lombok.Data;

/**
 * 统一返回结果集实体类
 * @param <T> 返回数据对象
 */
@Data
public class ErrorMsg<T> {

    //错误码
    private Integer errorCode;

    //错误信息，一般为前端提示信息
    private String errorMsg;

    //返回值，一般为成功后返回的数据
    private T data;

    //错误详情，一般为失败后的详细原因，如空指针之类的
    private String errorDetail;

    public ErrorMsg() {}

    public ErrorMsg(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ErrorMsg(Integer errorCode, String errorMsg, T data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    /**
     * 配合静态对象直接设置 data 参数
     * @param data
     * @return
     */
    public ErrorMsg setNewData(T data) {
        ErrorMsg error = new ErrorMsg();
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
    public ErrorMsg setNewErrorMsg(String errorMsg) {
        ErrorMsg error = new ErrorMsg();
        error.setErrorCode(this.errorCode);
        error.setErrorMsg(errorMsg);
        error.setErrorDetail(this.errorDetail);
        error.setData(this.data);
        return error;
    }

    public static final ErrorMsg SUCCESS = new ErrorMsg(200, "成功");

    public static final ErrorMsg INSERT_SUCCESS = new ErrorMsg(200, "新增成功");

    public static final ErrorMsg UPDATE_SUCCESS = new ErrorMsg(200, "更新成功");

    public static final ErrorMsg DELETE_SUCCESS = new ErrorMsg(200, "删除成功");

    public static final ErrorMsg UPLOAD_SUCCESS = new ErrorMsg(200, "上传成功");

    public static final ErrorMsg DOWNLOAD_SUCCESS = new ErrorMsg(200, "下载成功");

    public static final ErrorMsg LOGIN_SUCCESS = new ErrorMsg(200, "登陆成功");

    public static final ErrorMsg LOGOUT_SUCCESS = new ErrorMsg(200, "登出成功");

    public static final ErrorMsg LOGIN_ERROR = new ErrorMsg(201, "登陆错误");

    public static final ErrorMsg LOGIN_EXPIRE = new ErrorMsg(202, "登陆过期");

    public static final ErrorMsg ACCESS_LIMITED = new ErrorMsg(301, "访问受限");

    public static final ErrorMsg ARGS_ERROR = new ErrorMsg(501, "参数错误");

    public static final ErrorMsg UNKOWN_ERROR = new ErrorMsg(502, "系统异常");

    public static final ErrorMsg INSERT_ERROR = new ErrorMsg(503, "新增错误");

    public static final ErrorMsg UPDATE_ERROR = new ErrorMsg(504, "更新错误");

    public static final ErrorMsg DELETE_ERROR = new ErrorMsg(506, "删除错误");

    public static final ErrorMsg UPLOAD_ERROR = new ErrorMsg(507, "上传错误");

    public static final ErrorMsg DOWNLOAD_ERROR = new ErrorMsg(508, "下载错误");

    public static final ErrorMsg OTHER_SYSTEM_ERROR = new ErrorMsg(509, "调用系统异常");

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
