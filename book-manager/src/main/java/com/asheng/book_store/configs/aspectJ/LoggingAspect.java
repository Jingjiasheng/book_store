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
    //声明该方法为一个前置通知:在目标方法开始之前执行
    //前置通知可以获取方法名以及方法的参数
    //execution中是AspectJ表达式
    @Before(value = "execution(* com.asheng.book_store.service.serviceImpl.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("beforeMethod "+methodName+" start with "+args);
    }

    //后置通知，就是在目标方法执行之后（无论是否发生异常）执行的通知
    //后置通知中不能访问目标方法的返回结果
    @After(value = "execution(* com.asheng.book_store.service.serviceImpl.*.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("afterMethod "+methodName+" end with "+args);
    }

    //返回通知，在方法正常结束之后执行的代码
    //返回通知是可以访问到方法的返回值的
    @AfterReturning(value = "* com.asheng.book_store.service.serviceImpl.*.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("afterReturning "+methodName+" end with "+result);
    }
    //返回异常通知，返回抛出异常的时候执行的通知，可以获得返回的异常
    //可以访问到异常对象，且可以指定在出现特定异常的时候再执行通知代码
    @AfterThrowing(value = "execution(* com.asheng.book_store.service.serviceImpl.*.*(..))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("afterThrowing "+methodName+" end with "+ ex );
    }
    //环绕通知需要携带ProceedingJoinPoint类型的参数
    //环绕通知类似于动态代理的全过程，这个类型ProceedingJoinPoint的参数可以决定是否执行目标方法
    //且环绕通知必须有返回值，返回值即为目标方法返回值
    @Around(value = "execution(* com.asheng.book_store.service.serviceImpl.*.*(..))")
    public  Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();
//执行目标方法
        try {
            //前置通知
            System.out.println("beforeMethod "+methodName+" start with "+args);
            result = proceedingJoinPoint.proceed();
//返回通知
            System.out.println("afterMethod "+methodName+" end with "+result);
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("afterThrowing "+methodName+" exception with "+ throwable );
            throwable.printStackTrace();
        }
//后置通知
        System.out.println("afterMethod "+methodName+" end with "+args);
        //System.out.println("around "+proceedingJoinPoint);
        return result;
    }
}
