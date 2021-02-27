package com.kh.map;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropSaveTest {
	// Properties :
	//  어떠한 프로그램을 실행할 때
	//  함께 사용할 설정들을 담당하는 구조이다.
	//  key와 value 모두 문자열 형태로 이루어져 있으며
	//  XML 형태로도 파일 저장, 불러오기가 가능하다.

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		prop.setProperty("소유자", "홍길동");
		prop.setProperty("작성일", "2021-02-17");
		prop.setProperty("파일사이즈", "200KB");
		prop.setProperty("비고", "내용 없음");
		
		System.out.println(prop);

		
		try {
			prop.store( new FileOutputStream("test.txt"), "설정 파일 1");
			
			prop.store( new FileWriter("test2.txt"), "설정 파일 2");
			
			prop.storeToXML( new FileOutputStream("test.xml"), "설정 XML");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
