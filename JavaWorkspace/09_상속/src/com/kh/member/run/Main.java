package com.kh.member.run;

import com.kh.member.controller.MemberManager;
import com.kh.member.model.vo.Gold;
import com.kh.member.model.vo.Silver;
import com.kh.member.model.vo.VIP;

public class Main {

	public static void main(String[] args) {
		MemberManager mm = new MemberManager();
		
		// 실버
		mm.insertSilver( new Silver ("스파이더맨", "실버", 1000));
		mm.insertSilver( new Silver ("스파이더맨", "실버", 1000));
		mm.insertSilver( new Silver ("스파이더맨", "실버", 1000));
		
		
		// 골드
		mm.insertGold( new Gold("말랑카오" , "골드",1500));
		mm.insertGold( new Gold("말랑카오" , "골드",1500));
		mm.insertGold( new Gold("말랑카오" , "골드",1500));
		
		// VIP
		mm.insertVIP(new VIP("홍길동","VIP",3000));
		mm.insertVIP(new VIP("홍길동","VIP",3000));
		mm.insertVIP(new VIP("홍길동","VIP",3000));
		
		mm.memberPrint();
		
		

	}

}
