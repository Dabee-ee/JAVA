package com.kh.loop;

import java.util.Scanner;

public class C_DowhileLoop {
	
	Scanner sc = new Scanner(System.in);
public void test1() {
		
		String msg = null; 
		
		// 컴퓨터 상에 아직 값이 들어갈 공간이 정해지지 않은
		// 빈 공간을 뜻한다.
		
		do { // 최초 한 번은 반드시 실행!
		
			
			System.out.println("문자열 입력 : ");
			msg = sc.next();
			
			System.out.println("글자 수 : " + msg.length());
		}
			while( ! msg.equals("나가기")); 
			
			
		}
		
	}

