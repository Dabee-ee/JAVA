package com.kh.var;
import java.util.Scanner;

public class InputMethod {
	
	// 키보드 입력을 받을 수 있는 기능 확인하기
	public void inputTest1() {
		
		// System.out : 모니터 (출력자원)
		// System.in  : 키보드 (입력자원)
		
		// Scanner : 각각의 자료형 별로
		//           키보드의 입력값을 처리하는 객체(class)
		// Ctrl + Shift + O
		Scanner sc = new Scanner(System.in);
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// 풀패키지(풀클래스명) : 사용하려는 자바 클래스 파일의 이름을
		//                  해당 클래스가 속한 모든 패키지명을 기술하여
		//                  선언하는 것을 말한다.
		//                 만약, 사용하려는 클래스가 여러개 있고, 그 클래스들의
		//                 이름이 같다면 이렇게 풀패키지명으로 선언하여 사용해야 한다!
		
		// 1. 키보드 값 입력을 담기 위한 변수 공간 선언
		String name;    // 이름
		int age;        // 나이
		double height;  // 신장(키)

		// 2. 화면에 값을 입력받기 위한 안내 메시지 출력하기
		System.out.print("이름 입력 : ");
		name = sc.next();
				
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
				
		System.out.print("신장 입력 : ");
		height = sc.nextDouble();

		// 3. 키보드로 입력한 내용 출력하기
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("신장 : " + height);

		
	}
}

