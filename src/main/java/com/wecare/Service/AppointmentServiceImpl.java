package com.wecare.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.DTO.AppointmentsDTO;
import com.wecare.Entity.AppointmentsEntity;
import com.wecare.Repository.AppointmentsRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	private AppointmentsRepository appointmentsRepository;

	@Override
	public void addAppointment(AppointmentsDTO appointmentsDTO) {
		AppointmentsEntity appointmentsEntity = new AppointmentsEntity();
		appointmentsEntity.setUserId(appointmentsDTO.getUserId());
		appointmentsEntity.setCoachId(appointmentsDTO.getCoachId());
		appointmentsEntity.setAppointmentDate(appointmentsDTO.getAppointmentDate());
		appointmentsEntity.setAppointmentSlot(appointmentsDTO.getAppointmentSlot());
		appointmentsRepository.save(appointmentsEntity);
		
	}

	@Override
	public List<AppointmentsDTO> getAllAppointments(Integer userId) {
		List<AppointmentsEntity> appointmentsList = appointmentsRepository.findByUserId(userId);
		List<AppointmentsDTO> appointmentsDTOList = new ArrayList<>();
		for (AppointmentsEntity appointments : appointmentsList) {
			AppointmentsDTO appointmentsDTO = new AppointmentsDTO();
			appointmentsDTO.setAppointmentId(appointments.getAppointmentId());
			appointmentsDTO.setAppointmentDate(appointments.getAppointmentDate());
			appointmentsDTO.setAppointmentSlot(appointments.getAppointmentSlot());
			appointmentsDTO.setCoachId(appointments.getCoachId());
			appointmentsDTO.setUserId(appointments.getUserId());
			appointmentsDTOList.add(appointmentsDTO);
		}
		return appointmentsDTOList;
	}

	@Override
	public void deleteAppointments(Integer appointmentId) {
		appointmentsRepository.deleteById(appointmentId);
	}

	@Override
	public void updateAppointment(Integer appointmentId, AppointmentsDTO appointmentsDTO) {
		Optional<AppointmentsEntity> appointmentsOptional = appointmentsRepository.findById(appointmentId);
		AppointmentsEntity appointmentsEntity = appointmentsOptional.orElseThrow();
		appointmentsEntity.setAppointmentDate(appointmentsDTO.getAppointmentDate());
		appointmentsEntity.setAppointmentSlot(appointmentsDTO.getAppointmentSlot());
		appointmentsRepository.save(appointmentsEntity);
	}

	@Override
	public List<AppointmentsDTO> getAllSchedules(Integer coachId) {
		List<AppointmentsEntity> coachSchedules = appointmentsRepository.findByCoachId(coachId);
		List<AppointmentsDTO> coachesSchedulesDTO = new ArrayList<>();
		for(AppointmentsEntity coachSchedulesList : coachSchedules ) {
			AppointmentsDTO appointmentsDTO = new AppointmentsDTO();
			appointmentsDTO.setAppointmentId(coachSchedulesList.getAppointmentId());
			appointmentsDTO.setAppointmentDate(coachSchedulesList.getAppointmentDate());
			appointmentsDTO.setAppointmentSlot(coachSchedulesList.getAppointmentSlot());
			appointmentsDTO.setCoachId(coachId);
			appointmentsDTO.setUserId(coachSchedulesList.getUserId());
			coachesSchedulesDTO.add(appointmentsDTO);
		}
		return coachesSchedulesDTO;
	}

}
