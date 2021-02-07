package com.kh.poly.emp;

public class Secretary extends Employee implements Bonus {

	
	
	public Secretary() {}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
}

	@Override
	public void incentive(int pay) {
		this.setSalary((int) (getSalary() + (pay * 0.8)));
//	System.out.println(getSalary());
	}



	@Override
	public double tax() {
		return this.getSalary() * 0.1;
	}
	
	

}
