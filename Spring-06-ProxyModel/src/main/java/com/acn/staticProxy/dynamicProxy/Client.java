package com.acn.staticProxy.dynamicProxy;

import com.acn.staticProxy.Host;
import com.acn.staticProxy.Rent;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/17:27
 */
public class Client {
    public static void main(String[] args) {
        
        // 真实角色
        Host host = new Host();
        
        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 传入需要代理的对象
        pih.setTarget(host);
        // 拿到调用处理程序返回的对象
        Rent proxy = (Rent)pih.getProxy();
        proxy.rent();
    }
}
