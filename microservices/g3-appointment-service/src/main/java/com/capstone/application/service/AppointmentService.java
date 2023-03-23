package com.capstone.application.service;
import java.util.List;
import java.util.Optional;

import com.capstone.application.model.Appointment;
import com.capstone.application.model.PendingAppointments;
public interface AppointmentService 
{
		Appointment saveAppointment(Appointment appointment);
		public Optional<Appointment> findByAppointmentById(Integer patientId);
		public List<Appointment> findByAppointmentByPEmail(String physicianEmail);
		public boolean deleteAppointment(Integer appointmentId);
		public List<Appointment> findByAcceptedAppointment(String acceptance);
		public Appointment update(Appointment appointment);
		public List<Appointment> findByAppointmentByPEmailandDate(String physicianEmail, String date, String acceptance);
		
		





}
