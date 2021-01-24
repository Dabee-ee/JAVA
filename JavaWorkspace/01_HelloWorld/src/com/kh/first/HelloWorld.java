// 한 줄 주석 (설명 문구)
// 이렇게 주석을 작성하게 되면, 개발자는 볼 수 있으나
// 실제 컴파일되어 컴퓨터에게 명령을 지시할 땐 무시됨.


/*
 * 여러줄 주석도 가능하다.
 * 우아아아앙
 */

/**
 * 색깔이 달라졌다.
 */

package com.kh.first;
/**
 * javaDocument : javaDoc 주석 ( 자바 파일 관련 문서 작성용 주석 )
 * [참고 링크] http://www.devkuma.com/books/pages/1232
 * 
 *
 *어떠한 클래스나 파일에 대한 내용을
 *설명하는 문서를 작성할 때 사용하는 주석이다.
 *
 *@author user1
 *@when 2021-01-22
 *@version 1.0
 */


public class HelloWorld {

	/*
	 * 자바 프로그램 작성 순서
	 * - 프로젝트 생성
	 * - 자동 생성된 src 폴더 안에 패키지 생성
	 *   패키지(package) : 특정 목적을 가진 소스 코드들을
	 *                   한 곳에 묶어 놓은 폴더 (like 양말은 양말서랍, 치킨은 치킨서랍에...)
	 * 
	 * - 클래스 파일 생성
	 *   클래스(class) : 어떠한 요소를 작성할 때 사용하는 하나의 설계 도면
	 *   
	 * - 메소드 생성
	 *   메소드(Method) : 특정 클래스 안에서 하나의 기능을 담당하는 함수
	 *   
	 *   실행 전용 메소드 :
	 *   	해당하는 프로젝트 전체에서 단 한 개만 존재하는 메소드
	 *      프로그램 실행 시 동작하는 함수
	 *   	public static void main(String[] args) { . . . }
	 *   
	 *   기능 제공 메소드 :
	 * 		나머지
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");

	}

}
