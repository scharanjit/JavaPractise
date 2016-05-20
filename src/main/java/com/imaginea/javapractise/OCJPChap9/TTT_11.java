package OCJPChap9;

public class TTT_11 
{
	synchronized void a() 
	{
		actBusy();

	}
	static synchronized void b()
	{ 
		actBusy(); 
	}
	static void actBusy()
	{
		try 
		{ 
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000); 
		}
		catch (InterruptedException e) 
		{}
	}
	public static void main(String[] args)
	{
		final TTT_11 x = new TTT_11();
		final TTT_11 y = new TTT_11();
		Runnable runnable = new Runnable()
		{
			public void run()
			{
				int option = (int) (Math.random() * 4);
				System.out.println(option);
				switch (option) 
				{
					case 0: x.a(); break;
					case 1: x.b(); break;
					case 2: y.a(); break;
					case 3: y.b(); break;
				} 
			}
		};
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();
	}
}

/*
 *Which of the following pairs of method invocations could NEVER be executing at the same time?
(Choose all that apply.)
A. x.a() in thread1, and x.a() in thread2---
B. x.a() in thread1, and x.b() in thread2
C. x.a() in thread1, and y.a() in thread2	
D. x.a() in thread1, and y.b() in thread2
E. x.b() in thread1, and x.a() in thread2
F. x.b() in thread1, and x.b() in thread2---
G. x.b() in thread1, and y.a() in thread2
H. x.b() in thread1, and y.b() in thread2 --
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * A, F, and H.
 * 
 *  A is a right answer because when synchronized instance methods are called on the same instance, they block each other.
 F and H can't happen because synchronized static methods in the same class block each other, regardless of which instance was used
to call the methods. (An instance is not required to call static methods; only the class.)

C could happen because synchronized instance methods called on different instances
do not block each other. B, D, E, and G could all happen because instance methods and
static methods lock on different objects, and do not block each other. (Objective 4.3)
*/