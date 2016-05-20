package OCJPChap6;
import java.util.regex.*;

//Regular expressions (regex for short)

public class RegexSmall 
{
	public static void main(String [] args) 
	{
		Pattern p = Pattern.compile("ab"); // the expression
		Matcher m = p.matcher("abaaaba"); // the source
		while(m.find())
		{
			System.out.print(m.start() + " ");
		}
		System.out.println("");
		System.out.println("=======================================================");
		/*
		 *  String pattern = "\d"; // compiler error!
			This line of code won't compile! The compiler sees the \ and thinks, "Ok, here
			comes an escape sequence, maybe it'll be a new line!" But no, next comes the d and
			the compiler says "I've never heard of the \d escape sequence." The way to satisfy
			the compiler is to add another backslash in front of the \d
			String pattern = "\\d"; // a compilable metacharacter
		  
		
		
			//a 1 56 _Z
	
			\d A digit
			\s A whitespace character
			\w A word character (letters, digits, or "_" (underscore))
			\n = linefeed (which you might see on the exam)
			\b = backspace
			\t = tab
		
		*/
		
		Pattern p1 = Pattern.compile("\\s");
		Matcher m1 = p1.matcher("a 1 56 _Z"); 
		while(m1.find())
		{
			System.out.print(m1.start() + " ");
		}
		
		
	}
}