package com.kh.var;

public class For {
	
	public void test1() {
		
		// sum의 초기 값  
		// for문이 반복되고 나오면 증가 (for문에서 출력된 결과 값으로 새로 저장)
		int sum = 0;
		
		// i의 초기 값 // i가 10이 될 때 까지 1씩 증가
		for (int i = 1; i <= 10 ; i ++ ) {
			
			System.out.println("반복 확인 : " + i);
			
			// sum + i
			sum += i;
			
			// sum + i 의 결과 값 출력
			System.out.println(" sum : " + sum);
			
			// 빠져 나가서 결과 값 sum은 새로운 sum 값이 되고,
			// i 는 1 증가해서 다시 들어 옴
		}
		
		// for문이 종료되고 출력할 문자열
		System.out.println("\n 최종 값 : " + sum);
		
	}
	
	public void test2() {
		
	}

}
