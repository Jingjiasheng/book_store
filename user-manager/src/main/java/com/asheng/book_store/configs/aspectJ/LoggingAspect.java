package com.asheng.book_store.configs.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class LoggingAspect {

    //环绕通知需要携带ProceedingJoinPoint类型的参数
    //环绕通知类似于动态代理的全过程，这个类型ProceedingJoinPoint的参数可以决定是否执行目标方法
    //且环绕通知必须有返回值，返回值即为目标方法返回值
    @Around(value = "execution(* com.asheng.book_store.service.serviceImpl.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();
//执行目标方法
        try {
            //前置通知
            System.out.println("开始执行目标方法+++++++++++++++++++++++ " + methodName + " 参数【 " + Arrays.toString(args));
            result = proceedingJoinPoint.proceed();
//返回通知
            System.out.println("目标方法执行结束——————————————————————- " + methodName + " 结果【 " + result);
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("方法执行出现异常xxxxxxxxxxxxxxxxxxxxxxx " + methodName + " 异常信息【 " + throwable);
            throwable.printStackTrace();
        }
//后置通知
        System.out.println("方法执行完成vvvvvvvvvvvvvvvvvvvvvvvvvv " + methodName + " 执行结果【 " + Arrays.toString(args));
        //System.out.println("around "+proceedingJoinPoint);
        return result;
    }
}
