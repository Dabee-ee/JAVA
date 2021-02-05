package com.kh.cafe.model.vo;

public class Tea extends Drink {
	
	private String season;
	public Tea() {}
	
	public Tea(String name, String size, int price, String origin) {
		super(name, size, price, origin);
	}
	
	public Tea(String name, String size, int price, String origin, String season) {
		// super()나 this() 생성자 참조 메소드는
				// 반드시 생성자 선언 내의 첫 줄에 위치해야 한다.
		super(name, size, price, origin);
		this.season = season;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	@Override
	public String drinkInfo() {
		
		return super.drinkInfo() + ", " + season;
	}
	
	
	

}
