package com.kh.poly.emp;

public class Sales extends Employee implements Bonus {

	
	
	public Sales() {}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
}

	@Override
	public void incentive(int pay) {
		this.setSalary((int) (getSalary() + (pay * 1.2)));
//		System.out.println(getSalary());

	}

	@Override
	public double tax() {
		return this.getSalary() * 0.13;
	}

}
