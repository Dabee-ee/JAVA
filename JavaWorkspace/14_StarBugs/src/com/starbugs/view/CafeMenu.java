package com.starbugs.view;

import java.util.Scanner;

import com.starbugs.controller.CafeManager;
import com.starbugs.model.exception.CoffeeException;
import com.starbugs.model.vo.Coffee;

public class CafeMenu {
	
	public static CafeManager cm = new CafeManager();

	public static void display() {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 1 ) 변수 방식
		 *     변수를 직접 선언하면 사용자의 입력값을 받을 수 있다.
		 *     하지만 해당 변수를 재사용할 수 없다.
		System.out.println("--------------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 에스프레소");
		System.out.print("메뉴 선택 : ");
		
		int select = sc.nextInt();
		String coffeeName = null;
		int price = 0;
		
		switch(select) {
		case 1 : 
			coffeeName = "아메리카노";
			price = 3500;
			break;
		case 2 :
			coffeeName = "카페라떼";
			price = 4500;
			break;
		case 3 :
			coffeeName = "에스프레소";
			price = 7500;
			break;
		}
		
		System.out.println(coffeeName + "을 주문하셨습니다.");
		System.out.println("가격은 " + price + "입니다.");
		*/
		/*
		 * 2) 배열 방법
		 *    변수 명을 재사용할 수 있다.
		 *    실제 배열 안의 몇번째 순서에 어떤 값이
		 *    들어 있는지 확인하기 어렵다.
		int[] cup = new int[3];
		
		System.out.println("--------------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 에스프레소");
		
		System.out.print("메뉴 선택 : ");
		cup[0] = sc.nextInt();
		
		System.out.print("몇 잔? : ");
		cup[1] = sc.nextInt();
		
		String coffeeName = null;
		
		switch(cup[0]) {
		case 1 : 
			coffeeName = "아메리카노";
			cup[2] = 3500;
			break;
		case 2 : 
			coffeeName = "카페라떼";
			cup[2] = 4500;
			break;
		case 3 :
			coffeeName = "에스프레소";
			cup[2] = 7500;
			break;
		}
		
		System.out.println("주문하신 커피는 " + coffeeName + "입니다.");
		System.out.println("총 " + cup[1] + "잔을 주문하셨으며,");
		System.out.println("가격은 " + (cup[1] * cup[2]) + " 원 입니다." );		
		*/
		
		/*
		 * 3 ) 객체 사용한 경우
		 *     객체를 사용함으로써 코드가 한결 단순해졌으나,
		 *     여전히 한 잔 밖에 팔지 못한다. 
		System.out.println("--------------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 에스프레소");
		
		System.out.print("메뉴 선택 : ");
		int select = sc.nextInt();
		
		System.out.print("몇 잔? : ");
		int cup = sc.nextInt();
		
		Coffee co = new Coffee(select, cup);
		
		System.out.println("주문 정보 : " + co);
		*/
		
		do {
			
			initMenu();
			System.out.print(">> 메뉴 선택 : ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 :
				insertCoffee();
				break;
			case 2 :
				checkCoffee();
				break;
			case 3 :
				updateCoffee();
				break;
			case 4 :
				deleteCoffee();
				break;
			case 5 :
				cm.printAll();
				break;
			case 0 :
				System.out.print("정말 종료하시겠습니까? (y/n) : ");
				if( sc.next().toUpperCase().charAt(0) == 'Y') {
					cm.close();
					return;					
				}
			}
			
		} while(true);
		
	}
	
	// 주문 메뉴 메소드
	public static void initMenu() {
		
		System.out.println("** -------------- **");
		System.out.println("1. 커피 주문");
		System.out.println("2. 주문 확인");
		System.out.println("3. 주문 수정");
		System.out.println("4. 주문 취소");
		System.out.println("5. 주문 전체 확인");
		System.out.println("0. 프로그램 종료");
	
	}
	
	public static void insertCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- 메뉴 ----");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 에스프레소");
		
		System.out.print(">> 메뉴 선택 : ");
		int sel = sc.nextInt();
		
		System.out.print(">> 주문 잔 수 : ");
		int cup = sc.nextInt();
		
		Coffee co = new Coffee(sel, cup);
		
		System.out.println( cm.insertCoffee(co) );
	}
	
	public static void checkCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주문 번호 : ");
		int orderNo = sc.nextInt();
		
		try {
			
			System.out.println( cm.checkCoffee(orderNo) );
			
		} catch (CoffeeException e) {

			// e.printStackTrace();
			System.out.println( e.getMessage() );
		}		
	}
	
	public static void updateCoffee() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 주문 번호 : ");
		int orderNo = sc.nextInt();
		
		try {
			System.out.println("이전 주문 내역 :: ");
			System.out.println( cm.checkCoffee(orderNo) );
		
			System.out.println("---- 메뉴 ----");
			System.out.println("1. 아메리카노");
			System.out.println("2. 카페라떼");
			System.out.println("3. 에스프레소");
			
			System.out.print(">> 메뉴 선택 : ");
			int sel = sc.nextInt();
			
			System.out.println(">> 주문 잔 수 : ");
			int cup = sc.nextInt();
			
			cm.updateCoffee(orderNo, new Coffee(sel, cup));
						
		} catch (CoffeeException e) {
			
			System.out.println( e.getMessage() );
			
		}
	}
	
	public static void deleteCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> 주문 번호 : ");
		
		int orderNo = sc.nextInt();
		
		cm.deleteCoffee(orderNo);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
