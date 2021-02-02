package com.kh.var;

import java.util.Scanner;

public class random {
	
	
public void chamchamcham() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("참,참,참! \n 방향을 입력해주세요 :");
		String player = sc.next();
		
		int choice = (int)(Math.random() * 3);   // 0 ~ 2
		String computer = "";
		
		switch( choice ) {
		case 0 : computer = "오른쪽";
		         break;
		case 1 : computer = "왼쪽";
				 break;
		case 2 : computer = "가운데";
				 break;
		}
		
			System.out.println("사용자의 선택 : " + player);
			System.out.println("컴퓨터의 선택 : " + computer);
			
			
			if( player.equals(computer))  {
				System.out.println("뿅망치! ");
			
			} else {
				System.out.println("아쉽군..");
				
				
			}
	}


}
