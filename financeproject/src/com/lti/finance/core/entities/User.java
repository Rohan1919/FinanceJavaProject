package com.lti.finance.core.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="REGISTRATION")
public class User {
	
	//@OneToMany(cascade = CascadeType.ALL,mappedBy = "userId")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERSEQ")
	@SequenceGenerator(name="USERSEQ", sequenceName="USERSEQ", allocationSize=1)
	@Column(name="USERID")
	private int userId;
	
	@Column(name="NAME")
	private String name;
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
	
	@JsonIgnore//cascade = CascadeType.ALL
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="user")
	private PurchaseCard pCard;
	public User() {
	
	}
	public User(int userId, String name, String userName, String password, String phoneNumber, String email,
			String aadharCardNumber, String panCardNumber, String address, PurchaseCard pCard) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.aadharCardNumber = aadharCardNumber;
		this.panCardNumber = panCardNumber;
		this.address = address;
		this.pCard = pCard;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public PurchaseCard getpCard() {
		return pCard;
	}
	public void setpCard(PurchaseCard pCard) {
		this.pCard = pCard;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", aadharCardNumber=" + aadharCardNumber
				+ ", panCardNumber=" + panCardNumber + ", address=" + address + ", pCard=" + pCard + "]";
	}
	
	

}
