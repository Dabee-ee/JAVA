package com.kh.io.charStream.run;

import com.kh.io.charStream.model.dao.TestCharStream;

public class Main {

	public static void main(String[] args) {
		
		TestCharStream test = new TestCharStream();
		
		test.fileSave();
		
		test.fileOpen();

	}

}
