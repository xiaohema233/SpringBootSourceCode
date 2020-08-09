package com.maple;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * @Author: xiaohema
 * @Date: 2020/8/8 19:25
 */

public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        context.setServletContext(servletContext); //2

        Dynamic servelt = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servelt.addMapping("/");
        servelt.setLoadOnStartup(1);
        servelt.setAsyncSupported(true);
    }
}
