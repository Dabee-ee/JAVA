package com.kh.excep.my;

import java.util.Scanner;

public class MyExcepTest {

	public static void main(String[] args) {
		
		MyExcepTest test = new MyExcepTest();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 온도를 입력하세요! ");
		int value = sc.nextInt();
		try {
			test.checkTemp(value);
		} catch (TempException e) {
			
			// 1. 사용자에게 문제 발생 인지
			System.out.println(e.getMessage());
			System.out.println("담당자 홍길동에게 연락하세요~!");
			
			// 2. 개발자에게 문제 발생 추적
			e.printStackTrace();
			
		} finally {
			
			
		}
	}
	
	public void checkTemp(int value) throws TempException {
		
		if(value > 30) {
			
			// System.out.println("실내 온도가 너무 높습니다!");
			throw new TempException("실내 온도가 너무 높습니다!");
			
		} else if(value < 1) {
			
			// System.out.println("실내 온도가 너무 낮습니다!");
			throw new TempException("실내 온도가 너무 낮습니다!");
			
		} else {
			
			System.out.println("정상입니다~!");
		}
	}

}
