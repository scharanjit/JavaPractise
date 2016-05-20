package OCJPChap6;

import java.io.*;
 public class Ex8ReadingFor
 {
	 	
	 public static void main(String[] args)
	 {
		 String s;
		 try 
		 {
			 FileReader fr = new FileReader("myfile234.txt");
			 BufferedReader br = new BufferedReader(fr);
			 while((s = br.readLine()) != null)
				 System.out.println(s);
			 //br.flush();
		 } 
		 catch (IOException e)
		 { 
			 System.out.println("File not found"); 
		 }
	 }
 }
 
 
 
 /*
  * 4. public class ReadingFor {
5. public static void main(String[] args) {
6. String s;
7. try {
8. FileReader fr = new FileReader("myfile.txt");
9. BufferedReader br = new BufferedReader(fr);
10. while((s = br.readLine()) != null)
11. System.out.println(s);
12. br.flush();
13. } catch (IOException e) { System.out.println("io error"); }
16. }
17. }
And given that myfile.txt contains the following two lines of data:
ab
cd
  * And given that myfile.txt contains the following two lines of data:
	ab
	cd
	
	
  * 
  * C. ab
	   cd
  * E. Compilation fails
  * 
  * 
  * 
  * 
  * 
  * E is correct. You need to call flush() only when you're writing data. Readers don't have
	flush() methods. If not for the call to flush(), answer C would be correct.
  * 
  * */
  