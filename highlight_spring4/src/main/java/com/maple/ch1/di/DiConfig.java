package com.maple.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 声明当前类是一个配置类
 * @ComponentScan 自动扫描包下所有 @Service @Component @Repository @Controllerl类并注册为Bean
 */
@Configuration
@ComponentScan("com.maple.ch1.di")
public class DiConfig {

}
