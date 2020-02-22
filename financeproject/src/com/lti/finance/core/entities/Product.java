package com.lti.finance.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="PRODUCT_INFO")
public class Product {
	
	@Id
	@Column(name="PRODUCTID")
	private int productId;
	
	@Column(name="PRODUCTNAME")
	private String productName;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="PRODUCTDETAILS")
	private String productDetails;
	
	@Column(name="PRODUCTURL")
	private String productUrl;
	
	@Column(name="PRODUCTTYPE")
	private String productType;
	
	public Product() {
		
	}
	public Product(int productId, String productName, double price, String productDetails, String productUrl,
			String productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productDetails = productDetails;
		this.productUrl = productUrl;
		this.productType = productType;
	}


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", productDetails=" + productDetails + ", productUrl=" + productUrl + ", productType=" + productType
				+ "]";
	}

	
	
	
}
