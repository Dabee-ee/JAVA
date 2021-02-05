package com.kh.emp.run;

import com.kh.emp.model.vo.Employee;

public class ObjArrayTest {

	public static void main(String[] args) {
		// 앞에서 만든 사원정보관리 프로그램에는 한 가지 문제점이 있다. 
		// 사원정보를 '하나만' 관리할 수 있다는 것이다.
		// 사원의 정보를 여러가지 가지고 있다면 여러개를 관리할 수 있을텐데...
		// ----> 이럴 때는 객체를 배열로 묶어서 쓸 수 있다.
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		// ... 이렇게 만드는 것보다 하나의 더 큰 사원의 개념을 만들자
		
		// 객체를 여러 개 하나씩 선언하는 형태에서 
		// 객체를 배열단위로 묶어 사용하는 형태로 바꿀 수 있다.
		
		// 선언하는 방법은 순서가 있다. 
		// 1. 객체 배열의 길이를 선언
		Employee [] empArr = new Employee [5];
		
		// 2. 직접 값을 추가한다.
		empArr[0] = new Employee(); // Arr 0번째부터 새로운 employee를 넣음.
		empArr[1] = new Employee();
		empArr[2] = new Employee();
		
		// cf. 숏핸드 
		Employee[] empArr2 = {
				
				new Employee(),
				new Employee(),
				new Employee(),
				new Employee(),
				new Employee()
				
		};
		
		
		// 각각의 정보를 뽑고 싶다면 반복문을 이용하자
		for ( int i  = 0 ;  i < empArr2.length ; i ++) {
			System.out.println(empArr2[i].empInfo() );
		}
	}

}
