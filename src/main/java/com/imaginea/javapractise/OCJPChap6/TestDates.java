package OCJPChap6;

import java.util.*;
public class TestDates {
	public static void main(String[] args) 
	{
		Date d1 = new Date(1000000000000L); // a trillion!
		System.out.println("1st date " + d1.toString());

		d1.setTime(d1.getTime() + 3600000); // 3600000 millis / hour
		System.out.println("new time " + d1.toString());

		Date now = new Date();
		System.out.println("Now Date "+now);



		Calendar c = Calendar.getInstance();
		c.setTime(d1); // #1

		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) // #2

			System.out.println("Sunday is the first day of the week");

		System.out.println("trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK)); // #3

		c.add(Calendar.MONTH, 1); // #4

		Date d2 = c.getTime(); // #5

		System.out.println("new date " + d2.toString() );


		// assume c is October 9, 2001
		c.roll(Calendar.MONTH, 9); // notice the year in the output
		Date d4 = c.getTime();
		System.out.println("new date " + d4.toString() );

		/*Notice that the year did not change, even though we added 9 months to an
October date. In a similar fashion, invoking roll() with HOUR won't change the
date, the month, or the year.*/
	}
}