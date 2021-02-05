package com.kh.product.run;

import com.kh.product.model.vo.Product;
import com.kh.product.model.vo.SmartPhone;
import com.kh.product.model.vo.TV;
import com.kh.product.model.vo.Tablet;

public class Main {

	public static void main(String[] args) {
		
		TV tv1 = new TV ("HDTV", 500);
		SmartPhone sp1 = new SmartPhone ("갤럭시", 1000);
		Tablet ta1 = new Tablet ("서피스" , 700);
		
		// 위 세가지 모두 product의 member
		// 그러므로 각각 처리하는 것이 아니라, 공통되는 상위 클래스로 묶어서 사용. (= 다형성)
		
		Product[] products = new Product[3];
				
		products[0] = tv1;
		products[1] = sp1;
		products[2] = ta1;
		
		for (int i = 0 ; i < products.length ; i ++) {
			products[i].display();
		}
		
		for(Product p : products) {

			// p.setChannel();
			// Product에는 setChannel이 없기 때문에 못가져옴. 다운캐스팅 해줘야됨
			if ( p instanceof TV ) {
				((TV) p).setChannel(10);
			}
				// 변수 p가 TV로 바뀔 수 있는지 확인해서 참거짓으로 반환해주는 기능

			p.display();		
			// 동적 바인딩을 통해 각 클래스의 재정의한 메소드를 실행시켰음.
			// instanceof를 쓰지 않으면 이 코드는 오류발생.
		}
		
	}

}


