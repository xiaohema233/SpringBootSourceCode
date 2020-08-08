package com.maple.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 注解@EnableScheduling开启对计划任务的支持
 *
 * @author xiaohema
 */
@Configuration
@ComponentScan("com.maple.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
