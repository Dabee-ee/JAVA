package com.kh.io.subStream.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.io.subStream.model.vo.Member;

public class TestObjectStream {
	// 객체 저장, 불러오는 입출력 클래스
	// 입력 : ObjectInputStream
	// 출력 : ObjectOutputStream
	
	public void fileSave() {
		
		Member[] marr = {
				new Member("둘리", 10, "서울", "010-1111-2222"),
				new Member("피카츄", 5, "몬스터볼", "010-1234-5678"),
				new Member("영심이", 12, "서울", "010-1234-1234")
		};
		
		try( ObjectOutputStream oos
				= new ObjectOutputStream(new FileOutputStream("member.txt")) ){
			
			for(int i = 0 ; i < marr.length ; i++) {
				oos.writeObject(marr[i]);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		
		Member[] marr = new Member[3];
		
		try(ObjectInputStream oin
				= new ObjectInputStream( new FileInputStream("member.txt")) ) {

			for(int i = 0; i < marr.length ; i++) {
				marr[i] = (Member)oin.readObject();
			}
			
			for(Member m : marr) {
				System.out.println(m);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
