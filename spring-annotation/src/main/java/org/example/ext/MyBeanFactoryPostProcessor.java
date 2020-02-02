/**
 * @program SpringBooks
 * @description: MyBeanFactoryPostProcessor
 * @author: mf
 * @create: 2020/02/02 20:52
 */

package org.example.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    /**
     * 重写该方法，目的研究一下它的作用，何时启动
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor");
        int count = configurableListableBeanFactory.getBeanDefinitionCount();
        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println(count+" Bean");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
