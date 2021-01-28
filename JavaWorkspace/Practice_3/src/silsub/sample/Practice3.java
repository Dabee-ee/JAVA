package silsub.sample;

import java.util.Scanner;

public class Practice3 {
	
	// 문제 1.
	//국, 영, 수 세 과목(int)의 점수를 키보드로 입력받고,
	//합계와 평균을 계산하고,
	//세 과목의 점수와 평균을 가지고 합격 여부 처리함
	//합격의 조건 : 세 과목의 점수가 각각 40점이상이고,
	//			평균이 60점 이상이면 합격, 
	//			아니면 불합격 처리함
	//합격인 경우에는 과목별 점수와 합계, 평균을 출력하고,
	//불합격인 경우는 "불합격" 출력함
	
	
	Scanner sc = new Scanner(System.in);
	
 public void test1() {
	 
	 int kor ;
	 int eng ;
	 int mat  ;
	 
	 System.out.println("국어 점수를 입력하세요 : ");
	 kor = sc.nextInt();
	 
	 System.out.println("영어 점수를 입력하세요 : ");
	 eng = sc.nextInt();
	 
	 System.out.println("수학 점수를 입력하세요 : ");
	 mat = sc.nextInt();
	 
	 int sum;
	 sum = kor + eng + mat;
	 
	 int avg;
	 avg = sum / 3;
	 
	 if ((kor >= 40) && (eng >= 40)  && (mat >= 40)  && (avg >= 60)) {
		 System.out.println("합격입니다. \n총점 :" + sum + "점\n평균 : " + avg + "점" );
	 }	else {
		 System.out.println("불합격입니다. ");
	 }
	 
 }
 
 
 // 문제 2.
// <ex> 화면에 출력함
//	*** 초기 메뉴 ***
//	1. 입력
//	2. 수정
//	3. 조회
//	4. 삭제
//	7. 종료
//	메뉴번호 입력 : 번호입력받음
//	=> 처리내용 : 
//		1 입력 --> "입력메뉴가 선택되었습니다."
//		2 입력 --> "수정메뉴가 선택되었습니다."
//		3 입력 --> "조회메뉴가 선택되었습니다."
//		4 입력 --> "삭제메뉴가 선택되었습니다."
//		7 입력 --> "프로그램이 종료됩니다."
//		다른값 입력시 "번호가 잘못 입력되었습니다."
//			  "다시 입력하십시오." 출력되게 함

 
 public void test2(){
	 
	 	System.out.println("*** 초기 메뉴 ***");
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.println("---------------------");
		
		// 1. 안내 문구
		System.out.println("메뉴 번호 입력 : ");
		int menu = sc.nextInt();
		
		// switch
		switch( menu ) {
		
		case 1: // if ( menu == 1 )
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4: 
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
			
		default : // 이도저도 아닌거라서 값을 특정 지을 수 없음. + else 역할
			System.out.println("번호가 잘못 입력되었습니다. \n 다시 입력하십시오.");
 }
}
 
 // 문제 3.
// 1. 정수 변수 선언
// 2. 키보드로 부터 정수 하나 입력받음
// 3. 입력받은 정수가 양수이면 "양수다." 출력
//    양수가 아니면 "양수가 아니다." 출력
// 4. main 에서 실행 테스트함.

 public void test3() {
	 
	 System.out.println("정수를 입력하세요 :");
	 int num = sc.nextInt();
	 
	 if (num > 0) {
		 System.out.println("양수다.");
	 }	else {
		 System.out.println("양수가 아니다.");
	 }
 }
 
 
 // 문제 4.
 // 정수를 하나 입력받아, 그 수가 양수일 때만
 // 입력된 수를 줄 수로 적용하여 다음과 같이 출력되게 함
 //	 정수 하나 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		================
//		정수 하나 입력 : -5
//		양수가 아닙니다.
 
 public void printStar() {
	
	 
	 System.out.println("정수를 입력하세요 : ");
	 int num = sc.nextInt();
	 
	 if (num > 0 ) {
		 
		 
		 for( int i = 0; i <= num ; i++) {
			 int sum = 0;
			 sum += i;
			 
			 for(int j = 0; j <=i ; j++) {
				 System.out.print("*");
				 }	
			 System.out.println();
			 }
	 		}	else {
				System.out.println("양수를 입력하세요.");
	 }
 }

 
// 문제 5.
// 문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
// 문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
// 단, 영문자만 입력받도록 함.
// Hint ::
//  - 영문자는 대문자와 소문자가 있다.
//  - 영 대소문자는 숫자는 ASCII 코드를 참조한다.
 
//	ex>
//	문자열 입력 : application
//	문자 입력 : p
//	포함된 갯수 : 2 개
//	====================
//	문자열 입력 : apple_test123
//	영문자가 아닙니다.
 
 public void countInputCharacter(){
	
	int count = 0;
	
	 System.out.println("문자열 입력 : ");
	 String strs = sc.next();
	 int numA = strs.charAt(0);
	 
	 // 질문1 if //
	 if (!((65 <= numA && numA <= 90) || (97 <= numA && numA <=122))) {
	 
	 System.out.println("영문자가 아닙니다. \n 영문자만 입력하세요.");
	 return;
	 } 
	 
	 else  {
	 System.out.println("문자 입력 : ");
	 String str = sc.next();
	 int numB = str.charAt(0);
		 
						 // (else 내장)질문2 if
						 if (!((65 <= numB && numB <= 90) || (97 <= numB && numB <=122))) {
								 System.out.println("영문자가 아닙니다. \n영문자만 입력하세요.");
								 return;
						 }		
						 
						 else if (str.length() > 1) {
								 System.out.println("하나의 문자만 입력해주세요.");
								 return;
						 }
						 
						 else {
								 for (int i = 0; i < strs.length(); i++) { 
									 if (strs.charAt(i) == numB) { count++;
									 }
								 }
						 // (else 내장)질문2 if 
								 
		 System.out.println("포함된 갯수 : " + count );
 		}
		// 질문1 if //
					 
}		
} 
}

