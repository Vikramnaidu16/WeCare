package com.wecare.Entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
public class AppointmentsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AppointmentId")
	private Integer appointmentId;
	
	@Column(name = "UserId")
	private Integer userId;
	
	@Column(name = "CoachId")
	private Integer coachId;
	
	@Column(name = "AppointmentDate")
	private LocalDate appointmentDate;
	
	@Column(name = "AppointmentSlot")
	private String appointmentSlot;
	
	public AppointmentsEntity() {
		
	}
	
	public AppointmentsEntity(Integer appointmentId, Integer userId, Integer coachId, LocalDate appointmentDate, String appointmentSlot) {
		super();
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.coachId = coachId;
		this.appointmentDate = appointmentDate;
		this.appointmentSlot = appointmentSlot;
	}
	
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

	@Override
	public String toString() {
		return "AppointmentsEntity [userId=" + userId + ", coachId=" + coachId + ", appointmentDate=" + appointmentDate
				+ ", appointmentSlot=" + appointmentSlot + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentDate, appointmentSlot, coachId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppointmentsEntity other = (AppointmentsEntity) obj;
		return Objects.equals(appointmentDate, other.appointmentDate)
				&& Objects.equals(appointmentSlot, other.appointmentSlot) && Objects.equals(coachId, other.coachId)
				&& Objects.equals(userId, other.userId);
	}
}
