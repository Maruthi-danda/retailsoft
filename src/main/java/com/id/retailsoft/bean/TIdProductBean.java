package com.id.retailsoft.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TIdProductBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long productId;
	
	String productName;
	
	Long productPrice;
	
	

	public Long getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public Long getProductPrice() {
		return productPrice;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	
	
	

}
