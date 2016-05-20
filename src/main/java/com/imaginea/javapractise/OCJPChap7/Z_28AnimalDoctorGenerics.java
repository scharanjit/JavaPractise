package OCJPChap7;
import java.util.*;

//NO POLYMORPHISM ALLOWED IN GENERICS
//WE CAN ONLY ADD OBJECTS


abstract class Animall 
{
	public abstract void checkup();
}

class Doggg extends Animall
{
	public void checkup()
	{ // implement Dog-specific code
		System.out.println("Dog checkup");
	}
}
class Cattt extends Animall 
{
	public void checkup() 
	{ // implement Cat-specific code
		System.out.println("Cat checkup");
	}
}

class Birdd extends Animall
{
	public void checkup() 
	{ // implement Bird-specific code
		System.out.println("Bird checkup");
	}
}


public class Z_28AnimalDoctorGenerics {

	public void checkAnimals(ArrayList<Animall> animals) {
		for(Animall a : animals) {
			a.checkup();
		}
	}
	public static void main(String[] args) {
		
		// make ArrayLists instead of arrays for Dog, Cat, Bird
	//	List<Doggg> an = new ArrayList<Animall>();
		
		List<Doggg> dogs = new ArrayList<Doggg>();
		dogs.add(new Doggg());
		dogs.add(new Doggg());
		List<Cattt> cats = new ArrayList<Cattt>();
		cats.add(new Cattt());
		cats.add(new Cattt());
		List<Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());
		// this code is the same as the Array version
		
		Z_28AnimalDoctorGenerics doc = new Z_28AnimalDoctorGenerics();
		// this worked when we used arrays instead of ArrayLists
		//doc.checkAnimals(dogs); // send a List<Dog>
		//	doc.checkAnimals(cats); // send a List<Cat>
		//	doc.checkAnimals(birds); // send a List<Bird>
		/*The compiler stops us with errors, not warnings. You simply CANNOT assign
			the individual ArrayLists of Animal subtypes (<Dog>, <Cat>, or <Bird>) to an
			ArrayList of the supertype <Animal>, which is the declared type of the argument.
			This is one of the biggest gotchas for Java programmers who are so familiar with
			using polymorphism with arrays, where the same scenario (Animal[] can refer to
			Dog[], Cat[], or Bird[]) works as you would expect.*/


		List<Animall> animals = new ArrayList<Animall>();
		animals.add(new Cattt()); // OK
		animals.add(new Doggg()); // OK
		System.out.println(animals);
		doc.addAnimal(animals); //we cannt pass the reference..but we can put dog object
		System.out.println(doc);
		//	So if this is true, and if you can put Dogs into an ArrayList<Animal>, then why
		//	can't you use that same kind of method scenario? Why we hav complile time errors

		//comparing array & generic array list..aaray hav exception (ArrayStoreException)  but in generic no
		//pre defined exception

		List<Doggg> animals1 = new ArrayList<Doggg>();
		animals1.add(new Doggg());
		animals1.add(new Doggg());

		//doc.addAnimal(animals1); // THIS is where it breaks!,-- Important
		//generic type shud be same  <Doggg>   ~~~~ <Animall>
	}

	public void addAnimal(List< Animall> animals) {
		animals.add(new Doggg()); 
	}
}
