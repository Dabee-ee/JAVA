package com.kh.date;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {

		DateTest date = new DateTest();
		// date.testDate();
		// date.testCalendar();
		// date.exam1();
		
		System.out.println("올해까지의 날짜 : " + date.getDays() + "일");
	}

	public void testDate() {
		Date d = new Date();
		
		System.out.println("date : " + d);
		
		System.out.println("시스템 시간 : " + new GregorianCalendar().getTimeInMillis());
		
		
		Date d2 = new Date(0);
		
		System.out.println("date2 : " + d2);
	}
	
	public void testCalendar() {
		// 기존의 Date 클래스에서
		// 보다 폭넓은 시간 정보를 제공하기 위한
		// 날짜 처리 클래스
		
		// 다형성 : 자식 클래스로 부모를 만들 수 있다!
		Calendar cal = new GregorianCalendar();
		
		System.out.println("date : " + cal);
		
		// 1. 일일히 뽑기
		int year = cal.get(Calendar.YEAR);

		// 월의 정보는 1월, 2월, 3월 의 정보가
		//  Jan, Feb, Mar 등의 문자열 배열로 이루어져 있다.
		// 따라서 0부터 세기 시작한다.
		// 1월 == 0
		// 2월 == 1
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int am_pm = cal.get(Calendar.AM_PM);
		
		System.out.printf("%d년 %d월 %d일 \n", year, month, date);
		
		System.out.printf("%d : %d : %d (%s) \n",
						hour, min, sec, (am_pm > 0 ? "오후" : "오전"));
		
		// 2. 날짜 표현 형식을 지정하여 출력하기
		// yyyy-mm-dd
		// yyyy : 연도
		// MM : 월
		// dd : 일
		SimpleDateFormat dateFormat
		    = new SimpleDateFormat("yyyy년 MM월 dd일 E요일, HH시 mm분 ss초");
		
		String result = dateFormat.format(cal.getTime());
		
		System.out.println(result);
	}
	
	public void exam1() {
		// 특정 연도를 입력받아
		// 해당 연도가 윤년인지, 평년인지 구하는 기능
		// exam1 에서 값을 입력 받아 
		// isLeapYear() 메소드에게 매개변수로 연도를 전달하고
		// isLeapYear() 에서 윤년이면 true / 아니면 false 를
		// 리턴하여 exam1()에서 윤년인지 평년인지 출력하는 기능을 구현해보자!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		
		 if ( isLeapYear(year) ) {
			 
			 System.out.println("윤년입니다!");
		 } else {
			 
			 System.out.println("평년입니다!");
		 }
		
	}

	public boolean isLeapYear(int year) {
		
		boolean result = false;
		
		// 연도가 4의 배수이면서
		// 100의 배수가 아니거나 400의 배수인 연도가 윤년
		
		// 방법 1)
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			result = true;
		} else {
			result = false;
		}
		
		// 방법 2)
		// result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? true : false;
		
		// 방법 3)
		// result = Year.isLeap(year);
		
		return result;
	}
	
	// 1년 1월 1일부터 현재 날짜까지 계산하기
	public long getDays() {
		
		long sumDays = 0;
		// 위의 isLeapYear 를 사용하여
		// 윤년이면 366일, 평년이면 365일을 더하여
		// 1년 1월 1일부터 현재 날짜까지 일 수 합산하기
		// ** hint 1 : 올해는 아직 다 가지 않았음 < 365일
		// ** hint 2 : Calendar 내장 함수 get() 을 활용하면
		//             올해 현재까지의 일 수를 계산할 수 있음
		//             cal객체.get( . . . )
		Calendar cal = new GregorianCalendar();
		
		// 반복문을 통해
		for(int i = 1; i <= cal.get(Calendar.YEAR); i++ ) {
			
			// 방법 1)
			if(i == cal.get(Calendar.YEAR)) {
				sumDays += cal.get(Calendar.DAY_OF_YEAR);
			} else {
				sumDays += isLeapYear(i) ? 366 : 365;
			}
			
			// 방법 2)
			/*
			sumDays += (i != cal.get(Calendar.YEAR) ) ? 
					       isLeapYear(i) ? 366 : 365
					     : cal.get(Calendar.DAY_OF_YEAR);
			*/
		}
		
		return sumDays;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
