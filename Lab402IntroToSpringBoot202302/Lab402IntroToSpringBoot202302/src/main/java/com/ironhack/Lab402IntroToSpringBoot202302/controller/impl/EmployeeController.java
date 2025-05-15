package com.ironhack.Lab402IntroToSpringBoot202302.controller.impl;

import com.ironhack.Lab402IntroToSpringBoot202302.controller.dto.EmployeeIdDTO;
import com.ironhack.Lab402IntroToSpringBoot202302.controller.interfaces.IEmployeeController;
import com.ironhack.Lab402IntroToSpringBoot202302.model.Employee;
import com.ironhack.Lab402IntroToSpringBoot202302.service.interfaces.IEmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmployeeController implements IEmployeeController {
    // Manage queries about DataBase
    // Requests
    //GET PUT DELETE PATH PATCH

    @Autowired
    private final IEmployeeService employeeService;
    //final private = is only assigned once, in the constructor, and never changes.
    // It makes your code safer, clearer and easier to maintain.
    // It is the best recommended practice in Spring Boot for controllers and services.


    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    //  ***************************************************  POST  ****************************************************
@PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
}
    //  ***************************************************  PATCH  ***************************************************
@PatchMapping("/employee/{id}")
    public void updateEmployeeHospital(@RequestBody @Valid EmployeeIdDTO employeeIdDTO, @PathVariable Long id) {
        employeeService.updateEmployeeHospital(employeeIdDTO.getId(), id);
}
    //  ****************************************************  GET  ****************************************************

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();

    }

}
