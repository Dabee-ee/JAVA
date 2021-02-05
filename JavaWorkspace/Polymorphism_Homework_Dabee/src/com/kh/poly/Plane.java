package com.kh.poly;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	public Plane () {}

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
	
	// 리필
	
	public void refuel(int fuel) {
		System.out.println(fuelSize + fuel );  

				}
	
	public  abstract void flight(int distance) ;
	
	public abstract void planInfo() {
		
	}
	
	
	}

