package OCJPChap3;
//remove static from Beta b1;
class Beta { }
class Alpha 
{
	static Beta b1;
	 Beta b2;
}
public class Tester
{
	public static void main(String[] args) 
	{
		Beta b1 = new Beta(); Beta b2 = new Beta();
		Alpha a1 = new Alpha(); Alpha a2 = new Alpha();
		System.out.println(a1.hashCode());
		a1.b1 = b1;
		a1.b2 = b1;
		System.out.println(a1.b2.hashCode());
		a2.b2 = b2;
		System.out.println(b1.hashCode());
		a1 = null; b1 = null; b2 = null;
		// do stuff
		
		System.out.println(a2.b2.hashCode()); //it carries the hashcode of b2 object hence b2  alive hypotheticaly
		System.out.println(a1.b1.hashCode());//it carries the hascode of b1 object hnece b1 alive hypothtically
		System.out.println(a1.b2.hashCode()); // refering non static refernce in static main function
		//System.out.println(a1.hashCode()); //a1 obhect dies
	}
}

//refernce(stack)--> Object(heap)
//a1-->A1
//a2-->A2
//b1-->B1
//b2-->B2
//a1.b1-->b1-->B1  i.e a1.b1-->B1
//a1.b2-->b1  i.e. a1.b2-->B1
//a2.b2-->b2   i.e. a2.b2-->B2

//a1==null   ie. A1--> unreachable
//b1= null ...ie.e B1 still refers by a1.b1 & a1.b2 (new ref)
//b2== null same case as B1...ie,e B2 still refers by a2.b2

//so only A1 object is free & available for garbage collection


//When line 16 is reached, how many objects will be eligible for garbage collection?


//Ans:- 1


/*
 * 
 *  the stack is a piece of memory where all references to objects are stored. 
 *  the heap is a piece of memory where the objects live. 
	In the given code four objects are instantiated, lets call them A1, A2, B1 and B2. 
	the object B1 is referenced by b1, A1.b1 and A1.b2. so B1 will not be eligible by nulling b1,
	 because the other references are still there. B2 has two references on it, on by b2 and the other
	  by A2.b2. so even by nulling the b2 there is still one reference on it, so this object will not be 
	  eligible. the next object is A1 that has only one reference from a1. so by nulling a1 this object
	   will be eligible by the gc. the last object is A2 that has also only one reference from a2.
	    but this reference is not set to null so also this object is not eligible for the gc. 
	    so looking once again at the four objects we can see that only 1 object is eligible.*/