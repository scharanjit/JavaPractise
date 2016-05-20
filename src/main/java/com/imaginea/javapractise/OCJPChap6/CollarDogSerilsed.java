package OCJPChap6;
/*
 * 
 * Remember, you do have to make a conscious choice to create objects that are
serializable, by implementing the Serializable interface. If we want to save Dog
objects, for example, we'll have to modify the Dog class as follows:


But when we run this code we get a runtime exception something like this
java.io.NotSerializableException: Collar



 * What did we forget? The Collar class must ALSO be Serializable. If we modify
the Collar class and make it serializable, then there's no problem:
 * */

import java.io.*;
public class CollarDogSerilsed {
	public static void main(String[] args) 
	{
		Collar1 c = new Collar1(3);
		Dog1 d = new Dog1(c, 8);
		System.out.println("before: collar size is "+ d.getCollar().getCollarSize());
		try 
		{
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		}
		catch (Exception e)
		{ 
			e.printStackTrace();
		}


		try
		{
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog1) ois.readObject();
			ois.close();
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace();
		}
		System.out.println("after: collar size is "+ d.getCollar().getCollarSize());
	}
}

 class Dog1 implements Serializable {
	 private Collar1 theCollar;
	 private int dogSize;

	public Dog1(Collar1 c, int size) 
	{
		
		theCollar = c;
		dogSize = size;
	}
	// the rest of the code as before
	// Serializable has no methods to implement
	
	public Collar1 getCollar() 
	{ 
		return theCollar; }
	}

class Collar1 implements Serializable
{
	private int collarSize;
	public Collar1(int size) 
	{ 
		collarSize = size;
	}
	public int getCollarSize()
	{ 
		return collarSize; 
	}
}