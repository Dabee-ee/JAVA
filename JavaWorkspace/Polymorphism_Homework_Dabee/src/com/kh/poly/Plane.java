package com.kh.poly;

public abstract class Plane {
	
	private String name;
	private int fuelSize;
	
	public Plane() {}

	public Plane(String name, int fuelSize) {
		this.name = name;
		this.fuelSize = fuelSize;
	}
	
	// 주유
	
	public void refuel (int fuel) {
		 this.fuelSize = fuelSize + fuel;
//		 System.out.println(this.fuelSize);
	}
	
	// 운항
	public abstract void flight (int distance) ;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	


}