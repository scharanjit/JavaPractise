package OCJPChap6;

import java.io.*;
 public class Ex7Talker {
	 
	 public static void main(String[] args)
	 {
		 Console c = System.console();
		 String u = c.readLine("%s", "username: ");
		 System.out.println("hello " + u);
		 String pw;
//		 if(c != null && (pw = c.readPassword("%s", "password: ")) != null)
//		 {}
 // check for valid password
 	}
}
 
 /*If line 6 creates a valid Console object, and if the user enters fred as a username and 1234 as a
password, what is the result?
  * 
  * 
  * B. username: fred
	password:
  * 
  * D. Compilation fails
  * 
  * 
  D is correct. The readPassword() method returns a char[]. If a char[] were used,
answer B would be correct.*/
