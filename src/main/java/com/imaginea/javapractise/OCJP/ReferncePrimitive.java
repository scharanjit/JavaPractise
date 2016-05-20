package OCJP;

//instance variables declared inside a class but outside a method
//local variables are local to method

public class ReferncePrimitive {
	
	static int x;
	
	int size=27;
	
	public void setSize(int size)
	{
		this.size=size;
		//seting valuse of instance variable
	}
	public void localEx()
	{
		//ex local variable
		int ex=10;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("instance:--> "+x);
		//size of rpimitive varaibles
		System.out.println("boolean = true or false--> machine dependent");
		System.out.println("char is 2^16..contains single unicode (0-65535)");
		System.out.println("byte 1");
		System.out.println("short 2");
		System.out.println("int 4 bytes");
		System.out.println("Long 8");
		System.out.println("float 4");
		System.out.println("double 8");
		
		System.out.println("1 byte = 8 bite...size range 2^-7  to 2^7 -1");
	}
	
}
