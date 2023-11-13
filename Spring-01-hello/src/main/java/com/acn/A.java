package com.acn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/08/20:44
 */
@Data
@AllArgsConstructor
public class A {
    String name;

    public A() {
        System.out.println("加载A："+this.name);
    }
}
