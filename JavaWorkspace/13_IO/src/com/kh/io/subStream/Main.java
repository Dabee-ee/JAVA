package com.kh.io.subStream;

import com.kh.io.subStream.model.dao.TestObjectStream;
import com.kh.io.subStream.model.vo.Member;

public class Main {

	public static void main(String[] args) {
		
		// Byte2CharStream test1 = new Byte2CharStream();
		// test1.fileSave();
		// test1.fileOpen();
		
		// BufferedStream test2 = new BufferedStream();
		// test2.fileSave();
		// test2.fileOpen();
		
		// DataStream test3 = new DataStream();
		// test3.testDataStream();
		
		TestObjectStream test4 = new TestObjectStream();
		
		test4.fileSave();
		
		test4.fileOpen();
		
		
	}

}
