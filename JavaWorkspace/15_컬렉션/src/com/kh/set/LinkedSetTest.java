package com.kh.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetTest {

	public static void main(String[] args) {
		
		Set set1 = new LinkedHashSet();
		
		set1.add("안녕");
		set1.add(12345);
		set1.add(true);
		set1.add(3.14);
		set1.add('A');
		
		System.out.println(set1);
	}

}
