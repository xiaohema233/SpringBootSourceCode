package com.maple.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 15:16
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
