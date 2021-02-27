package com.kh.io.subStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Byte2CharStream {
	// byte <---> char 간 데이터 전환을 시켜주는
	// 보조 스트림
	// 입력 : InputStreamReader : byte --> char
	// 출력 : OutputStreamWriter : char --> byte
	
	public void fileSave() {
		
		try ( OutputStreamWriter ow
				  = new OutputStreamWriter( new FileOutputStream("sample2.txt") );
				) {
			
			ow.write("설날");
			ow.write("추석");
			ow.write("한글날");
			ow.write("어린이날");
			
			ow.write(12345);
			
			System.out.println("파일 저장 완료!");
						
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		
		try( InputStreamReader ir
				= new InputStreamReader( new FileInputStream("sample2.txt")); ){
			
			int value = 0;
			
			while (value != -1) {
				value = ir.read();
				
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
