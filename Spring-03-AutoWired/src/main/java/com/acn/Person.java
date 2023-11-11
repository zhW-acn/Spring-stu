package com.acn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/11/16:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Cat cat;
    private Dog dog;
    private String name;
}
