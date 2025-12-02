package com.wecare.DTO;

import java.time.LocalDate;

public class CoachDTO {
	
	private Integer CoachId;
	private String CoachName;
	private String Password;
	private LocalDate DateOfBirth;
	private String Gender;
	private Long MobileNumber;
	private String Speciality;
	
	
	
	public Integer getCoachId() {
		return CoachId;
	}
	public void setCoachId(Integer coachId) {
		CoachId = coachId;
	}
	public String getCoachName() {
		return CoachName;
	}
	public void setCoachName(String coachName) {
		CoachName = coachName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

}
