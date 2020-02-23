package com.lti.finance.core.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@SequenceGenerator(name="TRANSACTIONSEQ")
@Entity
@Table(name="PURCHASE")
public class Purchase {
	
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRANSACTIONSEQ")
	@Id
	@Column(name="PURCHASEID")
	private int purchaseId;
	@Column(name="TENTUREPERIOD")
	private int tenturePeriod;
	@Column(name="TRANSACTIONDATE")
	private LocalDate transactionDate;
	@Column(name="MONTHLYEMI")
	private double monthlyEmi;
	@Column(name="TOTALAMOUNT")
	private double totalAmount;
	
	
	@Column(name="PRODUCTID")
	private int productId;
	@Column(name="PCARDNO")
	private int pCardNo;
	
	
	public Purchase() {
		// TODO Auto-generated constructor stub
	}

	

	public Purchase(int purchaseId, int productId, int pCardNo, int tenturePeriod, LocalDate transactionDate,
			double monthlyEmi, double totalAmount) {
		super();
		this.purchaseId = purchaseId;
		this.productId = productId;
		this.pCardNo = pCardNo;
		this.tenturePeriod = tenturePeriod;
		this.transactionDate = transactionDate;
		this.monthlyEmi = monthlyEmi;
		this.totalAmount = totalAmount;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getpCardNo() {
		return pCardNo;
	}

	public void setpCardNo(int pCardNo) {
		this.pCardNo = pCardNo;
	}

	public int getTenturePeriod() {
		return tenturePeriod;
	}

	public void setTenturePeriod(int tenturePeriod) {
		this.tenturePeriod = tenturePeriod;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getMonthlyEmi() {
		return monthlyEmi;
	}

	public void setMonthlyEmi(double monthlyEmi) {
		this.monthlyEmi = monthlyEmi;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}



	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", productId=" + productId + ", pCardNo=" + pCardNo
				+ ", tenturePeriod=" + tenturePeriod + ", transactionDate=" + transactionDate + ", monthlyEmi="
				+ monthlyEmi + ", totalAmount=" + totalAmount + "]";
	}

	
	
	
	
	
	
	

}
