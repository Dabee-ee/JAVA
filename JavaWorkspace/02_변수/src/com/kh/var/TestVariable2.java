// 1. 패키지 : 특정 기능과 관련된 클래스들을 모아 놓은 폴더
package com.kh.var;

// 2. import : 다른 패키지의 클래스가 필요할 경우,
//						해당 클래스의 경로를 참조하기 위해 추가하는 명령어
						
// 3. 클래스 ( 앞글자는 대문자! )
// 여러 메소드(기능)와 변수들을 특정 목적으로 묶어 놓은 코드

public class TestVariable2 {
			// 변수를 선언하는 방법 - 전역 변수와 지역 변수
			// 1. 전역변수 (Global / Fields)
			// 클래스 바로 밑에 변수를 선언하면,
			// 다른 메소드들이 해당 변수를 공용으로 
			// 사용할 수 있으며, 값을 초기화 하지 않을 경우
			// 해당 자료형의 기본값으로 자동 초기화가 이루어진다.
	
			int num1 = 100;
			int num2 = 0;
			final double NUM3 = 500;
				
			// 기능 제공 메소드
			public void method1() {
						// 지역변수
						// 메소드 안에서 선언하는 변수
						// 메소드가 실행될 때 메모리에 추가되고,
						// 메소드가 종료되면 메모리에서 삭제한다.
				
						int num2 = 150;
						int num4 = 200;
						
						System.out.println("전역 변수 : " + num1);
						System.out.println("전역 변수 : " + num2);
						System.out.println("상수 : " + NUM3);
								
			}
			
			public void method2() {
				// 공사중
			}


	

}
