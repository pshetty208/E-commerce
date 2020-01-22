package com.ecommerce.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Order {
	
	@Id
	@Column(name = "OrderNum")
	private String OrderNo;
	@Column(name = "productsList")
	private List<Product> products;
	@Column(name = "totalAmount")
	private double Total;
	
	public String getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}
	
	@OneToMany(targetEntity=Product.class, mappedBy="ProductId", fetch=FetchType.EAGER)
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	

}
