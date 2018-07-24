package com.jagex.myTest.model;

public class Products {

	private String id;
	private String name;
	private int usdPrice;

	public Products(String id, String name, int usdPrice) {
		super();
		this.id = id;
		this.name = name;
		this.usdPrice = usdPrice;
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

	public int getUsdPrice() {
		return usdPrice;
	}

	public void setUsdPrice(int usdPrice) {
		this.usdPrice = usdPrice;
	}

}
