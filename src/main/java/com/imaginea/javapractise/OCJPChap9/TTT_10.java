package OCJPChap9;

class MyThread extends Thread 
{
	MyThread() 
	{
		System.out.print(" MyThread");
	}
	public void run() 
	{
		System.out.print(" bar-----------"); 
	}
	public void run(String s) 
	{ 
		System.out.print(" baz----------"); 
	}
}

public class TTT_10 
{
	public static void main (String [] args)
	{
		//check class I_18TestInners.java
	//	Thread t1= new Thread();
		//t1.start();
		
		Thread t = new MyThread()
		{
			public void run() 
			{ 
				System.out.print(" foosadada"); 
			}
		};

		t.start();
		
		//My Thread prints bec inner class constructor invoked
		//due to t.start...run method of inner class prints foosadada
	} 
}

/*B is correct. The first line of main we're constructing an instance of an anonymous inner
class extending from MyThread. So the MyThread constructor runs and prints MyThread.
Next, main() invokes start() on the new thread instance, which causes the overridden
run() method (the run() method in the anonymous inner class) to be invoked.*/