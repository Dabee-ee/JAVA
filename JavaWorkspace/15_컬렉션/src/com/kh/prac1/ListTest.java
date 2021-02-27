package com.kh.prac1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {
			
		List list = new ArrayList();

		for(int i = 0 ; i < 10 ; i++) {
			int num = (new Random().nextInt(100)) + 1;
			list.add(num);
		}
		
ListTest lt = new ListTest();
		
		System.out.print("정렬전 : ");
		lt.display(list);
		
		list.sort(new Decending());
		
		System.out.print("\n정렬후 : ");
		lt.display(list);
		
	}

	public void display(List list){
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
	

		
	}
	
		}



