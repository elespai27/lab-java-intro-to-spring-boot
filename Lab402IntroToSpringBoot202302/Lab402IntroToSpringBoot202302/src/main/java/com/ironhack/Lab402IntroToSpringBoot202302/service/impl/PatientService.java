package com.ironhack.Lab402IntroToSpringBoot202302.service.impl;

import com.ironhack.Lab402IntroToSpringBoot202302.model.Patient;
import com.ironhack.Lab402IntroToSpringBoot202302.reporitory.PatientRepository;
import com.ironhack.Lab402IntroToSpringBoot202302.service.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IPatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }


}


