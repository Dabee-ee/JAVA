package com.kh.prac2;

public class Fruit {
	
	private String name;
	private int price;
	private int quantity;
	
	public void Fruit() {}

	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
//		return String.join(" - ", );
		String result = String.join(" - ",name + price + quantity);
		
		return (result);
	}
	
	

}
