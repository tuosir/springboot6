package com.dayuzhou.springboot6;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//exclude= {DataSourceAutoConfiguration.class}

@SpringBootApplication()
public class Springboot6Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot6Application.class, args);
    }

}
