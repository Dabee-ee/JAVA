package com.kh.obj.method;

public class C_Overloading {

	// 오버로딩(Overloading)
		// 다른 매개변수를 가진, 같은 이름의 메소드를 선언할 때
		// 사용하는 기술 (= 메소드명 재활용)
		
		// 일반적으로 메소드는 주어진 매개변수를 사용하여
		// 정해진 소스코드를 실행하는 기능을 지닌다.
		// 이 때, 만약 같은 기능을 실행하는 메소드일 경우
		// 굳이 이름을 여러 개로 만들 필요가 있을까?
		// 이런 문제점에 착안하여 같은 기능을 실행하되
		// 사용하는 매개변수가 다르면 같은 이름을 가지도록
		// 하는 기술이 오버로딩이다.
		
		// 오버로딩 구현하기
		public void isZero(int num) {
			// 정수 하나를 num으로 받았을 때
			// 0이면 "0입니다."
			// 아니면 "0이 아닙니다." 출력
			
			// 사용자에게 입력받으려면 Scanner를 써야하지만
			// 매개변수를 입력받는 것에는 Scanner 필요 없음.
			
			if (num == 0) {
				System.out.println("0입니다.");
			}
			else {
				System.out.println("0이 아닙니다.");
			}
}

		// 이름 뭐로 지을지 할 필요가 없어지는 것이 오버로드
		// isZero 하나로 통일할 수 있음.
		
		public void isZero(double num) {
				// 0.0
			if (num == 0.0) {
				System.out.println("0입니다.");
			}
			else {
				System.out.println("0이 아닙니다.");
			}
			
		}
		public void isZero(char ch) {
			// '0'
			if (ch == '0') {
				System.out.println("0입니다.");
			}
			else {
				System.out.println("0이 아닙니다.");
			}
			
			/*
			 * 오버로딩 주의사항
			 * 1. 메소드 이름이 반드시 같아야 한다.
			 * 2. 매개변수의 자료형, 선언순서가 일치하면 안된다.
			 * 3. 리턴타입, 접근 제한자는 오버로딩하고 관련이 없다.
			 */
		}
			public int sum(int num1, int num2) {
				return num1 + num2;
			}
			
			// 안되는 경우
			// 1. 메소드의 매개 변수가 같을 경우
			// 2. 리턴 타입만 다르거나 접근 제한자만 다른 것도 안된다. 
			// 			-> 왜냐하면, 영향력이 없기 때문에.
			/*
			public double sum(int num1, int num2) {
				return num1 + num2;
			}
			*/
		
	}

