package OCJPChap6;

import java.util.*;
public class Ex3Lookin {

	public static void main(String[] args)
	{
		String input = "1 2 a 3 45 6";  //remove a & hav to add 0 at end //termination condition
		Scanner sc = new Scanner(input);
		int x = 0;
		do {
			x = sc.nextInt();
			
			System.out.print(x + " ");
		} while (x!=0);
	}
}

/*The nextXxx() methods are typically invoked after a call to a hasNextXxx(),
 which determines whether the next token is of the correct type.*/