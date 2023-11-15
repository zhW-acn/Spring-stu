package com.acn.staticProxy;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/15:09
 */
public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        // 代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
