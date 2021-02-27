package com.starbugs.controller;

import com.starbugs.model.dao.CoffeeDAO;
import com.starbugs.model.exception.CoffeeException;
import com.starbugs.model.vo.Coffee;

public class CafeManager {
	
	private Coffee[] orderArr; // 커피 배열
	// private Bread[] orderBread;
	private int count;         // 주문 개수
	private CoffeeDAO dao;     // 주문 정보 저장/열기할 객체
	
	public CafeManager() {
		// 커피 주문 10칸짜리 배열 선언
		// orderArr = new Coffee[10];
		
		dao = new CoffeeDAO();
		
		orderArr = dao.openFile();
		
		int i = 0;
		while(true) {
			if (orderArr[i] == null) {
				break;
			}
			
			i++;
		}
		
		count = i;
	}
	
	public Coffee insertCoffee(Coffee coffee) {
		
		coffee.setOrderNo(count);
		orderArr[count] = coffee;
		count++;
		
		return coffee;
	}
	
	public Coffee checkCoffee(int orderNo) throws CoffeeException {
		
		if ( orderNo >= count ) {
			throw new CoffeeException("잘못된 주문 정보입니다.");
		}
		
		return orderArr[orderNo];
		
	}
	
	public void updateCoffee(int orderNo, Coffee coffee) {
		
		coffee.setOrderNo(orderNo);
		orderArr[orderNo] = coffee;
		
		System.out.println("수정 성공!");
	}
	
	public void deleteCoffee(int orderNo) {
		
		orderArr[orderNo] = null;
		
		if( orderNo < count - 1 ) {
			
			for(int i = orderNo ; i < count - 1 ; i++) {
				
				orderArr[i] = orderArr[i + 1];
				orderArr[i + 1] = null;
			}
		} 
		count--;
	}
	
	public void printAll() {
		
		for(int i = 0 ; i < count; i++) {
			System.out.println(orderArr[i]);
		}	
	}
	
	public void close() {
		
		dao.saveFile(orderArr);
		
	}
	
}
