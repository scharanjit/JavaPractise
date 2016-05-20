package OCJPChap4;

import javax.swing.JButton;

//precedence rule
//the expression on the right side of the = will always be evaluated first.

public class Operators extends A{
	static int x;
	enum Color {RED, BLUE}   //; is optional
	
	
	static int players = 0;
	
	
	public static void main(String[] args) {
		x=8;
		
		x *= 2 +5; 	//the expression on the right side of the = will always be evaluated first.
		
		
		//x=x*2+5
		//right side
		//x=x*(2+5)
		//x=8*7
		//x=56
		
		System.out.println(x);
		
		
		
		boolean b = 100>99;
		System.out.println(b);
		
		
		String animal = "unknown";
		int weight = 700;
		char sex = 'm'; 			//It's also legal to compare a character primitive with any number
									// use a instead of m
									//When comparing a character with a character, or a character with a number,  
									//Java will use the Unicode value of the character as the numerical value, for comparis
		
		double colorWaveLength = 1.630;
		if (weight >= 500)
		{ 
			animal = "elephant"; 
			}
		if (colorWaveLength > 1.621) 
		{ 
			animal = "gray " + animal; 
			}
		
		if (sex <= 'n')     
		{
			animal = "female " + animal;
			}
		
		System.out.println("The animal is a " + animal);
		System.out.println(" ");
		
		
		System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
		System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
		System.out.println("5 != 6? " + (5 != 6));
		System.out.println("5.0 == 5L? " + (5.0 == 5L));
		System.out.println("true == false? " + (true == false));
		
		System.out.println("");
		
		JButton a = new JButton("Exit");
		JButton b1 = a;
		
		System.out.println("JButton : "+(b1==a));
		System.out.println("JButton : "+(b1.equals(a)));
		
		String a2=new String("Khalaas");
		String b2=a2;
		
		System.out.println(a2==b2);
		System.out.println(a2.equals(b2));
		
		System.out.println("");
		
		boolean b8 = false;
		 if (b8 = true) { System.out.println("b is true");
		 } else { System.out.println("b is false"); }
		
		 int x = 1;
		// if (x = 0) { }   //x is an integer
		 				//the value inside if must be boolean
		
		 if(x==0){}
		 
		 	System.out.println("");
		
			 JButton a33 = new JButton("True");     //object 1
			 JButton b33 = new JButton("True"); 	//object 2
			 JButton c = a33;
			 System.out.println("Is reference a == b? " + (a33 == b33)); //Look ..............................1
			 System.out.println("Is reference a == c? " + (a33 == c));
			 System.out.println(a33.equals(b33));
			 System.out.println("");
			 
			 
			 
			 Color c1 = Color.RED; Color c2 = Color.RED;
			 if(c1 == c2) { System.out.println("=="); }				//Look ...........................2
			 if(c1.equals(c2)) { System.out.println("dot equals"); }
			 
			 System.out.println("");
			 
			 String s = new String("foo");
			 if (s instanceof String) 
			 {
			 System.out.println("s is a String");
			 }
			 
			 System.out.println(" ");
			 // instance of use
			 A myA = new Operators();
			 m2(myA);
			
			 System.out.println("");
			 
			 Operators bx = new Operators();
			 if (bx instanceof Object) {
			 System.out.println("bx is definitely an Object");
			 }
			 
			 
			 
			 Operators vv = new Operators();
			 A ac= new A();
			 
			 if(vv instanceof Operators)
			 {
				 System.out.println("TRUE vv");
			 }
			 
			 if(vv instanceof A)
			 {
				 System.out.println("TRUE vv--> AA");  //Operators extends A
				 
			 }
			 
			 if(vv instanceof Zil)				//A implements Zil
				 
			 {
				 System.out.println("TRUE vv --> AA --> Zil");
			 }

			 if(ac instanceof A)
			 {
				 System.out.println("ac--> AA");
			 }
			 
			 if(ac instanceof Operators)
			 {
				 System.out.println("True");
			 }
			 else
			 {
				 System.out.println("Flase vv! instance of Child");
			 }
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 
			 String aI = null;
			 boolean bI = null instanceof String;
			 boolean cI = aI instanceof String;
			 System.out.println(bI + " " + cI);  //:O :O :O :O
			 
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 
			 Operators cati = new Operators();
			 
			 //System.out.println(cati instanceof Cat);  //two different class hierarchies
			 //Compilation fails—there's no way cati could ever refer to a Cat or a subtype of Cat.
			 
			 
			 int [] nums = new int[3];
			 if (nums instanceof Object) { System.out.println("An array is always an instance of Object. Any array.");} // result is true
			 
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 
			 
			 int xd = 15;
			 int y = xd % 4;
			 System.out.println("The result of 15 % 4 is the "
			 + "remainder of 15 divided by 4. The remainder is " + y);
			 
			 
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 
			 
			 String az = "String";
			 int bz = 3;
			 int cz = 7;
			 System.out.println(az + bz + cz);
			 
			 
			 System.out.println(az + (bz + cz));
			 
			 
			 
			 
			 String sl = "123";
			 sl += "45";
			 sl += 67;
			 System.out.println(sl);
			 
			 
			 int bp = 2;
			 System.out.println("" + bp + 3);
			 
			 System.out.println(bp + 3);
			 
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 
			 System.out.println("players online: " + players++);  //post increment
			 System.out.println("The value of players is "+ players);
			 System.out.println("The value of players is now "+ ++players); // preincrement
			 
			 System.out.println("");
			 
			 int xf = 2; int yf = 3;
			 if ((yf == xf++) | (xf < ++yf))						//You can read the code as follows: "If 3 is equal to 2 OR 3 < 4"
			 {
				 System.out.println("xf = " + xf + " yf = " + yf);     
			 }
			 
			 
			 
			 final int xo = 5;
			// int yo = xo++;   //cannot assign a value to final variable x
			 
			 
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 
			 // Cinditional Operator
			 //x = (boolean expression) ? value to assign if true : value to assign if false
			 
			 System.out.println(" ");
			 
			 
			 int sizeOfYard = 10;
			 int numOfPets = 8;
			 String status = (numOfPets<4)?"Pet count OK" :(sizeOfYard > 8)? "Pet limit on the edge" :"too many pets";
			 System.out.println("Pet status is :" + status);
	
	
			 //bitwise operator
			 
			 byte b1a = 6 & 8; 									// 0110 & 1000  =0000
			 byte b2a= 7 | 9;									// 0111 | 1001	=1111
			 byte b3a = 5 ^ 4;			//xor						// 101 ^ 100   =001
			 System.out.println(b1a + " " + b2a + " " + b3a);
			 
			 
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 System.out.println(" ");
			 System.out.println("------------------------------------------------------------------------------------- ");
			 
			 if ((isItSmall(3)) || (isItSmall(7)))
			 {
				  System.out.println("Result is true....1");  //does n't waste time in evaluating 7
			 }
			 
			 if ((isItSmall(3)) | (isItSmall(7)))
			 {
				  System.out.println("Result is true....2");  //checking both iteration...uneccesarily..
			 } 
			 
			 if ((isItSmall(6)) || (isItSmall(9))) 			// 6 vali iteration failed only then it is checking second
			 {
				  System.out.println("Result is true....3");
			 }
				  
			 
			 
			 
			 int zk = 5;
			 if(++zk > 5 || ++zk > 6)
				 zk++;
			 
			 
			 System.out.println("zk : "+zk);
			 
			 
			 int zm = 5;
			 if(++zm > 5 | ++zm > 6)
				 zm++;
			 
			 System.out.println("zm : "+zm);
			 
			 
			 //xor gate 1 1, 0 0 --> 0  1 0, 0 1--> 1 
			 System.out.println("xor ...1 " + ((2<3) ^ (4>3))); //true true
			 System.out.println("xor ...2 " + ((2>3) ^ (4>3)));
			 System.out.println("xor ...3 " + ((2>3) ^ (4<3)));//false false
			 
			 if(!(7 == 5)) { System.out.println("not equal"); }
			 
			 
			 
			 
			 
			 
			 
	}
	
	
	

	public static void m2(A a) 
	{
		if (a instanceof Operators)
		{
			((Operators) a).doBstuff(); // downcasting an A reference
									// to a B reference
			System.out.println("Inside m2");
	}
	}
	
	public static void doBstuff()
	{	
		System.out.println("'a' refers to a B");
	}
	public static boolean isItSmall(int i) {
		if (i < 5) {
		 System.out.println("i < 5");
		 return true;
		 } else {
		 System.out.println("i >= 5");
		 return false;
		 }
		 }

}
class A implements Zil {}


interface Zil
{
	}

class Cat{}

