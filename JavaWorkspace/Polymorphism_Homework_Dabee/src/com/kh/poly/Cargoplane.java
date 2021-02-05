package com.kh.poly;

public class Cargoplane extends Plane {

	public Cargoplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
			System.out.println(super.getFuelSize() - (distance * 5) ); 
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
