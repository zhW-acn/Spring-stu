jdk1.5支持注解，Spring2.5支持注解

## AutoWired注解

在使用注解之前：
1. 导入约束`xmlns:context="http://www.springframework.org/schema/context"`
2. 配置注解的支持
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <!--开启注解-->
    <context:annotation-config/>

</beans>
```


使用AutoWired注解之后甚至可以省略set方法，前提是自动装配的属性在IoC容器中存在且符合byName。因为**AutoWired是通过byType方法**实现的

1. 在IoC中byType寻找
2. 如果找到唯一则装配成功，如果找到不唯一
3. 不唯一中可以匹配到byName【即那个bean的id就是该AutoWired标记的字段名】，则装配那个bean
4. 没有则报错

* AutoWired注解中有一个为required的属性，required值默认为false
* 设为true后使AutoWired注解的属性可为null
* 也可以使用@Nullable注解实现该效果


## Qualifier注解
当IoC容器中同一个类型的bean不止一个时，需要手动指定装配的bean。
需要使用Qualifier注解与AutoWired注解配合以解决自动装配的歧义问题<br>
eg：

这里注入了两个cat
```xml
<bean id="cat1" class="com.acn.annotation.test.Cat"/>
<bean id="cat2" class="com.acn.annotation.test.Cat"/>
```
指定装配值
```
@Autowired
@Qualifier(value = "cat2")
private test.Cat cat;
```

如果@AutoWired自动装配比较复杂，自动装配无法通过一个注解完成时就可以使用该注解指定一个唯一的bean注入
<hr>
还有一个java的原生注解@Resource也可以指定，相当于上面两个注解的结合。先byName查找，找不到再ByType。

@Resource和@AutoWired的区别：
- 都是用来自动装配的，都可以放在属性字段上
- @AutoWired通过ByType实现，且必须要求这个对象存在
- @Resource默认通过byName实现，如果找不到名字，再通过ByType