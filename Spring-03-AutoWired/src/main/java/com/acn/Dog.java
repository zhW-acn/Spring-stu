package com.acn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/11/16:36
 */
@Data
@NoArgsConstructor
public class Dog {
    public void shout() {
        System.out.println("狗");
    }
}
