package com.kh.cafe.model.vo;

public class Coffee extends Drink {
	
	private int shot;
	
	public Coffee() { }

	public Coffee(String name, String size, int price, String origin) {
		super(name, size, price, origin);
	}

	public Coffee(String name, String size, int price, String origin, int shot) {
		super(name, size, price, origin);
		this.shot = shot;
	}

	public int getShot() {
		return shot;
	}

	public void setShot(int shot) {
		this.shot = shot;
	}
	
	@Override   // <-- 표기 안해도 됨 (JVM이 나중에 표기함)
	public String drinkInfo() {
		
		return super.drinkInfo() + ", " + shot +"잔 추가!";
	}	
	
}















