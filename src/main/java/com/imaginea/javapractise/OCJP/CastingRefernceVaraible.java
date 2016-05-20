package OCJP;

class Animal1
{
	void makeNosie()
	{
		System.out.println("generating noise");
	}
}

class Doge extends Animal1
{
	void makeNosie()
	{
		System.out.println("bhai bhau");

	}	

	void doingDeeds()
	{
		System.out.println("brrrrrrrrrrrr");	
	}
}

public class CastingRefernceVaraible {


	public static void main(String[] args) 
	{
		Animal1[] a = {new Animal1(),new Doge(), new Animal1()};

		for(Animal1 animal : a)
		{
			animal.makeNosie();  // this is successful because method exist in both the classes
			int i=0;
			if (animal instanceof Doge) //validation condition
			{
				i=i+1;
				System.out.println(i);
			//	animal.doingDeeds();
				System.out.println("Inside IF");
				Doge d =(Doge) animal;
				d.doingDeeds();			//casting the ref variable   //downcast
				System.out.println("-----------OUTSIDE IF");
			}							//before doing this downcast..we need to make sure that
										// animal must be instance of dog



		}


		Animal1 animals = new Animal1();
		//Doge d = (Doge)animals;				//now it compiles good but fails at RUNTIME
		//d.doingDeeds();						//child refferring parent ..>ERROR


		//upcast
		Doge ds = new Doge();
		Animal1 a23 = ds;
		Animal1 a24= (Animal1)ds;
		a23.makeNosie();


	}

}
