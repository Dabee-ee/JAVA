package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		
		
		System.out.println("합 : " + sum);
		System.out.println("차 : " + sub);
		System.out.println("곱 : " + multi);
		
		if ( num2 == 0 || num2 < 0) {
			System.out.println("나누기 : 0 ");
		}
		else {
		System.out.println("나누기 : " + div);
		}

	}

}
