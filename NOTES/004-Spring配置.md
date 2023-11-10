# 别名
给bean取别名，使用别名getBean也可以获取对象
`<alias name="hello" alias="你好"/>`

# Bean的配置
- id：bean的唯一标识，也就是变量名
- class：全限定类名
- name：和alias一样，也是别名。使用逗号或空格或分号取多个别名
- property：指定属性注入的值
- ref：引用其他bean


# import
可以将多个配置文件导入合并为一个。在开发中把其他bean的xml导入到一个总的applicationContext.xml中，世界使用总的配置即可。bean中重名的会被合并
`<import resource="">`

