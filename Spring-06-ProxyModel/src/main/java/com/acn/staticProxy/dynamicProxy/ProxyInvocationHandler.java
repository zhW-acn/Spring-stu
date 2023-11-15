package com.acn.staticProxy.dynamicProxy;

import com.acn.staticProxy.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/17:14
 */
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 返回代理类，只需修改被代理接口
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(target, args);
    }

}
