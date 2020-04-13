package com.dayuzhou.springboot6.controller;

import com.dayuzhou.springboot6.dao.EmployeeDao;
import com.dayuzhou.springboot6.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    //查询所有员工返回列表页面
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees=employeeDao.getAll();
        //放在请求域中
        model.addAttribute("emps",employees);
        //thymeleaf默认都会拼串
        //classpath:/templates/xxx.html
        return "emp/list";
    }
}
