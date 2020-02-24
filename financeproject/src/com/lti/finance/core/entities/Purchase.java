package com.lti.finance.core.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@SequenceGenerator(name="TRANSACTIONSEQ")
@Entity
@Table(name="PURCHASE")
public class Purchase {
	
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRANSACTIONSEQ")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PURCHASEIDSEQ")
	@SequenceGenerator(name="PURCHASEIDSEQ", sequenceName="PURCHASEIDSEQ", allocationSize=5)
	@Column(name="PURCHASEID")
	private int purchaseId;
	@Column(name="TENTUREPERIOD")
	private int tenturePeriod;
	@Column(name="TRANSACTIONDATE")
	private Date transactionDate=Date.valueOf(LocalDate.now());
	@Column(name="MONTHLYEMI")
	private double monthlyEmi;
	@Column(name="TOTALAMOUNT")
	private double totalAmount;
	
	@Column(name="USERID")
	private int userId;
	
	@Column(name="PRODUCTID")
	private int productId;
	@Column(name="PCARDNO")
	private int pCardNo;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="PRODUCTID",insertable = false,updatable=false)
	private Product product;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "purchase")
	private EmiSchedule emiSchedule;
	public Purchase() {
		
	}

	public Purchase(int purchaseId, int tenturePeriod, Date transactionDate, double monthlyEmi, double totalAmount,
			int userId, int productId, int pCardNo, Product product) {
		super();
		this.purchaseId = purchaseId;
		this.tenturePeriod = tenturePeriod;
		this.transactionDate = transactionDate;
		this.monthlyEmi = monthlyEmi;
		this.totalAmount = totalAmount;
		this.userId = userId;
		this.productId = productId;
		this.pCardNo = pCardNo;
		this.product = product;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getTenturePeriod() {
		return tenturePeriod;
	}

	public void setTenturePeriod(int tenturePeriod) {
		this.tenturePeriod = tenturePeriod;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getpCardNo() {
		return pCardNo;
	}

	public void setpCardNo(int pCardNo) {
		this.pCardNo = pCardNo;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", tenturePeriod=" + tenturePeriod + ", transactionDate="
				+ transactionDate + ", monthlyEmi=" + monthlyEmi + ", totalAmount=" + totalAmount + ", userId=" + userId
				+ ", productId=" + productId + ", pCardNo=" + pCardNo + ", product=" + product + "]";
	}
	
		
	
	

}
