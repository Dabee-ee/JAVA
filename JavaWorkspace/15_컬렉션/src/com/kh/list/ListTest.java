package com.kh.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTest {
	/**
	 * List : 
	 *   자바가 제공하는 자료구조 중
	 *   순서가 유지되고, 중복을 허용하는 방식을
	 *   말하며, ArrayList, Vector, LinkedList 등이 있다.
	 *   이 중, ArrayList와 Vector는 기능이 동일하다.
	 *   단, ArrayList에는 Thread Safe 기능이 없다.  
	 */
	
	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		
		// 1. 리스트에는 여러 타입의
		//    데이터가 들어갈 수 있다!
		// 2. 순서가 유지된다.
		list1.add("안녕");
		list1.add(12345);
		list1.add(true);
		list1.add(3.14);
		list1.add('A');
		
		// 3. toString() 메소드가 재정의 되어 있다!
		System.out.println(list1);
		
		// 반복문을 통해 하나씩 안의 정보도 가져올 수 있다
		for(int i = 0 ; i < list1.size(); i++) {
			
			System.out.println(i + " : " + list1.get(i));
			
		}
		
		// 중복된 값이 들어갈 수 있다.
		list1.add("안녕");
		System.out.println(list1);
		
		// 배열 중간 값 추가 / 수정 / 삭제
		
		// 추가
		// -- 오버로딩
		list1.add(2, "토마토");
		System.out.println(list1);

		// 삭제
		list1.remove(3);
		System.out.println(list1);
		
		// 수정
		list1.set(2, "초콜릿");
		System.out.println(list1);
		
		// 정렬 확인하기
		ArrayList sortList = new ArrayList();
		
		sortList.add("홍길동");
		sortList.add("고길동");
		sortList.add("박문수");
		sortList.add("전우치");
		sortList.add("도비");
		
		System.out.println(sortList);
		
		// 오름차순 정렬하기
		Collections.sort(sortList);
		System.out.println(sortList);
		
		// 내림차순 구현
		Iterator iter = new LinkedList(sortList).descendingIterator();
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
