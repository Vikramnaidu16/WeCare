package com.wecare.DTO;

import java.time.LocalDate;
import java.util.Objects;

public class UserDTO {
	
	private Integer UserId;
	private String UserName;
	private String Password;
	private Long MobileNumber;
	private String EmailId;
	private LocalDate DateOfBirth;
	private String Gender;
	private Integer PinCode;
	private String City;
	private String State;
	private String Country;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
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
	public Integer getPinCode() {
		return PinCode;
	}
	public void setPinCode(Integer pinCode) {
		PinCode = pinCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	@Override
	public String toString() {
		return "UserDTO [UserId=" + UserId + ", UserName=" + UserName + ", Password=" + Password + ", MobileNumber="
				+ MobileNumber + ", EmailId=" + EmailId + ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender
				+ ", PinCode=" + PinCode + ", City=" + City + ", State=" + State + ", Country=" + Country + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(City, Country, DateOfBirth, EmailId, Gender, MobileNumber, Password, PinCode, State, UserId,
				UserName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(City, other.City) && Objects.equals(Country, other.Country)
				&& Objects.equals(DateOfBirth, other.DateOfBirth) && Objects.equals(EmailId, other.EmailId)
				&& Objects.equals(Gender, other.Gender) && Objects.equals(MobileNumber, other.MobileNumber)
				&& Objects.equals(Password, other.Password) && Objects.equals(PinCode, other.PinCode)
				&& Objects.equals(State, other.State) && Objects.equals(UserId, other.UserId)
				&& Objects.equals(UserName, other.UserName);
	}

}
