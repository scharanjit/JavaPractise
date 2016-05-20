package OCJPChap6;

import java.util.regex.*;
 public class Ex4Archie {
	 public static void main(String[] args)
	 {
		 String tok [] ={"\\d+", "ab2c4d67"};
		 Pattern p = Pattern.compile(tok[0]);
		 Matcher m = p.matcher(tok[1]);
		 int count = 0;
		  while(m.find())
		  count++;
		  System.out.print(count);
	 }
}
 
 /*B is correct. The "\d" metacharacter looks for digits, and the + quantifier says look for
 "one or more" occurrences. The find() method will find three sets of one or more consecutive
 digits: 2, 4, and 67.*/