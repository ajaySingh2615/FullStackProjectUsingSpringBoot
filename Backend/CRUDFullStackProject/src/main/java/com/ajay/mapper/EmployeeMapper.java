package com.ajay.mapper;

import com.ajay.dto.EmployeeDto;
import com.ajay.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapTOEmployeeDto(Employee employee){
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
            employeeDto.getId(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
    }
}
