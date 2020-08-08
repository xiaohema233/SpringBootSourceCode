package com.maple.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zh900
 */
@Service
public class UseFunctionServices {
    @Autowired
    FunctionServices functionServices;

    public String SayHello(String word) {
        return functionServices.sayHello(word);
    }
}
