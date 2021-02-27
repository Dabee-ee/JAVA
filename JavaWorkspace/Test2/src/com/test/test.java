package com.test;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		
		Fruit[] fArr = new Fruit[5];
		
		fArr[0] = new Fruit("apple", 1200, 3);
		fArr[1] = new Fruit("banana", 2500, 2);
		fArr[2] = new Fruit("grape", 4500, 5);
		fArr[3] = new Fruit("orange", 800, 10);
		fArr[4] = new Fruit("melon", 5000, 2);
		
		String f = fArr.toString();
		
		for(int i = 0 ; i < fArr.length ; i++) {
			 System.out.println(fArr[i]);
		}
	
		Set Properties = f.keySet();
		Iterator p1  = Properties.iterator();

		
		while(p1.hasNext()){
			
			Object key = p1.next();
			
			System.out.println(key);

	}

}
