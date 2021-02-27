package com.kh.map;

import java.util.*;

public class HashMapTest {
	// Map : 
	//   자료(데이터)를 저장할 때
	//   각각의 식별 구분자(고유의 값)를 key로
	//   해당 값에 대한 내용을 value로
	//   나누어 저장, 관리하는 구조를 말한다.
	//   이 때 key는 set의 특성을,
	//   value는 list의 특성을 가진다.
	//  대표적으로 HashMap, HashTable, TreeMap, Properties가 있다.

	public static void main(String[] args) {
		
		HashMap map1 = new HashMap();
		// 다형성
		// Map map1 = new HashMap();
		
		map1.put("1호점", "길동스터치");
		map1.put("2호점", "길동스터치");
		map1.put("3호점", 12345);
		map1.put(1004, new Date());      // value --> List와 유사함
		
		// int -> 객체화 -> Integer  : 박싱
		// Integer -> 기본자료화 -> int : 언박싱
		
		System.out.println(map1);
		
		map1.put("3호점", "스타북스");  // key --> Set과 유사함
		
		System.out.println(map1);
		
		// --------------------------------
		
		System.out.println("1호점 : " + map1.get("1호점"));
		System.out.println("1004 : " + map1.get(1004));
		System.out.println("7호점 : " + map1.get("7호점"));
	}
//		// 저장된 value를 하나씩 꺼내는 방법
//		
//		// 1. keySet() 메소드 사용
//		//   map 안의 key들만 따로 빼내어
//		//   해당 키로 하나씩 조회하는 방법
//		Set keys = map1.keySet();
//		
//		Iterator iter1 = keys.iterator();
//		
//		while( iter1.hasNext() ) {
//			
//			// key 객체를 꺼냄
//			Object key = iter1.next();
//			
//			System.out.println( map1.get(key) );
//			
//		}
//		
//		System.out.println("-------------------------------");
//		
//		// 2. values() 메소드 사용
//		Collection values = map1.values();
//		
//		Object[] objArr = values.toArray();
//		
//		for(int i = 0 ; i < objArr.length ; i++) {
//			
//			System.out.println( objArr[i] );
//		}
//		/*
//		Iterator iter2 = values.iterator();
//		
//		while(iter2.hasNext()) {
//			
//			System.out.println(iter2.next());
//			
//		}
//		*/
//		System.out.println("--------------------------------");
//		
//		// 3. entrySet() 메소드 사용
//		//    key와 value를 한 쌍으로 통째로 꺼내오는 방법 
//		
//		Set entrySet = map1.entrySet();
//		
//		Iterator iter3 = entrySet.iterator();
//		
//		while(iter3.hasNext()) {
//			
//			// key와 value를 모두 가지는 객체
//			Map.Entry entry = (Map.Entry)iter3.next(); 
//			
//			Object key = entry.getKey();
//			Object value = entry.getValue();
//			
//			System.out.println(key + " : " + value);
//		}
//	}
}
