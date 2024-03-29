package com.abhi.healthcare.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "patients")
public class Patient extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id", unique = true, updatable = false)
    private Long patientId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long mobileNumber;
}
