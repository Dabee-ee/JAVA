package com.kh.op.test;

import java.util.Scanner;

public class G_삼항연산자 {
	
	public void test() {
		
		// 비교 항목이 3개인 연산자
		// 형식 : (조건식) ? "참일 때 값" : "거짓일 때 값"
		// ** 조건식 : 해당 연산의 결과가 반드시 참이나 거짓이 나오는 연산 식
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("남성은 1, 여성은 2 : ");
		
		int gender = sc.nextInt();
		
		// 삼항연산자
		// String result = (gender == 1) ? "남성" : "여성";
		
		// 삼항연산자 중첩 사용 (여러 개 사용) 으로 정확한 식 구현 가능
		
		String result = (gender == 1) ? "남성" : (gender == 2) ? "여성" : "알 수 없음";

		System.out.println("당신은 " + result + "입니다.");
		
		
	}

}
