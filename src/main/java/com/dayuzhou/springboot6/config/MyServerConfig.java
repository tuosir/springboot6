package com.dayuzhou.springboot6.config;

import com.dayuzhou.springboot6.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyServerConfig  {
        //注册3大组件
        @Bean
        public ServletRegistrationBean myServlet(){
            ServletRegistrationBean registrationBean =new ServletRegistrationBean(new MyServlet(),"/myServlet");
            return registrationBean;
        }
}
