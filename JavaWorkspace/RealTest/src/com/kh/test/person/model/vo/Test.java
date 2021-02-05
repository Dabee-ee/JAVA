package com.kh.test.person.model.vo;

public class Test {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("홍길동",'M');
		pArr[1] = new Person("홍길동",'M');
		pArr[2] = new Person("홍길동",'M');

		for( int i = 0 ; i <= pArr.length-1 ; i++) {
			System.out.println(pArr[i].getName());
		}

	}

}
