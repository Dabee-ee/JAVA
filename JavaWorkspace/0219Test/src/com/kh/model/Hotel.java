package com.kh.model;


public class Hotel {

	private int hotelNo; // 객실 번호
	private String name; // 투숙객 이름
	
	public Hotel() { }
	
	
	public Hotel(int hotelNo, String name) {
		super();
		this.hotelNo = hotelNo;
		this.name = name;
	}


	@Override
	public String toString() {
		if(name==null) {
			return hotelNo+ " 호실은 비어있습니다.";
		}
		return hotelNo + " 호실의 투숙객은 " + name + " 입니다.";
		
	}


	public int getHotelNo() {
		return hotelNo;
	}


	public void setHotelNo(int hotelNo) {
		this.hotelNo = hotelNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
