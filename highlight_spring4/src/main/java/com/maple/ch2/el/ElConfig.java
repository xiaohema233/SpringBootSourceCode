package com.maple.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * 配置类
 *
 * @Author: xiaohema
 * @Date: 2020/8/8 15:29
 */
@Configuration
@ComponentScan("com.maple.ch2.el")
@PropertySource("file:${user.dir}/src/main/java/com/maple/ch2/el/test.properties")
public class ElConfig {
    /**
     * 普通字符串
     */
    @Value("I Love You!")
    private String normal;

    /**
     * 操作系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 表达式结果
     */
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;

    /**
     * 其他Bean属性
     */
    @Value("#{demoService.another}")
    private String fromAnother;

    /**
     * 文件资源
     */
    @Value("file:${user.dir}/src/main/java/com/maple/ch2/el/test.txt")
    private Resource testFile;

    /**
     * 网址资源
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;

    /**
     * 配置文件
     */
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputRescource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
