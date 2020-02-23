package com.lti.finance.core.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Enumeration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@SequenceGenerator(name="SCHEDULESEQ")
@Entity
@Table(name="EMI_TRANSACTION_SCHEDULE")
public class EmiSchedule {
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SCHEDULESEQ")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRANSACTIONIDSEQ")
	@SequenceGenerator(name="TRANSACTIONIDSEQ", sequenceName="TRANSACTIONIDSEQ", allocationSize=1)
	@Column(name="TRANSACTIONID")
	private int transactionId;
	@Column(name="PURCHASEID")
	private int purchaseId;
	@Column(name="INSTALLMENTNO")
	private int installmentNo;
	@Column(name="DUEDATE")
	private Date dueDate;
	@Column(name="AMOUNTRECEIVED")
	private double amountReceived;
	@Column(name="AMOUNTRECEIVABLE")
	private double amountReceivable;
	@Column(name="STATUS")
	private String status;

   
	public EmiSchedule() {
		
	}

	
	public EmiSchedule(int transactionId, int purchaseId, int installmentNo,Date dueDate, double amountReceived,
			double amountReceivable, String status) {
		super();
		this.transactionId = transactionId;
		this.purchaseId = purchaseId;
		this.installmentNo = installmentNo;
		this.dueDate = dueDate;
		this.amountReceived = amountReceived;
		this.amountReceivable = amountReceivable;
		this.status = status;
	}


	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getInstallmentNo() {
		return installmentNo;
	}

	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(double amountReceived) {
		this.amountReceived = amountReceived;
	}

	public double getAmountReceivable() {
		return amountReceivable;
	}

	public void setAmountReceivable(double amountReceivable) {
		this.amountReceivable = amountReceivable;
	}

	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "EmiSchedule [transactionId=" + transactionId + ", purchaseId=" + purchaseId + ", installmentNo="
				+ installmentNo + ", dueDate=" + dueDate + ", amountReceived=" + amountReceived + ", amountReceivable="
				+ amountReceivable + ", status=" + status + "]";
	}

	
}
