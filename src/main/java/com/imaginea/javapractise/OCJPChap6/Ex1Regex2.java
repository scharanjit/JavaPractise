package OCJPChap6;

import java.util.regex.*;

public class Ex1Regex2 {
	public static void main(String[] args) 
	{
		String[]  Arr={"\\d*" ,"ab345ef93"};				//d looks for digit  // replace * with ?
		//d find the digit, m.start return the index number
		//we are using * here, whether d found or not found it will return index bec -->Zero or more occurrences
		// if we use ?, it will return  zero or one occurrence
		//m.group will retun group of digit
		Pattern p = Pattern.compile(Arr[0]);
		Matcher m = p.matcher(Arr[1]);   //contains source data
		System.out.println("pattern is  : "+m.pattern());
		boolean b = false;
		while(b = m.find()) 
		{
			System.out.print(m.start() + m.group()); 
			//System.out.print(m.start() +" : "+ m.group());
			//System.out.println("");
			
									//group will return the value based upon the quantifier
										//used ...if '*' used it will return all occurrence
										// if ? Used---it will return 0 or 1 occurrence
		}															
	}
}

/*The \d is looking for digits. The * is a quantifier that looks for 0 to many
occurrences of the pattern that precedes it. Because we specified *, the group() method
returns empty Strings until consecutive digits are found, so the only time group() returns
a value is when it returns 34 when the matcher finds digits starting in position 2. The
start() method returns the starting position of the previous match because, again,
we said find 0 to many occurrences.

 *
 *
 *
 *
\d A digit ---> If you want to try this at home, you'll need to "escape" the compile method's "\d" argument by making it "\\d", more on this a little later.
\s A whitespace character
\w A word character (letters, digits, or "_" (underscore))


 * Zero or more occurrences
? Zero or one occurrence

 *
 *
 */