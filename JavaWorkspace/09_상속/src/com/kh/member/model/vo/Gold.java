package com.kh.member.model.vo;

public class Gold extends Member {

	public Gold() {}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
}
	@Override
	public double getIncen() {
		return super.getPoint() * 0.03;
	}

}
