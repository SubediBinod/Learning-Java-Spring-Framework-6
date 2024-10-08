package com.Binod.FirstRest.services;

import com.Binod.FirstRest.entity.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getEmployees();
    Employee getEmployee(long id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(long id, Employee employee);
    void deleteEmployee(long id);
}
