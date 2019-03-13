package com.myapp.spring.domain;

public class sales {

	private long id;
	private String item;
	private double price;
	
	public sales() {
		// TODO Auto-generated constructor stub
		
	}

	public sales(long id, String item, double price) {
		this.id = id;
		this.item = item;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("sales [id=");
		builder.append(id);
		builder.append(", item=");
		builder.append(item);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
}
