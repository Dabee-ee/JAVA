package com.kh.op.test;

import jdk.swing.interop.SwingInterOpUtils;

//대입 연산자와 산술 연산자를 함께 사용하는 연산자
	// 산술대입 연산자 : +=, -=, *=, /=, %=
	// 증감 연산자와 같이 CPU를 거치지 않고
	// 메모리에서 직접 연산을 처리하기 때문에
	// 처리 속도가 빠르다.

	/*
	 * += : 왼쪽의 공간 안의 값에 오른쪽의 값을 더한 후
	 *      다시 왼쪽 공간에 넣어라
	 * -= : 왼쪽의 공간 안의 값에 오른쪽의 값을 뺀 후
	 *      다시 왼쪽 공간에 넣어라
	 * *= : 왼쪽의 공간 안의 값에 오른쪽의 값을 곱한 후
	 *      다시 왼쪽 공간에 넣어라
	 * /= : 왼쪽의 공간 안의 값에 오른쪽의 값을 나눈 후
	 *      몫을 다시 왼쪽 공간에 넣어라
	 * %= : 왼쪽의 공간 안의 값에 오른쪽의 값을 나눈 나머지를
	 *      다시 왼쪽 공간에 넣어라
	 */
		

public class F_복합대입연산자 {
	
	public void test() {
	
	int num = 10, result ;


	System.out.println("num : " + num);
	
	// num의 값을 3 증가시켜 다시 num에 저장해라!
	// num = num + 3;
	
	num += 3;
	
	System.out.println("num + 3: " + num);
	// 계속해서 증가시키고 싶다면 반복문을 사용해야 함.
	
	
	num -= 3;
	System.out.println("num - 3: " + num);
	
	num *= 3;
	System.out.println("num * 3: " + num);

	
	num /= 3;
	System.out.println("num / 3: " + num);
}
	
}
