package HiHa;
// wait/sleep difference
//waiting thread can be awake by calling notify and notifyAll while
//sleeping thread can not be awaken by calling notify method.

//wait is normally done on condition, Thread wait until a condition is true while 
//sleep is just to put your thread on sleep.

// wait release lock on object while waiting while sleep doesn’t release lock while waiting

//volatile keyword:-dentifying a variable with the volatile keyword means that the variable's value
//will be modified by different threads.
//thread wnt update value of cahce ..it directly upates main memory
public class Thread {
	

	public void run()
	{
		System.out.println("hi hi Hi");
		
	}
	
	
	
	public static void main(String args[])
	{
		Thread t = new Thread();
		System.out.println(t);
		t.run();
		System.out.println(t);
	
		
		Character x= new Character('S');
		Character y = new Character('S');
		 char x1='s';
		 char y1='s';
		 System.out.println(x1==y1);
		 //System.out.println(x1.equals(y1));
		System.out.println(x==y);
		System.out.println(x.equals(y));
		

		
		
	}
}
