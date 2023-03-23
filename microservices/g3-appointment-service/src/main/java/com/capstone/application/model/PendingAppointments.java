package com.capstone.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pending_appointments", schema="appointment_db")
public class PendingAppointments {
	
	@Id
	@Column(name="appintment_id")
	private int appointmentId;
	
	@Column(name="acceptance")
	private String acceptance;
	
	@Column(name="physician_email")
	private String physicianEmail;
	
	@Column(name="patient_id")
	private int patientId;
	

}
