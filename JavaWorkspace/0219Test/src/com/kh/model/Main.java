package com.kh.model;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Properties room = new Properties();

		Scanner sc = new Scanner(System.in);

		System.out.println("----------코코 Hotel에 오신것을 환영합니다------------");
		System.out.println("***************현재 객실 상황****************");

		room.put(1, new Hotel(1, null));
		room.put(2, new Hotel(2, "체리마루"));
		room.put(3, new Hotel(3, "호두마루"));
		room.put(4, new Hotel(4, null));
		room.put(5, new Hotel(5, null));

		for (int i = 1; i < room.size() + 1; i++) {
			System.out.println(room.get(i));
		}
		
		System.out.println("-----------------------------------------------");
		// 호실선택
		System.out.print("고객님 묵으실 방 호수를 입력해주세요 ! : ");
		int roomNo = sc.nextInt();

		Hotel h1 = (Hotel) room.get(roomNo);
		if (h1.getName() != null) {
			System.out.println("이미 투숙객이 있습니다! 다른 호실을 선택하세요.");
			return;
		}

		// 이름입력
		System.out.print("환영합니다 고객님  성함이 어떻게 되시나요 ? : ");
		String name = sc.next();
		switch (roomNo) {
		case 1:
			room.put(1, new Hotel(1, name));
			break;
		case 2:
			room.put(2, new Hotel(2, name));
			break;
		case 3:
			room.put(3, new Hotel(3, name));
			break;
		case 4:
			room.put(4, new Hotel(4, name));
			break;
		case 5:
			room.put(5, new Hotel(5, name));
			break;
		}
		for (int i = 1; i < room.size() + 1; i++) {
			System.out.println(room.get(i));
		}
	}
}