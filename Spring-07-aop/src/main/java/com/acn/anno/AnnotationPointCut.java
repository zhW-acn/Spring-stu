package com.acn.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/16/17:12
 */
@Aspect // 标注这个类是切面
public class AnnotationPointCut {

    @Before("execution(* com.acn.service.UserServiceImpl.*(..))")// 这个方法的切入点
    public void before(){
        System.out.println("方法执行前");
    }

    @After("execution(* com.acn.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }


    // 环绕增强中可以给定一个参数，代表要获取处理切入的点
    @Around("execution(* com.acn.service.UserServiceImpl.*(..))")
    public int around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        // 执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");
        return 1;
    }
}
