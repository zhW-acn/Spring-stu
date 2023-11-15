package com.acn.staticProxy;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/15:06
 */

// 房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要租房");
    }
}
