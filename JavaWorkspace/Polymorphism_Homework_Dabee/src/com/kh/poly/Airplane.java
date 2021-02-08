package com.kh.poly;

public class Airplane extends Plane {
	
// 부모생성자
	public Airplane() {}

	public Airplane(String name, int fuelSize) {
		super(name, fuelSize);
}
	
	// 기능
	@Override
	public void flight (int distance) {
		this.setFuelSize(this.getFuelSize()- (distance * 3));
//		return this.getFuelSize();
	}
	
//	public int refuel (int fuel) {
//		this.setFuelSize(this.getFuelSize() + fuel);
//		return this.getFuelSize();
//	}
	}
	
