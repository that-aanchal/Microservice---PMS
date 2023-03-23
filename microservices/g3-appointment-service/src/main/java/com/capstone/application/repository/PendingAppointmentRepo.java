package com.capstone.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.application.model.PendingAppointments;

@Repository
public interface PendingAppointmentRepo extends JpaRepository<PendingAppointments, Integer> {
	
	@Query(value="select * from pending_appointment where physician_email=?1", nativeQuery =true)
	public List<PendingAppointments> findByPhysicianEmail(String physicianEmail);
	
	@Modifying
	@Query(value="update pending_appointments set acceptance=1 where physician_email=?1 and patient_id=?2",nativeQuery=true)
	public int updateAppointmentStatus(String physicianEmail,int patientId);
	
	@Modifying
	@Query(value="delete * from pending_appointments where acceptance = 0",nativeQuery=true)
	public int deleteAppointment();
	
	

}
