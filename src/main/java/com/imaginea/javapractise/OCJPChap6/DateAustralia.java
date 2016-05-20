package OCJPChap6;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateAustralia {
	public static void main(String[] args) {
		Date d3 = new Date(1234567L);
		DateFormat df1= DateFormat.getDateInstance(DateFormat.LONG,Locale.JAPAN);
		System.out.println(df1.format(d3));
	}

}
