### 1.`<bean>`注册bean
见[bean](../总结/bean.md)

### 2.`<import resource="***.xml"/>`引用其他Spring配置文件

### 3.`<context:annotation-config/>`开启注解支持

### 4.`<context:property-placeholder location="***.properties"/>`引入配置文件

### 5.`<context:component-scan base-package="com.acn.***"/>`扫包，注册被Component标记的类

### 6.`<aop:aspectj-autoproxy/>`开启aop注解支持

### 7.aop标签
1. `<aop:config>`在这里配置aop
2. `<aop:pointcut>`切入点，配置方法的表达式
3. `<aop:aspect>`自定义切面
4. 详见[这里](../Spring-07-aop/src/main/resources/bean-config.xml)

### 8.`<mvc:default-servlet-handler/>`忽略静态资源

### 9.`<mvc:annotation-driven/>`mvc开启注解
自动注册了HandlerMapping，HandlerAdapter类