package com.kh.array;

public class MultiArray {
	// 다차원 배열
		//  여러 배열을 하나의 더 큰 배열로
		//  묶어 사용하는 개념
		
		// ex) 
		// 1학년 { 1반, 2반, 3반 }
		//     1반 { 김철수, 배철수, 박철수 }
		//     2반 { 고길동, 소길동, 김길동 }
		//     3반 { 김서방, 이서방, 박서방 }
		
		public void test1() {
			
			int[] num1 = { 1, 2, 3, 4, 5 };
			int[] num2 = { 6, 7, 8, 9, 10 };
			int[] num3 = { 11, 12, 13, 14, 15 };
			
			// 배열이 여러 개가 된다면
			// 변수가 많았던 것처럼 배열도 관리하기 힘들어 진다.
			// 따라서 이 배열들을 묶을 수 있는 더 큰 개념의
			// 배열을 도입하는데, 이것이 바로 다차원 배열이다.
			
			int[][] numbers = {
								{1, 2, 3, 4, 5},
								{6, 7, 8, 9, 10 },
								{11, 12, 13, 14, 15}
								};
			
			// 묶은 배열마다 길이가 다르다면?
			// 배열마다 길이가 달라도 묶을 수 있으며,
			// 이를 가변 배열이라고 부른다.
			int[][] numbers2 = {
									{1, 2, 3, 4, 5},
									{1, 3, 5},
									{1, 2, 3, 4}
								};
			
			// 다차원 배열 선언 시에는
			// 반드시 앞에 배열의 길이부터 선언 하여야 한다.
			int[][] arr = new int[5][5];
		}
		
		public void test2() {
			// 2차원 배열 선언하기
			// 3 * 3
			
			int[][] arr = new int[3][3];
			
			// 2차원 배열에 값 추가하기
			int num = 1;
			
			for(int i = 0; i < arr.length; i++) {
				for( int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num++;
				}
			}
			
			// 2차원 배열의 값 출력하기
			for(int i = 0 ; i < arr.length ; i++) {
				for( int j = 0 ; j < arr[i].length ; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}	
		public void silsub1() {
			// 5 * 5 배열을 만들어
			// 1 ~ 25까지 값을 추가한 후
			// 5개씩 끊어서 출력하기
			// ---------------------
			//  1  2  3  4  5
			//  6  7  8  9 10
			// 11 12 13 14 15
			// 16 17 18 19 20
			// 21 22 23 24 25
			// ---------------------
			
			int[][] arr = new int[5][5];
			int num = 1;
			
			for(int i = 0 ; i < arr.length; i++) {
				for( int j = 0 ; j < arr[i].length ; j++) {
					arr[i][j] = num;
					num++;
				}
			}
			
			for(int i = 0 ; i < arr.length; i++) {
				for( int j = 0 ; j < arr[i].length ; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
				System.out.println();
			}
			
		}
		
		public void silsub2() {
			// 5 * 5 배열을 만들어
			// 1 ~ 25까지 값을 추가한 후
			// 5개씩 끊어서 출력하기
			// ---------------------
			//  1  6 11 16 21
			//  2  7 12 17 22
			//  3  8 13 18 23
			//  4  9 14 19 24
			//  5 10 15 20 25
			// ---------------------
			
			int[][] arr = new int[5][5];
			int num = 1;
			
			for(int i = 0 ; i < arr.length; i++) {
				for( int j = 0 ; j < arr[i].length ; j++) {
					arr[i][j] = num;
					num++;
				}
			}
			
			for(int i = 0 ; i < arr.length; i++) {
				for( int j = 0 ; j < arr[i].length ; j++) {
					System.out.printf("%3d", arr[j][i]);
				}
				System.out.println();
			}
			
		}
		
		public void silsub3() {
			// 5 * 5 배열을 만들어
			// 1 ~ 25까지 값을 추가한 후
			// 5개씩 끊어서 출력하기
			// ---------------------
			//  1
			//  6  7
			// 11 12 13
			// 16 17 18 19
			// 21 22 23 24 25
			// ---------------------
			
			int[][] arr = new int[5][5];
			int num = 1;
			
			for(int i = 0 ; i < arr.length; i++) {
				for( int j = 0 ; j < arr[i].length ; j++) {
					arr[i][j] = num;
					num++;
				}
			}
			
			for(int i = 0 ; i < arr.length; i++) {
				for( int j = 0 ; j <= i ; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
				System.out.println();
			}	
		}
	}

		