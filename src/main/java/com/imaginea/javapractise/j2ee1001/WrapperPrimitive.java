package j2ee1001;
//primitive types order 

//boolean character byte shotrt int long float double
//Wrapping
public class WrapperPrimitive {
	  public static void main (String args[]) {
		    byte primitiveByte = 1;
		    char primitiveChar = 'c'-'a'; //it will give two as o/p
		    int primitiveInt = 1;
		    short primitiveShort = 1;
		    String s = "1";
		    Integer i1 = new Integer(primitiveByte);
		    Integer i2 = new Integer(primitiveChar);
		   // System.out.println(i2);
		    Integer i3 = new Integer(primitiveShort);
		    Integer i4 = new Integer(primitiveInt);
		    Integer i5 = new Integer(s);
		    System.out.println(i5);
		    int p1 = i1.intValue() + i2.intValue() +
		             i3.intValue() + i4.intValue() +
		             i5.intValue();
		    System.out.print(p1);
		    
		    
		    byte primitiveByte1 = 1;
		    char primitiveChar1 = 'b'-'a';
		    int primitiveInt1 = 1;
		    short primitiveShort1 = 1;
		   int s1 = 1;
		    
		    
		    
		    Byte b1= new Byte( (byte) primitiveShort1); //why type catsting necesary...bec we are converting short to byte...going high to low
		    b1.byteValue();
		    
		    
		    Short sd= new Short(primitiveByte1); //type casting not necessary
		    
		    
		    
		    
		    
		    
		    
		}
	  
}
/*T/he Integer class has only two constructors: one accepts a primitive int, and the other accepts a String. 
 * If the argument is of type byte, short or char, then it is implicitly promoted to type int.*/
