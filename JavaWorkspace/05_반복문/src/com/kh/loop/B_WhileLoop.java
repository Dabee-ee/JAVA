package com.kh.loop;

import java.util.Scanner;

public class B_WhileLoop {
	
		Scanner sc = new Scanner(System.in);
		
		public void test1() {
			// while 문은 별도의 초기식, 증감식이 없이 
			// 특정 조건만 반복하면 무한정 반복을 수행하는 
			// 무한 반복의 특성을 지닌다.
			
			while ( 1 < 5 ) {
				System.out.println("Hello World!");
			}
	}
			public void test2() {
				// 문자열을 하나 입력받아
				// 문자열의 길이만큼 문자 하나씩 추출하기
				
				// 안내 문구
				System.out.println("문자열 입력 : ");
				String str = sc.next();
				
				// while 문을 일정 횟수만큼
				// 반복의 한계를 주고 싶다면
				// 초기값과 증감식을 각각 while문 시작과 
				// 끝에 기입을 해줘야 한다.
				
				int i = 0;   // for문 시작값
				
				// 문자열의 길이가 얼마정도인지 알 수 없을 때 length 활용
				while( i < str.length() ) {
					
					System.out.println( i + " : " + str.charAt(i) );
					i++;
				}
			}
			
			public void test3() {
			// 1부터 입력받은 수까지 합 계산하기
				
				System.out.println("정수 입력 : ");
				int num = sc.nextInt();
				
				int i = 1;
				int sum = 1;
				while( i < num ) {
					
					sum += i ;
					i ++;
					
					System.out.println( "sum : " + sum );
				
				}
			}
			
			/**
			// for문을 while로 바꾸는 방법
			// 1. 초기값을 밖에 선언한다.
			int i = 0;
			
			// 2. 조건식을 사용하여 while 반복문을 만든다.
			while(i <= 5) {
				sum += i;
			
				// 3. 증감식을 반복문 안에 선언한다.
				i++;
			}
			*/
			
			public void silsub1() {
				// while 문을 중첩 사용하여
				// 구구단 2~9단 출력하기
				
					int i = 2;
					
					while( i < 10 ) {
						// 2단~9단
						
						System.out.println( i + "단 ----------");
						
						int j = 1;
						while( j < 10 ) {
						System.out.println( "multi : " + (i * j) ); j ++;
				}
					i++;
					System.out.println("--------------------- ");
			}	
			}
			
			public void silsub2() {
				// 정수를 입력 받아 
				// 1부터 입력 받은 정수까지의 수를 홀수와 짝수로 구분하여
				// 홀수면 "당", 짝수면 "근"을 반복하여 출력 하되, 
				// for문과 while 문 두 가지 경우를 사용해 보시오.
				// 예) 4입력 : 
				//      당근당근
				//     5입력 :
				//      당근당근당

				// num % 2 == 0 (짝수)
				
				Scanner sc = new Scanner(System.in);
				System.out.println("정수를 입력하세요 :  ");
				int num = sc.nextInt();
				
				int i = 1;
				while(i <= num) {
					if (i % 2 ==0) {
						System.out.println("짝");
					}
					else {
						System.out.println("홀");
					}
					
					i++;
					}
					
				}
			}





