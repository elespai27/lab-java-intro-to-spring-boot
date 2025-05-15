package com.ironhack.Lab402IntroToSpringBoot202302.service.impl;

import com.ironhack.Lab402IntroToSpringBoot202302.model.Employee;
import com.ironhack.Lab402IntroToSpringBoot202302.model.Hospital;
import com.ironhack.Lab402IntroToSpringBoot202302.reporitory.EmployeeRepository;
import com.ironhack.Lab402IntroToSpringBoot202302.reporitory.HospitalRepository;
import com.ironhack.Lab402IntroToSpringBoot202302.service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void updateEmployeeHospital(Long hospitalId, Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        Hospital hospital = hospitalRepository.findById(hospitalId)
                .orElseThrow(() -> new RuntimeException("Hospital not found"));

        employee.setHospital(hospital);
        employeeRepository.save(employee);

    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
