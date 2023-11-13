package com.acn.annotation;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/11/16:36
 */
@Data
@NoArgsConstructor
public class Cat {

    public void shout(){
        System.out.println("猫");
    }


}
