package OCJP;

//JUST RAN THE CODE after removing static frm method signature
class Animaleee 
{
	static void doStuff()
	{

		System.out.print("a ");

	}
}

public class StaticDog extends Animaleee 
{
	static void doStuff()
	{ 
		// it's a redefinition,
		// not an override
		System.out.print("d ");
	}

	public static void main(String [] args) 
	{
		Animaleee [] a = {new Animaleee(), new StaticDog(), new Animaleee()};

		for(int x = 0; x < a.length; x++)
		{
			a[x].doStuff(); // invoke the static method
		}

	}
}