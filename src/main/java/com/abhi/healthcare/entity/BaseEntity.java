package com.abhi.healthcare.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
    private String createdBy;
    @CreationTimestamp
    private LocalDateTime createdDate;
    private String updatedBy;
    @UpdateTimestamp
    private LocalDateTime updatedDate;
}
