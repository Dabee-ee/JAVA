package com.kh.loop;

import java.util.Scanner;

public class D_BreakTest {
	// 분기문 : 반복문 내에서 반복 수행 중
	//          특정 상황에 놓였을 때
	//          해당 반복문을 뛰쳐 나가거나 
	//          반복 내용을 무시하는 문법
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// 문자열을 입력받아
		// 글자 수를 출력하는 프로그램 작성
		// 단, 'exit'가 입력되면 반복 강제 종료
		
		String words = null;  // 아무것도 없음
		
		do {
			
			System.out.print("입력 : ");
			words = sc.nextLine();
			
			if ( words.equals("exit") ) {
				break;
			} else {
				System.out.println("글자 수 : " + words.length());
			}
			
		} while(true);
	}
				
			
		}

