package com.bsren.easy_spring.factory;

import com.bsren.easy_spring.exception.BeanException;

public interface BeanFactory {

    Object getBean(String nane) throws BeanException;
}
