package com.kh.logic.test;

import java.util.Scanner;

public class RPS {

	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// 가위, 바위, 보 중 하나를 입력했을 때
		// 컴퓨터가 가위를 내서 겨루는 프로그램 만들기
		
		System.out.print("입력 : ");
		String player = sc.next();
		String computer = "가위";
		
		if( player.equals(computer) ) {
			System.out.println("무승부 입니다.");
		} else if ( player.equals("바위")) {
			System.out.println("당신이 이겼습니다.");
		} else if ( player.equals("보")) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
	}
	public void test2() {
		// 숫자를 랜덤으로 뽑아주는 메소드 테스트하기
		
		// 1. Math.random()
		double num1 = Math.random();  // 0 ~ 1전까지 수를 임의로 꺼내옴
				
		System.out.println("num1 : " + num1);
		
		// double -> int 강제형변환
		int num2 = (int)(Math.random() * 10) + 1;
		
		System.out.println("num2 : " + num2);
		
		// 2. Random.nextInt()
		
		
	}
	
	public void test3() {
		// 컴퓨터에게 0 ~ 2 까지 임의의 수를 고르게 한 후,
		// 해당 숫자를 가위, 바위, 보로 바꾸기
		
		int choice = (int)(Math.random() * 3);   // 0 ~ 2
		String computer = "";
		
		switch( choice ) {
		case 0 : computer = "가위";
		         break;
		case 1 : computer = "바위";
				 break;
		case 2 : computer = "보";
				 break;
		}
		
		System.out.println("컴퓨터 : " + computer);
	}
	
	public void playGame() {
		
		System.out.println("가위, 바위, 보! \n 입력해주세요 :");
		String player = sc.next();
		
		int choice = (int)(Math.random() * 3);   // 0 ~ 2
		String computer = "";
		
		switch( choice ) {
		case 0 : computer = "가위";
		         break;
		case 1 : computer = "바위";
				 break;
		case 2 : computer = "보";
				 break;
		}
		
			System.out.println(player);
			System.out.println(computer);
			
			
			if( player.equals(computer))  {
				System.out.println("아쉽게 비겼습니다!");
			
			} else if ((player.equals("가위") && computer.equals("보")) || (player.equals("바위")&& computer.equals("가위")) || (player .equals("보")&& computer.equals("바위"))){
				System.out.println("당신이 이겼습니다!");
				
				
			} else if ( (player.equals("보") && computer.equals("가위") ) || (player.equals("가위") && computer.equals("바위") ) || (player.equals("바위")&& computer .equals("보"))) {
				System.out.println("당신이 졌습니다!");
				}
		
	}
	
	
	public void playGame2() {
		
		System.out.println("가위, 바위, 보! \n 입력해주세요 :");
		String player = sc.next();
		int playerch = 0 ;
		
		switch( player ) {
		case "가위" : playerch = 0 ;
		         break;
		case "바위" : playerch = 1 ;
				 break;
		case "보" : playerch = 2 ;
				 break;
		}
		
		int choice = (int)(Math.random() * 3);   // 0 ~ 2
		String computer = "";
		
		switch( choice ) {
		case 0 : computer = "가위";
		         break;
		case 1 : computer = "바위";
				 break;
		case 2 : computer = "보";
				 break;
		}
		
			System.out.println("당신의 선택 !! 	===>  " + player);
			System.out.println("컴퓨터의 선택  !! 	===> " + computer);
			
			
			if( player == computer )  {
				System.out.println("\n 아쉽게 비겼습니다!");
			
			} else if ( (player != computer ) && playerch >= choice ){
				System.out.println("\n 당신이 이겼습니다!");
				
				
			} else if ( (player != computer ) && playerch <= choice) {
				System.out.println("\n 당신이 졌습니다!");
				}
		
	}
	
	
	public void playGame3() {
		// 가위 바위 보 중 하나를 입력하여
		// 컴퓨터와 겨루는 프로그램을 작성하시오.
		// 내가 이길 경우 : 당신이 이겼습니다!  -ㅅ-)/
		// 무승부일 경우 : 아쉽게 비겼습니다!   @_@
		// 내가 졌을 경우 : 컴퓨터가 이겼습니다!
		
		System.out.print("입력 : ");
		String player = sc.next();
		int choice = (int)(Math.random() * 3);   // 0 ~ 2
		
		String computer = "";
		
		switch( choice ) {
		case 0 : computer = "가위"; break;
		case 1 : computer = "바위"; break;
		case 2 : computer = "보"; break;
		}
		
		System.out.println("컴퓨터 : " + computer);
		
		// 삼항 연산자의 경우...
		// String computer = (choice == 0) ? "가위" : (choice == 1) ? "바위" : "보";
		
		if(player.equals(computer)) {
			System.out.println("아쉽게 비겼습니다!   @_@");
		} else {
			// 나머지 경우
			boolean win = false;
			
			if( player.equals("가위") && computer.equals("바위")) {
				win = false;
			} else if ( player.equals("바위") && computer.equals("보") ) {
				win = false;
			} else if ( player.equals("보") && computer.equals("가위")) {
				win = false;
			}
			
			if( win ) { 
				System.out.println("당신이 이겼습니다!  -ㅅ-)/");
			} else {
				System.out.println("컴퓨터가 이겼습니다!");
			}
		}
	}
}
