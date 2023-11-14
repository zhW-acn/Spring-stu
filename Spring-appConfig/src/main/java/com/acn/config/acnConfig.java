package com.acn.config;

import com.acn.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/11/14/22:03
 */
// 该注解本身也加了component注解，也是Bean，也注册到容器中了。
// configuration代表这是一个配置类，和ApplicationContext.xml一样
@Configuration
@ComponentScan("com.acn.bean")// 扫描包
@Import(acnConfig.class) // 导入另一个配置类
public class acnConfig {

    // 注册一个Bean
    // 方法名，相当于bean标签中的id
    // 方法返回值，相当于bean标签中的class
    @Bean
    public User getUser(){
        return new User(); // 返回要注入到IoC的Bean
    }
}
