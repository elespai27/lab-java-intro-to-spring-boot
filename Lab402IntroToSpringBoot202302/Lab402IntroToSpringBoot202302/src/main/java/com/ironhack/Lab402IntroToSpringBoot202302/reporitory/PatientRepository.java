package com.ironhack.Lab402IntroToSpringBoot202302.reporitory;

import com.ironhack.Lab402IntroToSpringBoot202302.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // here custom methods if I need them

}
