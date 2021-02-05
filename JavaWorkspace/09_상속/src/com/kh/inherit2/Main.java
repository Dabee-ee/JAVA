package com.kh.inherit2;

public class Main {

	public static void main(String[] args) {

		SuperClass sup = new SuperClass(1, "부모");
		
		System.out.println( sup.print() );

			SubClass1 s1 = new SubClass1(2, "자식1");
			
			System.out.println(s1.print() );
					
	}

}
