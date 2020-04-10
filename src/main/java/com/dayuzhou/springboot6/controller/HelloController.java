package com.dayuzhou.springboot6.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/success")
    public String hello(Map<String,Object> map){
        map.put("hello","你好!");
        return "success";
    }
}
