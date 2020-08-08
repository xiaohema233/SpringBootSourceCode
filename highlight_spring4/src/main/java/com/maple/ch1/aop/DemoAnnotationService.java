package com.maple.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 14:38
 */

@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
    }
}
