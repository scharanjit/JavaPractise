package OCJPChap7;


//First go through class Apple.java for better understanding
//then this class
//Map, any classes that you use as a part of the keys for that map 
//must override the hashCode() and equals() methods.
//if we dont override hashCode & equals method, we are not able to find out stuff
//1. Use the hashCode() method to find the correct bucket
//2. Use the equals() method to find the object in the bucket

import java.util.*;
class Dog111 
{
	public Dog111(String n) 
	{ 
		name = n;
	}
	public String name;
	public boolean equals(Object o)
	{
		if((o instanceof Dog111) && (((Dog111)o).name == name)) 
		{
			//System.out.println("---boolean pass---");
			return true;
			
		}
		else
		{
			//System.out.println("---boolean fail---");
			return false;
		}
	}
	public int hashCode()
	{	
		
		//System.out.println("---Inside hashcode:----");
		//System.out.println(name);
			
		return name.length(); 
	}
}

class Cat
{

	
	
}

enum Pets {DOG111, CAT, HORSE }

public class Z_19Maps 
{
	public static void main(String[] args) 
	{								//<key,value>
		Map<Object, Object> m = new HashMap<Object, Object>();

		m.put("k1", new Dog111("aiko")); // add some key/value pairs  ---calling hashCoder bucket
		m.put("k2", Pets.DOG111);
		m.put(Pets.CAT, "CAT key");
		
		Dog111 d1 = new Dog111("clover"); // let's keep this reference
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''");
		m.put(d1, "Dog key");
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''");
		m.put(new Cat(), "Cat key");
		System.out.println("***************************************************");
		System.out.println("#1 : "+m.get("k1")); // #1 chk $4 o/p //The value retrieved is a Dog object-->  new Dog111("aiko")...we can put some value here
		System.out.println("****************************************************");
		
		String k2 = "k2";
		System.out.println("#2 : "+m.get(k2)); // #2   //same as k1...it is getting value from enumeration
		Pets p = Pets.CAT;
		System.out.println("#3 : "+m.get(p)); // #3
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("#4 :- "+m.get(d1)); // #4
		System.out.println("----------------------------------------------");
		System.out.println("");
		
		System.out.println("#5 :- "+m.get(new Cat())); // #5
		
		System.out.println("#6 :- "+m.size()+" "+m.values()); // #6
		System.out.println();
		
		d1.name = "magnolia";
		System.out.println("#7 :- "+m.get(d1));   // #7
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		d1.name = "clover";
		System.out.println("#8 :- "+m.get(new Dog111("clover"))); // #8
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		d1.name = "arthur";
		System.out.println("#9 :- "+m.get(new Dog111("clover"))); // #9  --it fails in equal
		
		
		/* 7,8,9 :-Remember that the hashcode is equal to the length of the name variable. When
		you study a problem like this, it can be useful to think of the two stages of retrieval:
		1. Use the hashCode() method to find the correct bucket
		2. Use the equals() method to find the object in the bucket
		In the first call to get(), the hashcode is 8 (magnolia) and it should be 6
		(clover), so the retrieval fails at step 1 and we get null. In the second call to
		get(), the hashcodes are both 6, so step 1 succeeds. Once in the correct bucket (the
		"length of name = 6" bucket), the equals() method is invoked, and since Dog's
		equals() method compares names, equals() succeeds, and the output is Dog key.
		In the third invocation of get(), the hashcode test succeeds, but the equals() test
		fails because arthur is NOT equal to clover.*/
	}
}