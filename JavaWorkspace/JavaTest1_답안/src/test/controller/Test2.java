package test.controller;

public class Test2 {

	public static void main(String[] args) {

		
		for ( int i = 2; i <= 5 ; i++) {
			for (int j = 1 ; j < 10 ; j ++) {
				if (j % 2== 1) {
				System.out.println(i + "*" + j + "=" + (i * j));
				}
			} 
		System.out.println("--------------------- ");
		}
	}

}

// " 선언하지 않아도 출력 가능 (알아서 String 타입이 된다?)" + i(앞서 선언했던 값)

