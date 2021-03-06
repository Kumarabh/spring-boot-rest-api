package com.restapiservices.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	@Column
	private String productName;
	
	@Column
	private String productCode;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne
	private Customer customer;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long productId, String productName, String productCode) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCode = productCode;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCode=" + productCode
				+ "]";
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	
	
	
	
	
	
	
}
