package com.example.progettotesi.repository;

import com.example.progettotesi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {

    @Query(" SELECT e FROM Employee e WHERE " +
    "e.firstName LIKE CONCAT('%',:query,'%')"+
    " Or e.lastName LIKE CONCAT('%',:query,'%')")
    List<Employee> searchEmployees(String query);

    @Query(value = " SELECT * FROM employee e WHERE " +
            "e.firstName LIKE CONCAT('%',:query,'%')"+
            " Or e.lastName LIKE CONCAT('%',:query,'%')" , nativeQuery = true)
    List<Employee> searchEmployeesSQL(String query);




}
