package com.maple.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 *
 * @Author: xiaohema
 * @Date: 2020/8/8 15:01
 */

@Configuration
@ComponentScan("com.maple.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
