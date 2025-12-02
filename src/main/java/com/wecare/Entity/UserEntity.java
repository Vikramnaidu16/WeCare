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
@Table(name = "user")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserId")
	private Integer userId;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "MobileNumber")
	private Long mobileNumber;
	
	@Column(name = "EmailId")
	private String emailId;
	
	@Column(name = "DateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "PinCode")
	private Integer pinCode;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "Country")
	private String country;
	
	public UserEntity() {
		
	}
	
	
	public UserEntity(Integer userId, String userName, String password, Long mobileNumber, String emailId,
			LocalDate dateOfBirth, String gender, Integer pinCode, String city, String state, String country) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	
	public Integer getPinCode() {
		return pinCode;
	}
	
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserEntity [UserId=" + userId + ", UserName=" + userName + ", Password=" + password + ", MobileNumber="
				+ mobileNumber + ", EmailId=" + emailId + ", DateOfBirth=" + dateOfBirth + ", Gender=" + gender
				+ ", PinCode=" + pinCode + ", City=" + city + ", State=" + state + ", Country=" + country + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, dateOfBirth, emailId, gender, mobileNumber, password, pinCode, state, userId,
				userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(gender, other.gender) && Objects.equals(mobileNumber, other.mobileNumber)
				&& Objects.equals(password, other.password) && Objects.equals(pinCode, other.pinCode)
				&& Objects.equals(state, other.state) && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName);
	}
	
}
