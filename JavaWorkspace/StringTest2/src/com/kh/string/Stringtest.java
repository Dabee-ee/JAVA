package com.kh.string;

public class Stringtest {
		
		public static void test1() {
		String str = "한글데이터 변환하기" ;
		char[] chr = str.toCharArray();
		String change = "";
		
		for (int i = 0 ; i < chr.length ; i++) {
			change += Character.toString(chr[i]);
		}
		
		System.out.println(change);

	}
		
		public static void test2() {		// 한글자씩 뽑아보기 : charAt 이용
			String str = "한글데이터 변환하기" ;
//			char c ;
			
			for (int i = 0; i < str.length(); i++ ) {
				char c = str.charAt(i);
				System.out.println(str.charAt(i));
			}
			}
		
		public static void test3() {		// 한글자씩 뽑아보기 : split 이용
			// "J a v a P r o g r a m " 해당 문자열을
			// 공백을 제거하여 char[]에 담고,
			// 모든 글자 수와, 모두 대문자로 바꾼 결과를 출력하세요.
			
			String[] words = "J a v a P r o g r a m ".split(" ");			// 이 부분을 출력했을 때는 왜 주소 값이 나오는건지?
			
			String str = String.join("",words);			// 여기까지도 주소 값으로 출력됨.
			
			char array [] = str.toCharArray();		
			// toString이나 toCharArray등 배열에 담아야 값이 출력되는 것?
			// String array = str.toString(); 			--> String은 배열에 담지 않음
			// char array [] = str.toCharArray();	--> Char은 배열에 담아야 함. (한 글자씩 들어가 있으니까 합쳐서 사용하려면..)
			System.out.println(array);
			
		}
		
			// 그럼 String을 여러개로 합치려면?
			
			public void stringBuffer() {
				// 문자열 변경 시에 임시의 공간에 담아
				// 값을 완전히 변경하기 전까지 문자열 저장소에
				// 값을 기록하지 않고, 변경이 완료되면 한번에
				// 값을 기록하는 객체(클래스)
				StringBuffer sb = new StringBuffer();
				
				sb.append("Hello");
				
				System.out.println(sb);
				
				sb.append(" World!");					// StringBuffer을 이용하면 append할 때마다 공백과 함께 문자가 더해진다.
																		// append 하는 동안에는 임시 저장소인 Heap에 머물러 있는다.
				
				System.out.println(sb);
				
				// ------------------------------------------------------
				
				String result = sb.toString();				// toString(); 해주었을 때 비로소 메모리에 저장된다. 
																				// String을 여러개로 합칠 때, 더하기 연산자를 사용하기도 하는데 그렇게 하면
																				// 메모리 낭비가 심해지므로 Buffer를 사용한다.
				
				
				System.out.println(result);
			
		}
			
			public void stringBuilder() {
				// StringBuffer 는 동시제어 기능을 가진다.
				// 동시 제어 ( Thread Safe ) :
				//      하나의 공간에 서로 다른 두 프로그램이
				//      동시에 수정하려하는 것을 방지하는 기능
				// 간단한 프로그램을 작성할 때 해당 기능이 필요치 않을 경우
				// 개발자는 StringBuilder 를 사용할 수 있다.
				StringBuilder sb = new StringBuilder();
				
				
				sb.append("Hello");
				System.out.println(sb);
				
				
				sb.append(" World!");
				System.out.println(sb);
				
				
				String result = sb.toString();
				System.out.println(result);
			}
		}

