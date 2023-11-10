package com.acn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;


/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/10/11:02
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    String name;
    Address address;
    String[] books;
    List<String> hobbies;
    Map card;
    Set<String> games;
    String wife;
    Properties info;
}
