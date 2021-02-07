package com.kh.poly.emp;

public class Company {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[2];
		
//		Secretary se1 = new Secretary("Hilery", 0, "secretary", 800);
//		Sales sa1 = new Sales("Clinten", 0, "sales", 1200);
//		
	
		employees[0] = new Secretary("Hilery", 0, "secretary", 800); 
		employees[1] = new Sales("Clinten", 0, "sales", 1200);
		
//		se1.incentive(100); 
//		System.out.println(se1.tax() ); 
//		
//		sa1.incentive(100); 
//		System.out.println(sa1.tax() ); 
//		
		for ( int i = 0 ; i < employees.length ; i++ ) {
			System.out.println(employees[i].getName() +"\t\t" +  employees[i].getDepartment() +"\t\t" + employees[i].getSalary()   );
		}
		
		System.out.println("인센티브 100 지급");
		
		

		for ( int i = 0 ; i < employees.length ; i++ ) {
			employees[i].incentive(100);
			System.out.println(employees[i].getName() +"\t\t" +  employees[i].getDepartment() +"\t\t" 
		+ "\t\t" + employees[i].getSalary() +"\t\t" +  employees[i].tax()  );
		}
		

	}

}
