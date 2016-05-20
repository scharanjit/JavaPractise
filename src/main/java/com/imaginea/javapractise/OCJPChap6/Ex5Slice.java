package OCJPChap6;

import java.text.*;
 public class Ex5Slice {
public static void main(String[] args) {
	
	String s = "987.123456";
	double d = 987.123456d;  // rounding off the digit like 56 bcms 6 & 54 bcms 5
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMaximumFractionDigits(5);
	System.out.println(nf.format(d) + " ");
	try 
	{
		System.out.println(nf.parse(s)); //this is string //cant parse string
	} 
	
	catch (Exception e) 
	{
		System.out.println("got exc");
		}
 	}
 }
 
 /*
 The setMaximumFractionDigits() applies to the formatting
 but not the parsing. The try/catch block is placed appropriately. This one might scare you
 into thinking that you'll need to memorize more than you really do. If you can remember
 that you're formatting the number and parsing the string you should be fine for the exam.
 
 *The code compiles and runs without exception
 The invocation of parse() must be placed within a try/catch block
 *
 */