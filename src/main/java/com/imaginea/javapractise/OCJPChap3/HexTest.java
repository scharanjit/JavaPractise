package OCJPChap3;

//Explicit Inplicit type casting
//when we are putting smaller thing in bigger container--> no compilation error


public class HexTest {

	public static void main (String [] args) {

		double k=323.3;
		float d= 21212.23232f;
		int x = 0X0001;
		char f=(char) -57;

		char c = '\"'; // A double quote
		char di = '\n'; // A newline

		int y = 0x7fffffff;
		int z = 0xDeadCafe;
		System.out.println("x = " + x + " y = " + y + " z = " + z +" di = "+di+" c = "+ c);

		String s = "Bill Joy";
		System.out.println("Bill" + " Joy");


		byte l =27;
		System.out.println(l);


		byte a= 8;
		byte b=9;
		byte c1 =(byte) (b+a); ///we have to explicitly type cast unless it will show compile time error
		System.out.println("-c1----- " +c1);
		int jhh=123;
		double hhg=jhh;
		System.out.println("implicit type casting "+hhg);   //	implicit type casting

		//EXPLICIT TYPE CASTING

		double trip = 123.232;
		int zip =(int) trip; 	//EXPLICIT TYPE CASTING
		System.out.println("EXPLICIT TYPE CASTING "+zip);

		double sas =32.3 ;
		float gig = (float) sas; 
		System.out.println(gig);

		float ginga =45.78F;
		double hij=ginga;			//double is 64 bit & float is 32 bit...no explicit type casting required
		System.out.println(hij);	//double can easily accomodate the float...but vice versa is NOT true..


		byte nn =127;		//put 128 it'll show error...becuase byte can only hold up to 127

		byte na = (byte)128;  //type cast
		byte nb =(byte)129;
		byte nc =-(byte)130;
		System.out.println("butesss"+nb+"  "+na+"  "+nn+"   "+nc);

		byte kkk=3;
		kkk=(byte) (kkk+7);			//DHYAN se dekhiyee iss byte ko :)...we hav tio type cast...and the way it gets typecasted
		System.out.println(kkk);

		String ax ="21";
		// int axx= int(ax);  //illegal because int --> primitive & string non primitive




	}
}