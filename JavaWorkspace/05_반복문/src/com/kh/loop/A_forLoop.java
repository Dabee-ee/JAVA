package com.kh.loop;

import java.util.Scanner;

public class A_forLoop {
	// 반복문
		// 어떠한 계산, 출력을 연달아 수행할 경우
		// 컴퓨터를 통해 반복하도록 만드는 문법
		
		// 1. For : 반복 횟수에 제한을 두는 반복문
		// 2. While : 반복 횟수에 제한이 없는 반복문
		// 3. do-while : 조건에 만족하지 않더라도 반드시 1번은 수행하는 반복문
	
	
	
	
	
	public void test1() {
		
		// for ( 시작할 숫자 ; 비교할 조건 ; 증가할 수식 ) {. . . 반복할 내용 . . .}
		
				// 1 ~ 10까지의 합을 구하시오
				// int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;

		
		int sum = 0;
		
		for( int i = 1; i <=10 ; i++) {
			
			System.out.println(" 반복 확인 : " + i);
			
			sum = sum +  i; // sum = sum + i;
			System.out.println("sum : " + sum);
					
		}
		
		System.out.println("\n 최종 값 : " + sum);
		
	}
	
	public void test2() {
		
		// 단순 반복
		// 1 ~ 100 까지 중 짝수들의 합을 구하시오
		
		int sum1 = 0;
		
		for(int i = 1 ; i <= 100 ; i ++) {
			
			if( i % 2 == 0) {
			sum1 += i;
			}
		}
		
		System.out.println("sum1 : " + sum1);	
		
		// 거꾸로 반복
		// 5 ~ 1 까지 카운트 세기
		// 마피아게임에서 00 명 남았습니다. 와 같은 개념
		
		for( int i = 5 ; i > 0 ; i--) {
			
			System.out.println(" i : " + i);
		}
		
	}
	
	public void silsub1() {
		// 정수 하나를 입력받아
		// 1부터 해당 숫자까지의 합을 구하시오.
		// for ( 변수 시작값; 어디까지; 돌 때마다 카운트 ){....}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i <= num ; i ++) {			
			sum = sum + i;
			
			System.out.println("\n 반복 확인 : " + i);
			System.out.println("sum : " + sum);
					
		}
		
		System.out.println("\n 최종 값 = " + sum );
		
		
	}

}
