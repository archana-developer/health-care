package com.abhi.healthcare.mapper;

import com.abhi.healthcare.dto.PatientDTO;
import com.abhi.healthcare.entity.Patient;

public class PatientMapper {

    public static Patient mapToPatient(PatientDTO patientDTO, Patient patient) {
        patient.setFirstName(patientDTO.getFirstName());
        patient.setLastName(patientDTO.getLastName());
        patient.setEmail(patientDTO.getEmail());
        patient.setPassword(patientDTO.getPassword());
        patient.setMobileNumber(patientDTO.getMobileNumber());
        return patient;
    }
    public static PatientDTO mapToPatientDTO(Patient patient,PatientDTO patientDTO) {
        patientDTO.setFirstName(patient.getFirstName());
        patientDTO.setLastName(patient.getLastName());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setPassword(patient.getPassword());
        patientDTO.setMobileNumber(patient.getMobileNumber());
        return patientDTO;
    }

}
