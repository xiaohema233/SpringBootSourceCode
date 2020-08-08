package com.maple.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 17:02
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("Hello application event");
        context.close();
    }
}
