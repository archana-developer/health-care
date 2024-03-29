package com.abhi.healthcare.controller;

import com.abhi.healthcare.constants.PatientConstants;
import com.abhi.healthcare.dto.HttpResponse;
import com.abhi.healthcare.dto.PatientDTO;
import com.abhi.healthcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/create")
    public ResponseEntity<HttpResponse> createPatient(@RequestBody PatientDTO patientDTO) {
        patientService.createPatient(patientDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new HttpResponse(HttpStatus.CREATED.value(), PatientConstants.PATIENT_CREATED));
    }
}
