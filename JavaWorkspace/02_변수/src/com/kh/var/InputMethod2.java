package com.kh.var;
import java.util.Scanner;

public class InputMethod2 {
	
	
	public void myInputMethod() {
		// 기본 자료형 3가지 이상을 사용하여
		// 도서 정보를 입력받아 출력하는 프로그램 만들기
		// 단, Scanner를 사용하고, 변수의 이름은 직접
		// 선언하여 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		
		String BookTitle;    // 도서명
		int price;        // 가격
		double discount;  // 할인율
		boolean stock; // 재고

		// 2. 화면에 값을 입력받기 위한 안내 메시지 출력하기
		System.out.print("도서명 입력 : ");
		BookTitle = sc.next();
				
		System.out.print("가격 입력 : ");
		price = sc.nextInt();
				
		System.out.print("할인율 입력 : ");
		discount = sc.nextDouble();
		
		System.out.print("재고 유무 : ");
		stock = sc.nextBoolean();

		// 3. 키보드로 입력한 내용 출력하기
		System.out.println("도서명 : " + BookTitle);
		System.out.println("가격 : " + price + "원");
		System.out.println("할인율 : " + discount + "%");
		System.out.println("재고유무 : " + stock );
		
	}

}
