package OCJPChap9;
//learn the difference in notify & notifyAll
/*
 * 
 * read T_13FewThingsToRemeber too..thoroughly
 * Purpose of synchronization
 * Synchronization is built around an internal entity known as the intrinsic lock or monitor lock. 
 * 
 * When a thread invokes a synchronized method, it automatically acquires the intrinsic lock for 
 * that method's object and releases it when the method returns. 
 * The lock release occurs even if the return was caused by an uncaught exception.
 * */

public class T_17Reader extends Thread 
{
	Calculator c;

	public T_17Reader(Calculator calc)
	{
		c = calc;
	}

	public void run()
	{
		synchronized(c)
		{
			try
			{
				System.out.println("Waiting for calculation...");
				c.wait();
			} 
			catch (InterruptedException e) 
			{

			}

			System.out.println("Total is: " + c.total);

		}
	}
	public static void main(String [] args)
	{
		Calculator calculator = new Calculator();

		new T_17Reader(calculator).start();
		new T_17Reader(calculator).start();
		new T_17Reader(calculator).start();
		calculator.start();
	}
}

class Calculator extends Thread 
{
	int total;
	public void run()
	{
		synchronized(this) 
		{
			for(int i=0;i<100;i++)
			{
				total += i;
			}
			//notify();
			notifyAll();
		}
	}
}