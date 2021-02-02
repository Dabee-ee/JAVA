package com.kh.array;

import java.util.Scanner;

public class ArrayTest {
	
	Scanner sc = new Scanner(System.in);

	public void test1() {
		
		// 10명의 학생 점수 관리하기
		int score1 = 70;
		int score2 = 50;
		int score3 = 80;
		//  . . .
		
		// 변수가 너무 많으면 해당 변수들을
		// 일일히 사용하기도 어려울 뿐더러 관리, 
		// 연산처리에도 어려움이 생긴다.
		
		// Ah! 같은 자료형끼리 하나로 묶어보자!
		
		// 배열!
		// int[] 배열 이름;
		// int 배열이름[];
		
		int[] arr1 = new int[5];
		
		// [  ][  ][  ][  ][  ]
		//  0   1   2   3   4
		
		arr1[0] = 50;
		arr1[1] = 70;
		arr1[2] = 75;
		arr1[3] = 60;
		arr1[4] = 100;
		
		int sum = 0;
		
		for( int i = 0; i < arr1.length ; i++) {
			System.out.println(i + " : " + arr1[i]);
			
			sum += arr1[i];
		}
		
		System.out.println("sum : " + sum);
	}
	
	public void test2() {
		
		// 배열 사용방법
		// 1. 선언
		// 자료형[] 변수명;
		// 자료형 변수명[];
		
		// 배열을 선언하면 Heap 메모리에 
		// 배열의 크기만큼 공간이 할당된다(빌려온다)
		// 가장 앞에 있는 값의 주소를 가져와 stack 메모리에 저장한다.
		
		// 생성 및 초기화
		// 1. 공간만 할당하는 경우
		int[] arr = new int[5];
		
		// 2. 배열의 값으로 초기화하여 선언하는 경우
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		
		// 배열의 길이와 초기화값을 같이 선언할 수는 없다! - ERROR (못믿는다, 휴먼!)
		// int[] arr3 = new int[5] { 1, 2, 3, 4, 5, 6, 7 };
		
		// 3. 배열 값으로 선언 시 new 명령어 생략이 가능하다.
		// (short hand)
		int[] arr3 = { 1, 3, 5, 7, 9 };
		
		
		// int형 외에도 다른 자료형도 배열 선언이 가능하다
		char arr4[] = {'H', 'e', 'l', 'l', 'o'};
		
		System.out.println("arr4 : " + arr4);
			
		// 참조 자료형
		// String, 배열과 같이 Heap 메모리에
		// 값을 저장하는 변수들은 메모리 고유 주소번지값을
		// 가지는데, 이렇게 new로 생성하여 주소를
		// '참조하여 가져온다' 라는 표현을 써서 참조 자료형이라 부른다.
	}
	
	public void testCopy() {
		// 얕은 복사와 깊은 복사
		// 1. 얕은 복사
		//  배열의 주소만 복사하는 방법
		
		int[] origin = { 1, 2, 3 };
		int[] copy   = origin;
		
		// 안의 내용 출력하기
		for( int i = 0 ; i < origin.length ; i++) {
			
			System.out.println("원본 : " + origin[i]);
			
		}
		
		System.out.println("-------------------------------");
		
		for( int i = 0 ; i < copy.length ; i ++) {
			
			System.out.println("사본 : " + copy[i]);
		}	
	}
	public void testCopy2() {
		// 2. 깊은 복사
		// 배열의 주소가 아닌 실제 배열의 값들을
		// 복사하여 새로운 배열을 만드는 방법
		
		// 1) for 반복문을 사용하는 방법
		int[] origin1 = { 1, 2, 3, 4, 5 };
		int[] copy1   = new int[origin1.length];
		

	}
	
	public void silsub1() {
		// 배열 실습
		// 1~100까지 수 중 하나의 정수를
		// 총 다섯번 입력받아 배열의 각 방에 저장한 후
		// 이를 합하여 출력하는 기능을 구현하시오.
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for( int i = 0 ; i < 5 ; i ++) {
			System.out.print("1 ~ 100 까지 중 하나 입력 : ");
			array[i] = sc.nextInt();
			
			if( 1 > array[i] || array[i] > 100) {
				System.out.println("다시 입력해주세요!");
				i--;
			}
		}
		
		int sum = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			sum += array[i];
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void silsub2() {
		// 그 날도 어제와 같이 배가 무척 고픈 날이었다.
				// 그는 오늘도 어김없이 '엄마의 손맛'에 가서
				// 햄버거를 주문했다. 
				// 햄버거 1개는 4100원, 감자튀김은 1500원,
				// 콜라는 1캔 700원
				// 그는 햄최몇의 국가 대표이다.
				// 햄버거 5개는 먹어야 한다. 
				// 여기에, 감자튀김 2개, 콜라 3개를 추가 주문하였다.
				// 결제를 하려는데, 금액이 어디...
				// 어라... 총 얼마였지...
				// 계산기를 찾아 가방을 뒤져보다 이클립스를 발견했다.
				// 그래, 코드로 이 상황을 해결해보자!
				
				// [문제] 위와 같이 여러 음식을 여러 개 주문 하였을 때
				//          총 결제 금액이 얼마인지 산출하는
				//          프로그램을 작성하시오.
				
				String[] menuList = {"햄버거", "감자튀김", "콜라" }; 
				// 0, 2, 4 번 공간 : 가격 저장
				// 1, 3, 5 번 공간 : 갯수 저장
				int[] selectList = {4100, 0, 1500, 0, 700, 0};
				
				// ------------ 메뉴 입력부 ------------
				// for문 조건들에 여러 변수도 사용 가능
				for(int i = 0, j = 1 ; i < 3 ; i ++, j += 2) {
					System.out.print(menuList[i]+" : ");
					selectList[j] = sc.nextInt();
				}
				
				// ------------ 합계 계산부 ------------
				int sum = 0;
				
				for(int i = 0; i < 6 ; i +=2) {
					sum += (selectList[i] * selectList[i+1]);
				}
				
				// ------------ 결과 출력부 ------------
				// %d = 정수 표현 / %,d = 정수에 천단위 쉼표 표현
				System.out.printf("합계 : %,d 원", sum);
	}
}

