package com.wecare.DTO;

import java.time.LocalDate;

public class AppointmentsDTO {
	
	private Integer appointmentId;
	private Integer userId;
	private Integer coachId;
	private LocalDate appointmentDate;
	private String appointmentSlot;
	
	public Integer getAppointmentId() {
		return appointmentId;
	}
	
	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCoachId() {
		return coachId;
	}
	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentSlot() {
		return appointmentSlot;
	}
	public void setAppointmentSlot(String appointmentSlot) {
		this.appointmentSlot = appointmentSlot;
	}

}
