package com.capstone.application.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capstone.application.model.Appointment;
import com.capstone.application.service.AppointmentService;




@RestController
public class AppointmentController 
{

	
	private AppointmentService appointmentService;
	

	public AppointmentController(AppointmentService appointmentService) {
		super();
		this.appointmentService = appointmentService;
	}

	
	@GetMapping("/patient/{patientId}/appointments")
	public Optional<Appointment> appointmetForPatientId(@PathVariable int patientId)
	{
		return appointmentService.findByAppointmentById(patientId);
	}
	
	@GetMapping("/appointment/{physicianEmail}")
	public List<Appointment> pendingAppointmentByEmail(@PathVariable String physicianEmail) {
		return appointmentService.findByAppointmentByPEmail(physicianEmail);
	} 
	
	@GetMapping("/appointment/{physicianEmail}/{date}")
	public List<Appointment> AcceptedAppointmentByEmailandDate(@PathVariable String physicianEmail, @PathVariable String date,@RequestParam String acceptance) {
		
	return appointmentService.findByAppointmentByPEmailandDate(physicianEmail,date,acceptance);
	}
	
	@GetMapping("/appointments")
	public  List<Appointment> acceptedAppointmentForNurse(@RequestParam String acceptance)
	{
		return appointmentService.findByAcceptedAppointment(acceptance);
	}
	
	@PostMapping("/appointment")
	public Appointment Createappointment(@RequestBody Appointment appointment)
	{
		return appointmentService.saveAppointment(appointment);
	}
	
	@PutMapping("/appointments/{appointmentId}")
	public Appointment updatedPhysicianAvailabilitys(@RequestBody Appointment appointment) 
	{
		Appointment updateResponse = appointmentService.update(appointment);
        return updateResponse;
	}
	
	@DeleteMapping("/appointment/{appointmentId}")
	public boolean deleteAppointmentById(@PathVariable("appointmentId")Integer appointmentId) {
		return appointmentService.deleteAppointment(appointmentId);
	}

}
