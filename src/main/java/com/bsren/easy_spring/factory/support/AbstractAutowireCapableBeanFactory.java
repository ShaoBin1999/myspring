package com.bsren.easy_spring.factory.support;

import com.bsren.easy_spring.exception.BeanException;
import com.bsren.easy_spring.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{


    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) {
        return doCreateBean(name,beanDefinition);
    }

    protected Object doCreateBean(String name, BeanDefinition beanDefinition) {
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            bean = beanClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeanException("Instantiation of bean failed", e);
        }
        addSingleton(name,bean);
        return bean;
    }


}
