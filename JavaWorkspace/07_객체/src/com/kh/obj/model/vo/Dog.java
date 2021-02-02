package com.kh.obj.model.vo;

public class Dog {
	// 클래스는 '객체를 생성하기 위한 틀'이다.
		
		// 추상화
		// 1. Field 변수
		private String name;    // 이름
		private int age;        // 나이
		private String type;    // 견종
		private char gender;    // 성별
		private double weight;  // 몸무게

		// 2. 생성자
		public Dog() {
			// 기본 생성자
		}
		
		public Dog(String name) { // 사용자 정의 생성자
			this.name = name;
		}
		
		// 3. 기능 제공 메소드
		
		public void bark() {
			System.out.println("우리 집 " + name + "이가 짖습니다.");
		}
		
		public void play() {
			System.out.println("우리 집 " + name + "이가 난장판을 만듭니다.");
		}	
		
		// 이름을 바꿔주는 기능
		public void setName(String name) {
			
			this.name = name;
		}
			
		// 이름 확인을 위한 기능
		public void getName() {
			System.out.println("저의 이름은 " + name + "입니다.");
			
		}

}

// 이런 일반 클래스는 단순히 편의를 위해서 만들어진 것으로
// 다른 곳으로 가져갈 수 없다.
class Toy {
	
	
}

