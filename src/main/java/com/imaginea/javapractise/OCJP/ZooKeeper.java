package OCJP;


//there is NO concept of strung mutable used here....
//it's the refernce used here
//for varible--> parent
//for method -->child
class Mammal 
{

	String name = "furry ";
	String makeNoise()
	{ 
		return "generic noise"; 
	}

	//int name = 5;
	//int makeNoise() { return 23; }


}
class Zebra extends Mammal
{


	String name = "stripes ";
	String makeNoise()
	{
		return "bray";
	}
	// int name = 7;
	//int makeNoise() { return 29; }
}
public class ZooKeeper
{
	public static void main(String[] args) 
	{
		new ZooKeeper().go();
	}
	void go() 
	{
		Mammal m = new Zebra();
		System.out.println(m.name +" "+ m.makeNoise());
	}
}



//overloading overrideing is for methods not for variables