package com.starbugs.model.vo;

import java.io.Serializable;

public class Coffee implements Serializable {
	// Fields
	private int orderNo;  // 주문번호
	private String name;  // 커피 명
	private int cup;      // 잔의 수
	private int price;    // 가격
	
	// 생성자
	public Coffee() { }
	
	public Coffee(int type, int cup) {
		// 사용자 정의 생성자
		
		setName(type);
		setCup(cup);
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getName() {
		return name;
	}
	
	public void setName(int type) {

		switch(type) {
		case 1 : 
			name = "아메리카노";
			price = 3500;
			break;
		case 2 :
			name = "카페라떼";
			price = 4500;
			break;
		case 3 :
			name = "에스프레소";
			price = 7500;
			break;
		}
	}
	
	public int getCup() {
		return cup;
	}
	public void setCup(int cup) {
		this.cup = cup;
		setPrice(getPrice() * cup);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 오버라이드 : 부모가 가진 메소드를 재정의하여 쓰겠다!
	@Override
	public String toString() {
		
		return "커피 정보 : " + name + ", " + cup + ", " + price + "원";
	}
	
}








