package com.ironhack.Lab402IntroToSpringBoot202302.reporitory;

import com.ironhack.Lab402IntroToSpringBoot202302.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // here custom methods if I need them

}
