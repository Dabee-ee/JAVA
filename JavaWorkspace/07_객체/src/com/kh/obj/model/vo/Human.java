package com.kh.obj.model.vo;

public class Human {
	// 이런 클래스를 사용하는 것을 객체지향언어라고 한다.
	// 일상의 존재를 컴퓨터 코드화한 객체를 사용하여
	// 프로그램을 만드는 일을 의미한다.
	
	// 객체는 class에 의해 만들어진다, 라는 말이 있는데 정확히는
	// c++ 는 클래스에 의해 만들어진 변수를 의미
	//				클래스명 변수명;
	// JAVA는 Heap 메모리에 값을 할당하여 주소값을 받을 수 있는 변수를 의미
	// 			클래스명 변수명 = new 클래스명();
	// 			- new를 하지 않으면 실체화되지 않는다. (실체화 = 인스턴스)
	
	
	// 추상화
	// 이름 (String name)
	// 나이 (int age)
	// 성별 (char gender)
	// 연락처 (String tel)
	// 주소 (String address)
	
	// 1. 해당 클래스가 사용할 변수 (전역변수)
	// 접근 제한자 자료형 변수명;
	// public > protected > default > private
	public String name;
	protected int age;
	char gender;
	private String tel;			// 나 자신만 접근한다. 이 클래스 안에서만 접근 가능.
	private String address;
	
	// 즉, 필드에 따라 끌고갈 수 있는 범위가 달라지나보다(?)
	
	// 2. 생성자 (값을 가지고 태어나는 애들?)
	// 해당 클래스로 new를 통해 새로운 객체를 
	// 생성하고자 할 때 사용하는 객체 생성 전용 메소드
	// 접근제한자 클래스명 ( [ 매개 변수 ] { . . . } 
	
	
	public Human() {} // 기본 생성자 (내용 적는란에 아무것도 없음)
	// 생성자를 직접 선언하지 않으면
	// 기본 생성자가 자동으로 만들어 진다. (JVM에 의해)
	
	public Human(String name) { // 괄호 안에 '매개 변수'
			this.name = name;
			// 어떠한 값을 전달받아
			// 현재 전역변수(Field)의 정보를 
			// 수정할 때 사용하는 대명사 변수
			
	}
	
	// 3. 기능 제공 메소드 (Human의 기본적인 기능)
	// 현재 클래스의 정보를 활용하여
	// 특정 기능을 제공하기 위해 만드는 메소드
	// 
	// 접근제한자 [ 예약어 ] 리턴타입 메소드명( [ 매개변수 ] ) { . . . }
	public void sayMyName() {
		
		System.out.println("내 이름은 " + name + "입니다.");
	}

}
