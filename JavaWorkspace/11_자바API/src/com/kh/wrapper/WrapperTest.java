package com.kh.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		new WrapperTest().parsingTest();
	}
	
	public void parsingTest() {
		
		// byte --> int 
		// float --> double
		
		// "1004" -- > int
		// 파싱한다! (parsing)
		
		// 문자열 --> 숫자
		byte num1 = Byte.parseByte("10");
		short num2 = Short.parseShort("100");
		int num3 = Integer.parseInt("1004");
		
		float num4 = Float.parseFloat("3.14");
		double num5 = Double.parseDouble("3.14");
		
		// int 자료형의 최솟값과 최댓값 확인하기
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// 기본 자료형 --> 문자열
		String str1 = String.valueOf(123); // 123 --> "123"
		String str2 = String.valueOf(12.345);
		String str3 = String.valueOf(true);
		String str4 = String.valueOf('A');
		
	}

}
