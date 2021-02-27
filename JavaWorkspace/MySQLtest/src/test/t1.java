package test;

import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class t1 {

	public static void main(String[] args) {

		
		SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		
		Date now = new Date();
		
		String time1 = format1.format(now);
		System.out.println(time1);
		
        
	}
	}

