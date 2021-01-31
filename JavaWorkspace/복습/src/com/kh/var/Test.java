package com.kh.var;

public class Test {
	
	public void test() {
		// 컴퓨터에게 0 ~ 2 까지 임의의 수를 고르게 한 후,
		// 해당 숫자를 가위, 바위, 보로 바꾸기
		
		int choice = (int)(Math.random() * 3);   // 0 ~ 2
		String computer = "";
		
		switch( choice ) {
		case 0 : computer = "노다비";
		         break;
		case 1 : computer = "노다비1";
				 break;
		case 2 : computer = "노다비2";
				 break;
		}
		
		System.out.println("컴퓨터 : " + computer);
	}

}
