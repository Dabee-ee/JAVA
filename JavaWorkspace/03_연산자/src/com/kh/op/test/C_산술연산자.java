package com.kh.op.test;

public class C_산술연산자 {
	// +, -, *, /, %
	
		public void test1() {
			int num1 = 10;
			int num2 = 5;
			
			System.out.println("두 수의 합 : " + ( num1 + num2 ));
			System.out.println("두 수의 차 : " + ( num1 - num2 ));
			System.out.println("두 수의 곱 : " + ( num1 * num2 ));
			System.out.println("두 수의 몫 : " + ( num1 / num2 ));
			System.out.println("나눈 나머지 : " + ( num1 % num2 ));
			
			// -------------------------- //
			// -------------------------- //
			
			// 문자열과 '+' 을 수행하는 경우
			// 문자 하나와 숫자를 연산하면, 문자가 숫자로 변한다. (자동형변환 발생!)
			// 문자열과 숫자를 더하면, 숫자가 문자열이 된다.
			
			System.out.println(10 + 'A'); // 10 + 65 --->
			System.out.println("10" + 'A'); // 10 + A ---> 10A
			System.out.println(1 + 3 + "5"); // (1 + 3) + "5" ---> "45"
			System.out.println("20" + 2 + 1); // ("20" + 2) + 1 ---> "2021"
			
		}
	}

