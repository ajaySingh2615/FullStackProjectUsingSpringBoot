package com.ajay.repository;

import com.ajay.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
