package com.kh.test;

public class PlaneTest {
	
	public static void planeInfo () {
		System.out.println("Plane Name \t\t Fuel Size");
		System.out.println("----------------------------------------");
	}

	public static void main(String[] args) {
		
		Airplane a1 = new Airplane("L747", 1000);
		Cargoplane c1 = new Cargoplane("C40", 1000);
		
		int distance = 100;
		int fuel = 200;
		
		planeInfo();
		System.out.println(a1.getName() + "\t\t" + a1.getFuelSize());
		System.out.println(c1.getName() + "\t\t" + c1.getFuelSize());
		System.out.println(distance + "운항"); // " 100 운항"
		
		planeInfo();
		System.out.print(a1.getName() + "\t\t") ; a1.flight(distance);
		System.out.print(c1.getName() + "\t\t") ; c1.flight(distance);
		System.out.println(fuel + "주유");
		
		planeInfo();
		System.out.print(a1.getName()+ "\t\t" ) ; a1.refuel(fuel);
		System.out.print(c1.getName()+ "\t\t") ; c1.refuel(fuel);
		

	}

}
