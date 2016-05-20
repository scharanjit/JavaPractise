package OCJPChap7;

import java.util.*;

abstract class Animal 
{
	public abstract void checkup();
}

class Dogg extends Animal
{
	public void checkup()
	{ // implement Dog-specific code
		System.out.println("Dog checkup");
	}
}
class Catt extends Animal 
{
	public void checkup() 
	{ // implement Cat-specific code
		System.out.println("Cat checkup");
	}
}

class Bird extends Animal
{
	public void checkup() 
	{ // implement Bird-specific code
		System.out.println("Bird checkup");
	}
}
public class Z_27AnimalDoctor
{
	// method takes an array of any animal subtype
	public void checkAnimals(Animal[] animals)
	{
		for(Animal a : animals)
		{
			a.checkup();
		}
	}
	public static void main(String[] args)
	{
		// test it
		Dogg[] dogs = {new Dogg(), new Dogg()};
		Catt[] cats = {new Catt(), new Catt(), new Catt()};
		Bird[] birds = {new Bird()};

		Z_27AnimalDoctor doc = new Z_27AnimalDoctor();
		doc.checkAnimals(dogs); // pass the Dog[]
		doc.checkAnimals(cats); // pass the Cat[]
		doc.checkAnimals(birds); // pass the Bird[]
	}
}


/*
 * 
 * This works fine, of course (we know, we know, this is old news). But here's why
we brought this up as refresher—this approach does NOT work the same way with
type safe collections!
In other words, a method that takes, say, an ArrayList<Animal> will NOT be
able to accept a collection of any Animal subtype! That means ArrayList<Dog>
cannot be passed into a method with an argument of ArrayList<Animal>, even
though we already know that this works just fine with plain old arrays*/
