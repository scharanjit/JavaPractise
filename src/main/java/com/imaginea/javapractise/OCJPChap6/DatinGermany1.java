package OCJPChap6;

import java.text.DateFormat;
import java.util.*;


public class DatinGermany1 {
	public static void main(String[] args) {
		Date d = new Date(12683821L);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN);
		
		System.out.println(df.format(d));
	
	}

}
