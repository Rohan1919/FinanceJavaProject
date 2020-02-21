package com.lti.finance.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_CARD")
public class UserCard {
	
	@Id
	@Column(name="CARDNO")
	private String cardNo; 
	@Column(name="CVV")
	private int cvv;
	@Column(name="BANK_NAME")
	private String bankName;
	@Column(name="BALANCE")
	private double balance;
	
	
	public UserCard() {
		// TODO Auto-generated constructor stub
	}

	public UserCard(String cardNo, int cvv, String bankName, double balance) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.bankName = bankName;
		this.balance = balance;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "UserCard [cardNo=" + cardNo + ", cvv=" + cvv + ", bankName=" + bankName + ", balance=" + balance + "]";
	}
	
	

}
