// 변수를 사용하는 방법은 2가지가 있다.
// 변수를 '선언과 동시에 초기화' 하는 방법과
// 변수를 '선언 후 초기화' 하는 방법이다.


// Prac2은 '선언과 동시에' 초기화하는 방법이다.

// int age = 100;
// 위와 같이 변수 선언과 넣을 값을 '한번에' 선언해준다.

// 지역변수는 반드시 초기화 해야 한다.


package com.kh.var;

public class Prac2 {
	

		
		public static void method1() {
		
			String name = "노다비";
			char sex = 'F';
			int PassportNo = 456789;
			short  CustomerNumber = 123;
			long TicketNumber = 922337203 ;
			byte GateNumber = 33;
			float BaggageWeight = 8.9f;
			boolean AditionalFee = true;	
			double detailedFee= 3.65;

		

			// 출력할 값에 어떤 문자열을 포함하고 싶다면 
			// ""안에 문자열을 적고 '+' 더하기 연산자로 더해주면 끝!!
			
			System.out.println("Name : " +  name);
			System.out.println("Sex : " + sex);
			System.out.println("Passport No : " + PassportNo);
			System.out.println("Customer Number : " + CustomerNumber);
			System.out.println("Ticket Number : " + TicketNumber);
			System.out.println("Gate Number : " + GateNumber);
			System.out.println("Baggage Weight : " + BaggageWeight);
			System.out.println("Aditional Fee : " + AditionalFee);
			System.out.println("Detailed Fee : " + detailedFee + "  dollars");
			
		}
		
		

	}


