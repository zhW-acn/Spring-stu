package com.acn.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/23:34
 */
public class AfterLog implements AfterReturningAdvice {

    // returnValue：返回值类型
    // method：方法:
    // args：参数
    // target：被advice的对象
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为" + returnValue + "目标" + target);
    }
}
