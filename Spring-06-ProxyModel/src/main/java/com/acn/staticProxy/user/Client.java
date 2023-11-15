package com.acn.staticProxy.user;

import com.acn.staticProxy.dynamicProxy.ProxyInvocationHandler;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/17:41
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        userService.add();
    }
}
