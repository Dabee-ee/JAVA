package com.kh.obj.model.vo;

public class Book {
	
// 1. 추상화 과정
	// 필요한 정보 : 제목, 가격, 저자, 출판사
	
	// 1. 필드 변수
	private String title;
	private int price;
	private String author;
	private String publish;
	
	// 2. 생성자
	
	// 기본생성자
	public Book() {} 	
	// 단, 상속 관계 시 부모의 생성자는 자동으로 만들어지지 않는다.
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public Book(String title, int price, String author, String publish) {
		
		this(title, price);    // 다른 생성자( this() )를 사용할 땐
								// 반드시 해당 구문이 가장 위에 있어야 한다.
		this.author = author;
		this.publish = publish;
	}
	
	
	// 기능 제공 메소드
	
	public void bookPrint() {
		System.out.println(title +", " + price + ", " + author + ", " + publish);
	}
}
