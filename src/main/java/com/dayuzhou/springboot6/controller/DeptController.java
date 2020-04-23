package com.dayuzhou.springboot6.controller;

import com.dayuzhou.springboot6.bean.Department;
import com.dayuzhou.springboot6.bean.Employee;
import com.dayuzhou.springboot6.mapper.DepartmentMapper;
import com.dayuzhou.springboot6.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id ") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department inserDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

}
