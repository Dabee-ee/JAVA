package com.kh.inherit2;

public class GrandSubClass1 extends SubClass1 {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "손주 : " + this.getNum1() + ","
				 + this.getStr();
	}

	
}
