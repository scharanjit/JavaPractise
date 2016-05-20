package OCJPChap6;

//Tokenizing is the process of taking big pieces of source data, breaking them into
//little pieces, and storing the little pieces in variables.
// go to page 541...jst read concept..thats it


// \d digits

import java.util.*;
public class SplitTest {
	public static void main(String[] args)
	{

		String[] s23={"ab5 ccc 45 9 1 s 4e2","\\d"};   //split by digit
			//System.out.println(s23[0]);
		String[] tokens = s23[0].split(s23[1]);
		System.out.println("count token length :- " + tokens.length);
		for(String s : tokens)
			System.out.println(">" + s + "<");
	}
}