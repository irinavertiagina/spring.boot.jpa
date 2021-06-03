package com.irinav.spring.boot.spring_boot.controller;


import com.irinav.spring.boot.spring_boot.entity.Employee;
import com.irinav.spring.boot.spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author irkin
 **/
@RestController
@RequestMapping("/api")
public class myRESTController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> showAllEmpl(){
        List<Employee> list = employeeService.getAllEmployes();
        return list;
    }

//    @GetMapping("/employee/{id}")
//    public Employee getEmployee(@PathVariable int id){
//        Employee employee = employeeService.getEmployee(id);
//        return employee;
//    }
//
//    @PostMapping("/employee")
//    public Employee addEmployee(@RequestBody Employee employee){
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//
//    @PutMapping("/employee")
//    public Employee update(@RequestBody Employee employee){
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//    @DeleteMapping("/employee/{id}")
//    public String delete(@PathVariable int id){
//        employeeService.deleteEmployee(id);
//        return "Employee N "+ id +" was deleted";
//    }


}
