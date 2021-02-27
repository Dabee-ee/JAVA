package com.kh.list.sort;

import java.util.Comparator;

public class DescPriceSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		
		return (p1.getPrice() > p2.getPrice()) ? -1 : 1;
	}
	
	

}
