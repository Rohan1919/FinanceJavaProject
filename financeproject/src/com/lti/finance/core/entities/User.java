package com.lti.finance.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//@SequenceGenerator(name="USERSEQ")
@Entity
@Table(name="REGISTRATION")
public class User {
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERSEQ")
	@Id
	@Column(name="USERID")
	private int userId;
	@Column(name="USERNAME")
	private String userName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="PHONENUMBER")
	private String phoneNumber;
	@Column(name="EMAIL")
	private String email;
	@Column(name="AADHARCARD")
	private String aadharCardNumber;
	@Column(name="PANCARD")
	private String panCardNumber;
	@Column(name="ADDRESS")
	private String address;
	
	public User() {
	
	}

	public User(int userId, String userName, String password, String phoneNumber, String email, String aadharCardNumber,
			String panCardNumber, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.aadharCardNumber = aadharCardNumber;
		this.panCardNumber = panCardNumber;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(String aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", aadharCardNumber=" + aadharCardNumber + ", panCardNumber="
				+ panCardNumber + ", address=" + address + "]";
	}
	

}
