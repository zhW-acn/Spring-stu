## 导入相关包
```
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.30</version>

</dependency>
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.10</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.18.RELEASE</version>
</dependency>

<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.8.5</version>
</dependency>

<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>2.0.2</version>
</dependency>
```

**ATTENTION**：spring-jdbc的版本要与spring-mvc【core】一致。否则会报
> java.lang.NoSuchMethodError: org.springframework.beans.factory.config.BeanDefinition.getResolvableType()Lorg/springframework/core/ResolvableType;

## 1.新建一个专门编写数据源配置的spring-dao xml文件
1. 使用`Spring-jdbc`包下的`DriverManagerDataSource`配置数据源。代替`mybatis-config`中的`environment`
2. 使用`SqlSessionFactoryBean`配置`SqlSessionFactory`。需要指定它的数据源和`MyBatis`配置文件【可选】`Mapper`【可选】
3. 使用`SqlSessionTemplate`配置`sqlSession`。因为他没有Setter，只能通过构造器注入
```
<bean class="org.springframework.jdbc.datasource.DriverManagerDataSource" id="dataSource"
          p:driverClassName="com.mysql.cj.jdbc.Driver"
          p:url="jdbc:mysql:///test?characterEncoding=utf-8"
          p:username="root"
          p:password="acane"
/>

<!--sqlSessionFactory-->
<bean class="org.mybatis.spring.SqlSessionFactoryBean" id="sessionFactory">
    <property name="dataSource" ref="dataSource"/>
    <!--绑定MyBatis配置文件-->
    <property name="configLocation" value="db/mybatis-config.xml"/>
    <!--注册Mapper-->
    <property name="mapperLocations" value="db/mapper/*.xml"/>
</bean>

<!--只能构造器注入，因为SqlSessionTemplate没有Setter-->
<bean class="org.mybatis.spring.SqlSessionTemplate" id="sqlSession"
      c:_0-ref="sessionFactory"/>

```
## 2.给接口创建实现类
```
public class StudentMapperImpl implements StudentMapper{

    // 所有操作都使用SqlSessionTemplate类来执行
    SqlSessionTemplate sqlSession;

    @Override
    public List<Student> selectAllStudents() {
        return sqlSession.getMapper(StudentMapper.class).selectAllStudents();
    }
}
```
以前在MyBatis中，实现类只专注于实现接口方法，无需关心哪个数据源的sqlSession调用它。

现在需要在实现类中添加SqlSessionTemplate字段，无需调用者通过SqlSession手动注册Mapper。

## 3. 在Spring主配置文件中关联dao.xml并将实现类注入

```
<!--这个文件专注于数据库-->
<import resource="db/spring-dao.xml"/>


<!--StudentMapper实现类-->
<bean class="com.acn.mapper.StudentMapperImpl" id="studentMapper"
      p:sqlSession-ref="sqlSession"/>
```

## 4.整合方式2：继承SqlSessionDaoSupport

```java
public class StudentMapperImpl2 extends SqlSessionDaoSupport implements StudentMapper {

    @Override
    public List<Student> selectAllStudents() {
        return getSqlSession().getMapper(StudentMapper.class).selectAllStudents();
    }
}
```
需要配置sqlSessionFactory，而非sqlSession
```
<bean class="com.acn.mapper.StudentMapperImpl2" id="studentMapper2"
          p:sqlSessionFactory-ref="sessionFactory"/>
```

继承SqlSessionDaoSupport，调用静态方法`getSqlSession()`得到sqlSession。

相当于进一步封装了，无需自己手动创建sqlSession字段