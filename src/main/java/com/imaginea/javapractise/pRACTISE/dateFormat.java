package pRACTISE;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {
	public static void main(String[] args) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MMM-DD");
		
		Date d = new Date();
		
		System.out.println(sd.format(d));
	}

}
