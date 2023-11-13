在Spring中有三种装配方式，自动装配是Spring满足Bean依赖的一种方式

1. 在xml中显式的配置
2. 在java中显式配置
3. 隐式自动装配

<hr>

自动装配
-
### byName
                                                                                               
`<bean id="p2" class="com.acn.Person" p:name="p2" autowire="byName"/>`

会自动在容器中找与**set方法值**对应bean的id

例如：
- setCat在context中存在bean id为cat的，Spring就会自动装配
- 如果没有找到，就会报Nullpo
- 【弊端】对应bean的id必须和set方法值相同


### byType

`<bean id="p3" class="com.acn.Person" p:name="p3" autowire="byType"/>`

会自动在容器中找与类型一致对应bean的id

- 可以不用指定对应bean的id
- 【弊端】要求对应的bean全局唯一