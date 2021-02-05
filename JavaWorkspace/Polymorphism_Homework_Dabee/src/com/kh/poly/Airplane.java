package com.kh.poly;

public class Airplane extends Plane {

	public Airplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
			System.out.println(super.getFuelSize() - (distance * 3) ); 
			
	}
	

	@Override
	public void refuel(int fuel) {
		super.refuel(super.getFuelSize() - fuel);
	}

	@Override
	public void planInfo() {
		System.out.println("Plane name \t Fuel Size");
		
	}



}
