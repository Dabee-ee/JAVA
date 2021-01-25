package com.kh.op.run;

import com.kh.op.test.*;

public class Main {

	public static void main(String[] args) {
		// 실행전용 메소드
		// new A_증감연산자().test2();
		// new B_논리부정연산자().test1();
		new C_산술연산자().test1();
		
		/*
		 * 연산자
		 *  - 컴퓨터에서 계산에 사용하는 기호
		 *  - 각 연산자는 우선순위에 따라 연산이 처리된다.
		 *  ex) 10 + 5 * 2 = 20;
		 *  
		 *  - 총 15단계로 나누어져 있으나,
		 *    크게 6가지로 묶을 수 있다.
		 *    
		 *    최우선 > 단항 > 이항 > 삼항 > 대입 > 나열(,)
		 *    
		 *  - 최우선 연산자 : 1순위
		 *   (), .(직접접근 연산자, ~ 안에 있는), 
		 *   -> (람다식 : 간접 접근 연산자), 
		 *   [] (배열 괄호)
		 *   
		 *  - 단항 연산자 : 2순위
		 *    - 계산에 필요한 값이 1개인 연산자
		 *  +, - : 부호 표시 기호,
		 *  ! (논리 부정 연산자),
		 *  ++, -- (증감연산자),
		 *  (자료형) (형변환 연산자),
		 *  ~ (틸트) (비트반전연산자)
		 *  ex) 0010 --> 1101
		 *  
		 *  - 이항 연산자 : 3순위 ~ 12순위
		 *    - 값이 두 개 필요한 연산자
		 *  
		 *  산술 연산자 : 3순위 // *, /, %
		 *                4순위 // +, -
		 *  시프트 연산자 : 5순위 // <<, >>, >>>
		 *    - 값을 비트 단위로 왼쪽 / 오른쪽 이동시키는 연산자
		 *    (flag 신호, 2의 배수 계산, 기계언어 통신 구현)
		 *   
		 *   비교 연산자 : 6순위 // >, <, >=, <=
		 *   
		 *   비교 논리 연산자 : 7순위 
		 *    == : 같다 (동등비교 연산자)
		 *    != : 다르다 
		 *    ex) 2 == 양수 ? true/false
		 *    
		 *    논리 연산자 : 논리 값을 연산하는 연산자
		 *       비트 논리 연산자 : 비트(0, 1) 값을 계산
		 *         &(and) : 8순위
		 *         ^(xor) : 9순위
		 *         |(or) : 10순위
		 *       
		 *       일반 논리 연산자 : 같거나, 또는
		 *         A && B : A와 B 둘 모두 참일 경우 : 11순위
		 *         A || B : A가 참이거나 또는 B가 참인 경우 : 12순위
		 *         
		 *   - 삼항 연산자 : 13순위
		 *    (조건) ? "참일 때 값" : "거짓일 때 값";
		 *    ** 조건식은 반드시 true / false가 나와야 하며,
		 *       주로 비교, 논리 연산자가 사용된다.
		 *       
		 *   - 대입 연산자 : 14순위
		 *     순수 대입 : =
		 *     복합 대입 : +=, *=, -=, /=, %= . . . 
		 *                 <<=, >>=, >>>=
		 *                 &=, ^=, |=
		 *     
		 *   - 나열 연산자 : 15순위
		 *   ex) int kor;
		 *       int eng; . . .
		 *   --> int kor, eng, mat, . . .;
		 */


	}

}
