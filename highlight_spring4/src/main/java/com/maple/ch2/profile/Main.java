package com.maple.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 16:47
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 先将活动的Profile设置为dev
        context.getEnvironment().setActiveProfiles("dev");
        // context.getEnvironment().setActiveProfiles("prod");
        // 后注册Bean配置类，否则会报Bean未定义的错误
        context.register(ProfileConfig.class);
        // 刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();

    }
}
