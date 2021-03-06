package com.capgemini.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customerId", length = 10)
	private String customerId;
	private String fullName;
	private String email;
	private String password;
	private Long mobile;
	private String address;
	private String city;
	private String zipCode;
	private String country;
	private Date registrationDate;
	
	@ManyToMany(mappedBy="customerOrders",cascade=CascadeType.ALL)
	private List<Order> customerOrder=new ArrayList<>();

	/************* Constructor ***************/

	public Customer(String customerId, String fullName, String email, String password, Long mobile, String address,
			String city, String zipCode, String country, Date registrationDate) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
		this.registrationDate = registrationDate;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/************* Getter ***************/

	public String getCustomerId() {
		return customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Long getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getCountry() {
		return country;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	/************* Setter ***************/

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/************* ToString ***************/

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fullName=" + fullName + ", email=" + email + ", password="
				+ password + ", mobile=" + mobile + ", address=" + address + ", city=" + city + ", zipCode=" + zipCode
				+ ", country=" + country + ", registrationDate=" + registrationDate + "]";
	}

}
