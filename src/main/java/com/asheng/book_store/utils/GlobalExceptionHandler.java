package com.asheng.book_store.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * @author 胜&SS
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	/**
	 * 处理自定义的业务异常
	 * @param req
	 * @param e
	 * @return
	 */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
	public  ResultMsg bizExceptionHandler(HttpServletRequest req, Exception e){
    	logger.error("发生业务异常！原因是：{}",e.getMessage());
    	return ResultMsg.UNKOWN_ERROR.setNewErrorMsg(e.getMessage());
    }

	/**
	 * 处理空指针的异常
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value =NullPointerException.class)
	@ResponseBody
	public ResultMsg exceptionHandler(HttpServletRequest req, NullPointerException e){
		logger.error("发生空指针异常！原因是:",e.getMessage());
		return ResultMsg.ARGS_ERROR.setNewErrorMsg("内部出现NP异常，错误信息为："+e.getMessage());
	}

}