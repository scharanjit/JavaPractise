package DoubtsMustRead;

public class Question {

		public static void main(String[] args) {
			JavaHungry(null);
			short  s=0;
			int x=07;  //octal literal
			//int y=08;
			int octLit = 0400; //octal equivalent of decimal 256
			int hexLit = 0x100; //hexadecimal equivalent of decimal 256
			int decLit = 256; // decimal 256
			
			System.out.println(x+" "+octLit+"  "+hexLit+"  "+decLit+"  "+s);
			System.out.println(" "+x+s);
			int z=123456;
			
		}

		public static void JavaHungry(Object object) {
			System.out.println("Object");
			
		}
		
		public static void JavaHungry(String s) {
			System.out.println("String");
			
		}
		
		/*public static void JavaHungry(Integer i) {
			System.out.println("Integer");
			
		}*/
		
		
}
