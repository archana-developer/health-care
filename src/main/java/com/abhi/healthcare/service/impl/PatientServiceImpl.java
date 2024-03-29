package com.abhi.healthcare.service.impl;

import com.abhi.healthcare.dto.PatientDTO;
import com.abhi.healthcare.entity.Patient;
import com.abhi.healthcare.mapper.PatientMapper;
import com.abhi.healthcare.repository.PatientRepository;
import com.abhi.healthcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    @Override
    public void createPatient(PatientDTO patientDTO) {
        Patient patient = PatientMapper.mapToPatient(patientDTO, new Patient());
        patientRepository.save(patient);
    }
}
