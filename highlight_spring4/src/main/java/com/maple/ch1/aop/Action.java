package com.maple.ch1.aop;

import java.lang.annotation.*;


/**
 * @author xiaohema
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
