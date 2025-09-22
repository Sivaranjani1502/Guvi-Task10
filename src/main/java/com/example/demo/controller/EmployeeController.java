package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    // Save employee
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return repo.save(employee);
    }

    // Display all employees
    @GetMapping("/displayAll")
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    // Display employee by ID
    @GetMapping("/display/{employeeId}")
    public Employee getEmployeeById(@PathVariable String employeeId) {
        return repo.findByEmployeeId(employeeId);
    }
}
