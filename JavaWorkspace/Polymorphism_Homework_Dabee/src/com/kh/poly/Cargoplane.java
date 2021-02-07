package com.kh.poly;

public class Cargoplane extends Plane {
	
	
// 부모 생성자
	public Cargoplane() {}

	public Cargoplane(String name, int fuelSize) {
		super(name, fuelSize);
}

	// 기능
	@Override
	public int flight(int distance) {
		this.setFuelSize(this.getFuelSize()- (distance * 5));
		return this.getFuelSize();
	}
	
//	public int refuel (int fuel) {
//		this.setFuelSize(this.getFuelSize() + fuel);
//		return this.getFuelSize();
//	}

}
