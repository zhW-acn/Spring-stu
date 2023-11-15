package com.acn.staticProxy;

import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/15:14
 */
@NoArgsConstructor
public class Proxy {

    private Host host;

    public Proxy(Host host){
        this.host = host;
    }

    public void rent(){
        seeHouse();
        host.rent();
    }


    // 看房，自己的方法
    public void seeHouse(){
        System.out.println("房东看房");
    }
}
