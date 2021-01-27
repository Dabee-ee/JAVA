package com.kh.logic.test;

import java.util.Scanner;

public class SwitchTest {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
	
			/*
			 * Switch문은 특정 조건문을 작성하는 것이 아니라
			 * 조건에 들어가는 식의 결과 값에 따라
			 * 다양한 선택 문장을 실행하는 조건문이다.
			 * 
			 * ex)
			 *   int select = 000;
			 *   
			 *   switch( select ) {
			 *   	case 값1 :  . . . . break;
			 *   	case 값2 :  . . . . break;
			 *      . . . 
			 *   	default : . . . [break];
			 *   }
			 *   ** [] : 생략 가능하다는 표현 / 실제 작성 X
			 */
			
		
		
			// switch 문을 활용한 자판기 만들기
			
			System.out.println("-- 노다비's 미니 자판기 ver 0.5 --");
			
			System.out.println("-- 고길동's 미니 자판기 ver 0.5 --");
			System.out.println("1. 포카리스웨트");
			System.out.println("2. 파워에이드");
			System.out.println("3. 솔의눈");
			System.out.println("4. 미에로화이바");
			System.out.println("5. 웰치스");
			System.out.println("---------------------");
			
			// 1. 안내 문구
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			// switch
			switch( menu ) {
			
			case 1: // if ( menu == 1 )
				System.out.println("포카리스웨트를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("파워에이드를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("솔의눈을 선택하셨습니다.");
				break;
			case 4: 
				System.out.println("미에로화이바를 선택하셨습니다.");
				break;
			case 5:
				System.out.println("웰치스를 선택하셨습니다.");
				break;
				
			default : // 이도저도 아닌거라서 값을 특정 지을 수 없음. + else 역할
				System.out.println("잘못 누르셨습니다.");
				
				
			
		}
		
		}
	
	public void test2() {
		
		// 한자리의 정수를 입력받아
				// 그 수가 짝수인지, 홀수인지 판단하는 코드를 작성하기
				
				System.out.print("한 자리 정수 입력 : ");
				
				int num = sc.nextInt();
				
				switch(num) {
				
				case 1 : 
					System.out.println("홀수다!");
					break;
				case 2 :
					System.out.println("짝수다!");
					break;
				case 3 :
					System.out.println("홀수다!");
					break;
				case 4 :
					System.out.println("짝수다!");
					break;
				default : 
					System.out.println("0으로 들어왔습니다." );
					
				}
		
	}
	
	public void test3() {
		// 사칙연산 계산기 만들기
		
		System.out.println("OOO's 간이 계산기 :D ");
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수행할 사칙연산 입력 (+,-,*,/,%): ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch( op ) {
		
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		case '%' :
			result = num1 % num2;
			break;
		default :
			System.out.println("현재 지원하지 않는 연산자입니다.");
		return;
		}
		
		System.out.printf("%d %c %d = %d \n", num1, op, num2, result);
		
	}
	
	public void test4() {
		// 날이 좋은 날, 그는 그녀를 만나
		// 자신의 성적을 자랑하고 싶었다.
		// 총점 100만점 만점에
		// 90점 이상은 A,
		// 80점 이상은 B,
		// 70점 이상은 C,
		// 그 미만은 F 인 시험에서
		// 100점을 맞았기 때문이다.
		
		// 이 날, 그는 그녀를 만나기 전
		// 개발자인 당신을 만나 switch로
		// 성적을 계산하는 프로그램을 짜달라고 하였다.
		// 성공했다... 첫눈이 내리던 그 날... 그 날이 유독 좋았다...
		// [문제] 다음 내용에서 주인공인 개발자가 되어
		//        그(그녀)가 만들었을 코드를 직접 구현하시오.
		// hint : 90 ~ 99 / 10 == 9
		//        80 ~ 89 / 10 == 8
		//           . . . 
		
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();
		
		if( score > 100 || score < 0 ) {
			// sysout, syso 쓰고 Ctrl + space바
			System.out.println("잘못 입력했습니다.");
		} else {
			switch(score/10) {
			
			case 10: case 9:
				System.out.println("A 학점 입니다.");
				break;
			case 8:
				System.out.println("B 학점 입니다.");
				break;
			case 7:
				System.out.println("C 학점 입니다.");
				break;
			default : 
				System.out.println("F 학점입니다.");
			}
		}
	}
	
}

