package OCJPChap8;
//anonymus inner class
public class I_14TestObject 
{
	public static void main(String[] args) 
	{
		Object o = new Object() 
		{
			public boolean equals(Object obj)
			{
				return true;
			}
		};  //This code would be legal if line 7 ended with a semicolon. Remember that line 3 is a
			//statement that doesn't end until line 7, and a statement needs a closing semicolon!
		System.out.println(o.equals("Fred"));
	}
}


/*
 *4. Given:
1. public class TestObj {
2. public static void main(String[] args) {
3. Object o = new Object() {
4. public boolean equals(Object obj) {
5. return true;
6. }
7. }
8. System.out.println(o.equals("Fred"));
9. }
10. }


What is the result?
A. An exception occurs at runtime
B. true
C. fred
D. Compilation fails because of an error on line 3
E. Compilation fails because of an error on line 4
F. Compilation fails because of an error on line 8
G. Compilation fails because of an error on a line other than 3, 4, or 8

 
 Answer:
 G. This code would be legal if line 7 ended with a semicolon. Remember that line 3 is a
statement that doesn't end until line 7, and a statement needs a closing semicolon!
 A, B, C, D, E, and F are incorrect based on the program logic described above. If the
semicolon were added at line 7, then answer B would be correct—the program would
print true, the return from the equals() method overridden by the anonymous
subclass of Object.
 * */
 