在此之前：
# xml配置
```xml

<aop:aspectj-autoproxy/>
```

* **Aspect**：标注这个类是切面
* **Before**：前置增强
* **After**：后置增强
* **Around**：环绕增强

## 增强要加execution执行表达式，表示这个方法在哪个连接点切入

总结下步骤：
### 1. 开启注解支持和扫包
```
<context:annotation-config/>
<!--开启xml注解支持。proxy-target-class默认值为false[JDK]，true为[cglib]-->
<aop:aspectj-autoproxy/>
<context:component-scan base-package="com.acn.*"/>
```

### 2. 自定义注解切面类
```java
@Aspect
@Component
public class AnnotationAOP {

    @Pointcut("execution(public * com.acn.service.UserServiceImpl.*(..))")
    public void pointcut(){
    }

    @Before("pointcut()") // 定义切入点函数以简化
    public void before(){
        System.out.println("before");
    }

    @After("execution(public * com.acn.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }
}

```