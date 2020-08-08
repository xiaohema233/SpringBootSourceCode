package com.maple.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 19:31
 */

@Controller
public class HelloControler {
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
