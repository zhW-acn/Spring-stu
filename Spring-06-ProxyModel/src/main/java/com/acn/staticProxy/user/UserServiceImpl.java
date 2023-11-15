package com.acn.staticProxy.user;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/15/16:10
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增");
    }

    @Override
    public void delete() {
        System.out.println("删");
    }

    @Override
    public void update() {
        System.out.println("改");
    }

    @Override
    public void query() {
        System.out.println("查");
    }
}
