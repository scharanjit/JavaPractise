package OCJPChap9;

public class TT_5 
{
	public static void main(String [] args) 
	{
		System.out.print("1 ");
		synchronized(args)
		{
			System.out.print("2 ");
			try 
			{
				args.wait();
			}
			catch(InterruptedException e){}
		}
		System.out.print("3 ");
	} 
}


/*
 * D is correct. 1 and 2 will be printed, but there will be no return from the wait call because
no other thread will notify the main thread, so 3 will never be printed. It's frozen at line 7.

 A is incorrect; IllegalMonitorStateException is an unchecked exception.
  
  B and C are incorrect; 3 will never be printed, since this program will wait forever. 
 
  E is incorrect because IllegalMonitorStateException will never be thrown because the wait()
is done on args within a block of code synchronized on args.
 
 F is incorrect because any object can be used to synchronize on and this and static don't mix. (Objective 4.
 * */
