package com.starbugs.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.starbugs.model.vo.Coffee;

public class CoffeeDAO implements CafeDAO {

	@Override
	public void saveFile(Coffee[] orderArr) {

		try( ObjectOutputStream out
				= new ObjectOutputStream( new FileOutputStream("coffee.txt") ); ) {
			
			for(Coffee c : orderArr) {
				out.writeObject(c);
			}
			
			System.out.println("주문 정보 저장 완료!");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public Coffee[] openFile() {

		Coffee[] orderArr = new Coffee[10];
		
		try(ObjectInputStream in
				= new ObjectInputStream( new FileInputStream("coffee.txt")); ) {
			
			Coffee co = new Coffee();
			int i = 0;
			
			while ( co != null ) {
				co = (Coffee)in.readObject();
				orderArr[i] = co;
				i++;
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		return orderArr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
