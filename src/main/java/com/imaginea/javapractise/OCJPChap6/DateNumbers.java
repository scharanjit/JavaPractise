package OCJPChap6;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateNumbers {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		String s = d.toString();
		System.out.println(s);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		Locale loc = new Locale("Angreji"); 
		Locale loc1 = new Locale("Angreji", "US");
		
		System.out.println(loc+ "  "+loc1);
		Calendar c1 = Calendar.getInstance(loc);
		System.out.println(c1);
		
	}

}
