package OCJPChap6;
import java.io.*;
//Serialization lets you simply say "save this object and all of its instance variables
public class SerializeCat {
	public static void main(String[] args) {
	//	ObjectOutputStream.writeObject() // serialize and write
	//	ObjectInputStream.readObject() // read and deserialize
		
		Cat c = new Cat(); // 2
		try {
		FileOutputStream fs = new FileOutputStream("testSer.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(c); // 3
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
		c = (Cat) ois.readObject(); // 4
		ois.close();
		
		}
		
		catch (Exception e)
		{
			e.printStackTrace(); 
			}
	}
}
	class Cat implements Serializable { } // 1


/*1. We declare that the Cat class implements the Serializable interface.
	Serializable is a marker interface; it has no methods to implement. (In the
	next several sections, we'll cover various rules about when you need to declare
	classes Serializable.)
	2. We make a new Cat object, which as we know is serializable.
	3. We serialize the Cat object c by invoking the writeObject() method. It
	took a fair amount of preparation before we could actually serialize our Cat.
	First, we had to put all of our I/O-related code in a try/catch block. Next we
	had to create a FileOutputStream to write the object to. Then we wrapped the
	FileOutputStream in an ObjectOutputStream, which is the class that has the
	magic serialization method that we need. Remember that the invocation of
	writeObject() performs two tasks: it serializes the object, and then it writes
	the serialized object to a file.
	4. We de-serialize the Cat object by invoking the readObject() method. The
	readObject() method returns an Object, so we have to cast the deserialized
	object back to a Cat. Again, we had to go through the typical I/O hoops to
	set this up.
	*/
	
	//What does it really mean to save an object? Follow class dog