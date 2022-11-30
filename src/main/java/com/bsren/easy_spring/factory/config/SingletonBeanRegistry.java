package com.bsren.easy_spring.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
