package OCJPChap6;
//IMPORTANT CONCEPT
//Correct Vehicle  INSTANCES cannt be serailize use static int i vala
import java.io.*;
class Vehicle {
	
}
class Wheels { }
public class Ex6Car extends Vehicle implements Serializable  //can be serialize..bec no effect of inheritance
{
	public static void main(String[] args)  
	{
	try {
		
			Ex6Car bb = new Ex6Car();
			FileOutputStream fd= new FileOutputStream("sd.ser");
			ObjectOutputStream os1= new ObjectOutputStream(fd);
			os1.writeObject(bb);
			os1.close();
			
			FileInputStream jj = new FileInputStream("sd.ser");
			ObjectInputStream sd= new ObjectInputStream(jj);
			Ex6Car c = (Ex6Car)sd.readObject();
		System.out.println(c);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("exception");
	}
}}
class Ford extends Ex6Car //can be serailize
{ }
class Dodge extends Ex6Car //it cannot...bec wheels is not serialized
{
	Wheels w = new Wheels();
}

/*
 * Instances of which class(es) can be serialized? (Choose all that apply.)
A. Car
B. Ford
C. Dodge
D. Wheels
E. Vehicle

Here the instance shud be serialized

A and B are correct. Dodge instances cannot be serialized because they "have" an instance
of Wheels, which is not serializable. Vehicle instances cannot be serialized even though the
subclass Car can be.
 *
 */
