package com.kh.inherit2;

public class SubClass1 extends SuperClass {
	
	// SuperClass를 상속받은 자식 클래스
	
		public SubClass1() { }
		
		public SubClass1(int num1, String str) {
			
			super(num1, str);
			// 자식은 부모 생성자를 super() 메소드로 호출할 수 있다!
		}
		
		/**
		 *  @ : 어노테이션 (Annotation)
		 *  JVM이 컴파일할 때, 혹은 개발자가 코드를 읽을 때
		 *  서로 어떤 처리를 해야하는지 안내하는 키워드
		 * **/
		@Override // 덮어씌우다 / 재정의하다
		public String print() {
			
			return "자식 : " + this.getNum1() + ", " + this.getStr();
		}
		
		// 자식 고유의 메소드
		public void myPrint() {
			System.out.println("내가 첫째입니다!");
			
			
		}
		

}
