package com.lti.finance.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@SequenceGenerator(name="PAYMENTSEQ")
@Entity
@Table(name="USER_PAYMENT_RECORD")
public class UserPaymentRecord {
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAYMENTSEQ")
	@Id
	@Column(name="PAYMENTID")
	private int paymentId;
	@Column(name="BANKNAME")
	private String bankName;
	@Column(name="CARDNO")
	private String cardNo;
	@Column(name="TRANSACTIONID")
	private int transactionId;
	
	public UserPaymentRecord() {
		// TODO Auto-generated constructor stub
	}

	public UserPaymentRecord(String bankName, String cardNo, int transactionId, int paymentId) {
		super();
		this.bankName = bankName;
		this.cardNo = cardNo;
		this.transactionId = transactionId;
		this.paymentId = paymentId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	@Override
	public String toString() {
		return "UserPaymentRecord [paymentId=" + paymentId + ", bankName=" + bankName + ", cardNo=" + cardNo
				+ ", transactionId=" + transactionId + "]";
	}

	
	
	
	
}
