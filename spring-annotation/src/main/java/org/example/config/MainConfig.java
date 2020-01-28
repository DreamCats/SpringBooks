/**
 * @program SpringBooks
 * @description: 配置类
 * @author: mf
 * @create: 2020/01/26 17:10
 */

package org.example.config;

import org.example.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 以前是配置文件，现在是配置类... 配置文件==配置类
 */

@Configuration // 告诉spring，这是一个配置文件
@ComponentScan("org.example")
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

    // 给容器注册一个bean，类型为返回值的类型，id默认为方法名
    @Bean("person")
    public Person person01() {
        return new Person("class", 18);
    }
}
