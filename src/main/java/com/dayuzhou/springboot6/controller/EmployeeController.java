package com.dayuzhou.springboot6.controller;

import com.dayuzhou.springboot6.dao.DepartmentDao;
import com.dayuzhou.springboot6.dao.EmployeeDao;
import com.dayuzhou.springboot6.entities.Department;
import com.dayuzhou.springboot6.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

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
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //来到添加页面，查出所有的部门，在页面显示
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }
    //员工添加
    //springmvc自动将请求参数和入参对象的属性一一绑定
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //保存员工
        employeeDao.save(employee);
        return "redirect:/emps";
    }
}
