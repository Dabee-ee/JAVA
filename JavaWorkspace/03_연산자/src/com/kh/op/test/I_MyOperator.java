package com.kh.op.test;

import java.util.Scanner;

public class I_MyOperator {
	
	public void test() {
		
		// 삼항 연산자, 일반 논리 연산자 등을 사용하여 
		// 카페 음료를 취향에 따라 선택하는 코드 구현하기
		// ex) 고객명 : 딸끼쁘띠
		//  Hot  :  true
		//  Size :  small
		// > 딸기쁘띠님은 커피 samll 사이즈를 주문하셨습니다.
		// 계산 금액은 0000 원입니다.

		
		Scanner sc = new Scanner (System.in);
		
		// 변수 선언
		String name;
		int menu;
		char Hot ;
		char size ;
		int price;
		
		// 입력 값
		System.out.println("이름을 입력해주세요 :  ");
		name = sc.next();
		
		System.out.println("커피를 골라주세요 (아메리카노 = 1 / 라떼 = 2)  ");
		menu = sc.nextInt();
		
		System.out.println("Hot으로 주문하시겠습니까? ( Y / y) :  ");
		Hot = sc.next().charAt(0); 
		
		
		System.out.println("사이즈를 골라주세요. ( S  / M  / L  ) :  ");
		size = sc.next().charAt(0); 
		
		
		// 결과
		System.out.println("고객명 :  " + name);
		
		String result1 = (menu == 1) ? "아메리카노 " : "라떼 " ;
		System.out.println("커피  : " + result1);
		
		boolean result2 = (Hot == 89  || Hot == 121);
		System.out.println("Hot : " + result2);
		
		String result3 = (size == 'S' ) ? "S" : (size == 'M') ? "M" : "L";
		System.out.println("사이즈 : " + result3 );
		
		String result4 = (menu == 1 ) ? "4000원" : "5000원" ;
		System.out.println("가격 : " + result4 );
		
		
	}

}
