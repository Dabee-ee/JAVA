package com.kh.loop;

import java.util.Random;
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
	
	public void test3() {
		// 1에서 100까지 수 중
		// 3의 배수의 합을 구하고,
		// 3의 배수가 총 몇 개 있는지 구하여
		// 합 : ooo / 개수 : ooo 이라고 출력하시오.
		
		int sum = 0;
		int count = 0;
		
		// 반복문 조건
		// 시작값 : 1
		// 끝값 : 100
		// 반복 시 증가 수치 : +1
		for( int i = 1 ; i <= 100 ; i++ ) {
			
			if( i % 3 == 0) {
				// 3의 배수라면
				sum += i;
				count++;
			}
			
		}
		
		System.out.println("합 : " + sum + "/ 개수 : " + count);
	}
	
	public void test4() {
		// 구구단
		// 2단
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		//   . . .
		// 2 * 9 = 18
		
		for(int i = 1 ; i < 10 ; i++) {
			
			System.out.println("2 * " + i + " = " + (2 * i));
	}
	}
		
		public void test5() {
			
			for(int j = 2 ; j < 10 ; j ++) {
			
				for(int i = 1 ; i < 10 ; i ++) {		
					
					System.out.println("multi  " + (j * i));
				}
				
				System.out.println("--------------------- ");
				}	
		}
		
		public void silsub2() {
			
			// 1에서 6까지 주사위 임의의 수(랜덤한 수) 3번을 반복해서
			// 구한뒤 각각의 값과 합계를 출력하는 코드를 작성 하시오.
			// ---------------
			// 주사위 : 3
			// 주사위 : 4
			// 주사위 : 1
			// 합계 : 8
			// ---------------
			
			int sum = 0;
			for(int i = 1; i <= 3 ; i++) {
				int rnd = new Random().nextInt(6) + 1;
				
				System.out.println("주사위 : " + rnd);
				sum += rnd;
			}
			System.out.println("합계 : " + sum);
			
		}
		
		
}
