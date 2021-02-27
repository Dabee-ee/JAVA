package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	/**
	 * Set :  
	 *  자바에서 제공하는 자료구조 중 하나로
	 *  List와 대조되는 특성을 가진다.
	 *  1. 저장 순서 유지 X
	 *  2. 중복 값 저장 X
	 *  종류 HashSet, TreeSet, LinkedHashSet 등이 있다.
	 */
	
	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		
		set1.add("안녕");
		set1.add(12345);
		set1.add(true);
		set1.add(3.14);
		set1.add('A');
		
		// 1. 순서 유지 X
		System.out.println(set1);

		set1.add("안녕");
		set1.add("하세요");
		set1.add('A');
		set1.add(36.5);
		
		// 2. 중복값 X
		System.out.println(set1);	
		
		// set의 다른 기능
		
		System.out.println("저장된 정보 수 : " + set1.size());
		System.out.println("포함여부 : " + set1.contains("안녕"));
		
		// set1.clear();
		System.out.println("set 비었니 ? : " + set1.isEmpty());
		
		// 3. set은 순서가 없기 때문에
		//    값을 하나씩 꺼낼 수 없음
		// -> 해결 방법 : 목록화 처리(Iterator)
		
		// Enumeration 의 신버전
//		Iterator iter = set1.iterator();
//		
//		// 다음에 가져올 요소가 있는지 확인한다.
//		while( iter.hasNext() ) {
//			
//			Object obj = iter.next();
//			
//			System.out.println(obj);
		
		Object[] arr = set1.toArray();
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		}
	}





