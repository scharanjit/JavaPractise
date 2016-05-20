package OCJPChap8;

public class I_19Car
{
	class Engine
	{
		// insert code here
		//C............
				{
					I_19Car.this.drive(); 
				}
		
		
		//G........
		Engine() { I_19Car.this.drive(); }
		
	}
	public static void main(String[] args) {
		new I_19Car().go();
	}
	void go() {
		new Engine();
	}
	void drive() 
	{ 
		System.out.println("hi");
	}
}


/*Which, inserted independently at line 5, produce the output "hi"? (Choose all that apply.)
A. { Car.drive(); }
B. { this.drive(); }
C. { Car.this.drive(); }
D. { this.Car.this.drive(); }
E. Engine() { Car.drive(); }
F. Engine() { this.drive(); }
G. Engine() { Car.this.drive(); }
Answer:

 C and G are correct. C is the correct syntax to access an inner class’s outer instance
method from an initialization block, and G is the correct syntax to access it from
a constructor.*/