package com.maple.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author xiaohema
 */
public class JSR250WayService {
    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PostConstruct //1 在构造函数执行完之后执行
    public void init() {
        System.out.println("jsr250-init-method");
    }

    @PreDestroy //2 在Bean销毁之前执行
    public void destroy() {
        System.out.println("jsr250-destory-method");
    }

}
