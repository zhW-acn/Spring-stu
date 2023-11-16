package com.acn.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/23:29
 */
public class Log implements MethodBeforeAdvice {

    // method：目标对象的执行方法
    // args：参数
    // target：被advice的对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
