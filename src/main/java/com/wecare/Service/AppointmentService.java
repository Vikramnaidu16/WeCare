package com.wecare.Service;

import java.util.List;

import com.wecare.DTO.AppointmentsDTO;

public interface AppointmentService {
	
	public void addAppointment(AppointmentsDTO appointmentsDTO);
	
	public List<AppointmentsDTO> getAllAppointments(Integer userId);
	
	public List<AppointmentsDTO> getAllSchedules(Integer coachId);
	
	public void deleteAppointments(Integer appointmentId);
	
	public void updateAppointment(Integer appointmentId, AppointmentsDTO appointmentsDTO);

}
