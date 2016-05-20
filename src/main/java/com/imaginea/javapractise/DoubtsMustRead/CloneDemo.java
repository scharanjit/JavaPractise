package DoubtsMustRead;

//Demonstrate the clone() method. 
class TestClone implements Cloneable { 
	int a; 
	double b; 
	//This method calls Object's clone(). 
	TestClone cloneTest() { 
		try { 
			//call clone in Object. 
			return (TestClone) super.clone(); 
		} catch(CloneNotSupportedException e) { 
			System.out.println("Cloning not allowed."); 
			return this; 
		} 
	} 
}

class CloneDemo { 
	public static void main(String args[]) { 
		TestClone x1 = new TestClone(); 
		TestClone x2; 
		x1.a = 10; 
		x1.b = 20.98; 
		x2 = x1.cloneTest(); // clone x1 
		System.out.println("x1: " + x1.a + " " + x1.b); 
		System.out.println("x2: " + x2.a + " " + x2.b); 
	} 
}



/*

. Why Collection doesn’t extend Cloneable and Serializable interfaces ? 
The Collection interface specifies groups of objects known as elements.
 Each concrete implementation of a Collection can choose its own way of how to maintain and order its elements.
  Some collections allow duplicate keys, while some other collections don’t. 
  The semantics and the implications of either cloning or serialization come into play when dealing with actual implementations.
 Thus, the concrete implementations of collections should decide how they can be cloned or serialized.


*/