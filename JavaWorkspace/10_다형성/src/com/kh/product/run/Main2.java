package com.kh.product.run;

public class Main2 {

	public static void main(String[] args) {
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

}
