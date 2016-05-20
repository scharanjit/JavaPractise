package OCJPChap3;


//Instance variables and objects live on the heap.
// Local variables (method variables) live on the stack.



class Collar { }

public  class StackHeap 
{

	Collar c; // instance variable
	String name; // instance variable

	public static void main(String [] args) 
	{

		StackHeap d; // local variable: d.
		d = new StackHeap();
		d.go(d);
	}

	void go(StackHeap dog)
	{ // local variable: dog

		c = new Collar();
		dog.setName("Aiko");
	}

	void setName(String dogName) 
	{ // local var: dogName
		name = dogName; // do more stuff

	}
}