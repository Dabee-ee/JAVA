package test.controller;

public class Test3 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		double avg = sum / 100;
		
		while (i <=100 ) {
			sum += i;
			i ++;
		}
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);

	}

}
