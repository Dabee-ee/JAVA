package com.kh.member.model.vo;

public class VIP extends Member {

	public VIP() {}

	public VIP(String name, String grade, int point) {
		super(name, grade, point);
}
	
	@Override
	public double getIncen() {
		return super.getPoint() * 0.05;
	}
	
	

}
