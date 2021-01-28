package com.kh.loop;

import java.util.Scanner;

public class Z_Silsub {
	
	Scanner sc = new Scanner(System.in);
	
	
	// 실습1. 
	// 정수 하나를 입력받아 직각 삼각형을 다음과 같이 출력하시오.
	// 입력 : 5 
	// *
	// **
	// ***
	// ****
	// *****
	
	public void test1() {
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		
		for(int i = 0; i <= num ; i++) {
			int sum = 0;
			sum = sum + i;
			
				for(int j = 0; j <=i ; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
		
	}
	
	
	public void test2() {
		
		System.out.println("가로 길이를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("세로 길이를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		for(int i = 0; i < num2 ; i++) {
			int sum = 0;
			sum = sum + i;
			
				for(int j = 0; j <num1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
		
	}
	
public void test3() {
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		
		for(int i = 0; i <= num ; i++) {
			int sum = 0;
			sum = sum + i;
			
				for(int j = 0; j <i ; j++) {

					for(int k = 0; k <=j  ; k++) {
						System.out.print("*");
						
						}
					System.out.println(j + 1);
					}
				}
				System.out.println();
		}

public void test4() {
	// 정수 하나를 입력받아
	// 직각 삼각형을 다음과 같이 
	// 출력 하시오.
	// 입력 : 5

	// *
	// **
	// ***
	// ****
	// *****
	
	// hint : print / println 활용
	
	System.out.print("입력 : ");
	int num = sc.nextInt();
	
	for( int i = 1 ; i <= num ; i++ ) { // 세로 줄 반복
		for( int j = 1 ; j <= i ; j++) { // 가로 줄 반복
			System.out.print("*");
		}
		System.out.println();
	}
}

public void test5() {
	// 가로와 세로 길이를 정수로
	// 각각 입력받아 직사각형을
	// * 로 출력 하시오
	// 가로 : 5
	// 세로 : 3
	
	// *****
	// *****
	// *****

	// hint : print / println 활용		
	System.out.print("가로 : ");
	int col = sc.nextInt();
	
	System.out.print("세로 : ");
	int row = sc.nextInt();
	
	int i = 1;
	while( i <= row ) { // 세로 반복
		
		int j = 1;
		while( j <= col) { // 가로 반복
			if(j != col) {
				System.out.print("*");
			} else {
				System.out.println("*");
			}
			j++;
		}
		i++;
	}
}


}
