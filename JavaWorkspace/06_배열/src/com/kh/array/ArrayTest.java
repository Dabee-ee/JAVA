package com.kh.array;

public class ArrayTest {

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
		
	}

