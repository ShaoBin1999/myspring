package com.bsren.easy_spring.exception;

public class BeanException extends RuntimeException{

    public BeanException(String msg){
        super(msg);
    }

    public BeanException(String msg,Throwable e){
        super(msg,e);
    }
}
