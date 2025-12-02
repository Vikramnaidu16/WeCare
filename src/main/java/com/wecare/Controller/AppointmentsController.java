package com.wecare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.DTO.AppointmentsDTO;
import com.wecare.Service.AppointmentService;

@RestController
@CrossOrigin
@RequestMapping(value = "/appointments")
public class AppointmentsController {
	
	@Autowired
	private AppointmentService appointmentsService;
	
	@PostMapping(value = "/addappointment")
	public void addAppointments(@RequestBody AppointmentsDTO appointmentsDTO) {
		appointmentsService.addAppointment(appointmentsDTO);
	}
	
	@GetMapping(value = "/allappointments/{userId}")
	public ResponseEntity<List<AppointmentsDTO>> getAllAppointments(@PathVariable Integer userId){
		List<AppointmentsDTO> appointmentsList = appointmentsService.getAllAppointments(userId);
		return new ResponseEntity<>(appointmentsList,HttpStatus.OK);
	}
	
	@GetMapping(value = "/allschedules/{coachId}")
	public ResponseEntity<List<AppointmentsDTO>> getAllSchedules(@PathVariable Integer coachId){
		List<AppointmentsDTO> schedulesList = appointmentsService.getAllSchedules(coachId);
		return new ResponseEntity<>(schedulesList,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteappointment/{appointmentId}")
	public void deleteAppointment(@PathVariable Integer appointmentId) {
		appointmentsService.deleteAppointments(appointmentId);
	}
	
	@PutMapping(value = "updateappointment/{appointmentId}")
	public void updateAppointments(@PathVariable Integer appointmentId, @RequestBody AppointmentsDTO appointmentsDTO) {
		appointmentsService.updateAppointment(appointmentId, appointmentsDTO);
	}

}
