package OCJPChap6;

import java.io.*;
public class Ex10TestSer {

	public static void main(String[] args)
	{
		SpecialSerial s = new SpecialSerial();
		try {

			ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream("myFile"));
			os.writeObject(s);
			os.close();
			//System.out.println("static : " +s.z + " "); //static
			//System.out.println("Transient "+s.y + " ");  //Transient
			System.out.print(++s.z+" " ); //editing variable after saving state...ser...failed bec it is static
			//System.out.println(++s.y + " ----");
			//s.x=s.x+100;
			//System.out.println(++s.x);
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("myFile"));
			SpecialSerial s2 = (SpecialSerial)is.readObject();
			is.close();
			System.out.println(s2.y + " " + s2.z);
			//there is deep logic here
			//parent class implementing Serializable
			// therefore its state of its instance can be saved...but var here are statiic & transient so..
			// how static dint bcm zero & transient lost it value
		} 
		catch (Exception x) {System.out.println("exc"); }
	}
}

class SpecialSerial implements Serializable 
{
	int x= 103;
	transient int y = 7;  //remove transient & static keyword & fell the difference :P
	static int z = 9;

}	


/*
 * 
 * 	C. The output is 10 0 10
	D. The output is 10 7 9
	E. The output is 10 7 10
	F. In order to alter the standard deserialization process you would implement the
	readObject() method in SpecialSerial
	G. In order to alter the standard deserialization process
 * 
 * 
 * 
 * C and F are correct. C is correct because static and transient variables are not
	serialized when an object is serialized. F is a valid statement.
 * 
 * */
