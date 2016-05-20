package OCJPChap3;

/*
 * 
 * Leagal illegal type cast 
 * 
 * Type Size Range 
 * 
 * ---Arithmetic types ---------
byte	 1	 byte 	2128 to 127
short 	2 	bytes 	232768 to 32767
int 	4 	bytes approximately 22 billion to 2 billion
long 	8 	bytes approximately 21019 to 1019
float	 4 	bytes approximately 21038 to 1038, 8 significant digits
double 	8	 bytes approximately 210308 to 10308, 16 significant digits
 -----Arithmetic types ---------
char 	2 	bytes can hold any single character
boolean 1 	byte holds either true or false
 * */

public class TypeCasting_HexTest1 {
	
	public static void main(String[] args) {

		String ax ="21";
		// int axx= int(ax);  //illegal because int --> primitive & string non primitive
		
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		
		char c;
		
		boolean bo;
		// all are legal
		b=1;  
		s=b;	 //implicit casting
		i=b;  	 //implicit casting
		l=b;	 //implicit casting
		f=b;	 //implicit casting
		d=b;	 //implicit casting
		
		i=5;
		
		// b=i;  //illegal
		b= (byte) i;  //explicit casting 
		
		d=10;
		// i=d;   //illegal
		i=(int) d;
		
		
		// c=i; //illegal
		
		c=(char) i;
		
		c= 'd';
		 i=c; 		//legal
		 
		 String s1 ="MAD";
		 
		// c=s1;//differnet type
		
		 int x = 1, y = 2;
		  System.out.println(x < y); // displays true
		  boolean boo1, boo2;
		  boo1 = x < y; // boo1 assigned true
		 boo2 = false; // boo2 assigned false
		  System.out.println(boo1 && boo2); // displays false
		  System.out.println(boo1 || boo2); // displays true
		  System.out.println(!boo2); // displays true
		 
		  byte bd;
		  short sf = 257;
		  bd = (byte)sf; // truncated value assigned
		  System.out.println(bd); // displays 1
		 
		 float fh = 1.0f/3.0f; // f suffix means float constant
		 double dg = 1.0/3.0; // no suffix means double constant
		 System.out.println(fh); // displays 0.33333334
		  System.out.println(d); // displays 0.3333333333333333
		 
		  dg = 3.99999999;
		  long lg;
		  lg = (long)dg; // fractional part truncated
		  System.out.println(lg); // displays 3
		
		
	}

}
