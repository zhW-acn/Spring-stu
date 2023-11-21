# Bean标签的属性
- id：bean的唯一标识
- class：全限定类名
- lazy-init：是否延迟加载
- init-method：对象初始化完成后Spring立即执行什么方法
- destroy-method：对象被销毁之前Spring会调用什么方法
- scope：singleton&prototype...[这里更详细](../NOTES/006-Bean的作用域&单例模式.md)
- depends-on：在实例化之前要先实例化另一个对象

<hr>

# 三种注入方式
- bean子标签：property标签
- 构造方法注入：[constructor](../NOTES/003-IoC创建对象【构造器注入】.md)
- 静态工厂注入：需要自定义public方法返回一个对象，通过Bean的属性`factory-method`属性指定该方法名

**ATTENTION**：这三种注入方式都需要[前提条件](../NOTES/005-各种类型的依赖注入DI；命名空间.md):
- property是通过反射查找属性对应的Setter方法注入
- constructor是通过反射查找相应的构造器注入
- factory-method是要找到对应返回该对象类型的方法再注入

<hr>

# 生命周期

