package j2ee1001;

public  class Thread_Mythread extends Thread
{
	String name;

	Thread_Mythread (String s) { name = s; }

	public static void main(String args[])
	{
		Thread_Mythread tt1 =  new Thread_Mythread("My ");
		tt1.start();
		Thread_Mythread tt2 =  new Thread_Mythread("Infy ");
		tt2.start();
	}

	public void run()
	{
		for(int i=0; i<2; ++i)
		{
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{}
			System.out.print(name);
		}
	}
}
