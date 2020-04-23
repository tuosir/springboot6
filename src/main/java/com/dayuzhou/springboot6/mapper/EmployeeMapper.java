package com.dayuzhou.springboot6.mapper;

import com.dayuzhou.springboot6.bean.Employee;


public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public void insertEmp(Employee employee);
}
