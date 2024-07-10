package com.example.employee.respositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.enity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

}
