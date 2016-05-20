package OCJPChap5;

public class ExceptionType {

	
		public static void main(String[] args) {
			try
			{
				int x = Integer.parseInt("two"); 
			}
			
			finally
			{
				System.out.println("Hi");
			}
		}
}

/*
 * C and D are correct. Integer.parseInt can throw a NumberFormatException, and
IllegalArgumentException is its superclass
.
NumberFormatException :- Thrown to indicate that the application has attempted to convert a string to one
of the numeric types, but that the string does not have the appropriate format.
String s = "FOOBAR";
      int i = Integer.parseInt(s);
      // this line of code will never be reached
      System.out.println("int value = " + i);
      
      
 IllegalArgumentException:- Thrown to indicate that a method has been passed an illegal or 
 inappropriate argument.
      
*
*
*
*
*/
 

