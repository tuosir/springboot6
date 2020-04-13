package com.dayuzhou.springboot6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

//    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username)&&"1234".equals(password )){
            session.setAttribute("loginUser",username);
            //            从定向
            return "redirect:/main.html";

        }else {
            map.put("msg","用户密码错误");
            return "login";
        }


    }
}
