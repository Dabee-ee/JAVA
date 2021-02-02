package com.kh.obj.model.vo;

public class FieldTest {
	
	public int num1; 		// 1. JVM 초기값
	// 아무런 값도 주지 않았기 때문에 초기값이 들어가게 됨.
	// 초기값은 변수활용에서 봤던 '변수 저장 가능 범위'
	
	public int num2 = 100; 		// 2. 사용자 지정 초기값
	
	// 초기값들만 따로 묶을 수 있다. 아무것도 없고 중괄호만 있는 블럭
	{
		
		// 3. 초기화 블럭 (생략가능)
		num1 = 50;
		num2 = 70;
	}
	
	// 4. 생성자 ( 생성자를 통해서 값을 주입할 수 있다.)
	public FieldTest(int num2) {
		this.num2 = num2;
	}
	
	}

