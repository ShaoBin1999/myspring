package com.bsren.easy_spring.factory.support;

import com.bsren.easy_spring.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
