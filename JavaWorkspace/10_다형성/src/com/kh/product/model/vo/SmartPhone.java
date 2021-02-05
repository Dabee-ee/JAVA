package com.kh.product.model.vo;

public class SmartPhone extends Product {

	private boolean tel; // 전화 여부
	
	public SmartPhone() {
		super();
	}

	public SmartPhone(String modelName, int price) {
		super(modelName, price);
	}

	@Override
	public void display() {
		System.out.println( super.getModelName() + " : 전화 여부 >> " + tel);
	}
}
