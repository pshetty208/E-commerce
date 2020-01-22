package com.ecommerce.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {
	
	@Id
	private String ProductId;
	private int Units;
	
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public int getUnits() {
		return Units;
	}
	public void setUnits(int units) {
		Units = units;
	}
	
	

}
