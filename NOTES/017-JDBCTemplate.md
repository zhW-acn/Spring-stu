注入到IoC
```
<bean class="org.springframework.jdbc.core.JdbcTemplate" id="jdbcTemplate"
p:dataSource-ref="dataSource"/>
```

需要一个数据源属性对象
```
<!--数据源对象-->
<bean class="org.apache.commons.dbcp.BasicDataSource" id="dataSource"
      p:driverClassName="${jdbc.driver}"
      p:url="${jdbc.url}"
      p:username="${jdbc.username}"
      p:password="${jdbc.password}"

      p:initialSize="${dbcp.initialSize}"
      p:maxActive="${dbcp.maxActive}"
      p:maxIdle="${dbcp.maxIdle}"
      p:defaultAutoCommit="true"/>
```
这个数据源对象可以使用配置文件导入配置
```
<!--加载配置文件PropertyPlaceholderConfigurer类-->
<context:property-placeholder location="application.properties"/>
```

使用方法和QueryRunner很像，见[这里](../SpringMVC-07-JDBCTemplate/src/test/java/MyTest.java)