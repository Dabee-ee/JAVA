package com.kh.test;

import com.kh.poly.Plane;

public class Cargoplane extends Plane {
	
	

	public Cargoplane() {
		super();
}

	public Cargoplane(String name, int fuelSize) {
		super(name, fuelSize);
}

	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize() - (distance * 5));
		System.out.println(this.getFuelSize());
//		return this.getFuelSize();
	}

}
