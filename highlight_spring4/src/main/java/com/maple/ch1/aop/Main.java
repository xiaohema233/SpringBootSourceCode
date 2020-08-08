package com.maple.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 15:02
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();

        context.close();
    }
}
