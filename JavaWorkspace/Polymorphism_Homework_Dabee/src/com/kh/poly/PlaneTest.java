package com.kh.poly;

public class PlaneTest {

	public static void main(String[] args) {

		Airplane a1 = new Airplane("L747", 1000);
		Cargoplane c1 = new Cargoplane("C40", 1000);
		
//		Plane [] pArr = new Plane[2];
//		
//		pArr[0] = a1;
//		pArr[1] = c1;
////		
//		for (int i = 0 ; i < pArr.length ; i ++) {
//			pArr[i].flight();
//		}
//		for (int i = 0 ; i < pArr.length ; i ++) {
//			pArr[i].refuel();
//		}
		
		a1.planInfo();
		System.out.println("--------------------------------");
		System.out.println(a1.getPlaneName() +"     " + a1.getFuelSize());
		System.out.println(c1.getPlaneName()  +"     " + c1.getFuelSize());
		System.out.println("100 운항");
		
		a1.planInfo();
		System.out.println("--------------------------------");
		System.out.print(a1.getPlaneName() +"     ") ;  a1.flight(100);
		System.out.print(c1.getPlaneName() +"     ") ;  c1.flight(100);
		System.out.println("200 주유");
		
		a1.planInfo();
		System.out.println("--------------------------------");
		System.out.print(a1.getPlaneName() +"     ") ;a1.refuel(200);
		System.out.print(c1.getPlaneName() +"     ") ; c1.refuel(200);
		
		
		
	}


		
		
		
		
	}

