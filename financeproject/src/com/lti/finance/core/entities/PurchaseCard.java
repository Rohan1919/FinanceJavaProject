package com.lti.finance.core.entities;

import java.time.LocalDate;
import java.util.Enumeration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@SequenceGenerator(name="PAYMENTSEQ")
@Entity
@Table(name="PURCHASE_CARD")
public class PurchaseCard {
	@Id
	@Column(name="PCARDNO")
	private String pCardNo;
	@Column(name="CARDTYPE")
	private String cardType;
	@Column(name="CVV")
	private int cvv;
	@Column(name="USERID")
	private int userId;
	@Column(name="ISSUEDATE")
	private LocalDate issueDate;
	@Column(name="LIMIT")
	private double limit;
	@Column(name="STATUS")
	private String status;
	@Column(name="EXPDATE")                //DIFFERNT COLUMN NAME THAN VARIABLE
	private LocalDate expiryDate;

	public PurchaseCard() {
		
	}

	


	public PurchaseCard(String pCardNo, String cardType, int cvv, int userId, LocalDate issueDate, double limit,
			String status, LocalDate expiryDate) {
		super();
		this.pCardNo = pCardNo;
		this.cardType = cardType;
		this.cvv = cvv;
		this.userId = userId;
		this.issueDate = issueDate;
		this.limit = limit;
		this.status = status;
		this.expiryDate = expiryDate;
	}




	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	

	public String getpCardNo() {
		return pCardNo;
	}




	public void setpCardNo(String pCardNo) {
		this.pCardNo = pCardNo;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}




	@Override
	public String toString() {
		return "PurchaseCard [pCardNo=" + pCardNo + ", cardType=" + cardType + ", cvv=" + cvv + ", userId=" + userId
				+ ", issueDate=" + issueDate + ", limit=" + limit + ", status=" + status + ", expiryDate=" + expiryDate
				+ "]";
	}

	
	
	
}
