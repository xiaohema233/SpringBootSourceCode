package com.maple.web.ch4_4;

import com.maple.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 22:08
 */
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj demoObj) {
        throw new IllegalArgumentException("非常抱歉，参数有误/" + "来自@ModelAttribute" + msg);
    }

}
