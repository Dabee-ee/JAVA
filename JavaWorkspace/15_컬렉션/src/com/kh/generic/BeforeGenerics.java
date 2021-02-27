package com.kh.generic;

import java.util.ArrayList;

public class BeforeGenerics {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Book());
		list.add(new Coffee());
		list.add(new Student());
		
		System.out.println("list 크기 :  " + list.size());
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			 Object obj = list.get(i);
			 // ((Book)obj).read();
			 // 읽을 수 있는 객체로 들어간 것인지 먼저 확인해야 한다.
			 // 이럴 때는 저 객체가 원래 무엇이었는지 확인하는 비교 연산자 사용.
			 
//			 if (obj instanceof Book ) {
//				 ((Book) obj).read();
//			 } else if ( obj instanceof Coffee) {
//				 ((Coffee) obj).drink();
//			 }
			 // 얘네들을 일일이 꺼낼려고 보니까 여간 불편한 일이 아니다
			 // 얘네들한테 이름표만 달아줬더라면....
			 // 
		
		}
		
		

	}

}


class Book {
	
	private int bno;
	
	public Book() { }
	
	public void read() {
		System.out.println("책을 읽어요!");
	}
}

class Coffee {
	
	private String name;
	
	public Coffee() { }
	
	public void drink() {
		System.out.println(name +" 을 마십니다.");
	}
}

class Student {
	
	private int stno;
	
	public Student() { }
	
	public void study() {
		System.out.println(stno + "가 열공합니다.");
	}
}


