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
@Table(name ="coach")
public class CoachEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CoachId")
	private Integer coachId;
	
	@Column(name = "CoachName")
	private String coachName;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "DateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "MobileNumber")
	private Long mobileNumber;
	
	@Column(name = "Speciality")
	private String speciality;
	
	
	
	
	public CoachEntity() {
		
	}
	

	public CoachEntity(Integer coachId, String coachName, String password, LocalDate dateOfBirth, String gender,
			Long mobileNumber, String speciality) {
		super();
		this.coachId = coachId;
		this.coachName = coachName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.speciality = speciality;
	}



	public Integer getCoachId() {
		return coachId;
	}
	
	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
	}
	
	public String getCoachName() {
		return coachName;
	}
	
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "CoachEntity [CoachId=" + coachId + ", CoachName=" + coachName + ", Password=" + password
				+ ", DateOfBirth=" + dateOfBirth + ", Gender=" + gender + ", MobileNumber=" + mobileNumber
				+ ", Speciality=" + speciality + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(coachId, coachName, dateOfBirth, gender, mobileNumber, password, speciality);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoachEntity other = (CoachEntity) obj;
		return Objects.equals(coachId, other.coachId) && Objects.equals(coachName, other.coachName)
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(gender, other.gender)
				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(password, other.password)
				&& Objects.equals(speciality, other.speciality);
	}
	
}
