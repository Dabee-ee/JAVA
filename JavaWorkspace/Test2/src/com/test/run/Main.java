package com.test.run;

import com.test.model.vo.*;

public class Main {

	public static void main(String[] args) {
		Student[] sArr = new Student[3];
		
		
		sArr[0] = new Student("홍길동", 10, 160, 60, "212001", "건축");
		sArr[1] = new Student("김철수", 15, 156, 45, "212002", "로보틱스");
		sArr[2] = new Student("박문수", 20, 180, 80, "212003", "오징어심리");
		
		String p = sArr.toString();
		
		System.out.println("이름 \t\t 나이 \t 키 \t\t몸무게 \t 학번 \t\t 전공");
		for(int i = 0 ; i < sArr.length ; i++) {
			 System.out.println(sArr[i]);
		 }

	}

}
