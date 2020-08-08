package com.maple.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionServices() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionServices() {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionServices());
        return useFunctionService;
    }

    @Bean
    public UseFunctionService useFunctionServices(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
