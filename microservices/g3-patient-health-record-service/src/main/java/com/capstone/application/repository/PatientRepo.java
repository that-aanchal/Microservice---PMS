package com.capstone.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.application.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
