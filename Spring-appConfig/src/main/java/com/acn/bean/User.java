package com.acn.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/14/22:02
 */
@Data
@Component// 注册到容器
public class User {

    @Value("acn")// 注入值
    String name;
}
