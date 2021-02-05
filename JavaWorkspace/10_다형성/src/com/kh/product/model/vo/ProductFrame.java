package com.kh.product.model.vo;

public interface ProductFrame {
	
		// 인터페이스 
		// 1. 미완성 메소드의 집합체!
		// 2. 프로그램의 기준이 될 수 있는 상수 (public static final) 나,
		// 			미완성 메소드만을 가질 수 있는 틀
	
		public static final int NUM1 = 100;
		int NUM2 =200;	
		// 인터페이스가 상수밖에 가질 수 없기 때문에 static final이 자동으로 생략된다.
		
		public abstract void powerOn();
		
		void powerOff(); 	// public abstract이 자동으로 생략됨.
		
	
	

}
