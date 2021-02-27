package com.kh.prac2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PropTest {
	
	
	
	
		public static void main(String[] args) {
			
			
			
			Properties prop = new Properties();
			ArrayList list = new ArrayList();
			
			list.add( new Fruit("apple", 1200, 3));
			list.add( new Fruit("banana", 2500, 2));
			list.add( new Fruit("grape", 4500, 5));
			list.add( new Fruit("orange", 800, 10));
			list.add( new Fruit("melon", 5000, 2));
			
//			Fruit[] fArr = new Fruit[5];
			
//			fArr[0] = new Fruit("apple", 1200, 3);
//			fArr[1] = new Fruit("banana", 2500, 2);
//			fArr[2] = new Fruit("grape", 4500, 5);
//			fArr[3] = new Fruit("orange", 800, 10);
//			fArr[4] = new Fruit("melon", 5000, 2);
			
			String f = fArr.toString();
			
			for(int i = 0 ; i < fArr.length ; i++) {
				 System.out.println(fArr[i]);
			}
		}

// -----

		
		public void fileSave(p : Properties) {
			
			
			try( FileReader fr = new FileReader("data.xml"); ) {
			

			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		public void fileOpen(p:Properties) {
			
			try( FileReader fr = new FileReader("data.xml"); ) {
				
				try ( FileOutputStream fout = new FileOutputStream("data.xml")) {
					
					Set Properties = fArr.keySet();

					Iterator p  = Properties.iterator();

					
					while(iter1.hasNext()){
						
						Object key = p.next();
						Object value = p.next();
						
						System.out.println(fArr(key) + fArr(value));
						
					}

				
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

		}

		
	


