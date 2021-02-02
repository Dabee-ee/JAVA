package com.kh.obj.method;

public class A_NonStatic {
	
	// 논스태틱은 공유용도
	// 매소드들이 매개변수와 리턴타입을 받느냐 안받느냐에 따라
	// Main에서 실행하는 방법이 달라진다?
	
	// 1.  매개변수 X , 리턴타입(반환값) X 
	// 입력값도 받지 않고, 출력 값도 주지 않는 애
	public void test1() {
		// 실행 시 해당 기능만 수행한 뒤
		// 해당 메소드를 호출한 곳으로 돌아가는 메소드
		System.out.println("test 1 입니다 !!! ");
		
		return;		// 해당 메소드가 끝났을 때 메소드를 종료하며
							// 해당 메소드를 호출했던 지점으로 돌아가는 명령어
							// 만약 리턴타입이 void (돌려줄 값이 없음) 일 경우
							// JVM이 자동으로 추가해준다.
	}
		// 2. 매개변수 X, 리턴타입 O
		// 입력 값은 없는데, 출력 값은 주는 경우
		// 주고자하는 자료형의 타입을 적어놔야한다.
		public String test2() {
				// 만약 메소드가 끝나고 돌려주는 값(리턴 값)이 있다면
				// 즉, void가 아니라면 
				// 반드시 해당 자료형의 값을 return과 함께 작성해야 한다.
			String str = "촉촉한나라의초코칩공주";
			
			return str;
		}
		
		// 3. 매개변수 O , 리턴타입 X
		// 값이 void일 경우에 생략이 가능하다.
		public void test3(String name) {
			System.out.println(name + "님, 로그인을 환영합니다!");
		}
		// 4. 매개변수 O , 리턴타입 O
		public int sum(int num1, int num2) {
			return (num1 + num2 );
		}
	}

