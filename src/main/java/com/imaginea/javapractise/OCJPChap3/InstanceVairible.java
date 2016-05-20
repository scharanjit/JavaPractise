package OCJPChap3;


//Variable returns below DEFAULT values if NOT initialized

//Variable Type Default Value
//Object reference 			null (not referencing any object)
//byte, short, int, long 	0
//float, double 			0.0
//boolean 					false
//char 					    '\u0000'

public class InstanceVairible	
{
	private String title; 	// instance reference variable
	public String getTitle()
	{
		return title;
	}

	public static void main(String [] args)
	{
		InstanceVairible b = new InstanceVairible();
		String s = b.getTitle(); // Compiles and runs
		System.out.println(s);
		String t = s.toLowerCase(); // Runtime Exception!

		int localPrimitiveVariable;
		//System.out.println(localPrimitiveVariable); //a local primitive variable should always be initialize....
		//umnless it will show compile time error

	}
}
