package com.kh.io.byteStream.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	// 특정 데이터를 바이트 단위로 읽고 쓰는
	// 입출력 객체
	// 입력(Input) : InputStream
	// 출력(Output) : OutputStream
	
	public void fileOpen1() {
		// 특정 데이터를 파일로부터 읽어오는 메소드
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("test.txt");
			
			int value = 0;
			
			// 파일의 끝(-1)을 읽기 전까지
			// 반복해서 1바이트씩 읽어라!
			while(value != -1) {
				
				value = fin.read();
				
				System.out.println(value + " : " + (char)value);
			}
			
		} catch (FileNotFoundException e) {
			
			// e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다!");
		} catch (IOException e) {

			// e.printStackTrace();
			System.out.println("파일 읽기 중 문제 발생!");
			
		} finally {
			// 입력 자원 반납
			
			try {
				fin.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		// try with resource
		try( FileInputStream fin = new FileInputStream("test.txt"); ) {
			
			int value = 0;
			
			while( value != -1) {
				
				value = fin.read();
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void fileSave() {
		
		try ( FileOutputStream fout = new FileOutputStream("test.txt")) {
			
			fout.write('A');
			
			byte[] writeData = { 10, 20, 30, 40, 50 };
			
			fout.write(writeData);
			fout.write(writeData, 1, 3);
			
			System.out.println("byte 단위 데이터 작성 완료!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
