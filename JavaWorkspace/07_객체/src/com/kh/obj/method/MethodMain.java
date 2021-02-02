package com.kh.obj.method;

public class MethodMain {
	
public static void main(String[] args) {
	
// 	new A_NonStatic().test1();
	
//	A_NonStatic non = new A_NonStatic();		 
//	// Scanner 가져왔던 방식이랑 같음. 복습하기.
//	
//	non.test1();
//	System.out.println( non.test2());
//	non.test3("홍길동");
//	System.out.println( non.sum(10, 20));
//	
//	B_Static sta = new B_Static();
//	
//	// sta.test1();
//	// 실행은 잘 되지만, 노란줄. 
//	// 스테틱 방식으로 접근하라고 나옴.
//	
//	B_Static.test1(); // 모두의 것이라는 것을 표시해줘야한다.
//								// 그래서 클래스 이름으로 직접 호출한다.
//	System.out.println( B_Static.test2() );
//	B_Static.test3(10, 20);
//	System.out.println( B_Static.sum(1.5, 2.5));
	
//}

	
	C_Overloading ov = new C_Overloading();
	
	ov.isZero(12345);
	ov.isZero(0.0);
	ov.isZero('A');
	ov.sum(3, 3);
	
}
}
