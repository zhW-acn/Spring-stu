package com.acn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hello {

    String name;

    A a;

    public void show() {
        System.out.println("Hello," + name);
    }

    public void showA(){
        System.out.println(a.name);

    }
}