package com.Binod.FirstRest.services;

import com.Binod.FirstRest.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

    private final Map<Long, Employee> employeeDatabase = new HashMap<>();

    // Get all employees
    @Override
    public List<Employee> getEmployees() {
        return new ArrayList<>(employeeDatabase.values());
    }

    // Get an employee by ID
    @Override
    public Employee getEmployee(long id) {
        return employeeDatabase.get(id);
    }

    // Create a new employee
    @Override
    public Employee createEmployee(Employee employee) {
        if (employeeDatabase.containsKey(employee.getId())) {
            throw new RuntimeException("Employee with this ID already exists");
        }
        employeeDatabase.put(employee.getId(), employee);
        return employee;
    }

    // Update an existing employee
    @Override
    public Employee updateEmployee(long id, Employee employee) {
        if (!employeeDatabase.containsKey(id)) {
            throw new RuntimeException("Employee not found");
        }
        employee.setId(id); // Ensure the ID remains the same
        employeeDatabase.put(id, employee);
        return employee;
    }

    // Delete an employee
    @Override
    public void deleteEmployee(long id) {
        if (!employeeDatabase.containsKey(id)) {
            throw new RuntimeException("Employee not found");
        }
        employeeDatabase.remove(id);
    }
}
