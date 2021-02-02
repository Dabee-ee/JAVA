package com.kh.obj.method;

public class MethodTest {
	
	// 메소드는 다른 메소드를 호출할 수 있다!
	
	public void methodA() {
		System.out.println("메소드 A 입니다. ");
		
		// 이렇게 다른 메소드를 호출해서 메소드들끼리 연결시키면
		// A만 불러도 다른 메소드들까지 한번에 불러진다.
		// 이러한 구조 때문에 변수가 stack에 담긴다. (cf. 시퀀스 다이어그램)
		methodB();

	}
	
	public void methodB() {
		System.out.println("메소드 B 입니다. ");
		
		methodC();
	}
	
	public void methodC() {
		System.out.println("메소드 C 입니다. ");
	}

}
