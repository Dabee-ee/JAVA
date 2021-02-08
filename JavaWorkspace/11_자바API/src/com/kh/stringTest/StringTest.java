package com.kh.stringTest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		StringTest st = new StringTest();
		
		// st.test1();
		// st.stringBuffer();
		// st.stringBuilder();
		// st.stringSplit();
		st.exam2();
	}

	public void test1() {
		/*
		 * String 클래스 특성
		 * 
		 * 1. 불변성의 값이다.
		 * 2. 값이 변경될 때마다 Heap 공간의
		 *    문자열 저장소(String pool)에 값을
		 *    일일히 저장한다.
		 * 3. 이미 동일한 값이 저장되어 있으면
		 *    새로운 문자열 공간을 할당하지 않는다.
		 */
		
		String str1 = "Hello World!";
		String str2 = "Hello World!";
		String str3 = new String("Hello World!");
		
		// 본래 두 객체의 주소는 달라야 하지만
		// "Hello World!"가 이미 저장이 되어 있기 때문에
		// 두 객체가 같은 공간을 바라본다.
		System.out.println("str1 과 str2 비교하기 : " + (str1 == str2));
		
		System.out.println("str1 과 str3 비교하기 : " + (str1 == str3));
		
		//실제 값과 비교한다?
		System.out.println("str1.equals(str3) : " + (str1.equals(str3)));
		
		// -----------------------------
		
		String str4 = "안";
		String str5 = "안" + "녕";
		
		System.out.println("str4와 str5 비교하기 : " + (str4 == str5));
		
	}
	
	public void stringBuffer() {
		// 문자열 변경 시에 임시의 공간에 담아
		// 값을 완전히 변경하기 전까지 문자열 저장소에
		// 값을 기록하지 않고, 변경이 완료되면 한번에
		// 값을 기록하는 객체(클래스)
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append(" World!");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		String result = sb.toString();
		
		
		System.out.println(result);
		
	}
	
	public void stringBuilder() {
		// StringBuffer 는 동시제어 기능을 가진다.
		// 동시 제어 ( Thread Safe ) :
		//      하나의 공간에 서로 다른 두 프로그램이
		//      동시에 수정하려하는 것을 방지하는 기능
		// 간단한 프로그램을 작성할 때 해당 기능이 필요치 않을 경우
		// 개발자는 StringBuilder 를 사용할 수 있다.
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("Hello");
		System.out.println(sb.hashCode());
		
		
		sb.append(" World!");
		System.out.println(sb.hashCode());
		
		
		String result = sb.toString();
		System.out.println(result);
	}
	
	public void stringSplit() {
		// 만약 "홍길동, 고길동, 김철수, 김영희" 와 같은
		// 문자열을  구분자 ',' 단위로 쪼개고 싶을 때
		// 사용하는 메소드
		
		String fruit = "천혜향, 바나나, 체리, 사과, 키위, 두리안";
		
		String[] fruitArr = fruit.split(", ");
		
		for(String s : fruitArr) {
			System.out.println( s );
		}
		
		// ------------------
		// 
		// split() 처럼 문자열을 특정 구분자로
		//  하나 하나 쪼개어 주는 클래스
		StringTokenizer tokens = new StringTokenizer(fruit);
		
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken(", "));
		}
		
		// join()
		// 여러 조각으로 나눠진 문자열을
		// 하나의 문자열로 합치는 메소드
		String result = String.join(" - ",fruitArr);
		
		System.out.println(result);
	}
	
	public void exam1() {
		// "J a v a P r o g r a m " 해당 문자열을
		// 공백을 제거하여 char[]에 담고,
		// 모든 글자 수와, 모두 대문자로 바꾼 결과를
		// 출력 하세요.
		// 1. 공백 제거
		String[] words = "J a v a P r o g r a m ".split(" ");
		
		// 2. 다시 붙이기
		String str = String.join("", words);
		
		char[] array = str.toCharArray();
		String strUp = str.toUpperCase();
		
		System.out.println(array.length + "글자 / " + strUp);
	}
	
	public void exam2() {
		// 키보드로 영문자를 입력받아 해당 문자열의 
		// 가장 앞글자를 대문자로 바꾸어 출력하세요.
		// 입력 : apple
		// 출력 : Apple
		// * 단 StringBuilder를 사용하세요.
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.print("입력 : ");
		sb.append(sc.next());
		
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
				
		System.out.println("출력 : " + sb);
	}
	
	
	
	
	
	
	
	
	
}
