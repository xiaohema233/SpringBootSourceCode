package com.maple.ch1.javaconfig;

public class UseFunctionServices {
    FunctionServices functionServices;

    public void setFunctionServices(FunctionServices functionServices) {
        this.functionServices = functionServices;
    }

    public String SayHello(String word) {
        return functionServices.sayHello(word);
    }
}
