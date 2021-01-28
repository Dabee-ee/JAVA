package com.kh.loop;

import java.util.Scanner;

public class E_ContinueTest {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// 문자열을 입력받아
		// 한 문자 씩 출력하는 기능
		
		System.out.println("문자열 입력 : ");
		String str = sc.next();
		
		for( int i = 0 ; i < str.length(); i++) {
			
			System.out.println(i);
			
			if ( i % 2 == 0 ) {
				
				continue; // 조건문과 함께 쓰임
			
			}
			
			System.out.println(str.charAt(i));
		}
		
	}

}
