package com.silsub.set;

import java.util.Set;
import java.util.TreeSet;

public class LottoProgram {

	public static void main(String[] args) {
		Set test = new TreeSet();
		
		// 방법 1)
		while(test.size() < 6){
			test.add((int)(Math.random() * 45) + 1);
		}
		
		// 방법 2)
		/*
		for( ; test.size() < 6 ; ){
			int rnd = (int)(Math.random() * 45) + 1;
			test.add(rnd);
		}
		*/
		
		System.out.println(test);
	}

}
