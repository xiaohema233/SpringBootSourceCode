package com.maple.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 16:44
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }

}
