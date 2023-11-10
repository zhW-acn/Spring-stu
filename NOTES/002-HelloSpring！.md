1. bean
    ```java
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Hello {
        String name;
        A a;
        public void show() {
            System.out.println("Hello," + name);
        }
        public void showA(){
            System.out.println(a.name);
        }
    } 
    ```
2. 注入到xml
    ```xml
   <bean id="hello" class="com.acn.Hello">
        <property name="name" value="Spring"/>
        <property name="a" ref="a"/>
    </bean>

    <bean id="a" class="com.acn.A">
        <property name="name" value="b"/>
    </bean>
    ```
3. 通过CPX得到对象
   ``` java
   main{
        // 获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");// 可以传不定参数
        // 对象都在Spring中管理了，要使用就直接从ApplicationContext中取出来
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
        hello.showA();
   }
   ```
<hr>

xml配置：
*    id:变量名
*    class:类名
*    property:属性赋值
*    name:属性名
*    value:属性值
*    ref:指向容器中的另一个bean