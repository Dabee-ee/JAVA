package com.kh.product.model.vo;

public class Tablet extends Product {
	
	private boolean pen;

	public Tablet() { }


	public Tablet(String modelName, int price) {
		super(modelName, price);
}



	@Override
	public void display() {
		System.out.println( super.getModelName() + "필기 가능합니다.");

	}

}
