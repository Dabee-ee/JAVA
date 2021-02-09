package com.kh.excep.throwsTest;

public class ThrowsTest {
	// 예외를 발생시키고
	// 처리하는 과정
	
	public void testA() throws Exception {
		
		System.out.println("저는 김철수 부장입니다.");
		
		testB();
		
		System.out.println("김철수 부장 퇴근합니다!");
	}
	
	public void testB() throws Exception {
		
		System.out.println("저는 홍길동 과장입니다.");
		
		testC();
		
		System.out.println("홍길동 과장 퇴근합니다!");
	}
	
	public void testC() throws Exception {
		
		System.out.println("저는 신입사원 고길동입니다 :) ");
		
		// 강제로 예외 상황을 발생 시키는 예약어
		throw new Exception("화재 발생!!");
		
		// 예외가 발생했을 때,
		// 해당 예외 줄까지만 실행하고 그 밑은 실행하지 않는다.
		// System.out.println("신입사원 퇴근합니다. :) ");
	}

}
