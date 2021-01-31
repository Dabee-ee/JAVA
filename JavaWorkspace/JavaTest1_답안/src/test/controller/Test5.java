package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if (num1 > 9 ) { // 9 
			System.out.println("한 자리 수만 입력 가능합니다.");
		}
		else {
			System.out.println("두 번째 정수를 입력하세요 : ");
			int num2 = sc.nextInt();
			
			if (num2 > 9) {
				System.out.println("한 자리 수만 입력 가능합니다.");
			}
			else {
				int sum = num1 + num2; 
				int multi = num1 * num2;
				
				if (sum > 1 && sum < 19) {
					if (multi < 10) {
						System.out.println("한 자리 수 입니다.");
					} else {
						System.out.println("두 자리 수 입니다.");
				
					}
				}
			}
		}		
	}
}



