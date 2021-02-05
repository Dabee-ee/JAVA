package com.kh.cafe.model.vo;

// 다른 클래스를 상속받지 않아도
// 기본적으로 Object 클래스를 상속받아 사용한다.

public class Drink /* extends Object */{

	private String name;
	private String size;
	private int price;
	private String origin;
	
	public Drink () {}

	public Drink(String name, String size, int price, String origin) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.origin = origin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String drinkInfo() {
		return name + "," + size + "," + price + "," + origin;
	}
}
