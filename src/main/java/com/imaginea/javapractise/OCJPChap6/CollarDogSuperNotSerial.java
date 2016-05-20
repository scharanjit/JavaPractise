package OCJPChap6;

/*
 * Condition1 SuperClass serializable Alone..SubClass Not serializable....o/p:- 
 * 
 * Condition2 SuperClass & SubClass Both serializable..................o/p:- No Prob
 * 
 * Condition3 SuperClass Serial & SubClass transient...hav to use method read write object in super class...o/p No exception
 * 
 * 
 * Condtion 4 SuperClass Not Serial SubClass serializable O/p:- below is the example
 * 
 * 
 * 
 * If you are a serializable class, but your superclass is NOT serializable, then any
instance variables you INHERIT from that superclass will be reset to the values they
were given during the original construction of the object. This is because the nonserializable
class constructor WILL run!

 */

import java.io.*;
public class CollarDogSuperNotSerial
{
	public static void main(String [] args) 
	{
		DogA d = new DogA(35, "Fido");
		System.out.println("before: " + d.name + " "+ d.weight);
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
			d = (DogA) ois.readObject();
			ois.close();
		} 
		catch 
		(Exception e)
		{ 
			e.printStackTrace();
		}
		System.out.println("after: " + d.name + " "+ d.weight);
	}
}

//SUBCLASS SERIALSED
class DogA extends Animal implements Serializable
{
	String name;
	DogA(int w, String n) 
	{
		weight = w; // inherited
		name = n; // not inherited
	}
}

//SUPERCLASS NOT SERIALISED
class Animal //implements Serializable
{	// not serializable !
	int weight = 42;
}