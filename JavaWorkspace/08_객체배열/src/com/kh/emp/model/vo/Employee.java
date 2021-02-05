package com.kh.emp.model.vo;

public class Employee {
	// 사원 클래스 구현하기
	
	// 1. 필드 변수
	private String name;  // 이름
	private int empNo;    // 사원번호
	private int age;      // 나이
	private String dept;  // 부서
	private String phone; // 연락처
	private int salary;   // 급여
	
	// 2. 생성자 ( Alt + Shift + 'S')
	public Employee() { } // 기본 생성자 

	// 사용자 정의 생성자
	public Employee(String name, int empNo, int age, 
			        String dept, String phone, int salary) {
		this.name = name;
		this.empNo = empNo;
		this.age = age;
		this.dept = dept;
		this.phone = phone;
		this.salary = salary;
	}
	
	// 3. 기능 메소드
	// 사원 정보 모두 출력 기능
	public String empInfo() {
		
		return name +", " + empNo + ", " + age + ", "
				+ dept + ", " + phone + ", " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
