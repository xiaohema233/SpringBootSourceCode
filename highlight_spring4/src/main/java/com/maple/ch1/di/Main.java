package com.maple.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionServices useFunctionServices = context.getBean(UseFunctionServices.class);

        System.out.println(useFunctionServices.SayHello("di"));

        context.close();
    }
}
