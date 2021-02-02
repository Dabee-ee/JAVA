package com.kh.obj.method;

public class B_Static {
	// 프로그램 실행 시 static 영역에 보관되며
	// 프로그램 종료 시 static 영역에서 제거된다.
	
	// Static은 언제 생겼을까?
	// 	-> JVM이 static이 쓰여지는 순간 미리 준비해놓는다.
	
	// 1. 매개 변수 X, 리턴 타입 X
	public static void test1() {
 		System.out.println("내가 바로 스테틱!!!!");

	}
	
	// 2. 매개 변수 X, 리턴 타입 O
	public static String test2() {
		return "간장공장공장장은";
	}

	// 3. 매개 변수 O, 리턴 타입X
	public static void test3(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 4. 매개 변수 O, 리턴 타입 O
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
}
