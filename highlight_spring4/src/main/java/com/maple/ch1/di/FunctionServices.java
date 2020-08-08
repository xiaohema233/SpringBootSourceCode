package com.maple.ch1.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionServices {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
