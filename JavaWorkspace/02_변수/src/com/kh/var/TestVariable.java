// 1. 패키지 생성

package com.kh.var;

// 2. 클래스 생성
// 	- 앞 글자는 대문자 
//		- 클래스의 이름은 파일의 이름과 동일해야 함
public class TestVariable {
		
		// 기능 제공 메소드 만들기 (실행했을 때 출력 안됨)
		public void method1() {
			
			// 일반 데이터 출력
			System.out.println(200);
			System.out.println(200);
			System.out.println(200);
			
			// ------------------------------------------ //
			
			// 변수 사용 시
			// 공간(변수) <- 값
			// 우측의 값을 좌측의 공간에 넣어라(대입해라)

			int money = 200;
			
			System.out.println(money);
			System.out.println(money);
			System.out.println(money);
			
		}
		
		public void method2() {
			// 변수 선언 기능 테스트
			
			// 1. 변수 선언 ( 프로필 작성하기 )
			// 자료형 (type) 변수명;			-> 이런식으로 선언하면 됨.
			// 이름                -  문자열 (String)
			String name;
			// 나이                -  정수 (Int)
			int age;
			// 취미                -  문자열 (String)
			String hobby;
			// 성별                -  문자 (Char) 문자 하나로 처리 가능하니까! 자바는 그것마저 따짐
			char gender;
			// 신장(키)            - 실수 (Double)
			double height;
			// 반려동물 유무  - 	논리 (Boolean)
			boolean pet;
			
			// 2. 선언한 변수에 값 대입하기
			// 공간명 = 값;
			name = "홍길동";
			age = 10;
			hobby = "음주 코딩";
			gender = '남';
			height = 180.5;
			pet = true; 
			
			// 3. 변수 공간의 값 꺼내오기
			System.out.println( name );
			System.out.println( age );
			System.out.println( hobby );
			System.out.println( gender );
			System.out.println( height );
			System.out.println( pet );
			
			
			
		}
		
		public void myMethod() {
			
			// 변수들 중 자료형 int, double, String, boolean 을
			// 사용하여 변수 공간 직접 만들어 보기
			// 도서명, 가격, 할인율(0.1), 재고유무 
			// 위의 값을 바탕으로 변수를 선언하여 
			// 값을 대입하고 화면에 출력하는 코드를 작성해보세요.
			
			int 가격;
			double 할인율;
			boolean 재고유무;
			String 도서명;
			
			가격 = 1000;
			할인율 = 0.1;
			재고유무 = true;
			도서명 = "코딩";
			
			System.out.println( 가격 );
			System.out.println( 할인율 );
			System.out.println( 재고유무 );
			System.out.println( 도서명 );
			
		}

}
