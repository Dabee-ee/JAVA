package com.kh.io.byteStream.run;

import com.kh.io.byteStream.model.dao.TestByteStream;

public class Main {

	public static void main(String[] args) {
		
		TestByteStream test = new TestByteStream();
		
		test.fileSave();
		test.fileOpen2();
	}
}
