package com.capstone.application.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.capstone.application.model.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

	@Query(value = "SELECT * from accepted_appointment where physician_email=?1", nativeQuery=true)
	List<Appointment> findByEmail(String physicianEmail);
	
	

	@Query(value = "SELECT * from accepted_appointment where acceptance=?1", nativeQuery=true)
	List<Appointment> findByAcceptance(String acceptance);

	@Query(value = "SELECT * from accepted_appointment where physician_email=?1 and date=?2 and acceptance=?3", nativeQuery=true)
	List<Appointment> findByEmailandDate(String physicianEmail, String date ,String acceptance);
	
	@Modifying
	@Query(value ="Insert into accepted_appointment values (Select * from pending_aapointments where acceptance =?1)" , nativeQuery=true)
	List<Appointment> acceptedAppointmnets(String acceptance);



	//List<Appointment> findByEmailandDate(String physicianEmail, String date, String acceptance);
	

}
