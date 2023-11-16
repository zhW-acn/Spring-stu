在此之前：
# xml配置
```xml
<!--开启xml注解支持。proxy-target-class默认值为false[JDK]，true为[cglib]-->
<aop:aspectj-autoproxy/>
```

* **Aspect**：标注这个类是切面
* **Before**：前置增强
* **After**：后置增强
* **Around**：环绕增强

## 增强要加execution执行表达式，表示这个方法在哪个连接点切入