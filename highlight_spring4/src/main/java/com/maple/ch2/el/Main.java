package com.maple.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 15:44
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);

        resourceService.outputRescource();
        context.close();
    }
}
