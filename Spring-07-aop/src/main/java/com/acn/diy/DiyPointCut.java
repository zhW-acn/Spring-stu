package com.acn.diy;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/16/11:37
 */
public class DiyPointCut {
    public void before(){
        System.out.println("方法执行前");
    }

    public void after(){
        System.out.println("方法执行后");
    }
}
