package com.kh.io.subStream.model.vo;

import java.io.Serializable;

public class Member implements Serializable {
	// 직렬화 ( Serializable)
	// 해당 객체의 정보를 다른 프로그램, 컴퓨터에게 전달할 때
	// 여러 필드의 값을 한 줄로(01010...) 구성하여 
	// 전달하고자 하는 대상이 다른 구조를 가지더라도
	// 객체를 올바르게 인식시키기 위한 기술
	
	// 1. 필드변수
	// 이름, 나이, 주소, 연락처
	private String name;
	private int age;
	private String address;
	private String phone;
	
	// 2. 생성자
	public Member() { }

	public Member(String name, int age, String address, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	// 3. Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		// Object 에서 제공하는 객체의 정보를 표시하는 메소드
		// 클래스명@고유번호로 표시하나
		// 우리는 이 정보보다 실제 해당 객체가 가지는 필드 변수의
		// 정보를 더 필요로 하기 때문에 재정의할 필요가 있다.
		return name + ", " + age + ", " + address + ", " + phone;
		
	}
	
	
	
	
	
	
}
