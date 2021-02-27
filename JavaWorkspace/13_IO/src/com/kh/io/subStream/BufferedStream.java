package com.kh.io.subStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {
	// 입력이나 출력 시 임시공간(버퍼)을
	// 사용하여 데이터를 한 번에 받거나, 입력할 수 있는
	// 보조 스트림
	// 입력 : BufferedInputStream / BufferedReader
	// 출력 : BufferedOutputStream / BufferedWriter
	
	public void fileSave() {
		
		try( BufferedWriter bw = new BufferedWriter( new FileWriter("sample3.txt") ); ){
			
			bw.write("하나, 둘, 셋");
			bw.write("안녕하세요");
			bw.newLine();  // 한 줄 띄어쓰기
			bw.write("반갑습니다.");
			
			bw.flush();   // 중간에 버퍼 비우기
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen() {
		
		try( BufferedReader br = new BufferedReader( new FileReader("sample3.txt"));) {
			
			String line = "";
			
			while( line != null ) {
				
				line = br.readLine();
				
				System.out.println(line);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
