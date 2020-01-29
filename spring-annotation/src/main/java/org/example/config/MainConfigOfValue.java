/**
 * @program SpringBooks
 * @description: value的用法
 * @author: mf
 * @create: 2020/01/29 21:04
 */

package org.example.config;

import org.example.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//使用@Value赋值；
//1、基本数值
//2、可以写SpEL； #{}
//3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）
@Configuration
@PropertySource(value = {"classpath:/person.properties"})
public class MainConfigOfValue {

    @Bean
    public Person person() {
        return new Person();
    }
}
