package com.kh.product.model.vo;

public class TV extends Product {
	
	private int channel = 1; 
	
	public TV() { }

	public TV(String modelName, int price) {
		super(modelName, price);
}
	
	public void setChannel (int channel) {
		this.channel = channel;
		
	}



	@Override
	public void display() {
		System.out.println( channel + " 번 화면을 보여줍니다. ");
		
	}
}
