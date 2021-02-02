package com.kh.prod;

public class Product {
	
	// 1. 필드변수
	private String name;
	private int price;
	private int quantity;

	// 기본 생성자
	public Product() {}
		
	// 초기 값을 받는 생성자 ?
	
public Product(String name, int price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
}
		// 기능 제공 메소드
		
		public void Print() {
			System.out.println(name + price + quantity);
		}

	

}
