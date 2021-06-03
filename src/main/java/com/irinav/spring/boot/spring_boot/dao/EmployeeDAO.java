package com.irinav.spring.boot.spring_boot.dao;

import com.irinav.spring.boot.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployee();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);


}
