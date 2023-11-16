# 使用Spring的API接口


1. 被代理接口和实现类【UserService和UserServiceImpl】--->**_target_**
2. 【log&afterLog】是 **_aspect_**，通过继承不同类型的 **_advice_** 重写方法
    ```
   // 前置增强
   // method：目标对象的执行方法
    // args：参数
    // target：被advice的对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
   
   // 后置增强
   // returnValue：返回值类型
   // method：方法
    // args：参数
    // target：被advice的对象
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为" + returnValue + "目标" + target);
    }
    ```
3. xml
    ```
   <!--注册bean-->
    <bean id="userService" class="com.acn.service.UserServiceImpl"/>
    <bean id="log" class="com.acn.log.Log"/>
    <bean id="afterLog" class="com.acn.log.AfterLog"/>

    <!--配置aop-->
    <aop:config>
        <!--切入点-->
        <!--表达式execution(要执行的位置)-->
        <aop:pointcut id="pointcut" expression="execution(* com.acn.service.UserServiceImpl.*(..))"/>

        <!--执行环绕-->
        <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>
        <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
    </aop:config>
    ```
   表达式execution：访问修饰符 返回类型 全限定类名.方法
    - `.*( )`：全部无参方法
    - `.*( * )`：全部一个参数的方法【*：表示一个未知参数类型】
    - `.*(..)`：【..：表示任意参数类型和个数】
    - 访问修饰符 返回类型 全限定类名.方法都可以用*代替

# 自定义类实现AOP