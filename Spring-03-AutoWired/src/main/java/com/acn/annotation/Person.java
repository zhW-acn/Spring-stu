package com.acn.annotation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/11/16:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Autowired
    @Qualifier(value = "cat2")
    private Cat cat;

    @Autowired
    private Dog dog;

    private String name;
}
