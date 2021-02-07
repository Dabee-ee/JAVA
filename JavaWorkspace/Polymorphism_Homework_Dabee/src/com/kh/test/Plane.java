package com.kh.test;

public abstract class Plane {
	
	// 필드변수, 추상화
	private String planeName;
	private int fuelSize;
	
	public Plane() {}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	// 기능메소드 1. 운항
	public abstract void flight (int distance);
	
	// 2. 주유
	public void refuel (int fuel) {
		this.fuelSize = fuelSize + fuel;
		System.out.println(this.fuelSize);
		
		
		
	}
	

}
