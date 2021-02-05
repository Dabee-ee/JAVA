package com.kh.cafe.run;

import com.kh.cafe.model.vo.*;

public class Main {

	public static void main(String[] args) {
		
		Coffee c1 = new Coffee("아메리카노", "벤티", 2500, "브라질",1);
		Coffee c2 = new Coffee("아메리카노", "톨", 3000, "콜롬비아", 3);

		System.out.println(c1.drinkInfo());
		System.out.println(c2.drinkInfo());
		
		Tea t1 = new Tea("캐모마일", "라지", 4500, "국산","봄");
		System.out.println(t1.drinkInfo());
		

	}

}
