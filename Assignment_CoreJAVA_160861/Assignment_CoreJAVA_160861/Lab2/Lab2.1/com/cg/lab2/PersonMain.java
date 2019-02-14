package com.cg.lab2;

public class PersonMain {

	String firstName;
	String lastName;
	Gender gender;
	String phoneNo;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "PersonMain [firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", phoneNo=" + phoneNo + "]";
	}
	public PersonMain(String firstName, String lastName, Gender gender,
			String phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNo = phoneNo;
	}
	public PersonMain() {
	
		// TODO Auto-generated constructor stub
	}
	
	
}
