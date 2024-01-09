package com.example.registrationform.Service.impl;

import com.example.registrationform.Dto.EmployeeDto;
import com.example.registrationform.Entity.Employee;
import com.example.registrationform.Repo.EmployeeRepo;
import com.example.registrationform.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public String addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(

                employeeDto.getId(),
                employeeDto.getName(),
                employeeDto.getAddress(),
                employeeDto.getPhoneNumber()
        );

        employeeRepo.save(employee);


        return employee.getName();
    }
}
