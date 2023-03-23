package com.capstone.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="visit_details", schema="patient_info_db")
public class VisitDetails 
{
	@Id
	@Column(name="visit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int visitId;
	
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="height")
	private float height;
	
	@Column(name="weight")
	private float weight;
	
	@Column(name="blood_pressure_systolic")
	private int BPsystolic;
	
	@Column(name="blood_pressure_diastolic")
	private int BPdiastolic;
	
	@Column(name="body_temperature")
	private float bodyTemperature;
	
	@Column(name="respiration_rate")
	private int repirationRate;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="nurse_email")
	private String nurseEmail;
	
	@Column(name="physician_email")
	private String physicianEmail;
	
	@Column(name="appointment_id")
	private int appointmentId;
	
	@Column(name="key_notes_by_nurse")
	private String keyNotes;
	
	@Column(name="diagnosis_by_doctor")
	private String diagnosis;

	
	
	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public VisitDetails() {
		super();
	}


	public VisitDetails(int visitId, int patientId, float height, float weight, int bPsystolic, int bPdiastolic,
			float bodyTemperature, int repirationRate, String bloodGroup, String nurseEmail, String physicianEmail,
			int appointmentId, String keyNotes, String diagnosis) {
		super();
		this.visitId = visitId;
		this.patientId = patientId;
		this.height = height;
		this.weight = weight;
		BPsystolic = bPsystolic;
		BPdiastolic = bPdiastolic;
		this.bodyTemperature = bodyTemperature;
		this.repirationRate = repirationRate;
		this.bloodGroup = bloodGroup;
		this.nurseEmail = nurseEmail;
		this.physicianEmail = physicianEmail;
		this.appointmentId = appointmentId;
		this.keyNotes = keyNotes;
		this.diagnosis = diagnosis;
	}


	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getBPsystolic() {
		return BPsystolic;
	}

	public void setBPsystolic(int bPsystolic) {
		BPsystolic = bPsystolic;
	}

	public int getBPdiastolic() {
		return BPdiastolic;
	}

	public void setBPdiastolic(int bPdiastolic) {
		BPdiastolic = bPdiastolic;
	}

	public float getBodyTemperature() {
		return bodyTemperature;
	}

	public void setBodyTemperature(float bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}

	public int getRepirationRate() {
		return repirationRate;
	}

	public void setRepirationRate(int repirationRate) {
		this.repirationRate = repirationRate;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getNurseEmail() {
		return nurseEmail;
	}

	public void setNurseEmail(String nurseEmail) {
		this.nurseEmail = nurseEmail;
	}

	public String getPhysicianEmail() {
		return physicianEmail;
	}

	public void setPhysicianEmail(String physicianEmail) {
		this.physicianEmail = physicianEmail;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getKeyNotes() {
		return keyNotes;
	}

	public void setKeyNotes(String keyNotes) {
		this.keyNotes = keyNotes;
	}
	
	
}
