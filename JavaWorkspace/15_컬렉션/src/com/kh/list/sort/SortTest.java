package com.kh.list.sort;

import java.util.ArrayList;

public class SortTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add( new Product("핫팩", 3000, 0.01) );
		list.add( new Product("고구마", 7000, 0.05) );
		list.add( new Product("붕어빵", 500, 0.0) );
		list.add( new Product("어묵", 1000, 0.0) );
		
		System.out.println("list : " + list);
		
		// 가격 기준 정렬
		list.sort(new AscPriceSort());
		System.out.println("가격 오름차순 : " + list);
		
		// 가격 기준 내림차순 정렬
		list.sort(new DescPriceSort());
		System.out.println("가격 내림차순 : " + list);
		
		// 상품명을 기준 정렬
		list.sort(new AscNameSort());
		
		System.out.println("이름 오름차순 : " + list);
		
		list.sort(new DescNameSort() );
		
		System.out.println("이름 내림차순 : " + list);
		
		
	}
	
	
	
	
	
	
	
	

}
