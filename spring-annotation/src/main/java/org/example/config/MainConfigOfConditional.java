/**
 * @program SpringBooks
 * @description: Conditional
 * @author: mf
 * @create: 2020/01/28 23:03
 */

package org.example.config;

import org.example.bean.Person;
import org.example.condition.ManCondition;
import org.example.condition.WomanCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Conditional({Condition}) ： 按照一定的条件进行判断，满足条件给容器中注册bean
 *
 * 如果man，给容器中注册("Maifeng")
 * 如果woman，给容器中注册("Liumeng")
 */
@Configuration
public class MainConfigOfConditional {

    @Bean("isMan")
    public Person person() {
        return new Person();
    }

    @Conditional(ManCondition.class)
    @Bean("Man")
    public Person person01() {
        return new Person("Maifeng", 18);
    }

    @Conditional(WomanCondition.class)
    @Bean("Woman")
    public Person person02() {
        return new Person("Liumeng", 18);
    }
}
