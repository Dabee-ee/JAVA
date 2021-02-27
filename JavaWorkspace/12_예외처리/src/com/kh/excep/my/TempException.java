package com.kh.excep.my;

// 사용자 정의 예외
// 반드시 Exception 이나 RuntimeException 을 상속받아서
// 구현해야 한다!
public class TempException extends Exception {

	public TempException() { }
	
	public TempException(String msg) {
		super("이상 발생 : " + msg);
	}
}
