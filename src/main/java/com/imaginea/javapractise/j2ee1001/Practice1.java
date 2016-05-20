package j2ee1001;
//wait can be used anywhere but method shud be synchronzed...unless runtime

public class Practice1 extends Thread
{
public synchronized void run()
{
	try
	{	System.out.print("Child");
		wait();
	call();
	
	}
	catch(Exception E)
	{	E.printStackTrace();
	}
}
private synchronized void call() throws InterruptedException {
	wait();
	
}
public static void main(String args[])
{
	Practice1 obj=new Practice1();
	obj.start();
	System.out.print("Parent");
	
	
}
}
