package com.kh.inherit;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 12, 150.5);
		
		Student st = new Student();
		
		st.setAge(0);
		st.setHeight(0);
		st.setName(null);
		
		// student에 setter 만든적 없는데 작성할 수 있음.
		// 부모클래스인 Person으로부터 코드를 받아와서 가능함.
		// = 상속
	}

}
