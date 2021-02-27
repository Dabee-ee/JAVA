package com.kh.io.charStream.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	// 문자 기반 데이터 입출력 클래스
	// 입력(Input) : Reader
	// 출력(Output) : Writer
	
	public void fileSave() {
		
		try( FileWriter fw = new FileWriter("sample.txt");) {
			
			fw.write("청포도");
			fw.write("두리안");
			fw.write("자두");
			fw.write("배");
			fw.write("딸기");
			
			fw.write(12345);
			
			char[] chArr = { '저', '는', '자', '바', '팬', '입', '니', '다' };
			
			fw.write(chArr);
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen() {
		
		try( FileReader fr = new FileReader("sample.txt"); ) {
			
			int ch = ' ';
			
			while(ch != -1) {
				
				ch = fr.read();
				
				System.out.println((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
