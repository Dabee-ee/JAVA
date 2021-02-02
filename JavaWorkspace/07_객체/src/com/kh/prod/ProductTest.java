package com.kh.prod;

import com.kh.obj.model.vo.Book;

public class ProductTest {

	public static void main(String[] args) {
		// 실행 전용 메소드
				Scanner sc = new Scanner(System.in);
						
				Product p = new Product();
				
				System.out.print("상품명 : ");
				String name = sc.nextLine();
				
				System.out.print("가격 : ");
				int price = sc.nextInt();
				
				System.out.print("수량 : ");
				int quantity = sc.nextInt();
				
				p.setName(name);
				p.setPrice(price);
				p.setQuantity(quantity);
				
				System.out.println( p.information() );
				
				System.out.println("총 금액 : " + ( p.getPrice() * p.getQuantity() ) + "원");

			}

		
}
