package com.kh.emp.view;

import java.util.Scanner;

import com.kh.emp.model.vo.Employee;

public class EmpMenu {
	// 사원 관리 화면
	
	private Employee emp;  // 관리할 사원 객체
	
	public static void display() {
		// 사원 관리 화면
		Scanner sc = new Scanner(System.in);
		EmpMenu em = new EmpMenu();
		
		
		
		
		
		// 반복할 수 있도록 반복문 씌워줌
		do {
			System.out.println("-- 노다비's 사원 관리 프로그램 ver 1.0 --");
			System.out.println("1. 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 조회");
			System.out.println("0. 퇴근하기");
			System.out.println("---------------------------------------");
			System.out.print(" 메뉴 선택 >> ");
	
			int select  = sc.nextInt();
			switch( select ) {
			case 1:
				empInsert( em ); 
				// em이 가지고 있는 emp를 전달하라는 의미
				// EmpMenu em = new EmpMenu(); 인스턴스화 시켰던 이 객체를 가져옴
				// static은 static만의 공간에 있기 때문에 public void empInsert면 가져올 수 없음.
				break;
			case 2:
				empUpdate(em);
				break;
			case 3:
				empDelete( em );
				break;
			case 4:
				empPrint( em );
				break;
			case 0:
				System.out.println("오늘 하루도 정말 고생하셨습니다~!");
				return;		// 메소드 종료
			default :
				 	System.out.println("잘못 입력하셨습니다.");
			
			}
		} while(true);
		
		
	}

	// 1. 사원 정보 생성 (입력 받는 기능)
	public static void empInsert(EmpMenu em) {
												// 매개변수가 Employee emp에서 바뀜.
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 사원명 : ");
		String name = sc.next();
		
		System.out.println(" 사원번호 : ");
		int empNo = sc.nextInt();
		
		System.out.println(" 나이 : ");
		int age = sc.nextInt();
		
		System.out.println(" 부서 : ");
		String dept = sc.next();
		
		System.out.println(" 연락처 : ");
		String phone = sc.next();
		
		System.out.println(" 급여 : ");
		int salary = sc.nextInt();
		
		em.setEmp(new Employee(name, empNo, age, dept, phone, salary));
//		
//		emp = new Employee(name, empNo, age, dept, phone, salary);
//		사용자 정의 생성자에서 선언한 순서와 일치해야 한다.
//		
		System.out.println(" 사원 정보 등록이 완료되었습니다.");
	}
	
	// 2. 사원 정보 수정
	public static void empUpdate (EmpMenu em) {
		Employee emp = em.getEmp();
		Scanner sc = new Scanner(System.in);
		
		// 연락처 / 급여
		
		System.out.println(" 현재 연락처 : " + emp.getPhone());
		System.out.println(" 바꿀 연락처 : " );
		emp.setPhone(sc.next());
		
		System.out.println(" 현재 급여 : " + emp.getSalary());
		System.out.println(" 바꿀 급여 : " );
		emp.setSalary(sc.nextInt());
		
		em.setEmp(emp);
		
		System.out.println("사원 정보 수정 완료.");
	}
	
	// 3. 삭제
	public static void empDelete(EmpMenu em) {
		em.setEmp(null);
		System.out.println("사원 정보 삭제 완료.");
	}
	// 4. 사원 정보 조회
	
	public static void empPrint (EmpMenu em) {
//		System.out.println(emp.empInfo() );
		System.out.println( em.getEmp().empInfo() );
	}
	
	
		// 사원 정보 전달용 Getter & Setter
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}
