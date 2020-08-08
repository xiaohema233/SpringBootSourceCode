package com.maple.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionServices useFunctionServices = context.getBean(UseFunctionServices.class);
        System.out.println(useFunctionServices.SayHello("java config"));
        context.close();
    }
}
