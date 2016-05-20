package OCJPChap6;

import java.io.*;


//Use instance..it willl act in same way as in Ex14Computer.java

// no effect of super sub class
class Player 
{

	//static int b=9;
	Player()
	{ 
		System.out.print("p");
	}
}

public class Ex2CardPlayer extends Player implements Serializable
{
//private	Player p = new Player();
	Ex2CardPlayer() 
	{ 
		System.out.print("c"); 
	}
	public static void main(String[] args) 
	{
		Ex2CardPlayer c1 = new Ex2CardPlayer();
		try 
		{
			FileOutputStream fos = new FileOutputStream("play.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(c1);
			os.close();
			FileInputStream fis = new FileInputStream("play.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			Ex2CardPlayer c2 = (Ex2CardPlayer) is.readObject();
			is.close();
		} 
		catch (Exception x )
		{ 	
System.out.println("Exception");
		}
	}
}

/*It's okay for a class to implement Serializable even if its superclass doesn't.
However, when you deserialize such an object, the non-serializable superclass must run its
constructor. Remember, constructors don't run on deserialized classes that implement
Serializable.*/

//please not here , if we attempt to seralise instance of non serialiszing class, it will generate an exception
