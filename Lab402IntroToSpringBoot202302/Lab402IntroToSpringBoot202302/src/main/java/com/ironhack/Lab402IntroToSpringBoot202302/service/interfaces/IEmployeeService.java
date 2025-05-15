package com.ironhack.Lab402IntroToSpringBoot202302.service.interfaces;


import com.ironhack.Lab402IntroToSpringBoot202302.model.Employee;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {

    Employee saveEmployee(Employee employee);


    void updateEmployeeHospital(Long hospitalId, Long employeeId);


    List<Employee> getAllEmployee();

}
