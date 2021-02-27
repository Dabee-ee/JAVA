package com.kh.io.subStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	// 데이터를 특정 형식에 맞게
	// 자료형을 나누어 저장하거나 불러오고자
	// 할 경우 사용하는 보조 스트림
	// 입력 : DateInputStream
	// 출력 : DataOutputStream
	
	public void testDataStream() {
		// 저장과 읽기를 한 번에
		
		try(
				DataOutputStream dout = new DataOutputStream( new FileOutputStream("score.txt"));
				DataInputStream din = new DataInputStream( new FileInputStream("score.txt"));
				) {
			
			// score.txt 에 데이터 저장하기
			dout.writeUTF("홍길동");
			dout.writeInt(90);
			dout.writeChar('A');
			dout.writeBoolean(true);
			
			// ------------------------------
			dout.writeUTF("고길동");
			dout.writeInt(60);
			dout.writeChar('C');
			dout.writeBoolean(true);
			
			// score.txt
			while(true) {
				String result = din.readUTF() + ", "
						       +din.readInt() + ", "
						       +din.readChar() + ", "
						       +din.readBoolean();
				
				System.out.println("result : " + result);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (EOFException e) {
			// End Of File : 파일의 끝에 도달했을 때
			// 더 읽으려 할 경우 발생하는 예외상황(에러 상황)
			
			System.out.println("파일을 끝까지 읽었습니다!");
			
		} catch (IOException e) {
			
			// e.printStackTrace();
		}
		
	}
}
