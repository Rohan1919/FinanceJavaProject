package com.lti.finance.core.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="GOVAPI")
public class GovApi {
	
	@Id
	@Column(name="AADHARCARD")
	private String aadharCardNo;
	
	
	@Column(name="NAME")
	private String name;
	
	
	@Column(name="PANCARD")
	private String panCardNo;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL,mappedBy="gapi")
	private User user;
	
	public GovApi() {
		// TODO Auto-generated constructor stub
	}

	public GovApi(String name, String aadharCardNo, String panCardNo) {
		super();
		this.name = name;
		this.aadharCardNo = aadharCardNo;
		this.panCardNo = panCardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharCardNo() {
		return aadharCardNo;
	}

	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	@Override
	public String toString() {
		return "GovApi [name=" + name + ", aadharCardNo=" + aadharCardNo + ", panCardNo=" + panCardNo + "]";
	}
	
	
	

}
