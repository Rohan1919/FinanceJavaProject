package com.lti.finance.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="PRODUCT_INFO")
@Component
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
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double price, String productDetails) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productDetails = productDetails;
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

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", productDetails=" + productDetails + "]";
	}
	
	
	
}
