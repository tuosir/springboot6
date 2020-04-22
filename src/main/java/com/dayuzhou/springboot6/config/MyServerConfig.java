package com.dayuzhou.springboot6.config;

import com.dayuzhou.springboot6.filter.MyFilter;
import com.dayuzhou.springboot6.listener.MyListener;
import com.dayuzhou.springboot6.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class MyServerConfig  {
        //注册3大组件
        @Bean
        public ServletRegistrationBean myServlet(){
            ServletRegistrationBean registrationBean =new ServletRegistrationBean(new MyServlet(),"/myServlet");
            registrationBean.setLoadOnStartup(1);
            return registrationBean;
        }

        @Bean
        public FilterRegistrationBean myFilter(){
            FilterRegistrationBean registrationBean =new FilterRegistrationBean();
            registrationBean.setFilter(new MyFilter());
            registrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
            return registrationBean;
        }
        @Bean
        public ServletListenerRegistrationBean myListener(){
            ServletListenerRegistrationBean registrationBean=new ServletListenerRegistrationBean<MyListener>(new MyListener());
            return registrationBean;
        }

}
