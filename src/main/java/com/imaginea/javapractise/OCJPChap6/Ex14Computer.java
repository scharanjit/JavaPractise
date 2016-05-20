package OCJPChap6;

//Reason:- reason of exception is keyboard is not implementing  serailised interface
//how can we serialies the instance of a class who is nt implementing the interface
import java.io.*;
class Keyboard /*implements Serializable*/ {  }
public class Ex14Computer implements Serializable {
	private Keyboard k = new Keyboard();

	public static void main(String[] args) 
	{
		Ex14Computer c = new Ex14Computer();
		c.storeIt(c);
	}

	void storeIt(Ex14Computer c) 
	{
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("myFile"));
			os.writeObject(c);
			os.close();
			System.out.println("done");
		} 
		catch (Exception x) 
		{
			//x.printStackTrace();
			System.out.println("---------------------excEPTION---------------------------"); 

		}
	}
}
