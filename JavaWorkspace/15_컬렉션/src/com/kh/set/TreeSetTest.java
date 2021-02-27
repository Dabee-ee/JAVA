package com.kh.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet set1 = new TreeSet();
		
		set1.add("coconut");
		set1.add("durian");
		set1.add("cherry");
		set1.add("banana");
		
		System.out.println(set1);
		
		// set --> Object[] 화 하기
		Object[] arr = set1.toArray();
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}

	}
	
	
	
	
	
	

}
