package com.Binod.FirstRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Binod.FirstRest.entity.Employee;
import com.Binod.FirstRest.services.EmployeeServices;

@RestController
@RequestMapping("/employees") // Set base path for employee-related requests
public class MyRestController {

    @Autowired
    private EmployeeServices employeeService; // Use the interface

    @GetMapping("/home")
    public String getHome() {
        return "Welcome to home page";
    }

    // GET all employees
    @GetMapping("/")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    // GET employee by ID
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable long id) {
        return employeeService.getEmployee(id);
    }

    // POST: Create a new employee
    @PostMapping("/create")
    public Employee createEmp(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    // PUT: Update an existing employee
    @PutMapping("/{id}")
    public Employee updateEmp(@PathVariable long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    // DELETE: Remove an employee
    @DeleteMapping("/{id}")
    public String deleteEmp(@PathVariable long id) {
        employeeService.deleteEmployee(id);
        return "Employee with ID " + id + " has been deleted.";
    }
}
