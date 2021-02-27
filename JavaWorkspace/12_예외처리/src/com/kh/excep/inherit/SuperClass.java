package com.kh.excep.inherit;

import java.io.IOException;

public class SuperClass {
	// 예외를 throws 하는 
	// 메소드를 가진 상위 클래스
	
	public SuperClass() { }
	
	public void test() throws IOException {
		
		System.out.println("IO 예외가 발생할 수 있는 메소드! ");
		
	}
	
	
}
