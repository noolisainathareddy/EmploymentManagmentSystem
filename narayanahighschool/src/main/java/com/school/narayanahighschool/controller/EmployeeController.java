package com.school.narayanahighschool.controller;

import com.school.narayanahighschool.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //GetAllEmployees
    public List<Employees> getAllEmployees(){
    }
}
