package com.acn.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/11/21:23
 */


// 使用该注解等价于<bean id="user" class="com.acn.bean.User"/>
@Component
public class User {

    // 等价于<property name="name" value="acn">
    @Value("acn")
    public String name;

    // 也可以放在Setter上，Setter的优先级更高
    @Value("aca")
    public void setName(String name) {
        this.name = name;
    }
}
