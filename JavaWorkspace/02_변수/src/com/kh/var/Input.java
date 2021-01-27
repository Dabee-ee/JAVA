package com.kh.var;

import java.util.Scanner;

public class Input {
	
	public void TestUnicode() {
		
		Scanner sc = new Scanner(System.in);
		
		// 스캐너 특징상 문자 하나를 입력받을 수는 없다. 
		// 항상 입력하고 엔터까지 값으로 받기 때문에.
		System.out.println("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);  // 첫 번째 문자를 꺼낸다.
		
		// 안 녕 하 세 요
		// 0  1   2  3  4  
		
		System.out.println("문자 : " + ch);
		
	}

}
