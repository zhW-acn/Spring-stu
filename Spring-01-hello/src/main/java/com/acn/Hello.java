package com.acn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Hello {

    String name;

    A a;

    public void show() {
        System.out.println("Hello," + name);
    }

    public void showA(){
        System.out.println(a.name);

    }

    public Hello() {
        System.out.println("加载Hello："+this.name);
    }
}