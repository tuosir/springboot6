package com.dayuzhou.springboot6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Springboot6Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot6Application.class, args);
    }

}
