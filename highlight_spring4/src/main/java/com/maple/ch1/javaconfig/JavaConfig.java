package com.maple.ch1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionServices functionServices() {
        return new FunctionServices();
    }

    @Bean
    public UseFunctionServices useFunctionServices() {
        UseFunctionServices useFunctionServices = new UseFunctionServices();
        useFunctionServices.setFunctionServices(functionServices());
        return useFunctionServices;
    }

    @Bean
    public UseFunctionServices useFunctionServices(FunctionServices functionServices) {
        UseFunctionServices useFunctionServices = new UseFunctionServices();
        useFunctionServices.setFunctionServices(functionServices);
        return useFunctionServices;
    }
}
