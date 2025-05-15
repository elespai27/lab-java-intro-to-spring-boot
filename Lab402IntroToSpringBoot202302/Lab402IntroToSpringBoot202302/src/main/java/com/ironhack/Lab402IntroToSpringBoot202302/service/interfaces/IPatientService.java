package com.ironhack.Lab402IntroToSpringBoot202302.service.interfaces;

import com.ironhack.Lab402IntroToSpringBoot202302.model.Patient;

import java.util.List;

public interface IPatientService {
    Patient savePatient(Patient patient);


    List<Patient> getAllPatient();
}
