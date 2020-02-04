# Spring书籍、源码分析与学习
## 引言
> 个人Spring学习之旅，📝笔记。

## 参考笔记
- [b站视频入口](https://www.bilibili.com/video/av32102436?p=1)
- [代码资料](https://gitee.com/adanzzz/spring_source_parsing_data)
## 思维导图
- [Spring注解驱动开发](https://www.processon.com/view/link/5e30213ae4b096de64c8e9bf)


## 目录说明
### 组件注册
- [xml注册bean方式](/spring-annotation/src/main/resources/beans.xml)
- [xml注册包扫描方式](/spring-annotation/src/main/resources/beans.xml)
- [注解注册bean方式](/spring-annotation/src/main/java/org/example/config/MainConfig.java)
- [注解注册包扫描方式](/spring-annotation/src/main/java/org/example/config/MainConfig.java)
- [@Filter的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfFilter.java)
- [@Scope的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfScope.java)
- [@Lazy的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfScope.java)
- [@Conditional的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfConditional.java)
- [@Import的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfImport.java)
### 生命周期
- [bean的生命周期](/spring-annotation/src/main/java/org/example/config/MainConfigOfLifeCycle.java)
### 属性赋值
- [@Value的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfValue.java)
- [@PropertySource的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfValue.java)
### 自动装配
- [@Autowired的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfAutowired.java)
- [@Qualifier的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfAutowired.java)
- [@Profile的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfProfile.java)
### AOP
- [AOP小例子](/spring-aop/src/main/java/org/example/config/MainConfigOfAOP.java)
### 事务
- [Spring事务](/spring-annotation/src/main/java/org/example/tx/MainConfigOfTx.java)
- [Spring事务源码](/spring-annotation/src/main/java/org/example/tx/MainConfigOfTx.java)
### 扩展原理
- [BeanFactoryPostProcessor](/spring-annotation/src/main/java/org/example/ext/MyBeanFactoryPostProcessor.java)
- [BeanDefinitionRegistryPostProcessor](/spring-annotation/src/main/java/org/example/ext/MyBeanDefinitionRegistryPostProcessor.java)
- [ApplicationListener](/spring-annotation/src/main/java/org/example/ext/MyApplicationListener.java)
## 源码总结
- [Spring和SpringAOP](/Spring和SpringAOP源码总结.md)
- [参考这位大佬的MVC原理](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringMVC-Principle) **这位大佬总结的不错，可参考**
- [SpringMVC开发文档](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html) **这里就不贴视频中的SpringMVC工程**
## 手写简单的IOC和AOP
- [手写简单的IOC](/spring-ioc) 非常简单，每行都有注释
- [手写简单的AOP](/spring-aop2) 非常简单，每行都有注释

## SpringBoot
**[参考这位大佬](https://snailclimb.gitee.io/springboot-guide/#/)**
**项目结构过于具体简单的文件解释就不说了，主要是看细节和原理**
- [SpringBoot启动流程分析](/SpringBoot启动流程分析.md)


## Spring常见面试问题
- [参考这位大佬总结的，挺好的](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions) 其实专注一个参考资料，认真备面就完全ok
- [什么是Spring框架](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_1-%e4%bb%80%e4%b9%88%e6%98%af-spring-%e6%a1%86%e6%9e%b6)
- [列举一些重要的Spring模块](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_2-%e5%88%97%e4%b8%be%e4%b8%80%e4%ba%9b%e9%87%8d%e8%a6%81%e7%9a%84spring%e6%a8%a1%e5%9d%97%ef%bc%9f)