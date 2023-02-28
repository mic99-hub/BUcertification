package com.example.progettotesi.service;

import com.example.progettotesi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee searchEmployee(long id);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id );
    Employee updateEmployee(Employee employee ,Long id );
    void deleteEmployee(long id);
}
