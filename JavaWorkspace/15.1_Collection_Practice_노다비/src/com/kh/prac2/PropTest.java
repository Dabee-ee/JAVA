package com.kh.prac2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.put("1", "apple,1200,3");
		prop.put("2", "banana,2500,2");
		prop.put("3", "grape,4500,5");
		prop.put("4", "orange,800,10");
		prop.put("5", "melon,1200,3");
		
		fileSave(prop);
		fileOpen(prop);
		
		
	}
	
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), "Fruits");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
		public static void fileOpen(Properties p) {
			try {
				p.loadFromXML(new FileInputStream("data.xml"));
				
				
				Fruit[] fruits = new Fruit[p.size()];
				
				for(int i = 0 ; i < p.size() ; i++) {
					String info = p.getProperty(String.valueOf(i+1));
					
					
					String name = info.split(",")[0];
					int price = Integer.parseInt(info.split(",")[1]);
					int quan = Integer.parseInt(info.split(",")[2]);
					
					fruits[i] = new Fruit(name, price, quan);
					
				}
				
				for(int i = 0 ; i < fruits.length ; i ++) {
					System.out.println((i + 1) + " = " + fruits[i]); 
				}
				
			} catch (InvalidPropertiesFormatException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
				
		}
		
	}


