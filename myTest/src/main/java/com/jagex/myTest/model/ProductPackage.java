package com.jagex.myTest.model;

public class ProductPackage {

	private String id;

	private String name;

	private String description;

	private Products products;

	private int totalPrice;

	public ProductPackage(String id, String name, String description, Products products, int totalPrice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.products = products;
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
