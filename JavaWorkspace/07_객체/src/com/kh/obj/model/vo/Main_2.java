package com.kh.obj.model.vo;

public class Main_2 {
	public static void main(String[] args) {
		
		// 같은 패키지 내에 있기 때문에 import 안한다.
		Human hu = new Human();
		
		// 같은 패키지 에서는 접근이 가능하다.
		hu.age = 10;
		hu.gender = 'M';
		
		// hu.tel; --> private는 여전히 접근이 불가하다.
		
		// Book 생성자 확인
		
		Book bk1 = new Book();
		Book bk2 = new Book("아프니까청춘이다", 15000);
		Book bk3 = new Book("어린왕자", 11500, "생텍쥐페리", "문학나무");

		bk1.bookPrint();
		bk2.bookPrint();
		bk3.bookPrint();
		
	}

}
