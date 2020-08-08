package com.maple.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.maple.ch2.prepost")
public class PrePostConfig {

	/**
	 * initMethod destroyMethod指定BeanWayService类的init和destory方法在构造之后、Bean销毁之前执行
	 *
	 * @return
	 */
	@Bean(initMethod = "init", destroyMethod = "destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}

	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}

}
