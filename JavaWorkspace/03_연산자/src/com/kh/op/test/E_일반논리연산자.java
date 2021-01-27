package com.kh.op.test;

import java.util.Scanner;

public class E_일반논리연산자 {
	
	public void test1() {
		
		// && : and ( ~이면서 ~인 것 ) 11순위
		// || : or  ( ~이거나 ~인 것 ) 12순위
		
		// 청소년 나이
		// 14 <== age <= 19
		// 14 <== age && age <= 19
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력  : " );
		int age = sc.nextInt();
		
		boolean result = (age >= 14 && age <= 19);
		
		System.out.println("청소년 구별 : " + result);

	}
	
	public void test2() {
		
		// 실습 
		// 문자 하나를 입력받아 
		// 해당 문자가 영어 대문자인지 확인하는 프로그램(기능) 메소드 작성하기
		Scanner sc = new Scanner(System.in);
		
		// 스캐너는 문자 하나를 받아도 문자열로 생각한다.
		// 그러므로 문자 하나를 뽑아주는 식을 써줘야 제대로 인식한다.
		System.out.println("문자 하나를 입력하세요  : " );
		char ch = sc.next().charAt(0); 
		
		boolean result = ((int)ch >= 65 && (int)ch <= 90);
		System.out.println("영대문자인가요? : " + result);
	}
	
	public void test3() {
		
		// 문자 하나를 입력받아
		// Y이거나 y이면 true
		// 그 이외의 문자이면 false를 출력하세요.
		// 입력 : Y
		// Y/y를 입력했나요? true / false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계속 하시겠어요? (Y / y)  : " );
		char ch = sc.next().charAt(0); 
		
		boolean result = ((int)ch == 89  || (int)ch == 121);
		System.out.println("Y/y를 입력했나요? : " + result);
		
		// int를 안써도 출력 가능!
	}

}
