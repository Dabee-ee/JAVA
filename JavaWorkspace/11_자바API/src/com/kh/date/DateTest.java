package com.kh.date;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		DateTest date = new DateTest() ;
		
		date.testDate();

	}
	public void testDate() {
		Date d = new Date();
		
		System.out.println("date : " + d);

	}

}
