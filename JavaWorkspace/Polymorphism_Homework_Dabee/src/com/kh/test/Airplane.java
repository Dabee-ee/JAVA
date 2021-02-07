package com.kh.test;

import com.kh.poly.Plane;

public class Airplane extends Plane {
	
	

	public Airplane() {
		super();
}

	public Airplane(String name, int fuelSize) {
		super(name, fuelSize);
}

	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize() - (distance * 3));
		System.out.println(this.getFuelSize());
//		return this.getFuelSize();
	}

}
