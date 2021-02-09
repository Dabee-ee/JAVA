package com.kh.excep.throwsTest;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작!");
		
		ThrowsTest th1 = new ThrowsTest();
		// try-catch
		
		try { // 예외가 발생할 수 있는 코드
			th1.testA();
		} catch(Exception e) {
			// 만약 실행 중 Exception이 발생했다면 
			// 대타로 실행할 코드들
			System.out.println("실행 중 문제가 발생했습니다.");
			System.out.println("문제 상황 : " + e.getMessage());
			
			// 개발자 확인용
			// e.printStackTrace();
		} finally {
			// 문제 상황이 발생하더라도
			// 반드시 실행해야 할 코드를 작성하는 영역
			System.out.println("지금까지 작성한 내용을 저장합니다.");
		}
		
		System.out.println("프로그램 종료!");
	}

}
