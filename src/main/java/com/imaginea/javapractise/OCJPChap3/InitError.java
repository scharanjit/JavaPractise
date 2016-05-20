package OCJPChap3;

public class InitError {


	static int [] x = new int[4];
	static
	{ 
		x[4] = 5;  // bad array index!	//common sense logic:P
	}			//array size stupid


	public static void main(String [] args)
	{

	}
}
