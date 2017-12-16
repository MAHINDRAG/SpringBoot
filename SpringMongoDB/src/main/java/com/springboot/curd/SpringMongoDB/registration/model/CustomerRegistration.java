package com.springboot.curd.SpringMongoDB.registration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Registration")
public class CustomerRegistration {
    @Id
	private String customerCode;
	private String creationDate;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String streetName;
	private String town;
	private String city;
	private String state;
	private String country;
	private Integer pobox;
		
	public CustomerRegistration() {
		super();
	}

	public CustomerRegistration(String customerCode, String creationDate, String firstName, String lastName,
			String mobileNumber, String email, String streetName, String town, String city, String state,
			String country, Integer pobox) {
		super();
		this.customerCode = customerCode;
		this.creationDate = creationDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.streetName = streetName;
		this.town = town;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pobox = pobox;
	}
	
	
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
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
	public Integer getPobox() {
		return pobox;
	}
	public void setPobox(Integer pobox) {
		this.pobox = pobox;
	}
	@Override
	public String toString() {
		return "CustomerRegistration [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + ", streetName=" + streetName + ", town=" + town + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pobox=" + pobox + "]";
	}
		
}
