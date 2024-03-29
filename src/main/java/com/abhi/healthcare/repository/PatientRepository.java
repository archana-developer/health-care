package com.abhi.healthcare.repository;

import com.abhi.healthcare.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient,Long> {
}
