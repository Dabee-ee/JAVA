package com.kh.logic.test;

import java.util.Scanner;

public class IFtest {
	
	public void test1() {
		
		// 기본적인 if문
				// 마스크 착용 유무를 입력받아
				// 마스크를 착용해주세요 혹은
				// 이용해 주셔서 감사합니다
				// 출력하기
				// 자동 import 단축키 : Ctrl + Shift + O
				Scanner sc = new Scanner(System.in);
				
				// 안내문구
				System.out.print("마스크 착용 하셨나요? (Y/N) : ");
				char ch = sc.next().charAt(0);
				
				// 입력받은 값을 비교하는 조건을 만들어
				// 조건에 따른 선택 기점 만들기
				if( ch == 'Y' ) {
					// 만약 'Y'를 입력했다면
					System.out.println("이용해주셔서 감사합니다.");
				} else {
					// 위의 조건을 만족하지 않는 나머지 상황
					System.out.println("마스크를 반드시 착용해주세요, ㅇㅂㅇ)/ ");
		
	}

}
	
	public void test2() {
		
		// 조건에 따른 결과가 3개 이상일 경우
				// if와 else if 조건문을 사용한다.
				// 국어, 영어, 수학 점수를 입력받아
				// 평균에 따른 성적 구하기
				
				/*
				 * -- 점수 기준 --
				 * 평균 : 90점 이상 ( A )
				 *        80점 이상 ( B )
				 *        70점 이상 ( C )
				 *        60점 이상 ( D )
				 *        아니면 ...( F )
				 */
				
				Scanner sc = new Scanner(System.in);
				
				// 안내 문구
				System.out.print("국어 점수 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어 점수 : ");
				int eng = sc.nextInt();
		
				System.out.print("수학 점수 : ");
				int mat = sc.nextInt();
				
				int sum = kor + eng + mat;
				int avg = sum / 3;
				// int avg = (kor + eng + mat) / 3 도 가능! 
				
	
				
						if( avg >= 90) {
							
							System.out.println("당신의 성적은 A 입니다.");
							
						} else if( avg >= 80) {
							
							System.out.println("당신의 성적은 B 입니다.");
							
						} else if( avg >= 70 ) {
							
							System.out.println("당신의 성적은 C 입니다.");
							
						} else if( avg >= 60 ) {
							
							System.out.println("당신의 성적은 D 입니다.");
							
						} else {
							
							System.out.println("당신의 성적은 F 입니다.");
		
		
		
	}
	
}
	
	public void test3() {
		// 조건에 따른 결과가 3개 이상일 경우
		// if와 else if 조건문을 사용한다.
		// 국어, 영어, 수학 점수를 입력받아
		// 평균에 따른 성적 구하기
		
		/*
		 * -- 점수 기준 --
		 * 평균 : 90점 이상 ( A )
		 *        80점 이상 ( B )
		 *        70점 이상 ( C )
		 *        60점 이상 ( D )
		 *        아니면 ...( F )
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 안내 문구
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		// int avg = (kor + eng + mat) / 3 도 가능! 
		
		String grade = "";
		
		if( avg >= 90 ) {
			
			grade = "A";
			
		} else if( avg >= 80 ) {
			
			grade = "B";
			
		} else if( avg >= 70 ) {
			
			grade = "C";
			
		} else if( avg >= 60 ) {
			
			grade = "D";
			
		} else {
			
			grade = "F";
			
		}
		
		System.out.println("당신의 성적은 " + grade + "학점 입니다.");
	}
	
	
	public void testSimya() {
		// if 조건문을 활용하여 메뉴판 만들기
		
		// 1. 메뉴판 출력하기
		System.out.println("-- 유다니엘's 심야식당 ver 1.0 --");
		System.out.println("1. 푸라면");
		System.out.println("2. 두리안");
		System.out.println("3. 고추튀김");
		System.out.println("4. 써프라이드 치킨");
		System.out.println("5. 떡볶이");
		System.out.println("-------------------------");
		
		// 2. 고객에게 메뉴 안내하기
		System.out.print("메뉴를 골라 주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int menu = sc.nextInt();
		
		if ( menu == 1 ) {
			
			System.out.println("푸라면을 선택하셨습니다.");
			System.out.println("가격은 7000원입니다. (4인 이상 주문 시)");
			
		} else if ( menu == 2 ) {
			
			System.out.println("두리안을 선택하셨습니다.");
			System.out.println("가격은 30000원입니다.");
			
		} else if ( menu == 3 ) {
			
			System.out.println("고추튀김을 선택하셨습니다.");
			System.out.println("가격은 2000원입니다. (재료비 별도)");
			
		} else if ( menu == 4 ) {
			
			System.out.println("써프라이드 치킨을 선택하셨습니다.");
			System.out.println("가격은 23000원입니다. (소요시간 30~50분)");
			
		} else if ( menu == 5 ) {
			
			System.out.println("떡볶이를 선택하셨습니다.");
			System.out.println("가격은 1500원입니다.");
			
		} else {
			
			System.out.println("잘못 선택하셨습니다.");
		}
		
	}
	
	public void test4() {
		
		// 과일 이름 (사과, 배, 바나나, 참다래, 두리안, 감)들을
		// 입력받아 과일과 그 가격을 출력하는 프로그램을 작성하세요.
		
		/*
		 * 사과 - 1500원
		 * 배 - 3000원
		 * 바나나 - 450원
		 * 참다래 - 78000원
		 * 두리안 - 1200원
		 * 감 - 100000원 
		 */

		Scanner sc = new Scanner(System.in);
		
		// 1. 메뉴판 만들기
		System.out.println("-- 노다비's 과일가게 ver 1.0 -- ");
		System.out.println("    1. 사과");
		System.out.println("    2. 배");
		System.out.println("    3. 바나나");
		System.out.println("    4. 참다래");
		System.out.println("    5. 두리안");
		System.out.println("    6. 감");
		
		System.out.println("과일 입력 : ");
		int menu = sc.nextInt();
				
		
		if ( menu == 1 ) {
			
			System.out.println("사과를 선택하셨습니다.");
			System.out.println("가격은 1500원입니다. ");
			
		} else if ( menu == 2 ) {
			
			System.out.println("배를 선택하셨습니다.");
			System.out.println("가격은 1000원입니다.");
			
		} else if ( menu == 3 ) {
			
			System.out.println("바나나를 선택하셨습니다.");
			System.out.println("가격은 2000원입니다. (재료비 별도)");
			
		} else if ( menu == 4 ) {
			
			System.out.println("참다래를 선택하셨습니다.");
			System.out.println("가격은 3000원입니다. (소요시간 30~50분)");
			
		} else if ( menu == 5 ) {
			
			System.out.println("두리안을 선택하셨습니다.");
			System.out.println("가격은 700원입니다.");
			
		} else if ( menu == 6 ) {
			
			System.out.println("감을 선택하셨습니다.");
			System.out.println("가격은 1200원입니다.");
			
		} else {
			
			System.out.println("잘못 선택하셨습니다.");

		
	}
}
	
	public void test5() {


			// 과일 이름(사과, 배, 바나나, 참다래, 두리안, 감)들을
			// 입력받아 과일과 그 가격을 출력하는 프로그램을 작성하세요.
			/*
			 * 사과 - 1500원
			 * 배 - 3000원
			 * 바나나 - 450원
			 * 참다래 - 78000원
			 * 두리안 - 1200원
			 * 감 - 100000원 
			 */
			
			Scanner sc = new Scanner(System.in);
			
			// 1. 메뉴판 만들기
			System.out.println("-- 홍길동's 과일가게 ver 1.0 --");
			System.out.println("  사과");
			System.out.println("  배");
			System.out.println("  바나나");
			System.out.println("  참다래");
		    	System.out.println("  두리안");
			System.out.println("  감");
			System.out.println("---------------------");
			
			System.out.print("과일 입력 : ");
			
			String fruit = sc.next();
			int price = 0;

			// ** 문자열은 일반 문자나 기본 자료형들과 다르게
			// 참조 자료형의 형태를 띄기 때문에
			// 실제 문자열이 가진 값은 해당 문자열의 메모리 안 주소값을 가진다.
			// 따라서 Heap 메모리 안에 저장된 주소의 값을 실제 문자열과
			// 비교하게 되어 올바른 비교 결과가 나오지 않는다.
			// 이를 해결하기 위해 문자열들은 "문자열".equals("비교할 문자열")라는
			// 메소드를 별도로 제공한다.

			
			if( fruit.equals("사과") ) {
				price = 1500;
				
			} else if ( fruit.equals("배") ) {
				
				price = 3000;
				
			} else if ( fruit.equals("바나나")) {
				
				price = 450;
				
			} else if ( fruit.equals("참다래") ) {
				
				price = 78000;
				
			} else if ( fruit.equals("두리안") ) {
				
				price = 1200;
				
			} else {
				
				price = 100000;
				
			}
			
			System.out.println(" 주문하신 과일은 " + fruit + "이며, ");
			System.out.println(" 가격은 " + price + "원 입니다.");
			
		}
}