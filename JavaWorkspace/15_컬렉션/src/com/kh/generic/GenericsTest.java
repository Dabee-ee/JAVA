package com.kh.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		// 컬렉션은 여러가지 자료형을 받을 수 있다.
		//Object로 상향하여 받기 때문이다. 
		
		// Book --> Object, coffee --> Object ...
		// 책을 책이라 하지 못하고...
		
		ArrayList<Book> list1 = new ArrayList<>();
		// 꺽쇠 : 자료형 제한자 , Book 이라는 이름을 가진 애만 받겠다.
		// 이클립스 8 이전 버전은 안됨.
		
		list1.add(new Book());
		list1.add(new Book());
		
		// list1.add(new Coffee()); 
		//  add에 빨간 줄! 휴먼, Book만 받으라고 해놓고 커피를 넣다니...
		
		// 이제 for Each가 가능해짐. 어차피 listdpsms Book 만 담겨있으니까.
		for ( Book a : list1 ) {
			a.read();
		}
		
		
		ArrayList<Coffee> list2 = new ArrayList<>();
		list2.add(new Coffee());
		list2.add(new Coffee());
		
		GenericsTest test = new GenericsTest();
		// 매개변수에도 제네릭스를 붙여 값을 한정 지을 수 있다.
		
		
		test.printBook(list1);
		// test.printCoffee(list2);
		
		// -----------------------------------------
		// 맵에는 key와 value 각각을 제한한다!
		HashMap<String, Book> map = new HashMap<>ㄴ() ;
		
		map.put("어린왕자", new Book());
		map.put("콩쥐팥쥐", new Book());
		map.put("당신 거기있어줄래요", new Book());
		map.put("컬러의 말", new Book());
		map.put("칼의 노래", new Book());
		
		// 이전에는 꺼내면 어떤 값이 나올지 모르니까 컬렉션을 썼었다.
		// 하지만 이제는 꺼내면 Book 만 나오니까 .
		
		ArrayList<Book> list3 = new ArrayList<>( map.values());
		
		for( Book b : list3) {
			b.read();
		}
	}
	
	public void printBook(List<Book> list) {
		// 책만 받아서 뽑으세요.
		
		for (Book a : list ) {
			a.read();
		}
	}
		public void printCoffee(List<Coffee> list) {
			
			for (Coffee c : list ) {
				c.drink();
			}
	}

}
