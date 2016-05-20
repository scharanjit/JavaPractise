package OCJPChap9;
//learn use of wait & notify thread methods
// put cmnts on wait & notify method & feel the difference

public class T_16ThreadA
{
	public static void main(String [] args) {
		ThreadB b = new ThreadB();
		b.start();

		synchronized(b)
		{
			try 
			{
				System.out.println("Waiting for b to complete...");
				b.wait();
				System.out.println("Thread sleeping till it wnt notified");
			} 
			catch (InterruptedException e) 
			{}
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread
{
	
	int total;
	public void run()	
	{
		System.out.println("Here we are.............");
		synchronized(this)
		{
			for(int i=0;i<100;i++) 
			{
				total += i;
			}

			notify();
			System.out.println("I notified");
		}
	}}