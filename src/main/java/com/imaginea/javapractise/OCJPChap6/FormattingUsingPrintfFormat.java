package OCJPChap6;

public class FormattingUsingPrintfFormat {
	public static void main(String[] args) {
		//printf("format string", argument(s));
		
														// use of % $ is necessary however use of 1 is optional when only single value is der
		System.out.printf("%2$d + %1$d", 123, 456);   // 2 here represents 2nd integer the value with 456
		System.out.println("");						 // if we want to use 123 integer, we have use 1 in place of 2
													
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.printf("%3$d + %1$d - %2$d", 123, 456,789);
		
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.printf("%2$d + %3$d", 123, 456,789);
		
		
				//   %[arg_index$][flags][width][.precision]conversion char
				//	The values within [ ] are optional.
		

		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		/*flags While many flags are available, for the exam you'll need to know:
		 "-" Left justify this argument
		 "+" Include a sign (+ or -) with this argument
		 "0" Pad this argument with zeroes
		 "," Use locale-specific grouping separators (i.e., the comma in 123,456)
		 "(" Enclose negative numbers in parentheses


		conversion The type of argument you'll be formatting. You'll need to know:
 		b boolean
 		c char
 		d integer
 		f floating point
 		s string
*/
		
		int i1 = -123;
		int i2 = 12345;
		System.out.printf(">%1$(7d< \n", i1);  //7--? total number 0f zeros we want
		System.out.printf(">%0,7d< \n", i2);
		System.out.format(">%+-7d< \n", i2);
		System.out.printf(">%2$b + %1$5d< \n", i1, false);  //for negative values...it is adding spaces not zeros
		
	}
}
